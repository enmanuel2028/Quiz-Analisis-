package app;

//imports unused path resource error
import javax.swing.JFrame;
import controller.TaskListController;
import model.TaskList;
import view.TaskListView;

public class App {
    public static void main(String[] args) {
        // los valores se encuentran correctamente elaborados, error en "The import
        // view.TaskListView cannot be resolved"
        TaskList taskList = new TaskList();
        TaskListController controller = new TaskListController(taskList);
        TaskListView view = new TaskListView(controller);

        view.setTitle("Lista de tareas");
        // verificar el setsize en raiz de dimension "toohigh"
        view.setSize(400, 300);
        view.setLocationRelativeTo(null);
        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.setVisible(true);
    }
}
