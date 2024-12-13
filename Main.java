import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TodoManager todoManager = new TodoManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n=== Todo List Menyu ===");
            System.out.println("1. Vazifa qo'shish");
            System.out.println("2. Vazifalarni ko'rish");
            System.out.println("3. Vazifani yangilash");
            System.out.println("4. Vazifani o'chirish");
            System.out.println("5. Vazifani bajarilgan deb belgilash");
            System.out.println("6. Chiqish");
            System.out.print("Tanlang: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Enterni ushlash

            switch (choice) {
                case 1:
                    System.out.print("Vazifa nomini kiriting: ");
                    String title = scanner.nextLine();
                    todoManager.addTodo(title);
                    break;
                case 2:
                    todoManager.viewTodos();
                    break;
                case 3:
                    System.out.print("Yangilanishi kerak bo'lgan vazifa ID sini kiriting: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Yangi nomini kiriting: ");
                    String newTitle = scanner.nextLine();
                    todoManager.updateTodo(updateId, newTitle);
                    break;
                case 4:
                    System.out.print("O'chirilishi kerak bo'lgan vazifa ID sini kiriting: ");
                    int deleteId = scanner.nextInt();
                    todoManager.deleteTodo(deleteId);
                    break;
                case 5:
                    System.out.print("Bajarilgan deb belgilanishi kerak bo'lgan vazifa ID sini kiriting: ");
                    int completeId = scanner.nextInt();
                    todoManager.markAsCompleted(completeId);
                    break;
                case 6:
                    System.out.println("Chiqish...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Noto'g'ri tanlov.");
            }
        }
    }
}
