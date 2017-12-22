public class TodoListDemo {
    public static void main(String[] args) {
        ToDoList ourList = new ToDoList();
        ourList.addToDoItem("Java OO Technieken leren", 5, "8/1/2018");
        ourList.addToDoItem("Java Geavanceerde OO Technieken leren", 10, "16/3/2018");
        ourList.addToDoItem("Java game binnenleveren", 8, "10/3/2018");
        ourList.addToDoItem("Uitblazen na examens P2", 1, "19/1/2018");
        System.out.println("===== Alle todo-item van hoogste prioriteit naar laagste");
        System.out.println(ourList.getAllTodoItems(ToDoList.ToDoItemOrder.HIGH_TO_LOW));
        System.out.println("===== Alle todo-item van laagste prioriteit naar hoogstse");
        System.out.println(ourList.getAllTodoItems(ToDoList.ToDoItemOrder.LOW_TO_HIGH));
        System.out.println("===== Alle todo-item gesorteerd volgens deadline");
        System.out.println(ourList.getAllTodoItems(ToDoList.ToDoItemOrder.DEADLINE));
        System.out.println("===== Alle todo-item van laagste prioriteit naar hoogstse");
        System.out.println(ourList.getAllTodoItems(ToDoList.ToDoItemOrder.LOW_TO_HIGH));
        ourList.addToDoItem("Blokken voor Java Basisbegrippen", 1, "7/11/2018");
    }
}