class Task {
    int taskId;
    String taskName;
    String status;
    Task next;

    public Task(int id, String name, String status) {
        this.taskId = id;
        this.taskName = name;
        this.status = status;
        this.next = null;
    }
}

class TaskManager {
    Task head;

    public void addTask(Task task) {
        if (head == null) {
            head = task;
        } else {
            Task temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = task;
        }
    }

    public Task searchTask(int id) {
        Task temp = head;
        while (temp != null) {
            if (temp.taskId == id) return temp;
            temp = temp.next;
        }
        return null;
    }

    public void deleteTask(int id) {
        if (head != null && head.taskId == id) {
            head = head.next;
            return;
        }
        Task temp = head;
        while (temp != null && temp.next != null) {
            if (temp.next.taskId == id) {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
    }

    public void showTasks() {
        Task temp = head;
        while (temp != null) {
            System.out.println(temp.taskName);
            temp = temp.next;
        }
    }
}
