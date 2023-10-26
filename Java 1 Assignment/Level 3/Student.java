/*
*
* Student.Java
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
* Abstract or base class of Student
*/
abstract public class Student 
{
    //Private attributes
    private String name;
    private String StudentId;
    //Protected attributes
    protected String programme;

    //Parameterized constructor
    Student(String name, String StudentId, String programme)
    {
        //Set the parameter name to name
        this.name = name;
        //Set the parameter StudentId to StudentId
        this.StudentId = StudentId;
        //Set the parameter programme to programme
        this.programme = programme;
    }   
    
    //List of getters
    //This method is used to get the Student ID
    public String getId()
    {
        //Return the Student id
        return StudentId;
    }
    
    //This method is used to get the Student Name
    public String getName()
    {
        //Return the Student name
        return name;
    }
    
    /*
    * 
    * This method later will be used for overriding in the derived class
    * Later it will be used for class Undergrad and Postgrad
    * Override method which applies polymorphism
    *
    */
    abstract double calculateSemFee();
    
    //This method is used to return the details of the student
    public String toString()
    {
        //Return the details of the Student
        //Starting from the Student Name, Student Id, and lastly, programme
        return "\nStudent: " + name + " ID: " + StudentId + " pursuing " + programme + " ";
    }
}