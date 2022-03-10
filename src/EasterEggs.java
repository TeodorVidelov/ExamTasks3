import java.util.Scanner;
public class EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPaintedEggs = Integer.parseInt(scanner.nextLine());

        int red = 0;
        int orange = 0;
        int blue = 0;
        int green = 0;
        int maxEggs = Integer.MIN_VALUE;
        String maxColour = "";

        for (int i = 0; i < countPaintedEggs; i++) {
            String colourOfEgg = scanner.nextLine();

            if ("red".equals(colourOfEgg)){
                red++;
            }
            else if ("orange".equals(colourOfEgg)){
                orange++;
            }
            else if ("blue".equals(colourOfEgg)){
                blue++;
            }
            else if ("green".equals(colourOfEgg)){
                green++;
            }
            if (red > orange && red > blue && red > green){
                maxEggs = red;
                maxColour = "red";
            }
            else if (orange > red && orange > blue && orange > green){
                maxEggs = orange;
                maxColour = "orange";
            }
            else if (blue > red && blue > orange && blue > green){
                maxEggs = blue;
                maxColour = "blue";
            }
            else if (green > red && green > orange && green > blue){
                maxEggs = green;
                maxColour = "green";
            }
        }
        System.out.printf("Red eggs: %d\n",red);
        System.out.printf("Orange eggs: %d\n",orange);
        System.out.printf("Blue eggs: %d\n",blue);
        System.out.printf("Green eggs: %d\n",green);
        System.out.printf("Max eggs: %d -> %s",maxEggs,maxColour);
    }
}