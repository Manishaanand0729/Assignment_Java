package Assignment_day_2;

import java.util.Scanner;

public class EnvironmentSelector {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Environment (QA/Stage/Dev/UAT/Prod): ");
        String env = sc.next().toLowerCase();

        switch (env){
            case "qa" :
                System.out.println("Running Test case in QA Environment");
                break;
            case "stage" :
                System.out.println("Running Test case in stage Environment");
                break;
            case "dav" :
                System.out.println("Running Test case in dev Environment");
                break;
            case "uat" :
                System.out.println("Running Test case in uat Environment");
                break;
            case "prod" :
                System.out.println("Running Test case in prod Environment");
                break;
            default:
                System.out.println("Please Enter a valid Environment");


        }

    }
}
