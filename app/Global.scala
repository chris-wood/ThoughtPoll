import play.api._

import models._
import anorm._

import java.util.Date;

object Global extends GlobalSettings {
  
  override def onStart(app: Application) {
    InitialData.insert()
  }
  
}

/**
 * Initial set of data to be imported 
 * in the sample application.
 */
object InitialData {
  
  def date(str: String) = new java.text.SimpleDateFormat("yyyy-MM-dd").parse(str)
  
  def insert() = {

    var date: Date = new Date()
    
    // Check to see if the User table is empty - if so, add some pre-set data
    if(User.findAll.isEmpty) {

      // Insert a dummy test user
      Seq(
        User("root", "Test", "toor"),
        User("root2", "Test", "toor"),
        User("root3", "Test", "toor"),
        User("root4", "Test", "toor"),
        User("root5", "Test", "toor")
      ).foreach(User.create)

      // Insert a dummy question
      Seq(
        Question(1, "Do you like spicy food?", date)
      ).foreach(Question.create)

      // Insert a dummy set of choices for the question above
      Seq(
        Choice(1, "Yes"),
        Choice(1, "No"),
        Choice(1, "I'M CONFUSED HELP ME")
      ).foreach(Choice.create)

      // Insert a dummy set of answers for the question above
      Seq(
        Answer(1, 1, 1, "I like spicy food", date),
        Answer(2, 1, 1, "I like spicy food", date),
        Answer(3, 1, 1, "I like spicy food", date),
        Answer(4, 1, 1, "I like spicy food", date),
        Answer(5, 1, 1, "I like spicy food", date)
      ).foreach(Answer.create)      
    }
  }
}