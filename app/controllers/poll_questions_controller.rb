class PollQuestionsController < ApplicationController

  # WTF HACK
  skip_before_filter  :verify_authenticity_token

  # before_action :authenticate_user!, only: :submitVote
  before_action :set_poll_question, only: [:show, :edit, :update, :destroy]

  def qotd
    @poll_question = PollQuestion.last 
    jsonHash = JSON.parse(@poll_question.to_json(:include => :poll_answers))
    jsonHash["signed_in"] = signed_in?

    respond_to do |format|
      format.html { render :index }
      format.json { render json: jsonHash.to_json }
    end
  end

  # check to see if the user has voted yet today
  def didCurrentUserVote 
    @poll_question = PollQuestion.last 

    vote = PollVoteHistory.where(created_at: DateTime.now.at_beginning_of_day.utc..Time.now.utc, poll_question_id: @poll_question.id)
    @voted = false
    if vote != nil
      @voted = true
    end

    respond_to do |format|
      format.html { render :index }
      format.json { render json: @voted.to_json }
    end
  end

  def submitVote 
    anonymous = params[:anonymous]
    if signed_in? or anonymous
      qid = params[:question_id]
      aid = params[:answer_id]
      index = params[:answer_index]
      lat = params[:lat]
      lon = params[:lon]

      hist = PollVoteHistory.create(poll_question_id:qid, poll_answer_id:aid, answer_index: index, lat: lat, lon: lon)

      puts hist.to_json
      @history = PollVoteHistory.where(poll_question_id: qid)
      puts index
      # puts @history.to_json

      respond_to do |format|
        # format.html { head :ok }
        format.html { render :index }
        # format.json { head :ok }
        format.json { render json: @history.to_json }
      end
    else # respond with error... wasn't logged in and wasn't in anonymous mode
      respond_to do |format|
        format.html { render :index }
        format.json { render json: false.to_json }
      end
    end
  end

  # GET /poll_questions
  # GET /poll_questions.json
  def index
    # do nothing...
  end

  # GET /poll_questions/1
  # GET /poll_questions/1.json
  def show
  end

  # GET /poll_questions/new
  def new
    @poll_question = PollQuestion.new
  end

  # GET /poll_questions/1/edit
  def edit
  end

  # POST /poll_questions
  # POST /poll_questions.json
  def create
    @poll_question = PollQuestion.new(poll_question_params)

    respond_to do |format|
      if @poll_question.save
        format.html { redirect_to @poll_question, notice: 'Poll question was successfully created.' }
        format.json { render :show, status: :created, location: @poll_question }
      else
        format.html { render :new }
        format.json { render json: @poll_question.errors, status: :unprocessable_entity }
      end
    end
  end

  # PATCH/PUT /poll_questions/1
  # PATCH/PUT /poll_questions/1.json
  def update
    respond_to do |format|
      if @poll_question.update(poll_question_params)
        format.html { redirect_to @poll_question, notice: 'Poll question was successfully updated.' }
        format.json { render :show, status: :ok, location: @poll_question }
      else
        format.html { render :edit }
        format.json { render json: @poll_question.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /poll_questions/1
  # DELETE /poll_questions/1.json
  def destroy
    @poll_question.destroy
    respond_to do |format|
      format.html { redirect_to poll_questions_url, notice: 'Poll question was successfully destroyed.' }
      format.json { head :no_content }
    end
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_poll_question
      @poll_question = PollQuestion.find(params[:id])
    end

    # Never trust parameters from the scary internet, only allow the white list through.
    def poll_question_params
      params.require(:poll_question).permit(:body)
    end
end
