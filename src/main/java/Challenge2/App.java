package Challenge2;

/*

 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sahar Sheikholeslami

 */

import java.util.Scanner;

/*
Exercise 10 - Self-Checkout
Challenge 2 - DONE!

Working with multiple inputs and currency can introduce some tricky precision issues.

Create a simple self-checkout system. Prompt for the prices and quantities of three items.
Calculate the subtotal of the items. Then calculate the tax using a tax rate of 5.5%. Print out
the line items with the quantity and total, and then print out the subtotal, tax amount, and total.

Example Output
Enter the price of item 1: 25
Enter the quantity of item 1: 2
Enter the price of item 2: 10
Enter the quantity of item 2: 1
Enter the price of item 3: 4
Enter the quantity of item 3: 1
Subtotal: $64.00
Tax: $3.52
Total: $67.52
Constraints
Keep the input, processing, and output parts of your program separate.
Collect the input, then do the math operations and string building, and then print out the output.
Be sure you explicitly convert input to numerical data before doing any calculations.
Challenges
1) Revise the program to ensure that prices and quantities are entered as numeric values.
Don’t allow the user to proceed if the value entered is not numeric.
2) Alter the program so that an indeterminate number of items can be entered.
 The tax and total are computed when there are no more items to be entered.
 */
public class App {

    public static void main(String[] args) {
        final double TAXRATE = 5.5;
        Scanner input = new Scanner(System.in);

        int itemPrice=0;
        int itemQuantity=0;
        int i=0;
        double Subtotal=0, Tax=0, Total=0;

        while (true) {



            System.out.print("Enter the price of item " + (i + 1) + ": ");

            itemPrice = Integer.parseInt(input.nextLine());

            System.out.print("Enter the quantity of " + (i + 1) + ": ");
            itemQuantity = Integer.parseInt(input.nextLine());

            Subtotal += itemPrice*itemQuantity;

            System.out.println("would you like to continue? ");
            String answer = input.nextLine();
            if (answer.equals("No"))
                break;
            i++;
        }

        Tax = (Subtotal * TAXRATE)/100;

        Total = Tax+Subtotal;

        String output = String.format("Subtotal: %.2f\nTax: %.2f\nTotal: %.2f", Subtotal, Tax, Total);
        System.out.println(output);

    }
}
