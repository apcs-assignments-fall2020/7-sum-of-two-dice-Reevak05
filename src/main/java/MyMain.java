import java.util.Scanner;

public class MyMain {

    // Rolls a single die
    // Returns a random integer between 1 and 6
    public static int rollDie() {
       return (int)(Math.random()/0.16666666666666)+1;
    }

    // Rolls two dice n times
    // This method returns an int array of size 11, where each element is
    // the number of times a certain sum of two dice was rolled
    public static int[] sumOfTwoDice(int n) {
        int[] stats= new int[11];
        for (int i = 0; i<n; i++) {
            stats[(((int)(Math.random()/0.16666666666666)+1)+((int)(Math.random()/0.16666666666666)+1))-2] +=1;
        }
        return stats;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many pairs of dice would you like to roll?");
        int[] dice = sumOfTwoDice(scan.nextInt());
        int total = 0;
        for (int i = 0; i<dice.length; i++) {
            total += dice[i];
        }
        for (int i = 0; i<dice.length; i++) {
            System.out.println((100.0/total)*dice[i]+"% of rolls had a sum of " + (i+2) + ".");
        }
        scan.close();

    }
}
