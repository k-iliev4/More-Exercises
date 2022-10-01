import java.util.Scanner;

public class gamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currBalance = Double.parseDouble(scanner.nextLine());
        String game = scanner.nextLine();
        double totalSpent = 0;

        while (!game.equals("Game Time") && currBalance >= 0) {

            if (game.equals("OutFall 4 ")) {
                if (currBalance < 39.99) {
                    System.out.println("Too expensive");
                }
                currBalance -= 39.99;
                totalSpent += 39.99;
                if (currBalance <= 0) {
                    System.out.println("Out of money!");
                    break;
                }
            } else if (game.equals("CS:GO")) {
                if (currBalance < 15.99) {
                    System.out.println("Too expensive");
                }
                currBalance -= 15.99;
                totalSpent += 15.99;
                if (currBalance <= 0) {
                    System.out.println("Out of money!");
                    break;
                }
            } else if (game.equals("Zplinter Zell")) {
                if (currBalance < 19.99) {
                    System.out.println("Too expensive");
                }
                currBalance -= 19.99;
                totalSpent += 19.99;
                if (currBalance <= 0) {
                    System.out.println("Out of money!");
                    break;
                }
            } else if (game.equals("Honored 2")) {
                if (currBalance < 59.99) {
                    System.out.println("Too expensive");
                }
                currBalance -= 59.99;
                totalSpent += 59.99;
                if (currBalance <= 0) {
                    System.out.println("Out of money!");
                    break;
                }
            } else if (game.equals("RoverWatch")) {
                if (currBalance < 29.99) {
                    System.out.println("Too expensive");
                }
                currBalance -= 29.99;
                totalSpent += 29.99;
                if (currBalance <= 0) {
                    System.out.println("Out of money!");
                    break;
                }
            } else if (game.equals("RoverWatch Origins Edition")) {
                if (currBalance < 39.99) {
                    System.out.println("Too expensive");

                }
                currBalance -= 39.99;
                totalSpent += 39.99;
                if (currBalance <= 0) {
                    System.out.println("Out of money!");
                    break;
                }
            } else {
                System.out.println("Not found");
            }

            game = scanner.nextLine();
        }


        if (currBalance > 0) {
            System.out.println("Total spent: $" + totalSpent);
            System.out.printf("Remaining: $%.2f", currBalance);
        }
    }
}
