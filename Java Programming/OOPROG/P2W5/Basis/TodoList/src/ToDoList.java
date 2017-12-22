import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ToDoList {
    public enum ToDoItemOrder {
        HIGH_TO_LOW,
        LOW_TO_HIGH,
        DEADLINE
    }

    private LinkedList<ToDoItem> toDoList;

    public ToDoList() {
        this.toDoList = new LinkedList<>();
    }

    public void addToDoItem(String description, int priority, String deadline) {
        ToDoItem newToDoItem = new ToDoItem(description, priority, deadline);
        for (int i = 0; i < toDoList.size(); i++) {
            if (toDoList.get(i).priority > newToDoItem.priority) {
                toDoList.add(i, newToDoItem);
                return;
            }
        }
        toDoList.addLast(newToDoItem);
    }

    public String getAllTodoItems(ToDoItemOrder itemOrderBy) {
        StringBuilder sb = new StringBuilder();
        if (itemOrderBy == ToDoItemOrder.DEADLINE) {
            ToDoItem[] sortedByDeadline = new ToDoItem[toDoList.size()];
            toDoList.toArray(sortedByDeadline);

            Arrays.sort(sortedByDeadline, new Comparator<ToDoItem>() {
                @Override
                public int compare(ToDoItem itemOne, ToDoItem itemTwo) {
                    return itemOne.deadline.compareTo(itemTwo.deadline);
                }
            });

            for (ToDoItem toDoItem : sortedByDeadline) {
                sb.append(toDoItem);
                sb.append("\n");
            }

        } else {
            int startIndex = 0;
            if (itemOrderBy == ToDoItemOrder.LOW_TO_HIGH) {
                startIndex = toDoList.size();
            }

            ListIterator<ToDoItem> iterator = toDoList.listIterator(startIndex);

            if (itemOrderBy == ToDoItemOrder.HIGH_TO_LOW) {
                while (iterator.hasNext()) {
                    sb.append(iterator.next());
                    sb.append("\n");
                }
            } else {
                while (iterator.hasPrevious()) {
                    sb.append(iterator.previous());
                    sb.append("\n");
                }
            }
        }
        return sb.toString();
    }


    private class ToDoItem {
        private String description;
        private int priority;
        private LocalDate deadline;

        private ToDoItem(String description, int priority, String deadline) {
            this.description = description;
            this.priority = priority;
            this.deadline = extractDate(deadline);

            if (this.deadline.isBefore(LocalDate.now())) {
                throw new IllegalArgumentException("Please enter a correct date");
            }
        }

        private LocalDate extractDate(String deadline) {
            return LocalDate.of(extractDatePart(deadline, 2), extractDatePart(deadline, 1), extractDatePart(deadline, 0));
        }

        private int extractDatePart(String deadline, int index) {
            String[] date = deadline.split("/");
            return Integer.parseInt(date[index]);
        }

        @Override
        public String toString() {
            return String.format("%-5d %-40s %s", priority, description, deadline.toString());
        }
    }
}
