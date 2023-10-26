/*
*
* Undergrad.Java
* Created by Enrico Junior
* This code was compiled using Visual Studio Code (Blue Colored Icon)
* Student ID : E2100297
* Assignment Java
* Date : 30 December 2022
* Current JDK version (Javac Version) : 19
* Java(TM) SE Runtime Environment (build 19+36-2238)
*
*/

//Undergrad class
public class Undergrad {
    //List of private attributes
    private final int ArraySize = 4;
    private String name;
    private String studentId;
    private String programme;
    //List of the additional attributes which will store list of the Courses
    private Course[] courseList;
    private int creditsCompleted;
    //Additional attribute 'CourseCount' which will be used to count the registered Course
    private int courseCount;

    //Parameterized Constructor
    Undergrad(String name, String studentId, String programme, int creditsCompleted)
    {
        this.name = name;
        this.studentId = studentId;
        this.programme = programme;
        this.creditsCompleted = creditsCompleted;
        //Create a new array to store list of the registered course
        //Set the array size to 4
        courseList = new Course[ArraySize];
        //This variable is initialized in the Constructor in order to count the number of the registered course
        //It is set to 0 as the default Value
        courseCount = 0;
    }

    //This method is used to add the following registered course to the list
    public boolean registerCourse(Course NewCourse)
    {
        //Condition if the number of courseCount is as same as the number of elements in course list
        if(courseCount == 4)
        {
            //Display the following message if the Registered Number of Courses has exceeding the limits
            System.out.println("Course cannot be registered : (Maximum Reached)\n");
            //Return false if the registered course is exceeding the limits which is 4
            return false;
        }
        //Add the following course to list of the array
        courseList[courseCount] = NewCourse;
        //Increment the Course Count by 1 once a course successfully registered and append it to the array
        courseCount = courseCount + 1;
        //Return true from the following description above
        return true;
    }
    /*
    * The following method below is used to return the Details of the Undergraduate
    */
    public String toString()
    {
        //Set the default UndergradDetails value to empty string
        String UndergradDetails = "";
        //Add the description of the UndergradDetails consisting the Student Description
        //Starting from name, studentId, programme, and credits completed
        UndergradDetails += "Student: " + name + " ID: " + studentId + " pursuing " + programme + " has completed " 
            + creditsCompleted + " credits\n";
            
        //Condition if the Course Count remains 0
        if(courseCount == 0)
        {
            //Add and display the following message indicating that the following Undergrad student has not registered any courses
            UndergradDetails += "The student has not registered for any courses for this semester\n";
        }
        //Condition else otherwise
        else
        {
            //Add and display the following messafe indicating that the following Undergrad student has registered any courses
            UndergradDetails += "The student has registered for the following " + courseCount + " courses this semester\n";
            //Using counter-controlled loop
            for(int i = 0; i < courseCount; i++)
            {
                //Display list of the registered Course one per line
                UndergradDetails += courseList[i].toString() + "\n";
            }
        }
        //Return the Undergraduate Details
        return UndergradDetails;
    }
}