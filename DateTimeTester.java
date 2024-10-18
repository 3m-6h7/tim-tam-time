import java.util.Scanner;

public class DateTimeTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Date");
        System.out.println("2. Time");
        System.out.println("3. DateWithTime");
        System.out.println("4. Random Date");
        System.out.println("5. Random Time");
        System.out.println("6. Random DateWithTime");

        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.print("Enter day: ");
                int day1 = scanner.nextInt();
                System.out.print("Enter month: ");
                int month1 = scanner.nextInt();
                System.out.print("Enter year: ");
                int year1 = scanner.nextInt();
                Date date = new Date(day1, month1, year1);
                System.out.print("Pick a format: ");
                System.out.print("1. dd-mm-yyyy ");
                System.out.print("2. mm-dd-yyyy ");
                System.out.print("3. yyyy-mm-dd ");
                int DateChoice = scanner.nextInt();

                String formattedDate;
                switch (DateChoice) {
                    case 1:
                        formattedDate = String.format("%02d-%02d-%04d", day1, month1, year1);
                        break;
                    case 2:
                        formattedDate = String.format("%02d-%02d-%04d", month1, day1, year1);
                        break;
                    case 3:
                        formattedDate = String.format("%04d-%02d-%02d", year1, month1, day1);
                        break;
                    default:
                        System.out.println("Invalid option. Exiting.");
                        return;
                }
                System.out.println("Date: " + formattedDate);
                break;
            case 2:
                System.out.print("Enter hours: ");
                int hours1 = scanner.nextInt();
                System.out.print("Enter minutes: ");
                int minutes1 = scanner.nextInt();
                System.out.print("Enter seconds: ");
                int seconds1 = scanner.nextInt();
                Time time = new Time(hours1, minutes1, seconds1);
                System.out.println("Time: " + time.toString());
                break;
            case 3:
                System.out.print("Enter day: ");
                int day2 = scanner.nextInt();
                System.out.print("Enter month: ");
                int month2 = scanner.nextInt();
                System.out.print("Enter year: ");
                int year2 = scanner.nextInt();
                System.out.print("Enter hours: ");
                int hours2 = scanner.nextInt();
                System.out.print("Enter minutes: ");
                int minutes2 = scanner.nextInt();
                System.out.print("Enter seconds: ");
                int seconds2 = scanner.nextInt();

                System.out.print("Pick a format:");
                System.out.println("1. dd-mm-yyyy hh:mm:ss ");
                System.out.println("2. mm-dd-yyyy hh:mm:ss ");
                System.out.println("3. yyyy-mm-dd hh:mm:ss ");
                int DWTOption = scanner.nextInt();

                String formattedDateWithTime;
                switch (DWTOption) {
                    case 1:
                        formattedDateWithTime = String.format("%02d-%02d-%04d %02d:%02d:%02d", day2, month2, year2, hours2, minutes2, seconds2);
                        break;
                    case 2:
                        formattedDateWithTime = String.format("%02d-%02d-%04d %02d:%02d:%02d", month2, day2, year2, hours2, minutes2, seconds2);
                        break;
                    case 3:
                        formattedDateWithTime = String.format("%04d-%02d-%02d %02d:%02d:%02d", year2, month2, day2, hours2, minutes2, seconds2);
                        break;
                    default:
                        System.out.println("Invalid format option. Exiting.");
                        return;
                }
                DateWithTime dateWithTime = new DateWithTime(new Date(day2, month2, year2), new Time(hours2, minutes2, seconds2));
                System.out.println("DateWithTime: " + formattedDateWithTime);
                break;
            case 4:
                Date randomDate = new Date(true);
                System.out.print("Pick a format:");
                System.out.println("1. dd-mm-yyyy");
                System.out.println("2. mm-dd-yyyy");
                System.out.println("3. yyyy-mm-dd");
                int RDateoption = scanner.nextInt();

                String formattedRandomDate;
                switch (RDateoption) {
                    case 1:
                        formattedRandomDate = String.format("%02d-%02d-%04d", randomDate.getDay(), randomDate.getMonth(), randomDate.getYear());
                        break;
                    case 2:
                        formattedRandomDate = String.format("%02d-%02d-%04d", randomDate.getMonth(), randomDate.getDay(), randomDate.getYear());
                        break;
                    case 3:
                        formattedRandomDate = String.format("%04d-%02d-%02d", randomDate.getYear(), randomDate.getMonth(), randomDate.getDay());
                        break;
                    default:
                        System.out.println("Invalid format option. Exiting.");
                        return;
                }
                System.out.println("Random Date: " + formattedRandomDate);
                break;
            case 5:
                Time randomTime = new Time(true);
                System.out.println("Random Time: " + randomTime.toString());
                break;
            case 6:
                DateWithTime randomDateWithTime = new DateWithTime(true);
                System.out.print("Pick a format:");
                System.out.println("1. dd-mm-yyyy hh:mm:ss");
                System.out.println("2. mm-dd-yyyy hh:mm:ss");
                System.out.println("3. yyyy-mm-dd hh:mm:ss");
                int RDWTOption = scanner.nextInt();

                String formattedRandomDateWithTime;
                switch (RDWTOption) {
                    case 1:
                        formattedRandomDateWithTime = String.format("%02d-%02d-%04d %02d:%02d:%02d", randomDateWithTime.getDate().getDay(), randomDateWithTime.getDate().getMonth(), randomDateWithTime.getDate().getYear(), randomDateWithTime.getTime().getHours(), randomDateWithTime.getTime().getMinutes(), randomDateWithTime.getTime().getSeconds());
                        break;
                    case 2:
                        formattedRandomDateWithTime = String.format("%02d-%02d-%04d %02d:%02d:%02d", randomDateWithTime.getDate().getMonth(), randomDateWithTime.getDate().getDay(), randomDateWithTime.getDate().getYear(), randomDateWithTime.getTime().getHours(), randomDateWithTime.getTime().getMinutes(), randomDateWithTime.getTime().getSeconds());
                        break;
                    case 3:
                        formattedRandomDateWithTime = String.format("%04d-%02d-%02d %02d:%02d:%02d", randomDateWithTime.getDate().getYear(), randomDateWithTime.getDate().getMonth(), randomDateWithTime.getDate().getDay (), randomDateWithTime.getTime().getHours(), randomDateWithTime.getTime().getMinutes(), randomDateWithTime.getTime().getSeconds());
                        break;
                    default:
                        System.out.println("Invalid format option. Exiting.");
                        return;
                }

                System.out.println("Random DateWithTime: " + formattedRandomDateWithTime);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}