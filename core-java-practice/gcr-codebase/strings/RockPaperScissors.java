// Rock-Paper-Scissors is a game played between a minimum of two players. Each player can choose either rock, paper, or scissors. Here the game is played between a user and a computer. Based on the rules, either a player or a computer will win. Show the stats of player and computer win in a tabular format across multiple games. Also, show the winning percentage between the player and the computer.
// Hint => 
// The rule is: rock-scissors: rock will win (rock crushes scissors); rock-paper: paper wins (paper covers rock); scissors-paper: scissors win (scissors cuts paper)
// Create a Method to find the Computer Choice using the Math.random
// Create a Method to find the winner between the user and the computer
// Create a Method to find the average and percentage of wins for the user and the computer and return a String 2D array
// Create a Method to display the results of every game and also display the average and percentage wins 
// In the main take user input for the number of games and call methods to display results


import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n = sc.nextInt();
        
        int userWins = 0, compWins = 0;
        String[] options = {"Rock", "Paper", "Scissors"};

        for (int i = 0; i < n; i++) {
            System.out.print("Choose 0:Rock, 1:Paper, 2:Scissors: ");
            int user = sc.nextInt();
            int comp = (int) (Math.random() * 3);
            
            System.out.println("Computer chose: " + options[comp]);
            int winner = findWinner(user, comp); // 1: User, 2: Comp, 0: Tie
            if (winner == 1) userWins++;
            else if (winner == 2) compWins++;
        }

        displayStats(userWins, compWins, n);
    }

    public static int findWinner(int u, int c) {
        if (u == c) return 0;
        if ((u == 0 && c == 2) || (u == 1 && c == 0) || (u == 2 && c == 1)) return 1;
        return 2;
    }

    public static void displayStats(int uW, int cW, int total) {
        double uP = (uW * 100.0) / total;
        double cP = (cW * 100.0) / total;
        System.out.println("\nEntity\tWins\tPercentage");
        System.out.println("User\t" + uW + "\t" + uP + "%");
        System.out.println("Comp\t" + cW + "\t" + cP + "%");
    }
}