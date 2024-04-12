package com.wsw.factoryMethod;

import com.wsw.factoryMethod.picture.Render;
import com.wsw.factoryMethod.picture.factory.impl.GIFFactory;
import com.wsw.factoryMethod.picture.factory.impl.JPGFactory;
import com.wsw.factoryMethod.picture.factory.impl.PNGFactory;

/**
 * @author loriyuhv
 * @ClassName App
 * @date 2024/4/10 13:44
 * @description TODO
 */

public class App {
    public static void main(String[] args) {
        // JPG图片加载
        JPGFactory jpgFactory = new JPGFactory();
        Render render = jpgFactory.getRender();
        render.read();
        // PNG图片加载
        PNGFactory pngFactory = new PNGFactory();
        Render pngRender = pngFactory.getRender();
        pngRender.read();
        // GIF图片加载
        GIFFactory gifFactory = new GIFFactory();
        Render gifRender = gifFactory.getRender();
        gifRender.read();
    }
}
