import java.util.ArrayList;
import java.util.List;

public class TodoManager {
    private List<Todo> todos;
    private int nextId;

    public TodoManager() {
        todos = new ArrayList<>();
        nextId = 1;
    }

    public void addTodo(String title) {
        Todo todo = new Todo(nextId++, title);
        todos.add(todo);
        System.out.println("Vazifa qo'shildi: " + todo);
    }

    public void viewTodos() {
        if (todos.isEmpty()) {
            System.out.println("Vazifalar ro'yxati bo'sh.");
        } else {
            for (Todo todo : todos) {
                System.out.println(todo);
            }
        }
    }

    public void updateTodo(int id, String newTitle) {
        for (Todo todo : todos) {
            if (todo.getId() == id) {
                todo.setTitle(newTitle);
                System.out.println("Vazifa yangilandi: " + todo);
                return;
            }
        }
        System.out.println("Bunday ID mavjud emas.");
    }

    public void deleteTodo(int id) {
        for (Todo todo : todos) {
            if (todo.getId() == id) {
                todos.remove(todo);
                System.out.println("Vazifa o'chirildi: " + todo);
                return;
            }
        }
        System.out.println("Bunday ID mavjud emas.");
    }

    public void markAsCompleted(int id) {
        for (Todo todo : todos) {
            if (todo.getId() == id) {
                todo.markAsCompleted();
                System.out.println("Vazifa bajarildi: " + todo);
                return;
            }
        }
        System.out.println("Bunday ID mavjud emas.");
    }
}
