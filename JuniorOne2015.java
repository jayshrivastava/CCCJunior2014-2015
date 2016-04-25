package ccc2016jr;

import java.util.Scanner;

public class JuniorOne2015 {

        public static void main(String[] args) {
                // TODO Auto-generated method stub

                Scanner scan = new Scanner(System.in);
                int month = scan.nextInt();
                int day = scan.nextInt();

                if (month < 2 || (month ==2 && day < 18)) {
                        System.out.println("Before");
                } else if (month > 2 || (month ==2 && day > 18)) {
                        System.out.println("After");
                } else if (month == 2 && day == 18) {
                        System.out.println("Special ");  
                }

                scan.close();
        }

}
