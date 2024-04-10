package com.wsw.simpleFactory.factory;

import com.wsw.simpleFactory.figure.Shape;
import com.wsw.simpleFactory.figure.impl.Rectangle;
import com.wsw.simpleFactory.figure.impl.Round;
import com.wsw.simpleFactory.figure.impl.Square;

/**
 * @author loriyuhv
 * @ClassName ShapeFactory
 * @date 2024/4/10 13:16
 * @description TODO
 */

public class ShapeFactory {
    // 根据给定的形状名称，创建不同的形状实例
    public static Shape getShape(String typeName) {
        Shape shape = null;
        if ("round".equalsIgnoreCase(typeName)) {
            shape = new Round();
        }

        if ("rectangle".equalsIgnoreCase(typeName)) {
            shape = new Rectangle();
        }

        if ("square".equalsIgnoreCase(typeName)) {
            shape = new Square();
        }

        return shape;
    }
}
