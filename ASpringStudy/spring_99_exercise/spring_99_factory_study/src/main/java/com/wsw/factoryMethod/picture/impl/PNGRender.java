package com.wsw.factoryMethod.picture.impl;

import com.wsw.factoryMethod.picture.Render;

/**
 * @author loriyuhv
 * @ClassName PNGRender
 * @date 2024/4/10 13:38
 * @description TODO
 */

public class PNGRender implements Render {
    @Override
    public void read() {
        System.out.println("PNG图片加载。。。。。。");
    }
}
