public class ToDoList implements Aggregate{
    private Task[] tasks;
    private int last = 0;
    private int maxsize = 5;

    public ToDoList(){
        this.tasks = new Task[maxsize]
    }
    public Task getTask(int index){
        return tasks[index];
    }
    public void appendTask(Task task){
        this.tasks[last] = task;
        last++;
    }
    public int getLength(){
        return last;
    }
    public Iterator iterator(){
        return new ToDoListIterator(this);
    }
}