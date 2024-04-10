package com.wsw.simpleFactory.figure.impl;

import com.wsw.simpleFactory.figure.Shape;

/**
 * @author loriyuhv
 * @ClassName Rectangle
 * @date 2024/4/10 13:13
 * @description TODO
 */

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("绘制长方形...");
    }
}
