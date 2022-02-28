import java.util.Scanner;
public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double movieBudget = Double.parseDouble(scanner.nextLine());
        int countOfStatist = Integer.parseInt(scanner.nextLine());
        double costOfClothesForOneStatist = Double.parseDouble(scanner.nextLine());

        double costOfMovieDecor = movieBudget * 0.10;
        double sumStatistClothes = countOfStatist * costOfClothesForOneStatist;

        if (countOfStatist > 150){
            sumStatistClothes *= 0.90;
        }

        double totalSum = sumStatistClothes + costOfMovieDecor;

        if (totalSum <= movieBudget){
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",movieBudget - totalSum);
        }
        else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",totalSum - movieBudget);
        }
    }
}