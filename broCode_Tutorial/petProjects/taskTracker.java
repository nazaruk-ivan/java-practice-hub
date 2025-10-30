import java.util.ArrayList;
import java.util.Scanner;

public class TaskTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        while (true) {
            System.out.println("\n1. Add Task\n2. Remove Task\n3. Show Tasks\n4. Exit");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) {
                System.out.print("Enter task: ");
                tasks.add(sc.nextLine());
            } else if (choice == 2) {
                System.out.print("Enter index: ");
                int i = sc.nextInt();
                if (i >= 0 && i < tasks.size()) tasks.remove(i);
            } else if (choice == 3) {
                for (int i = 0; i < tasks.size(); i++) System.out.println(i + ". " + tasks.get(i));
            } else if (choice == 4) break;
        }
        sc.close();
    }
}