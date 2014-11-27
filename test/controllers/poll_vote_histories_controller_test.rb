require 'test_helper'

class PollVoteHistoriesControllerTest < ActionController::TestCase
  setup do
    @poll_vote_history = poll_vote_histories(:one)
  end

  test "should get index" do
    get :index
    assert_response :success
    assert_not_nil assigns(:poll_vote_histories)
  end

  test "should get new" do
    get :new
    assert_response :success
  end

  test "should create poll_vote_history" do
    assert_difference('PollVoteHistory.count') do
      post :create, poll_vote_history: { lat: @poll_vote_history.lat, lon: @poll_vote_history.lon, poll_answer_id: @poll_vote_history.poll_answer_id, poll_question_id: @poll_vote_history.poll_question_id }
    end

    assert_redirected_to poll_vote_history_path(assigns(:poll_vote_history))
  end

  test "should show poll_vote_history" do
    get :show, id: @poll_vote_history
    assert_response :success
  end

  test "should get edit" do
    get :edit, id: @poll_vote_history
    assert_response :success
  end

  test "should update poll_vote_history" do
    patch :update, id: @poll_vote_history, poll_vote_history: { lat: @poll_vote_history.lat, lon: @poll_vote_history.lon, poll_answer_id: @poll_vote_history.poll_answer_id, poll_question_id: @poll_vote_history.poll_question_id }
    assert_redirected_to poll_vote_history_path(assigns(:poll_vote_history))
  end

  test "should destroy poll_vote_history" do
    assert_difference('PollVoteHistory.count', -1) do
      delete :destroy, id: @poll_vote_history
    end

    assert_redirected_to poll_vote_histories_path
  end
end
