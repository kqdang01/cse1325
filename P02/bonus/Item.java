public class Item {
    private String task;
    private int priority;

    public Item(String task, int priority) {
        this.task = task;
        this.priority = priority;
    }

    public boolean isPriority(int num) {
        return (this.priority == num);
    }
    
    @Override
    public String toString() {
        return (this.priority + " " + this.task);
    }
}