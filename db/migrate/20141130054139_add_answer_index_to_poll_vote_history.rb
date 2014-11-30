class AddAnswerIndexToPollVoteHistory < ActiveRecord::Migration
  def change
    add_column :poll_vote_histories, :answer_index, :integer
  end
end
