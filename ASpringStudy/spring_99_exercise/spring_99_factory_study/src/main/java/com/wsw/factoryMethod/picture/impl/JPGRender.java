package com.wsw.factoryMethod.picture.impl;

import com.wsw.factoryMethod.picture.Render;

/**
 * @author loriyuhv
 * @ClassName JPGRender
 * @date 2024/4/10 13:37
 * @description TODO
 */

public class JPGRender implements Render {
    @Override
    public void read() {
        System.out.println("JPG图片加载。。。。。。");
    }
}
