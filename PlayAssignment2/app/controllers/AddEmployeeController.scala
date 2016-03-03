package controllers

import play.api.data.Form
import play.api.data.Forms._
import play.api.mvc.{Controller, Action}
import java.util.Date
/**
  * Created by kunal on 3/3/16.
  *
  * This is an employee controller that handles the displaying of employee records and renders the appropriate html page.
  */


class AddEmployeeController extends Controller {

  val addForm = Form(
    tuple(
      "name"-> nonEmptyText,
      "address" -> nonEmptyText,
      "dateOfBirth" -> date,
      "dateOfJoining" -> date,
      "designation" -> nonEmptyText
    )
  )

  def showEmployeeForm = Action{ implicit request =>
    Ok(views.html.AddEmployee(addForm))
  }

}
