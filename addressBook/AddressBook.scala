package addressBook;
import java.io.FileWriter
import com.google.gson.Gson
import scala.io.Source

//Person class to store data
class Person {
  var name_first = ""
  var name_last = ""
  var address = ""
  var city = ""
  var state = ""
  var zip = 0
  var contact = 0L

  //Constructor
  def this(f_name: String, l_name: String, given_address: String, given_city: String, given_state: String, code: Int, number: Long) {
    this()
    this.name_first = f_name
    this.name_last = l_name
    this.address = given_address
    this.city = given_city
    this.state = given_state
    this.zip = code
    this.contact = number
  }

  //Converting detail in String
  def getString: String = {
    "First name : " + this.name_first + "\n" + "Last name : " + this.name_last + "\n" + "Address : " + this.address + "\n" + "City : " + this.city + "\n" + "State : " + this.state + "\n" + "Zip code : " + this.zip + "\n" + "Contack no : " + this.contact + "\n"
  }
}




class AddressBook{
  //Function to load data from file
  def loadData(): Unit = {
    var json_mgr = new Gson()
    var address_book: String = "/home/admin1/IdeaProjects/Scala-Design-Pattern-Programs/src/main/scala/addressBook/contact.json"
    var strGrains = getFileData(address_book)
    var data: Array[Person] = json_mgr.fromJson(strGrains, classOf[Array[Person]])
    printDetails(data)
  }

  //Function to get data from file to the String
  def getFileData(path: String): String = {
    var file = path
    val data = Source.fromFile(file)
    var sentence: String = ""
    for (line <- data.getLines) {
      sentence += line
    }
    sentence
  }

  //Function to print details
  def printDetails(persons: Array[Person]): Unit = {
    for (i <- persons) {
      var tempPerson:Person = i
      println(tempPerson.getString)
    }
  }
}