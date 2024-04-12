package com.wsw.simpleFactory;

import com.wsw.simpleFactory.common.ShapeType;
import com.wsw.simpleFactory.factory.ShapeFactory;
import com.wsw.simpleFactory.factory.ShapeFactory2;
import com.wsw.simpleFactory.figure.Shape;

/**
 * @author loriyuhv
 * @ClassName App
 * @date 2024/4/10 13:21
 * @description TODO
 */

public class App {
    public static void main(String[] args) {
        Shape round = ShapeFactory.getShape("round");
        // round.draw();
        Shape rectangle = ShapeFactory.getShape("rectangle");
        // rectangle.draw();

        Shape shape = ShapeFactory2.getShape(ShapeType.ROUND);
        shape.draw();
    }
}
