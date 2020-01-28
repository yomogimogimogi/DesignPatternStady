public class Main{
    public static void main(String[] args){
        String[] priorityFirst = new String[5];
        String[] prioritySecond = new String[5];
        String[] priorityThird = new String[5];
        int countFirst = 0;        
        int countSecond = 0;
        int countThird = 0;

        ToDoList toDoList = new ToDoList();
        toDoList.appendTask(new Task("掃除",3));
        toDoList.appendTask(new Task("洗濯",2));
        toDoList.appendTask(new Task("課題",1));
        toDoList.appendTask(new Task("買い物",2));
        toDoList.appendTask(new Task("ゴミ捨て",3));

        Iterator it = toDoList.iterator();
        while(it.hasNext()){
            Task task = (Task)it.next();
            switch (task.getPriority()) {
                case 1:
                    priorityFirst = task.getName[countFirst];
                    countFirst++;
                    break;
                case 2:
                    prioritySecond = task.getName[countSecond];
                    countSecond++;
                    break;
                case 3:
                    priorityThird = task.getName[countFirst];
                    countThird++;
                    break;
            }
        }
        printTask();

    }
    private void printTask(){
        if(countFirst != 0){
            System.out.println("優先度1");
            for(String task:priorityFirst){
                System.out.println(task);
            }
        }

        if(countSecond != 0){
            System.out.println("優先度2");
            for(String task:prioritySecond){
                System.out.println(task);
            }
        }

        if(countThird != 0){
            System.out.println("優先度3");
            for(String task:priorityThird){
                System.out.println(task);
            }
        }
    }
}