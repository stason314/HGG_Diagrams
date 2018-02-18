package com.stanProjcts.HGG;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by Stanislav on 18.02.2018.
 */
public class WorkPanel extends JPanel implements Runnable {

    public static final int WIDTH = 500;
    public static final int HEIGHT = 500;

    private Thread thread;
    private BufferedImage bufferImage;
    private Graphics2D g2;

    public WorkPanel() {
        super();
        settings();
    }
    private void settings(){
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setFocusable(true);
        requestFocus();
    }

    public void start(){
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        bufferImage = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
        g2 =(Graphics2D) bufferImage.getGraphics();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);

        drawUpdate();

    }

    private void drawUpdate(){
        Graphics g2 = this.getGraphics();
        g2.drawImage(bufferImage, 0, 0, null);
        g2.dispose();

    }
}
