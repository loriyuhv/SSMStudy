package com.wsw.simpleFactory.figure.impl;

import com.wsw.simpleFactory.figure.Shape;

/**
 * @author loriyuhv
 * @ClassName Square
 * @date 2024/4/10 13:15
 * @description TODO
 */

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("绘制正方形...");
    }
}
