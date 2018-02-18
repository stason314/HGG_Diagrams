package com.stanProjcts.HGG.Models.Primitives;

import java.awt.*;

/**
 * Created by Stanislav on 18.02.2018.
 */
public class Line extends Primitive{


    public Line(Coordinate coord) {
        this.coord = coord;
    }


    @Override
    public void draw(Graphics2D g) {
        g.drawLine((int) coord.x, (int) coord.y, (int) coord.x + 20, (int) coord.y + 20);

    }

    @Override
    public void step() {

    }
}
