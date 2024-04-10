package com.wsw.factoryMethod.picture.factory.impl;

import com.wsw.factoryMethod.picture.Render;
import com.wsw.factoryMethod.picture.factory.RenderFactory;
import com.wsw.factoryMethod.picture.impl.JPGRender;

/**
 * @author loriyuhv
 * @ClassName JPGFactory
 * @date 2024/4/10 13:41
 * @description TODO
 */

public class JPGFactory implements RenderFactory {
    @Override
    public Render getRender() {
        return new JPGRender();
    }
}
