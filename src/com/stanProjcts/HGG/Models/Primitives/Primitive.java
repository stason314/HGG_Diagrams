package com.stanProjcts.HGG.Models.Primitives;

import java.awt.*;

/**
 * Created by Stanislav on 18.02.2018.
 */
public abstract class Primitive {
    protected Coordinate coord;


    abstract public void draw(Graphics2D g);
    abstract public void step();
}
