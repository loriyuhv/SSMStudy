package com.wsw.factoryMethod.picture.impl;

import com.wsw.factoryMethod.picture.Render;

/**
 * @author loriyuhv
 * @ClassName GIFRender
 * @date 2024/4/10 13:38
 * @description TODO
 */

public class GIFRender implements Render {
    @Override
    public void read() {
        System.out.println("GIF图片加载。。。。。。");
    }
}
