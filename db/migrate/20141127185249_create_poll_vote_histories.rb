class CreatePollVoteHistories < ActiveRecord::Migration
  def change
    create_table :poll_vote_histories do |t|
      t.integer :poll_question_id
      t.integer :poll_answer_id
      t.float :lat
      t.float :lon

      t.timestamps
    end
  end
end
