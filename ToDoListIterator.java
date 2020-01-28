public class ToDoListIterator implements Iterator{
    private ToDoList toDoList;
    private int index;

    public ToDoListIterator(ToDoList toDoList){
        this.toDoList = toDoList;
        this.index = 0;
    }

    public boolean hasNext(){
        if(index < toDoList.getLength()){
            return true;
        }else{
            return false;
        }
    }
    public Object next(){
        Task task = toDoList.getTask(index);
        index++;
        return task;
    }
}