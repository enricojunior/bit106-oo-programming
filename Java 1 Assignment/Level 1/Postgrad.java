/*
*
* Postgrad.Java
* Created by Enrico Junior
* This code was compiled using Visual Studio Code (Blue Colored Icon)
* Student ID : E2100297
* Assignment Java
* Date : 30 December 2022
* Current JDK version (Javac Version) : 19
* Java(TM) SE Runtime Environment (build 19+36-2238)
*
*/

//Postgraduate Class
public class Postgrad
{
    //List of private attributes
    private String name;
    private String studentId;
    private String programme;
    private String status;
    //This attribute is coming from the Academic.java file, and the variable was declared as supervisor
    private Academic supervisor;

    //Parameterized constructor
    //The parameterized constructor consists list of parameters
    //List of the parameter : name, studentId, programme, and supervisor
    Postgrad(String name, String studentId, String programme, Academic supervisor)
    {
        //Set the parameter name to this.name
        this.name = name;
        //Set the parameter studentId to this.studentId
        this.studentId = studentId;
        //Set the parameter programme to this.programme
        this.programme = programme;
        //Set the parameter supervisor to this.supervisor
        this.supervisor = supervisor;
        //Set the default Value of status to "AUDIT"
        status = "AUDIT";
    }    

    /*
    *
    * This method is used to set the status 
    * Using boolean logic
    * The parameter is status
    * In this method, it will Validate the status
    * Returns true if the status is either "RESEARCH" or "THESIS WRITING"
    * Returns false otherwise
    *
    */
    public boolean setStatus(String status)
    {
        //Declare boolean type variable "ValidStat"
        //ValidStat stands as Validate Statement, this variable will be used to validate the status of Postgrad
        boolean ValidStat;
        //Condition if the status equals "RESEARCH"
        if(status.equals("RESEARCH"))
        {
            //Set the boolean value of Valid Stat to true
            ValidStat = true;
            //Status is set to Research
            this.status = "RESEARCH";
        }
        //Condition if the status equals "THESIS WRITING"
        else if(status.equals("THESIS WRITING"))
        {
            //Set the boolean value of Valid Stat to true
            ValidStat = true;
            //Status is set to Thesis Writing
            this.status = "THESIS WRITING";
        }
        //Condition else otherwise
        else
        {
            //Boolean Value is set to false, if the status is neither Research or Thesis Writing
            ValidStat = false;
        }
        //Return the Value of ValidStat
        return ValidStat;
    }

    /*
    * This method is used to get the Details of the Post-Grad
    * Starting from the name, studentId, programme, status, and finally the supervisor
    */
    public String toString()
    {
        //Return the details of the Postgrad Student, starting from the name, Student ID, status, and the supervisor
        return "Student: " + name + " ID: " + studentId + " pursuing " + programme + " ( " + status + " ) is under the supervision of " + supervisor; 
    }
}