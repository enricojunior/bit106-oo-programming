/*
*
* Course.Java
* Modified by Enrico Junior
* This code was compiled using Visual Studio Code (Blue Colored Icon)
* Student ID : E2100297
* Assignment Java
* Date : 30 December 2022
* Current JDK version (Javac Version) : 19
* Java(TM) SE Runtime Environment (build 19+36-2238)
*
*/

//Class Course
//In this class, It will display the Course Details which was registered By the Undergraduate Students
public class Course 
{
    //List of the private attributes
    //Contains two attributes which are name and code
    private String name;
    private String code;
    
    //Constructor with parameter
    //No access modifier included, which means that the constructor is private-packaged
    //Parameterized constructor which contains two parameters : name, code
    Course(String name, String code)
    {
        //Set the parameter name to this.name
        this.name = name;
        //Set the paramater code to this.code
        this.code = code;
    }
    //This method is used to return the description of the Course
    public String toString() 
    {
        //Return the description of the course name followed by the course code
        return code + ": " + name;
    }
}