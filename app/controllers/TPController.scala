package controllers

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._

import views._

import models._

object TPController extends Controller {

  /**
   * Describes the hello form.
   */
   /*
  val helloForm = Form(
    tuple(
      "name" -> nonEmptyText,
      "repeat" -> number(min = 1, max = 100),
      "color" -> optional(text)
    )
  )
*/

  // -- Actions

  /**
   * Home page
   */
  def index = Action {
    // TODO: passing in the categories would be the next wise thing to do
    Ok(html.index()) // there are no parameters for the index page... 
  }

  /**
   * Handles the form submission.
   */
   /*
  def sayHello = Action { implicit request =>
    helloForm.bindFromRequest.fold(
      formWithErrors => BadRequest(html.index(formWithErrors)),
      {case (name, repeat, color) => Ok(html.hello(name, repeat.toInt, color))}
    )
  }
  */

}
