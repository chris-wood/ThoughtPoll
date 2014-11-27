json.array!(@poll_answers) do |poll_answer|
  json.extract! poll_answer, :id, :body, :votes, :poll_question_id
  json.url poll_answer_url(poll_answer, format: :json)
end
