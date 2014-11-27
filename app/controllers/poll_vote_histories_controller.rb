class PollVoteHistoriesController < ApplicationController
  before_action :set_poll_vote_history, only: [:show, :edit, :update, :destroy]

  # GET /poll_vote_histories
  # GET /poll_vote_histories.json
  def index
    @poll_vote_histories = PollVoteHistory.all
  end

  # GET /poll_vote_histories/1
  # GET /poll_vote_histories/1.json
  def show
  end

  # GET /poll_vote_histories/new
  def new
    @poll_vote_history = PollVoteHistory.new
  end

  # GET /poll_vote_histories/1/edit
  def edit
  end

  # POST /poll_vote_histories
  # POST /poll_vote_histories.json
  def create
    @poll_vote_history = PollVoteHistory.new(poll_vote_history_params)

    respond_to do |format|
      if @poll_vote_history.save
        format.html { redirect_to @poll_vote_history, notice: 'Poll vote history was successfully created.' }
        format.json { render :show, status: :created, location: @poll_vote_history }
      else
        format.html { render :new }
        format.json { render json: @poll_vote_history.errors, status: :unprocessable_entity }
      end
    end
  end

  # PATCH/PUT /poll_vote_histories/1
  # PATCH/PUT /poll_vote_histories/1.json
  def update
    respond_to do |format|
      if @poll_vote_history.update(poll_vote_history_params)
        format.html { redirect_to @poll_vote_history, notice: 'Poll vote history was successfully updated.' }
        format.json { render :show, status: :ok, location: @poll_vote_history }
      else
        format.html { render :edit }
        format.json { render json: @poll_vote_history.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /poll_vote_histories/1
  # DELETE /poll_vote_histories/1.json
  def destroy
    @poll_vote_history.destroy
    respond_to do |format|
      format.html { redirect_to poll_vote_histories_url, notice: 'Poll vote history was successfully destroyed.' }
      format.json { head :no_content }
    end
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_poll_vote_history
      @poll_vote_history = PollVoteHistory.find(params[:id])
    end

    # Never trust parameters from the scary internet, only allow the white list through.
    def poll_vote_history_params
      params.require(:poll_vote_history).permit(:poll_question_id, :poll_answer_id, :lat, :lon)
    end
end
