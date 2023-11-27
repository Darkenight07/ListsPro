package com.darkenight07.Menu;

import com.darkenight07.Listas.GestionListas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuContextual {

    public static void menuContextual (JPanel panel) {
        GestionListas gestionListas = new GestionListas();

        String[] menuBarItems = {"Crear", "Editar", "Ayuda"};
        JMenuBar menuBar = new JMenuBar();

        JMenuItem crearMenu = new JMenuItem(menuBarItems[0]);
        crearMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Crear");
            }
        });
        menuBar.add(crearMenu);

        JMenuItem editarMenu = new JMenuItem(menuBarItems[1]);
        editarMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Editar");
            }
        });
        menuBar.add(editarMenu);
        JMenuItem ayudaMenu = new JMenuItem(menuBarItems[2]);
        ayudaMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Ayuda");
            }
        });
        menuBar.add(ayudaMenu);

        panel.add(menuBar);
    }

}
