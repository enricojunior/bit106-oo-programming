/*
*
* StudentList.Java
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
* Class StudentList
* In this class, it will store multiple list of registered Student whether Undergraduate or Postgraduate
*
*/
public class StudentList 
{  
    //List of the attirbutes
    private int noOfStudents;
    private Student[] studentList;
    private int MAXSTUDENTS;
    
    /*
    * Parameterized Constructor
    * This parameter only consists one parameter, which is only maxStudents
    */
    StudentList(int maxStudents)
    {
        //Create a new array of students which will used later in the Main class, Registration.java
        studentList = new Student[maxStudents];
        //Set the default Value of Number of students to 0
        noOfStudents = 0;
        //Set the max Students according to the parameter
        this.MAXSTUDENTS = maxStudents;
    }
    
    //This method is used add New Student (Postgrad/Undergrad) to the list
    boolean addStudent(Student NewStudent)
    {
        //Condition oif noOfStudents value is same as the MAXSTUDENTS
        if(noOfStudents == MAXSTUDENTS)
        {
            //Return condition false
            return false;
        }
        //Set the NewStudent to the array and according to the index
        studentList[noOfStudents] = NewStudent;
        //Increment the number of registered students by 1
        noOfStudents = noOfStudents + 1;
        //Return condition true if the slot isn't maxed out yet
        return true;
    }

    /*
    *
    * This method below is used to set the status of the Postgraduate Student
    * It takes two parameters which are studentId which is used for a validation
    * Meanwhile the status can be only set either RESEARCH OR THESIS WRITING
    *
    */
    int setStatus(String studentId, String status)
    {
        //Intialize the variable PGradStuFounded to 0
        //0 is set as the default Value
        int PGradStuFounded = 0;
        //Using counter-controlled loop
        for(int i = 0; i < noOfStudents; i++)
        {
            //Condition if the StudentId of Postgrad was found in the Student List
            if(studentList[i].getId().equals(studentId))
            {      
                //Modify the Value of PGradStuFounded to 10
                PGradStuFounded = 10;
                //Condition if the StudentList is the instance of Postgraduate
                if(studentList[i] instanceof Postgrad)
                {
                    //Condition if the Status has been sucessfully updated
                    if(((Postgrad) studentList[i]).setStatus(status))
                    {
                        //Return error code 505 to display if the Status has been sucessfully updated
                        return 505;
                    }
                    //Condition if the Status failed to update
                    else
                    {
                        //Return error code 404 to inform that the status was failed to be updated
                        return 404;
                    }
                }
                //Condition else otherwise
                else
                {
                    //Return error 303, showing that the studentID doesn't belong to a specific Postgraduate
                    return 303;
                }
            }
        }
        //Default return
        return -1;
    }  

    /*
    *
    * This method below is used to register Course for Undergrad Students
    * It takes two parameters which are studentId which is used for a validation
    * Meanwhile, for the Course is used to register a specific course to a certain Undergrad Student
    *
    */
    int registerCourse(String studentId, Course NewCourse)
    {
        //Initialize the variable UGradStuFound to 0
        //0 is set as the default Value
        int UGradStuFound = 0;
        //Using counter-controlled looping
        for(int i = 0; i < noOfStudents; i++)
        {
            //Condition if the StudentId of Undergrad was found in the Student List
            if(studentList[i].getId().equals(studentId))
            {
                //Modify the Value of UGradStuFound to 10
                UGradStuFound = 10;
                //Condition if the StudentList is the instance of Undergraduate
                if(studentList[i] instanceof Undergrad)
                {
                    //Condition if the Course has been successfully registered and store to the list
                    if(((Undergrad) studentList[i]).registerCourse(NewCourse))
                    {
                        //Return error code 505 to display if the Course has been successfully registered
                        return 505;
                    }
                    //Condition if the Course failed to register
                    else
                    {
                        //Return error code 404 to inform that that Course was failed to be registered
                        return 404;
                    }
                }
                //Condition else otherwise
                else
                {
                    //Return error 303, showing that the studentID doesn't belong to a specific Undergraduate
                    return 303;
                }
            }
        }
        //Default return
        return -1;
    }
    /*
    * This method is used to return the list of both Undergrad & Postgrad Details
    */
    public String toString()
    {
        //Initialize the variable Message to an empty string
        String StuListMessage = "";
        //Using counter controlled loop which is for loop to display list of the Students one by one
        for(int i = 0; i < noOfStudents; i++)
        {
            //Add the following details of the StudentList one per line
            StuListMessage += studentList[i].toString() + "\n------------------------------";
        }
        //Return the Message
        return StuListMessage;
    }    
}