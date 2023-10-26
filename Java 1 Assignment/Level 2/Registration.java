/*
*
* Registration.Java
* Modified by Enrico Junior
* This code was compiled using Visual Studio Code (Blue Colored Icon)
* Student ID : E2100297
* Assignment Java
* Date : 30 December 2022
* Current JDK version (Javac Version) : 19
* Java(TM) SE Runtime Environment (build 19+36-2238)
*
*/

//Driver Class
//Main Program - Registration.java
public class Registration
{
    public static void main(String args[])
    {
        //Create a new object called "Student1"
        Undergrad Student1 = new Undergrad("Ali", "1", "BIT", 10);
        //Create list of 4 courses for the following "Student1" object
        //Details of the Courses according to the Parameter
        Course FirstCourse = new Course("Web Pro", "BIT210");
        Course SecondCourse = new Course("Java", "BIT106");
        Course ThirdCourse = new Course("Operating System", "BIT110");
        Course FourthCourse = new Course("Data Structures", "BIT208");

        //Assume that I would like to add the following courses to the following Object Student1
        //Registering First Course for Student1
        Student1.registerCourse(FirstCourse);
        //Registering Second Course for Student1
        Student1.registerCourse(SecondCourse);
        //Registering Third Course for Student1
        Student1.registerCourse(ThirdCourse);
        //Registering Fourth Course for Student1
        Student1.registerCourse(FourthCourse);

        //Display the Student Description followed by list of the registered courses
        System.out.println(Student1.toString());

        //Create a new Second Undergrad Student with following details
        Undergrad Student2 = new Undergrad("Alice", "2", "BCS", 70);
        //Display the Student Description
        System.out.println(Student2.toString());

        //Create a new Supervisor Object
        Academic Supervisor1 = new Academic("Abdul Wahab", "Prof.");
        //Now, moving on creating a new Postgraduate Object
        Postgrad Student3 = new Postgrad("Adil", "8", "Ph.D", Supervisor1);
        //Set the status of the Postgrad
        Student3.setStatus("RESEARCH");
        //Display the information about the Postgraduate
        System.out.println(Student3.toString());

        System.out.println();
        //Create a new Supervisor Object
        Academic Supervisor2 = new Academic("Xi Ping", "Assoc. Prof.");
        //Create a new Postgrad Object called Student4
        Postgrad Student4 = new Postgrad("Sally", "7", "MIT", Supervisor2);
        //Set the status of the Postgrad
        Student4.setStatus("THESIS WRITING");
        //Display the information about the Postgraduate
        System.out.println(Student4.toString());
    }
}