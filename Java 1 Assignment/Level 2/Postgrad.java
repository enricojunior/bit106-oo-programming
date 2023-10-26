/*
*
* Postgrad.Java
* Modified by Enrico Junior
* This code was compiled using Visual Studio Code (Blue Colored Icon)
* Student ID : E2100297
* Assignment Java
* Date : 30 December 2022
* Current JDK version (Javac Version) : 19
* Java(TM) SE Runtime Environment (build 19+36-2238)
*
*/

/*
*
* Class Postgraduate
* This class is considered as the derived class of the Base Class Student
* It will inherit the details of the student consists of name, studentId, and programme
*
*/
public class Postgrad extends Student 
{
    //List of the private attributes
    private Academic supervisor;
    private String status;

    //Parameterized constructor
    //The parameterized constructor consists list of parameters
    //List of the parameter : name, studentId, programme, and supervisor
    Postgrad(String name, String studentId, String programme, Academic supervisor)
    {
        /*
        * Using super keyword to inherit all of the attributes from the base class
        */
        super(name, studentId, programme);
        //Set the parameter supervisor to this.supervisor
        this.supervisor = supervisor;
        //Set the default Value of the Postgrad Status to "AUDIT"
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
    * This method is used to calculate the Semester Fee according to the registered Course
    */
    double calculateSemFee()
    {
        //Declare the Variable PostsemFeePrice
        double PostsemFeePrice = 0;
        //Condition if the programme is Master Degree
        if(programme.startsWith("M") || programme.startsWith("m"))
        {
            //Set the Value of the PostsemFeePrice to 6000RM if the programme is Master Degree
            PostsemFeePrice = 6000;
        }
        //Condition if the programme refers to Ph.D
        else if(programme.startsWith("P") || programme.startsWith("p"))
        {
            //Set the Value of the PostsemFeePrice to 8000RM if the programme is Ph.D Degree
            PostsemFeePrice = 8000;
        }
        //Return the PostsemFeePrice
        return PostsemFeePrice;
    }
    /*
    *
    * This method is used to return the Postgrad Details
    * Furthermore, it will display the Postgrad Details followed by the status and the supervisor
    * and the total Semester Fee according to the number of registered Courses
    *
    */
    public String toString()
    {
        //Return the details of the Postgrad followed by the status, supervisor and the semester Tuition Fee
        return super.toString() + " ( " + status + " ) is under the supervision of " + supervisor + "\n" +
            "and has semester tuition fee: " + calculateSemFee() + "RM";
    }
}