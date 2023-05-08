package view;

import controller.TaskListController;
import model.Task;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TaskListView extends JFrame {
    private TaskListController controller;
    private JList<Task> taskList;
    private DefaultListModel<Task> taskListModel;

    public TaskListView(TaskListController controller) {
        this.controller = controller;
        taskListModel = new DefaultListModel<>();
        taskList = new JList<>(taskListModel);

        JButton addButton = new JButton("Agregar tarea");
        JButton removeButton = new JButton("Eliminar tarea");
        JButton completeButton = new JButton("Completar tarea");

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String description = JOptionPane.showInputDialog("Ingrese la descripción de la tarea");
                Task task = new Task(taskListModel.size() + 1, description, false);
                controller.addTask(task);
                taskListModel.addElement(task);
            }
        });

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Task selectedTask = taskList.getSelectedValue();
                if (selectedTask != null) {
                    controller.removeTask(selectedTask);
                    taskListModel.removeElement(selectedTask);
                }
            }
        });

        completeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Task selectedTask = taskList.getSelectedValue();
                if (selectedTask != null) {
