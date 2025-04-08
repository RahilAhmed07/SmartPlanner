import java.util.Scanner;

public class TaskDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter task title: ");
        String title = input.nextLine();

        System.out.print("Enter task priority (1 to 5): ");
        int priority = input.nextInt();

        System.out.print("Is the task completed? (true/false): ");
        boolean completed = input.nextBoolean();

        System.out.println("\n📝 Task Summary:");
        System.out.println("Title: " + title);
        System.out.println("Priority: " + priority);
        System.out.println("Completed: " + completed);

        input.close();
    }
}
