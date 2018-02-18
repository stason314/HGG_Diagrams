package com.stanProjcts.HGG.Starters;

import javax.swing.*;

public class Starter {


    public static void main(String[] args){
        WorkPanel workPanel = new WorkPanel();

        JFrame jFrame = new JFrame("Diagrams");
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setContentPane(workPanel);
        jFrame.pack();
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        workPanel.start();

    }
}
