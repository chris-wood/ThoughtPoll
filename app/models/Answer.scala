package models

import play.api.db._
import play.api.Play.current

import anorm._
import anorm.SqlParser._

import java.util.Date;

// TODO: this should be a date object!
case class Answer(user_id: Long, 
  question_id: Long, 
  choice_id: Long,
  explanation: String,
  date_started: Date) 

object Answer {
  
  // -- Parsers
  
  /**
   * Parse a Answer from a ResultSet
   */
  val simple = {
    get[Long]("answer.user_id") ~
    get[Long]("answer.question_id") ~
    get[Long]("answer.choice_id") ~
    get[String]("answer.explanation") ~
    get[Date]("answer.date_started") map {
      case uid~qid~cid~expl~date => Answer(uid, qid, cid, expl, date)
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
   * Create a Answer.
   */
  def create(answer: Answer): Answer = {
    DB.withConnection { implicit connection =>
      SQL(
        """
          insert into answer (user_id, question_id, choice_id, explanation, date_started) values (
            {user_id}, {question_id}, {choice_id}, {explanation}, {date_started}
          )
        """
      ).on(
        'user_id -> answer.user_id,
        'question_id -> answer.question_id,
        'choice_id -> answer.choice_id,
        'explanation -> answer.explanation,
        'date_started -> answer.date_started
      ).executeUpdate()
      
      answer
      
    }
  }
  
}
