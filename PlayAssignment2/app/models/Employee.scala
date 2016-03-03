package models

import java.util.Date

import scala.collection.mutable.ListBuffer

/**
  * Created by kunal on 3/3/16.
  */

case class Employee(name:String,address:String,dateOfBirth:Date,dateOfJoining:Date,designation:String)

trait EmployeeServiceApi{
    def addEmployee(employee:Employee):Boolean
    def deleteEmployee(employee:Employee):Boolean
    def updateEmployee(employee: Employee):Boolean
    def showEmployee:ListBuffer[Employee]
}

class EmployeeService {
  val listBuffer:ListBuffer[Employee] = ListBuffer(Employee("kunal","faridabad",new Date(1992-9-21) ,new Date(2016-2-21),"Intern"),Employee("rishabh","kanpur",new Date(1991-2-2) ,new Date(2016-2-21),"Intern"))

  def addEmployee(employee: Employee): Boolean ={
    Future {
      listBuffer ++ ListBuffer(employee)
      true
    }
  }

  def deleteEmployee(employee: Employee): Unit ={
    listBuffer. map(emp => if(emp == employee)
      listBuffer.remove(listBuffer.indexOf(employee))
    )
  }

  def showEmployee:ListBuffer[Employee] = {
    listBuffer
  }
}
