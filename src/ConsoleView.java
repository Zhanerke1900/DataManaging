import java.util.Scanner;

public class ConsoleView {
    private Scanner scanner = new Scanner(System.in);

    public void displayData(String data) {
        System.out.println("Current Data: " + data);
    }

    public String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public void showUpdatedData(String data) {
        System.out.println("Data updated to: " + data);
    }

    public void showFinalData(String data) {
        System.out.println("Final combined data: " + data);
    }
}
