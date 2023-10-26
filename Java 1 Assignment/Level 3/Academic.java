/*
*
* Academic.Java
* Modified by Enrico Junior
* This code was compiled using Visual Studio Code (Blue Colored Icon)
* Student ID : E2100297
* Assignment Java
* Date : 30 December 2022
* Current JDK version (Javac Version) : 19
* Java(TM) SE Runtime Environment (build 19+36-2238)
*
*/

//Class Academic
//This class is used to set the details of the Supervisor of Post-Graduates
public class Academic
{  
    //List of the private attributes
    private String name;
    private String designation;
    
    /*
    *
    * Constructor with parameter
    * List of the parameter : name, designation
    *
    */
    Academic(String name, String designation) 
    {
        //Set the parameter name to this.name
        this.name = name;
        //Set the parameter designation to this.designation
        this.designation = designation;
    } 
    /*
    * This method is used to return the details regarding to the name and the designation
    */
    public String toString(){
        //Return the designation followed by the supervisor name
        return designation + " " + name;
    }  
}