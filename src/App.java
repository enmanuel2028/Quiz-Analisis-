package app;

import javax.swing.JFrame;
import controller.TaskListController;
import model.TaskList;
import view.TaskListView;

public class App {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();
        TaskListController controller = new TaskListController(taskList);
        TaskListView view = new TaskListView(controller);

        view.setTitle("Lista de tareas");
        view.setSize(400, 300);
        view.setLocationRelativeTo(null);
        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.setVisible(true);
    }
}
