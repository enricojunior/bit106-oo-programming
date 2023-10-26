/*
*
* Undergrad.Java
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
* Class Undergraduate
* This class is considered as the derived class of the Base Class Student
* It will inherit the details of the student consists of name, studentId, and programme
*
*/
public class Undergrad extends Student
{
    //I add an extra Variable with keyword final and int, so it means that the value is no longer be able to be modified
    //Variable name called ArraySize and initialized value by 4
    private final int ArraySize = 4;

    //Required Attributes according to the Class Diagram 
    private Course[] courseList;
    private int creditsCompleted;
    private int noOfCoursesRegistered; 

    /*
    *
    * Parameterized Constructor
    * The constructor consists list of parameters , such as:
    * name, studentId, programme, and creditsCompleted
    *
    */
    Undergrad(String name, String StudentId, String programme, int creditsCompleted)
    {
        /*
        * Using super keyword to inherit all of the attributes from the base class
        */
        super(name, StudentId, programme);
        //Set the parameter creditsCompleted to this.creditsCompleted
        this.creditsCompleted = creditsCompleted;

        //Set the Array Size of courseList to 4
        courseList = new Course[ArraySize];
        //Set the default Value of noOfCoursesRegistered to 0
        noOfCoursesRegistered = 0;
    }
    /*
    * This method is to let the Undergraduate Registering a Course
    * Using boolean logic = true, false
    */
    public boolean registerCourse(Course NewCourse)
    {
        //Condition if the noOfCoursesRegistered Value is same as the Array Size
        if(noOfCoursesRegistered == ArraySize){
            //Return False according to the condition
            return false;
        }
        //Set the NewCourse to the courseList index
        courseList[noOfCoursesRegistered] = NewCourse;
        //Increment the Value of the noOfCoursesRegistered by 1
        noOfCoursesRegistered = noOfCoursesRegistered + 1;
        //Return the Value "true"
        return true;
    }
    /*
    * This method is used to calculate the Semester Fee according to the registered Course
    */
    double calculateSemFee()
    {
        //Declare the Variable UndersemFeePrice
        double UndersemFeePrice;
        //Set the credit Hour for all of the Undergrad Courses by 4
        int creditHour = 4;
        //Set the FeePerCreditHour by 500
        int FeePerCreditHour = 500;
        /*
        *
        * Performing an arithmetic computation of the semFeePrice
        * Each courses that has been registered has 4 credit
        * Furthermore, the fee of credit per hour is 500
        *
        */
        UndersemFeePrice = noOfCoursesRegistered * creditHour * FeePerCreditHour;
        //Return the calculation of the Sem Fee Price
        return UndersemFeePrice;
    }
    /*
    *
    * This method is used to return the Undergrad Details
    * Furthermore, it will display list of the Registered Courses
    * and the total Semester Fee according to the number of registered Courses
    *
    */
    public String toString()
    {
        //Initialize Variable UndergradDetails to an empty string
        String UndergradDetails = "";

        //Add the following details of the Students to the Undergrad Details 
        UndergradDetails += super.toString() + "has completed " + creditsCompleted + " credits\n";

        //Condition if the noOfCoursesRegistered is 0
        if(noOfCoursesRegistered == 0)
        {
            //Add the following description indicating that no Courses registered in the list
            //The value of the Calculate Semester Fee is set to 0
            UndergradDetails += "The student has not registered for any courses this semester\n" +
                "and has the semester tuition fee: " + calculateSemFee() + "RM";
        }
        //Condition else, which means noOfCoursesRegistered is more than 0
        else
        {
            //Add the following description to the UndergradDetails, display the number of Courses Registered
            UndergradDetails += "The student has registered for the following " + noOfCoursesRegistered + " courses this semester\n\n";
            //Using counter-controlled loop by using repetition
            for(int i = 0; i < noOfCoursesRegistered; i++)
            {
                //Add and display the following registered course one per line
                UndergradDetails += courseList[i].toString() + "\n";
            }
            //Add and display the semester tuition fee
            UndergradDetails += "and has semester tuition fee: " + calculateSemFee() + "RM";
        }
        //Return the Undergraduate Details
        return UndergradDetails;
    }   
}