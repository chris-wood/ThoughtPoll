class CreatePollQuestions < ActiveRecord::Migration
  def change
    create_table :poll_questions do |t|
      t.string :body

      t.timestamps
    end
  end
end
