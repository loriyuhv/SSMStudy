package com.wsw.simpleFactory.factory;

import com.wsw.simpleFactory.common.ShapeType;
import com.wsw.simpleFactory.figure.Shape;
import com.wsw.simpleFactory.figure.impl.Rectangle;
import com.wsw.simpleFactory.figure.impl.Round;
import com.wsw.simpleFactory.figure.impl.Square;

/**
 * @author loriyuhv
 * @ClassName ShapeType2
 * @date 2024/4/10 13:29
 * @description TODO
 */

public class ShapeFactory2 {
    public static Shape getShape(ShapeType shapeType) {
        Shape shape = null;
        if ("round".equalsIgnoreCase(shapeType.name())) {
            shape = new Round();
        }

        if ("rectangle".equalsIgnoreCase(shapeType.name())) {
            shape = new Rectangle();
        }

        if ("square".equalsIgnoreCase(shapeType.name())) {
            shape = new Square();
        }

        return shape;
    }
}
