class PollAnswersController < ApplicationController
  before_action :set_poll_answer, only: [:show, :edit, :update, :destroy]

  # GET /poll_answers
  # GET /poll_answers.json
  def index
    @poll_answers = PollAnswer.all
  end

  # GET /poll_answers/1
  # GET /poll_answers/1.json
  def show
  end

  # GET /poll_answers/new
  def new
    @poll_answer = PollAnswer.new
  end

  # GET /poll_answers/1/edit
  def edit
  end

  # POST /poll_answers
  # POST /poll_answers.json
  def create
    @poll_answer = PollAnswer.new(poll_answer_params)

    respond_to do |format|
      if @poll_answer.save
        format.html { redirect_to @poll_answer, notice: 'Poll answer was successfully created.' }
        format.json { render :show, status: :created, location: @poll_answer }
      else
        format.html { render :new }
        format.json { render json: @poll_answer.errors, status: :unprocessable_entity }
      end
    end
  end

  # PATCH/PUT /poll_answers/1
  # PATCH/PUT /poll_answers/1.json
  def update
    respond_to do |format|
      if @poll_answer.update(poll_answer_params)
        format.html { redirect_to @poll_answer, notice: 'Poll answer was successfully updated.' }
        format.json { render :show, status: :ok, location: @poll_answer }
      else
        format.html { render :edit }
        format.json { render json: @poll_answer.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /poll_answers/1
  # DELETE /poll_answers/1.json
  def destroy
    @poll_answer.destroy
    respond_to do |format|
      format.html { redirect_to poll_answers_url, notice: 'Poll answer was successfully destroyed.' }
      format.json { head :no_content }
    end
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_poll_answer
      @poll_answer = PollAnswer.find(params[:id])
    end

    # Never trust parameters from the scary internet, only allow the white list through.
    def poll_answer_params
      params.require(:poll_answer).permit(:body, :votes, :poll_question_id)
    end
end
