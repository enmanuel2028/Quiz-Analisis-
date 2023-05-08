## Lista de Tareas

Este es un pequeño proyecto de lista de tareas que utiliza la arquitectura MVC (Modelo-Vista-Controlador) para organizar el código en tres capas: modelo, vista y controlador.

### Arquitectura MVC

La arquitectura MVC separa la aplicación en tres componentes principales:

- **Modelo:** es la capa que se encarga de manejar los datos y la lógica de la aplicación. En este caso, el modelo se llama `TaskList` y es una lista de tareas (objetos `Task`).
- **Vista:** es la capa que se encarga de la presentación de la aplicación al usuario. En este caso, la vista se llama `TaskListView` y muestra la lista de tareas, permite agregar, actualizar y eliminar tareas.
- **Controlador:** es la capa que se encarga de manejar las interacciones entre el modelo y la vista. En este caso, el controlador se llama `TaskListController` y se encarga de actualizar el modelo cuando se agregan, actualizan o eliminan tareas, y de actualizar la vista cuando se hacen cambios en el modelo.

### Main

El `main` de la aplicación crea una instancia del modelo (`TaskList`), una instancia del controlador (`TaskListController`) y una instancia de la vista (`TaskListView`), y luego los conecta entre sí.

Primero, crea una instancia del modelo llamada `taskList`:

```java
TaskList taskList = new TaskList();
```

Luego, crea una instancia del controlador llamada `controller`, pasando el modelo como parámetro:

```java
TaskListController controller = new TaskListController(taskList);
```

Después, crea una instancia de la vista llamada `view`, pasando el controlador como parámetro:

```java
TaskListView view = new TaskListView(controller);
```

Finalmente, se establecen algunas propiedades de la vista (como el título, el tamaño y la posición), y se hace visible la vista llamando al método `setVisible(true)`:

```java
view.setTitle("Lista de tareas");
view.setSize(400, 300);
view.setLocationRelativeTo(null);
view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
view.setVisible(true);
```

### Conclusión

La arquitectura MVC es una forma popular de organizar el código de una aplicación para separar las responsabilidades y hacer que sea más fácil de entender, mantener y modificar. En este pequeño proyecto de lista de tareas, se utiliza la arquitectura MVC para separar el modelo, la vista y el controlador en componentes separados y conectados entre sí, lo que permite agregar nuevas características o hacer cambios en la aplicación con más facilidad.
