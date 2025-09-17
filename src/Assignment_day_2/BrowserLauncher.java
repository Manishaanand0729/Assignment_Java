package Assignment_day_2;

import java.util.Scanner;

public class BrowserLauncher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Browser (Chrome/Firefox/IE/Safari): ");
        String browser = sc.next().toLowerCase();

        System.out.println("\n----Using if---else-if---");

        if(browser.equals("chrome")){
            System.out.println("Launching Chrome:");
        } else if (browser.equals("firefox")) {
            System.out.println("Launching firefox");
        } else if (browser.equals("IE")) {
            System.out.println("launching IE");
        } else if (browser.equals("Safari")) {
            System.out.println("Launching Safari");
        }else {
            System.out.println("Please pass the right browser");
        }

        System.out.println("\n---- Switch case----");

        switch (browser){
            case "chrome":
                System.out.println("launching chrome");
                break;
            case "firefox":
                System.out.println("launching Firefox");
                break;
            case "IE":
                System.out.println("launching IE");
                break;
            case "safari":
                System.out.println("launching Safari");
                break;
            default:
                System.out.println("Please pass the right browser");
        }
    }
}
