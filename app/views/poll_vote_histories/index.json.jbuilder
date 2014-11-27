json.array!(@poll_vote_histories) do |poll_vote_history|
  json.extract! poll_vote_history, :id, :poll_question_id, :poll_answer_id, :lat, :lon
  json.url poll_vote_history_url(poll_vote_history, format: :json)
end
