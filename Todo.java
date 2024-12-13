public class Todo {
    private int id;
    private String title;
    private boolean isCompleted;

    public Todo(int id, String title) {
        this.id = id;
        this.title = title;
        this.isCompleted = false;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void markAsCompleted() {
        this.isCompleted = true;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", SARLAVHA: " + title + ", BAJARILDI: " + (isCompleted ? "HA" : "YO'Q");
    }
}
