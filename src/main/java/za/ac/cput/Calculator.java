package za.ac.cput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author Siyamtanda Tonjeni - 217107958
 * Assignment one - Calculator main program
 * */

public class Calculator {
        static Scanner scn = new Scanner(System.in);
        static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        public double addition(double sum1, double sum2){
            char exitAddition = 'y';
            try {
                do {
                    try {
                        System.out.print("Enter first value: ");
                        double firstValue = Double.parseDouble(br.readLine()); //scn.nextDouble();
                        System.out.print("Enter second value: ");
                        double secondValue = Double.parseDouble(br.readLine()); //scn.nextDouble();
                        double sum = firstValue + secondValue;
                        System.out.println(firstValue + " + " + secondValue + " = " + sum);
                    } catch (NumberFormatException nfe) {
                        System.out.println("Error!! " + nfe.getMessage());
                    }

                    System.out.print("Are you done with addition? Yes/No: ");
                    exitAddition = scn.next().toLowerCase().charAt(0);

//checking if the entered option matches the options provided
                    while ((exitAddition != 'y') && (exitAddition != 'n')) {
                        System.out.print("Incorrect entry. Expected Yes or No. Exit addition? Yes/No: ");
                        exitAddition = scn.next().toLowerCase().charAt(0);
                    }
                } while (exitAddition != 'y');
            }catch (IOException ioe){
                System.out.println("Error!! " + ioe.getMessage());
            }
            return exitAddition;
        }

        public double subtraction(double sum1, double sum2){
            char exitSubtraction = 'y';
            try {
                do {
                    try {
                        System.out.print("Enter first value: ");
                        double firstValue = Double.parseDouble(br.readLine()); //scn.nextDouble();
                        System.out.print("Enter second value: ");
                        double secondValue = Double.parseDouble(br.readLine()); //scn.nextDouble();
                        double subtraction = firstValue - secondValue;
                        System.out.println(firstValue + " - " + secondValue + " = " + subtraction);
                    } catch (NumberFormatException nfe) {
                        System.out.println("Error!! " + nfe.getMessage());
                    }


                    System.out.print("Are you done with subtraction? Yes/No: ");
                    exitSubtraction = scn.next().toLowerCase().charAt(0);

//checking if the entered option matches the options provided
                    while ((exitSubtraction != 'y') && (exitSubtraction != 'n')) {
                        System.out.print("Incorrect entry. Expected Yes or No. Exit subtraction? Yes/No: ");
                        exitSubtraction = scn.next().toLowerCase().charAt(0);
                    }
                } while (exitSubtraction != 'y');
            }catch (IOException ioe){
                System.out.println("Error!! " + ioe.getMessage());
            }
            return exitSubtraction;
        }



        public static void main( String[] args ) throws IOException
        {
            Calculator calculator = new Calculator();
            double firstValue = 0;
            double secondValue = 0;
            System.out.println("\n\t********************************************\n" +
                    "\t* WELCOME TO MY SIMPLE CALCULATOR PROGRAM *\n"+
                    "\t********************************************\n");

            char exit, option;
            do {
                System.out.print("\nChoose option below\n"+
                        "A - Addition\n"+
                        "S - Subtraction\n"+

                        "Enter first letter(A, S): ");

                option = br.readLine().toLowerCase().charAt(0); //scn.next().toLowerCase().charAt(0);

//checking if the entered option matches the options provided
                while((option != 'a')&&(option != 's')&&(option != 'm')&&(option != 'd')){
                    System.out.print("\nIncorrect entry!!. Choose option below\n"+
                            "A - Addition\n"+
                            "S - Subtraction\n"+

                            "Enter first letter(A, S): ");
                    option = br.readLine().toLowerCase().charAt(0); //scn.next().toLowerCase().charAt(0);
                }

                switch (option){
                    case 'a':
                        System.out.println("\n\tAddition\n\t********\n");
                        calculator.addition(firstValue,secondValue);
                        break;
                    case 's':
                        System.out.println("\n\tSubtraction\n\t************\n");
                        calculator.subtraction(firstValue,secondValue);
                        break;

                }
                System.out.print("\n*************************\nTerminate calculator program? Yes/No: ");
                exit = br.readLine().toLowerCase().charAt(0); //scn.next().toLowerCase().charAt(0);

//checking if the entered option matches the options provided
                while((exit != 'y')&&(exit != 'n')){
                    System.out.print("Incorrect entry. Expected Yes or No. Terminate program? Yes/No: ");
                    exit = br.readLine().toLowerCase().charAt(0); //scn.next().toLowerCase().charAt(0);
                }
            }while (exit != 'y');

            System.out.println("\n\t******************************************\n" +
                    "\t* GOOD BYE. I HOPE YOU COME BACK AGAIN! *\n"+
                    "\t******************************************");
        }
    }

