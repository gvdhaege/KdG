import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Test {
    private class TodoItem {
        private String description;
        private int priority;
        private LocalDate deadline;

        TodoItem(String description, int priority, String deadline) {
            this.description = description;
            this.priority = priority;
            String[] date = deadline.split("/");
            this.deadline = LocalDate.of(Integer.parseInt(date[2]),
                    Integer.parseInt(date[1]),
                    Integer.parseInt(date[0]));

            if (this.deadline.isBefore(LocalDate.now()))
                throw new IllegalArgumentException("Deadline kan niet voor vandaag liggen");

        }

        private LocalDate getDeadline() {
            return deadline;
        }

        public String toString() {
            return String.format("%-5d %-40s %s", priority, description, deadline.toString());
        }
    }

    public enum TodoItemOrder {
        HIGH_TO_LOW,
        LOW_TO_HIGH,
        DEADLINE
    }

    private LinkedList<TodoItem> todoList;

    public Test() {
        todoList = new LinkedList<TodoItem>();
    }

    public void addTodoItem(String description, int priority, String deadline) {
        TodoItem newItem = new TodoItem(description, priority, deadline);

        for (int i = 0; i < todoList.size(); i++) {
            if (todoList.get(i).priority > newItem.priority) {
                todoList.add(i, newItem);
                return;
            }
        }
        todoList.addLast(newItem);
    }

    public String getAllTodoItems(TodoItemOrder orderBy) {
        StringBuilder sb = new StringBuilder();

        if (orderBy == TodoItemOrder.DEADLINE) {
            TodoItem[] sortedByDeadline = new TodoItem[todoList.size()];
            todoList.toArray(sortedByDeadline);
            Arrays.sort(sortedByDeadline, new Comparator<TodoItem>() {
                @Override
                public int compare(TodoItem o1, TodoItem o2) {
                    return o1.getDeadline().compareTo(o2.getDeadline());
                }
            });
            for (TodoItem deadlineSortedItem : sortedByDeadline) {
                sb.append(deadlineSortedItem + "\n");
            }

        } else {
            int startIx = 0;
            if (orderBy == TodoItemOrder.LOW_TO_HIGH)
                startIx = todoList.size();

            ListIterator<TodoItem> iterator = todoList.listIterator(startIx);

            if (orderBy == TodoItemOrder.HIGH_TO_LOW) {
                while (iterator.hasNext()) {
                    sb.append(iterator.next() + "\n");
                }
            } else
                while (iterator.hasPrevious())
                    sb.append(iterator.previous() + "\n");

        }

        return sb.toString();
    }


}
