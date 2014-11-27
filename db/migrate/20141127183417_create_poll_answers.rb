class CreatePollAnswers < ActiveRecord::Migration
  def change
    create_table :poll_answers do |t|
      t.string :body
      t.integer :votes
      t.integer :poll_question_id

      t.timestamps
    end
  end
end
