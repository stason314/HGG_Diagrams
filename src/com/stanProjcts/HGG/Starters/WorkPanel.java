package com.stanProjcts.HGG.Starters;

import com.stanProjcts.HGG.Models.Primitives.Coordinate;
import com.stanProjcts.HGG.Models.Primitives.Line;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by Stanislav on 18.02.2018.
 */
public class WorkPanel extends JPanel implements Runnable {

    public static final int panelWIDTH = 500;
    public static final int panelHEIGHT = 500;
    public static final int menuWIDTH = panelWIDTH - 100;

    private Thread thread;
    private BufferedImage bufferImage;
    private Graphics2D g2;

    private Line line;

    public WorkPanel() {
        super();
        settings();
    }
    private void settings(){
        setPreferredSize(new Dimension(panelWIDTH, panelHEIGHT));
        setFocusable(true);
        requestFocus();
    }

    public void start(){
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        bufferImage = new BufferedImage(panelWIDTH - 100, panelHEIGHT, BufferedImage.TYPE_INT_RGB);
        g2 =(Graphics2D) bufferImage.getGraphics();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);


        line = new Line(new Coordinate(panelWIDTH /2, panelHEIGHT /2));

        while (true){
            rendering();
            drawUpdate();
        }

    }

    private void rendering(){
        line.draw(g2);
    }

    private void drawUpdate(){
        Graphics g2 = this.getGraphics();
        g2.drawImage(bufferImage, 0, 0, null);
        g2.dispose();

    }
}
