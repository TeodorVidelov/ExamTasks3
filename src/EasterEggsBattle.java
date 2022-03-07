import java.util.Scanner;
public class EasterEggsBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int playerOneCountEggs = Integer.parseInt(scanner.nextLine());
        int playerTwoCountEggs = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        while (!"End of battle".equals(input)){
          String winner = input;

          if ("one".equals(winner)){
              playerTwoCountEggs--;
          }
          else if ("two".equals(winner)){
              playerOneCountEggs--;
          }

          if (playerOneCountEggs == 0){
              System.out.printf("Player one is out of eggs. Player two has %d eggs left.",playerTwoCountEggs);
              break;
          }
          else if (playerTwoCountEggs == 0){
              System.out.printf("Player two is out of eggs. Player one has %d eggs left.",playerOneCountEggs);
              break;
            }
            input = scanner.nextLine();
        }
        if ("End of battle".equals(input)){
            System.out.printf("Player one has %d eggs left.\n",playerOneCountEggs);
            System.out.printf("Player two has %d eggs left.",playerTwoCountEggs);
        }
    }
}