import java.util.*;
public class Parcel
{
    public static void main(String args[])
    {
        //Append scanner in order to read the data, regardless of their types
        Scanner input = new Scanner(System.in);
        
        //List of the declared variables
        double Weight;
        double Total;
        int ParcelNum;
        //Assign the default value, which is zero to be precise
        Total = 0;
        ParcelNum = 0;

        //Allow the user to input the parcel weight, 0 to stop the program
        System.out.print("Enter parcel weight in kg (0 to stop): ");
        Weight = input.nextDouble();

        //Using while loop with the statement Weight != 0, this statement explains
        //If the user input number zero through the input in the terminal, it will end the progra,
        while(Weight != 0)
        {
            if(Weight < 1)
            {
                //Declares variable "Cost1"
                double Cost1;
                //Assign the default value 5.50
                Cost1 = 5.50;
                //Returns the following message below
                System.out.print("For a parcel weight of ");
                //Formatted weight
                System.out.printf("%1.2f", Weight);
                System.out.print(", the cost is RM");
                //Formatted cost
                System.out.printf("%1.2f", Cost1);
                //Create new line in the terminal by 1 space
                System.out.println();
                System.out.println();                    
                //Count and sum the final total
                Total += Cost1; //Another way besides the following code is Total = Total + Cost1
            }
            else if((Weight >= 1) && (Weight < 5))
            {
                //Declares variable "Cost2"
                double Cost2;
                //Assign the default value 6.50
                Cost2 = 6.50;
                //Declares variable "CountTotal"
                //CountTotal variable is used to compute the multiplication of the cost followed by the weight
                double CountTotal = (Cost2 * Weight);
                //Returns the following message below
                System.out.print("For a parcel weight of ");
                //Formatted weight
                System.out.printf("%1.2f", Weight);
                System.out.print(", the cost is RM");
                //Formatted CountTotal
                System.out.printf("%1.2f", CountTotal);
                //Create new line in the terminal by 1 space
                System.out.println();
                System.out.println();
                //Count and sum the final total
                Total += CountTotal;
            }
            else
            {
                //Declares the variable "Cost3"
                double Cost3;
                //Assign the default value, which is 8.00
                Cost3 = 8.00;
                //Declares variable SubCountTotal
                //The function is same goes as variable "CountTotal", compute the value of the multiplication
                double SubCountTotal = (Cost3 * Weight);
                //Returns following message below
                System.out.print("For a parcel weight of ");
                //Formatted weight
                System.out.printf("%1.2f", Weight);
                System.out.print(", the cost is RM");
                //Formatted SubCountTotal
                System.out.printf("%1.2f", SubCountTotal);
                //Add new line in the terminal
                System.out.println();
                System.out.println();
                //The function of the following code below is as same as Total += CountTotal
                Total += SubCountTotal;
            }
            //Adds the value of the variable "ParcelNum" by 1
            ParcelNum += 1;
            //Ask the user to input the parcel weight again (if neccesary)
            System.out.print("Enter parcel weight in kg (0 to stop): ");
            Weight = input.nextDouble();
        }
        
        if(ParcelNum == 0 && Total == 0)
        {
            //It will display the following message below if the variable ParcelNum and Total still remains zero
            //This only happens when the user input "0" during the first input
            System.out.println();
            System.out.println("No parcels to send today!");
        }
        else
        {
            System.out.println();
            //Display the total number of parcels
            System.out.println("Total number of parcels is " + ParcelNum);
            //Display the total amount of RM(Ringgit) with formatted value
            System.out.print("With total amount of RM");
            System.out.printf("%1.2f", Total);
            //Adds one line in the terminal
            System.out.println();
        }
    }
}