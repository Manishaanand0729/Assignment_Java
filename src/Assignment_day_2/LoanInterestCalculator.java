package Assignment_day_2;

import java.util.Scanner;

public class LoanInterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Loan Type (Car/Housing/Personal/Education): ");
        String loanType = sc.next().toLowerCase();

        double interestRate;

        switch (loanType){
            case "car":
                interestRate = 5.4;
                System.out.println("Interest rate to car loan: " + interestRate + "%");
                break;
            case "housing":
                System.out.println("Please Enter Salary");
                double salary = sc.nextDouble();

                if(salary < 35000){
                    System.out.println(" NOT APPLICABLE FOR Housing Loan");
                }else {
                    interestRate = 4.5;
                    System.out.println("Interest rate to HOUSE loan: " + interestRate + " %");
                }
                break;
            case "personal":
                interestRate = 2.3;
                System.out.println("Interest rate to PERSONAL loan: " + interestRate + " %" );
                break;
            case "education":
                interestRate = 3.4;
                System.out.println("Interest rate to EDUCATION loan: " + interestRate + " %");
                break;
            default:
                System.out.println("Invalid Loan Type! Please select from Car, Housing, Personal, Education.");
        }
    }
}
