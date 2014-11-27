class PollQuestion < ActiveRecord::Base
	validates :body, presence: true
	has_many :poll_answers
end
