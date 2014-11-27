require 'test_helper'

class PollAnswersControllerTest < ActionController::TestCase
  setup do
    @poll_answer = poll_answers(:one)
  end

  test "should get index" do
    get :index
    assert_response :success
    assert_not_nil assigns(:poll_answers)
  end

  test "should get new" do
    get :new
    assert_response :success
  end

  test "should create poll_answer" do
    assert_difference('PollAnswer.count') do
      post :create, poll_answer: { body: @poll_answer.body, poll_question_id: @poll_answer.poll_question_id, votes: @poll_answer.votes }
    end

    assert_redirected_to poll_answer_path(assigns(:poll_answer))
  end

  test "should show poll_answer" do
    get :show, id: @poll_answer
    assert_response :success
  end

  test "should get edit" do
    get :edit, id: @poll_answer
    assert_response :success
  end

  test "should update poll_answer" do
    patch :update, id: @poll_answer, poll_answer: { body: @poll_answer.body, poll_question_id: @poll_answer.poll_question_id, votes: @poll_answer.votes }
    assert_redirected_to poll_answer_path(assigns(:poll_answer))
  end

  test "should destroy poll_answer" do
    assert_difference('PollAnswer.count', -1) do
      delete :destroy, id: @poll_answer
    end

    assert_redirected_to poll_answers_path
  end
end
