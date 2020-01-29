public class Task{
    // タスク名とその優先度
    private String taskName;
    private int priority;
    
    public Task(String taskName,int priority){
        this.taskName = taskName;
        this.priority = priority;
    }

    public String getTaskName(){
        return taskName;
    }

    public int getPriority(){
        return priority;
    }
}