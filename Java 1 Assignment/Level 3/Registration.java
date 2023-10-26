/*
*
* Registration.Java
* Created by Enrico Junior
* This code was compiled using Visual Studio Code (Blue Colored Icon)
* Student ID : E2100297
* Assignment Java
* Date : 30 December 2022
* Current JDK version (Javac Version) : 19
* Java(TM) SE Runtime Environment (build 19+36-2238)
*
*/

import java.util.Scanner;
//Driver Class (Main Class) of the program
public class Registration
{
    public static void main(String args[])
    {
        //Declare Scanner Variable in order to let the User prompt and enter Input
        Scanner Input = new Scanner(System.in);
        //Declare Variable ArraySizeSetter
        int ArraySizeSetter;

        //Prompt the User to Input the size of the list
        System.out.print("Enter size of the list : ");
        ArraySizeSetter = Input.nextInt();
        System.out.println();

        //The size of the StuManagementList is set according to the ArraySizeSetter
        StudentList StuManagementList = new StudentList(ArraySizeSetter);
        String UserOption = "";
        int RegisteredStu = 0;

        //List of attributes for Option 1
        String UGradName, UGradStuID, UGradProgramme;
        int creditsCompleted;

        //List of attributes for Option 2
        String PGradName, PGradStuID, PGradProgramme;
        String SupervisorName, SupervisorDesignation;

        //List of attributes for Option 3
        String DesiredID, UptStatus;
        char StatChoice;
        int ErrorValidateCode;

        //List of attributes for Option 4
        String ChoosedID, CourseName, CourseID;
        int SecondErrorValidateCode;

        //Using while-looping followed by Switch Case
        while(!((UserOption.equals("Q")) || (UserOption.equals("q"))))
        {
            //Call the function StuManagementMenu() to display the Menu System
            StuManagementMenu();
            //Prompt the User to input the Choice
            System.out.print("Enter your choice: ");
            UserOption = Input.next();
            //Applying switch-case
            switch(UserOption)
            {
                //Case if the User Option is 1
                case "1":
                    //Condition if the User unable to add more Undergraduate Students
                    if(RegisteredStu == ArraySizeSetter)
                    {
                        //This message will be displayed if the Registered Student has reached the Max Limit
                        System.out.println("Unable to register any more Undergraduate Students!");
                        //This message is used to inform the User to insert another option
                        System.out.println("Please insert another option!");
                        //Create new line
                        System.out.println();
                    }
                    //Condition else otherwise
                    else
                    {
                        Input.nextLine();
                        //Prompt the User to enter the Undergraduate Name
                        System.out.print("Enter Name: ");
                        UGradName = Input.nextLine();
                        //Prompt the User to enter the Undergraduate ID
                        System.out.print("Enter Id: ");
                        UGradStuID = Input.nextLine();
                        //Prompt the User to enter the Undergraduate Programme
                        System.out.print("Enter Programme: ");
                        UGradProgramme = Input.nextLine();
                        //Prompt the User to enter the Undergraduate Current Completed Credits
                        System.out.print("Enter Credits Completed: ");
                        creditsCompleted = Input.nextInt();
                        //Create a new object Undergrad called NewUGraduate and set all of the attributes to the object
                        Undergrad NewUGraduate = new Undergrad(UGradName, UGradStuID, UGradProgramme, creditsCompleted);
                        //This code is used to add Undergraduate Student to the StudentManagementList
                        StuManagementList.addStudent(NewUGraduate);
                        //Increase/Increment the Value of RegisteredStu to 1, once the Undergrad sucessfully added to the list
                        RegisteredStu = RegisteredStu + 1;
                        //Create a new line
                        System.out.println();
                    }
                    break;
                //Case if the User Option is 2
                case "2":
                    //Condition if the User unable to add more Undergraduate Students
                    if(RegisteredStu == ArraySizeSetter)
                    {
                        //This message will be displayed if the Registered Student has reached the Max Limit
                        System.out.println("Unable to register any more Postgraduate Students!");
                        //This message is used to inform the User to insert another option
                        System.out.println("Please insert another option!");
                        //Create a new line
                        System.out.println();
                    }
                    else
                    {
                        Input.nextLine();
                        //Prompt the User to enter the Postgraduate Name
                        System.out.print("Enter Name: ");
                        PGradName = Input.nextLine();
                        //Prompt the User to enter the Postgraduate ID
                        System.out.print("Enter Id: ");
                        PGradStuID = Input.nextLine();
                        //Prompt the User to enter the Postgraduate Programme
                        System.out.print("Enter Programme: ");
                        PGradProgramme = Input.nextLine();
                        //Condition if the Programme does not starts with P
                        //NOTE : There are only two option, which are Master Degree (M) or Professor Degree (P)
                        if(!(PGradProgramme.startsWith("P") || PGradProgramme.startsWith("p") || PGradProgramme.startsWith("M") || PGradProgramme.startsWith("m")))
                        {
                            //Display the following message if the Programme is invalid
                            System.out.println("\nInvalid Programme! Try again!");
                            //Use while-loop if the Programme remains Invalid
                            while(!(PGradProgramme.startsWith("P") || PGradProgramme.startsWith("p") || PGradProgramme.startsWith("M") || PGradProgramme.startsWith("m")))
                            {
                                //Prompt the User to enter the Postgraduate Programme again
                                System.out.print("Enter programme: ");
                                PGradProgramme = Input.nextLine();
                            }
                        }
                        //Prompt the User to enter the Supervisor Name
                        System.out.print("Enter Supervisor Name: ");
                        SupervisorName = Input.nextLine();
                        //Prompt the User to enter the Supervisor Designation
                        System.out.print("Enter Supervisor Designation: ");
                        SupervisorDesignation = Input.nextLine();
                        //Create a new object Academic called NewStuSupervisor and set all of the Supervisor Attributes
                        Academic NewStuSupervisor = new Academic(SupervisorName, SupervisorDesignation);
                        //Create a new object Postgrad called NewPGraduate and set all of the Postgraduate Attributes
                        Postgrad NewPGraduate = new Postgrad(PGradName, PGradStuID, PGradProgramme, NewStuSupervisor);
                        //This code is used to add Postgraduate to the StudentManagementList
                        StuManagementList.addStudent(NewPGraduate);
                        //Increase/Increment the Value of RegisteredStu to 1, once the Undergrad sucessfully added to the list
                        RegisteredStu = RegisteredStu + 1;
                        //Create a new line
                        System.out.println();
                    }
                    break;
                //Case if the User Option is 3
                case "3":
                    Input.nextLine();
                    //Prompt the User to enter the Desired Postgraduate ID
                    System.out.print("Enter Id: ");
                    DesiredID = Input.nextLine();
                    //Call the function PostGradStatusSetMenu() to display the Menu
                    PostGradStatusSetMenu();
                    //Prompt the User to enter the Status
                    System.out.print("Enter choice: ");
                    StatChoice = Input.nextLine().charAt(0);

                    //Condition if the StatChoice is R
                    if(StatChoice == 'R')
                    {
                        //UptStatus is set to "RESEARCH" if the User choice is R
                        UptStatus = "RESEARCH";
                    }
                    //Condition if the StatChoice is T
                    else if(StatChoice == 'T')
                    {
                        //UptStatus is set to "THESIS WRITING" if the User choice is T
                        UptStatus = "THESIS WRITING";
                    }
                    //Condition if the StatChoice is not on the Menu Option
                    else
                    {
                        //UptStatus is set to "AUDIT" if the User choice is invalid
                        UptStatus = "AUDIT";
                    }
                    //Assign the Value of the ErrorValidateCode from the object StuManagementList method
                    ErrorValidateCode = StuManagementList.setStatus(DesiredID, UptStatus);
                    //Condition if the ErrorValidateCode is 505
                    if(ErrorValidateCode == 505)
                    {
                        //This message will be displayed if the Status has been sucessfully updated
                        System.out.println("Sucessfully Updated the Postgraduate Status..");
                        //Create a new line
                        System.out.println();
                    }
                    //Condition if the ErrorValidateCode is 404
                    else if(ErrorValidateCode == 404)
                    {
                        //This message will be displayed if the Status failed to Update
                        System.out.println("Failed Updating the Postgraduate Status..");
                        //Create a new line
                        System.out.println();
                    }
                    //Condition if the ErrorValidateCode is 303
                    else if(ErrorValidateCode == 303)
                    {
                        //This message occurs if the Student ID belongs to an Undergraduate
                        System.out.println("This Student ID doesn't belong to Postgraduate..");
                        //Create a new line
                        System.out.println();
                    }
                    //Condition else otherwise
                    else
                    {
                        //This message will be displayed if the Student ID was not found in the list
                        System.out.println("Unable to find the Student ID! Please try again!");
                        //Create a new line
                        System.out.println();
                    }
                    break;
                //Case if the User Option is 4
                case "4":
                    Input.nextLine();
                    //Prompt the User to enter Undergraduate ID
                    System.out.print("Enter Id: ");
                    ChoosedID = Input.nextLine();
                    //Prompt the User to enter the Course Name
                    System.out.print("Enter Course Name: ");
                    CourseName = Input.nextLine();
                    //Prompt the User to enter the Course Code/ID
                    System.out.print("Enter Course Code: ");
                    CourseID = Input.nextLine();
                    //Create a new object Course called NewStuCourse and set the attributes to the Object
                    Course NewStuCourse = new Course(CourseName, CourseID);
                    //Assign the Value of SecondErrorValidateCode from StuManagementList register method
                    SecondErrorValidateCode = StuManagementList.registerCourse(ChoosedID, NewStuCourse);
                    //Condition if the SecondErrorValidateCode is 505
                    if(SecondErrorValidateCode == 505)
                    {
                        //This message will be displayed if the Course has been sucessfully registered
                        System.out.println("Sucessfully Registered a New Course..");
                        //Create a new line
                        System.out.println();
                    }
                    //Condition if the SecondErrorValidateCode is 404
                    else if(SecondErrorValidateCode == 404)
                    {
                        //This message will be displayed if the Course is failed to register
                        System.out.println("Course cannot be registered (Maximum Reached)");
                        //Create a new line
                        System.out.println();
                    }
                    //Condition if the SecondErrorValidateCode is 303
                    else if(SecondErrorValidateCode == 303)
                    {
                        //This message occurs if the Student ID belongs to an Undergraduate
                        System.out.println("This Student ID doesn't belong to Undergraduate..");
                        //Create a new line
                        System.out.println();
                    }
                    //Condition if the SecondErrorValidateCode is -1
                    else
                    {
                        //This message occurs if the Student ID was not found in the StuManagementList
                        System.out.println("Unable to find the Student ID! Please try again!");
                        //Create a new line
                        System.out.println();
                    }
                    break;
                //Case if the User Option is 5
                case "5":
                    //Display the title
                    System.out.println("List of the Registered Students: ");
                    //The code below is used to get all of the Registered Students
                    System.out.println(StuManagementList.toString());
                    //Create a new line
                    System.out.println();
                    break;
                //Case if the User Option is "Q" or "q"
                case "Q": case "q":
                    //Create a new line
                    System.out.println();
                    System.out.println("************* END OF PROGRAM *************");
                    break;
                //Case if the User Option is invalid
                default:
                    //This message will displayed if the User Option is Invalid
                    System.out.println("Invalid option! Please try again!");
                    //Additonal message to let know the User to select available choices according to the Menu
                    System.out.println("Enter the available choices!");
                    //Create a new line
                    System.out.println();
            }
        }        
    }
    //Menu Function of Student Management System
    public static void StuManagementMenu()
    {
        //Option for the User to Add Undergraduate Student to the Student List
        System.out.println("1 --> Add Undergrad Student");
        //Option for the User to Add Postgraduate Student to the Student List
        System.out.println("2 --> Add Postgrad Student");
        //Option for the User to Set Status for Postgraduate
        System.out.println("3 --> Set Status");
        //Option for the User to Register Course for Undergraduate
        System.out.println("4 --> Register Course");
        //Option for the User to display all of the Registered Students
        //Registered Students consists a mixture of Undergraduate and Postgraduate
        System.out.println("5 --> All Registered Students");
        //Option for the User to enter quit to exit program
        System.out.println("Q/q --> Quit");
    }
    //Menu Function to let the Post Graduate Select the Status Option
    public static void PostGradStatusSetMenu()
    {
        //Research Option
        System.out.println("R -> RESEARCH");
        //Thesis Writing Option
        System.out.println("T -> THESIS WRITING");
    }
}