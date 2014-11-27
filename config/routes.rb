Rails.application.routes.draw do
  resources :poll_vote_histories
  resources :poll_answers
  resources :poll_questions

  get '/' => 'poll_questions#index'
  get '/qotd' => 'poll_questions#qotd'
end
