import java.util.Scanner;
import views.ConsoleMenu;

public class App {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        boolean closeApp = false;
        while (closeApp == false) {
            ConsoleMenu.showMainMenu();
            char inputMainMenu = scanner.next().charAt(0);
            switch (inputMainMenu) {
                case '1':
                    System.out.println("Masukan data limit");
                    System.out.print("---->");
                    int input = scanner.nextInt();
                    WriteGrouping.write(
                            "D:\\Documents\\Java Project\\challenge02_nomaven\\output\\grouping_result.txt", input);
                    ConsoleMenu.showSuccessWriteMenu();
                    char input2 = scanner.next().charAt(0);
                    switch (input2) {
                        case '1':
                            ConsoleMenu.showMainMenu();
                            break;
                        case '0':
                            closeApp = true;
                            break;
                        default:
                            System.out.println("Error");
                            break;
                    }
                    break;

                case '2':
                    WriteBasicStatistic.write(
                            "D:\\Documents\\Java Project\\challenge02_nomaven\\output\\basic_statistic_result.txt");
                    ConsoleMenu.showSuccessWriteMenu();
                    char input3 = scanner.next().charAt(0);
                    switch (input3) {
                        case '1':
                            ConsoleMenu.showMainMenu();
                            break;
                        case '0':
                            closeApp = true;
                            break;
                        default:
                            System.out.println("Error");
                            break;
                    }
                    break;

                case '3':
                    System.out.println("Masukan data limit");
                    System.out.print("---->");
                    int inputBatas = scanner.nextInt();
                    WriteGrouping.write(
                            "D:\\Documents\\Java Project\\challenge02_nomaven\\output\\grouping_result.txt",
                            inputBatas);
                    WriteBasicStatistic.write(
                            "D:\\Documents\\Java Project\\challenge02_nomaven\\output\\basic_statistic_result.txt");
                    ConsoleMenu.showSuccessWriteMenu();
                    char input4 = scanner.next().charAt(0);
                    switch (input4) {
                        case '1':
                            ConsoleMenu.showMainMenu();
                            break;
                        case '0':
                            closeApp = true;
                            break;
                        default:
                            System.out.println("Error");
                            break;
                    }
                    break;

                case '0':
                    closeApp = true;
                    break;

                default:
                    System.out.println("Error");
                    break;
            }
        }
        // System.out.println(Grouping.groupAll());
        // System.out.println(Grouping.moreThan(7));
        // System.out.println(Grouping.lessThan(7));
        // System.out.println(Grouping.getValue(7));
        // System.out.println("Mean: " + Mean.calc());
        // System.out.println("Modus: " + Modus.calc());
        // System.out.println("Median: " + Median.calc());
        // System.out.println(Grouping.execute());
        // WriteFile.write("D:\\Documents\\Java
        // Project\\challenge02_nomaven\\output\\grouping_result.txt");
        // System.out.println(ReadFile.read().get(0));
    }
}
