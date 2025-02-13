import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {

    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Menü anzeigen
            System.out.println("\n--- To-Do-Liste ---");
            System.out.println("1. Aufgabe hinzufügen");
            System.out.println("2. Aufgaben anzeigen");
            System.out.println("3. Aufgabe löschen");
            System.out.println("4. Beenden");
            System.out.print("Auswahl: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Zeilenumbruch lesen

            switch (choice) {
                case 1: // Aufgabe hinzufügen
                    System.out.print("Neue Aufgabe: ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    System.out.println("Aufgabe hinzugefügt!");
                    break;

                case 2: // Aufgaben anzeigen
                    if (tasks.isEmpty()) {
                        System.out.println("Keine Aufgaben vorhanden.");
                    } else {
                        System.out.println("\nDeine Aufgaben:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;

                case 3: // Aufgabe löschen
                    if (tasks.isEmpty()) {
                        System.out.println("Keine Aufgaben zum Löschen vorhanden.");
                    } else {
                        System.out.print("Aufgabe zum Löschen (Nummer): ");
                        int taskNumber = scanner.nextInt();
                        if (taskNumber > 0 && taskNumber <= tasks.size()) {
                            tasks.remove(taskNumber - 1);
                            System.out.println("Aufgabe gelöscht!");
                        } else {
                            System.out.println("Ungültige Aufgabennummer.");
                        }
                    }
                    break;

                case 4: // Beenden
                    System.out.println("To-Do-Liste wird beendet. Tschüss!");
                    break;

                default:
                    System.out.println("Ungültige Auswahl!");
            }
        } while (choice != 4);

        scanner.close();
    }
}
