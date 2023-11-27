package com.darkenight07;

import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;
import com.darkenight07.Menu.MenuContextual;
public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Lists Pro");
        frame.setResizable(false);
        frame.setSize(1000, 720);
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel();

        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                MenuContextual.menuContextual(panel);
            }
        };
        timer.schedule(timerTask, 0, 100);

        frame.add(panel, java.awt.BorderLayout.WEST);
        frame.setVisible(true);
    }
}