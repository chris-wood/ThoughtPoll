Rails.application.routes.draw do
  devise_for :users
  resources :poll_vote_histories
  resources :poll_answers
  resources :poll_questions

  # routes -- KISS
  get  '/'              => 'poll_questions#index'
  get  '/qotd'          => 'poll_questions#qotd'
  get  '/didVote'       => 'poll_questions#didCurrentUserVote'
  post '/vote'          => 'poll_questions#submitVote'

end
