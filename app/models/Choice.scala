package models

import play.api.db._
import play.api.Play.current

import anorm._
import anorm.SqlParser._

import java.util.Date;

// TODO: this should be a date object!
case class Choice(question_id: Long, choice_text: String) 

object Choice {
  
  // -- Parsers
  
  /**
   * Parse a Choice from a ResultSet
   */
  val simple = {
    get[Long]("choice.question_id") ~
    get[String]("choice.choice_text") map {
      case qid~text => Choice(qid, text)
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
   * Create a Choice.
   */
  def create(choice: Choice): Choice = {
    DB.withConnection { implicit connection =>
      SQL(
        """
          insert into choice (question_id, choice_text) values (
            {question_id}, {choice_text}
          )
        """
      ).on(
        'question_id -> choice.question_id,
        'choice_text -> choice.choice_text
      ).executeUpdate()
      
      choice
      
    }
  }
  
}
