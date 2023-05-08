package controller;

import model.Task;
import model.TaskList;

public class TaskListController {
    private TaskList taskList;

    public TaskListController(TaskList taskList) {
        this.taskList = taskList;
    }

    public void addTask(Task task) {
        taskList.addTask(task);
    }

    public void removeTask(Task task) {
        taskList.removeTask(task);
    }

    public void updateTask(Task task) {
        taskList.updateTask(task);
    }
}
