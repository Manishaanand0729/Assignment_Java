    package Assignment_day_3;

    public class MultiplesOf5 {
        // Using for loop

        public static void main(String[] args) {
            for (int i = 5; i <= 100; i+= 5 ){
                System.out.println(i + "");
            }
            System.out.println();

            // using while loop

            int j = 5;
            while (j <= 100){
                System.out.println(j + "");
                j+= 5;
            }
            System.out.println();

            //using Do-while_loop

            int k = 5;
            do {
                System.out.println(k + " ");
                k += 5;
            }while (k <= 100);
        }
    }
