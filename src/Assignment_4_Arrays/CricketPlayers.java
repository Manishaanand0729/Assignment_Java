package Assignment_4_Arrays;

public class CricketPlayers {
    public static void main(String[] args) {
        // Each player = {name, age, team name, DOB, gender, Strike Rate}
        Object player1[] ={"virat Kholi", 35, "India", "05-11-1988", "Male", 138.4};
        Object player2[] = {"Smriti Mandhana", 28, "India", "18-07-1996", "Female", 122.8};
        Object player3[] = {"Steve Smith", 34, "Australia", "02-06-1989", "Male", 131.2};



        Object players[][] = {player1,player2,player3};

        for(Object[] player : players){
            for(Object info : player){
                System.out.println(info + " |");
            }
            System.out.println();
        }

    }
}
