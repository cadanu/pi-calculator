/* PiCalculator.java: This is a simple java program that can infinitely calculates the value of pi,
 *                    or as per user input.
 *
 * Author: G.D.Joyce
 */

// import declaration
import java.util.Scanner;

// PiCalculator class declaration
public class PiCalculator
{

    // calculate method declaration
    public double calculate(long end)
    {
        // variable declarations
        double denomCount = -1;
        double result1;
        double result2;
        double PI = 0;
        double calc;
        int count = 0;

        // this do-while loop calculates the value of PI
        do
        {
            //
            denomCount += 2;
            result1 = 1.0/denomCount;

            denomCount += 2;
            result2 = 1.0/denomCount;

            calc = 4 * (result1 - result2);
            PI += calc;
            count++;
        }
        while(count<=end); // end of do-while loop

        return PI;
    }// end of calculate method


    // main method signature
    public static void main(String[] args)
    {
        // new object declarations
        Scanner input = new Scanner(System.in);
        PiCalculator self = new PiCalculator();

        // program ui begin
        System.out.println("This program calculates the value of PI as long as you want.");
        System.out.print("Enter the amount of times you want the calculation to run: ");
        Long endPoint = input.nextLong();

        // if statement to catch numbers less than 1
        if(endPoint > 0)
        {
            // print result
            System.out.println("The value of PI is " + self.calculate(endPoint));
        }
        else
        {
            System.out.println("You have chosen to calculate nothing.");
        }// end if-else statement

    }// end of main method

}// end of PiCalculator class