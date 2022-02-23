import java.util.Scanner;
public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int studentTicket = 0;
        int standardTicket = 0;
        int kidsTicket = 0;

        while (!"Finish".equals(input)){
            String movieName = input;
            int  countFreeSeats = Integer.parseInt(scanner.nextLine());
            int percentOccupancyOfSeats = 0;
            for (int i = 0; i < countFreeSeats; i++) {
                String typeOfTicket = scanner.nextLine();
                    if ("student".equals(typeOfTicket)){
                        studentTicket++;
                    }
                    else if ("standard".equals(typeOfTicket)){
                        standardTicket++;
                    }
                    else if ("kid".equals(typeOfTicket)){
                        kidsTicket++;
                    }
                    else if ("End".equals(typeOfTicket)){
                        break;
                    }
                    percentOccupancyOfSeats++;
            }
            input = scanner.nextLine();
            System.out.printf("%s - %.2f%% full.\n",movieName,(percentOccupancyOfSeats * 1.0 / countFreeSeats) * 100);
        }
        int totalSoldTickets = standardTicket + studentTicket + kidsTicket;
        System.out.printf("Total tickets: %d\n",totalSoldTickets);
        System.out.printf("%.2f%% student tickets.\n",(studentTicket * 1.0 / totalSoldTickets) * 100);
        System.out.printf("%.2f%% standard tickets.\n",(standardTicket * 1.0 / totalSoldTickets) * 100);
        System.out.printf("%.2f%% kids tickets.",(kidsTicket * 1.0 / totalSoldTickets) * 100);
        }
    }