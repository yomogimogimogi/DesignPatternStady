
public class Main{
    private static String[] priorityFirst;
    private static String[] prioritySecond;
    private static String[] priorityThird;
    private static int countFirst = 0;
    private static int countSecond = 0;
    private static int countThird = 0;
    public static void main(final String[] args){

        ToDoList toDoList = new ToDoList();
        toDoList.appendTask(new Task("掃除",3));
        toDoList.appendTask(new Task("洗濯",2));
        toDoList.appendTask(new Task("課題",1));
        toDoList.appendTask(new Task("買い物",2));
        toDoList.appendTask(new Task("ゴミ捨て",3));

        final Iterator it = toDoList.iterator();
        while(it.hasNext()){
            final Task task = (Task)it.next();
            switch (task.getPriority()) {
                case 1:
                    priorityFirst[countFirst] =task.getTaskName();
                    countFirst++;
                    break;
                case 2:
                    prioritySecond[countSecond] =task.getTaskName();
                    countSecond++;
                    break;
                case 3:
                    priorityThird[countThird] = task.getTaskName();
                    countThird++;
                    break;
            }
        }
        printTask();

    }

    private static void printTask() {
        if (countFirst != 0) {
            System.out.println("優先度1");
            for(final String task:priorityFirst){
                System.out.println(task);
            }
        }

        if(countSecond != 0){
            System.out.println("優先度2");
            for(final String task:prioritySecond){
                System.out.println(task);
            }
        }

        if(countThird != 0){
            System.out.println("優先度3");
            for(final String task:priorityThird){
                System.out.println(task);
            }
        }
    }
}