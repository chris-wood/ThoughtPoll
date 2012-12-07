package models

import play.api.db._
import play.api.Play.current

import anorm._
import anorm.SqlParser._

import java.util.Date;

// TODO: this should be a date object!
case class Question(user_id: Long, question_text: String, date_started: Date) 

object Question {
  
  // -- Parsers
  
  /**
   * Parse a Question from a ResultSet
   */
  val simple = {
    get[Long]("question.user_id") ~
    get[String]("question.question_text") ~
    get[Date]("question.date_started") map {
      case uid~text~date => Question(uid, text, date)
    }
  }
  
  // -- Queries
  
  /**
   * Retrieve a User from email.
   */
   /*
  def findByEmail(email: String): Option[User] = {
    DB.withConnection { implicit connection =>
      SQL("select * from user where email = {email}").on(
        'email -> email
      ).as(User.simple.singleOpt)
    }
  }
  */
  
  /**
   * Retrieve all users.
   */
   /*
  def findAll: Seq[User] = {
    DB.withConnection { implicit connection =>
      SQL("select * from user").as(User.simple *)
    }
  }
  */
  
  /**
   * Authenticate a User.
   */
   /*
  def authenticate(email: String, password: String): Option[User] = {
    DB.withConnection { implicit connection =>
      SQL(
        """
         select * from user where 
         email = {email} and password = {password}
        """
      ).on(
        'email -> email,
        'password -> password
      ).as(User.simple.singleOpt)
    }
  }
  */
   
  /**
   * Create a User.
   */
  def create(question: Question): Question = {
    DB.withConnection { implicit connection =>
      SQL(
        """
          insert into question (user_id, question_text, date_started) values (
            {user_id}, {question_text}, {date_started}
          )
        """
      ).on(
        'user_id -> question.user_id,
        'question_text -> question.question_text,
        'date_started -> question.date_started
      ).executeUpdate()
      
      question
      
    }
  }
  
}
