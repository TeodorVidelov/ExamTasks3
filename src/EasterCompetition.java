import java.util.Scanner;
public class EasterCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfEasterBreads = Integer.parseInt(scanner.nextLine());

        int bestResult = Integer.MIN_VALUE;
        String bestBaker = "";

        for (int i = 0; i < countOfEasterBreads; i++) {
            String bakerName = scanner.nextLine();
            String input = scanner.nextLine();
            int bakerPoints = 0;

            while (!"Stop".equals(input)){
                int gradesByJury = Integer.parseInt(input);

                bakerPoints += gradesByJury;
                input = scanner.nextLine();
            }
            System.out.printf("%s has %d points.\n",bakerName,bakerPoints);

            if (bakerPoints > bestResult){
                bestResult = bakerPoints;
                bestBaker = bakerName;
                System.out.printf("%s is the new number 1!\n",bestBaker);
            }
        }
        System.out.printf("%s won competition with %d points!",bestBaker,bestResult);
    }
}