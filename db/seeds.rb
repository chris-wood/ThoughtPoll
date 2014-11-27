# This file should contain all the record creation needed to seed the database with its default values.
# The data can then be loaded with the rake db:seed (or created alongside the db with db:setup).
#
# Examples:
#
#   cities = City.create([{ name: 'Chicago' }, { name: 'Copenhagen' }])
#   Mayor.create(name: 'Emanuel', city: cities.first)

q1 = PollQuestion.create(body:"Sample Question Text")

a1 = PollAnswer.create(body:"Answer 1", poll_question_id: q1.id)
a2 = PollAnswer.create(body:"Answer 2", poll_question_id: q1.id)
a3 = PollAnswer.create(body:"Answer 3", poll_question_id: q1.id)
a4 = PollAnswer.create(body:"Answer 4", poll_question_id: q1.id)

