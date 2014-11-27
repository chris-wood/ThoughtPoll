class PollAnswer < ActiveRecord::Base
	validates :body, presence: true
	belongs_to :poll_question
end
