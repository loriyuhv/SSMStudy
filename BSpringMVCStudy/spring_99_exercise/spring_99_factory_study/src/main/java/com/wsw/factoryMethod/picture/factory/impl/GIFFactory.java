package com.wsw.factoryMethod.picture.factory.impl;

import com.wsw.factoryMethod.picture.Render;
import com.wsw.factoryMethod.picture.factory.RenderFactory;
import com.wsw.factoryMethod.picture.impl.GIFRender;

/**
 * @author loriyuhv
 * @ClassName GIFRender
 * @date 2024/4/10 13:42
 * @description TODO
 */

public class GIFFactory implements RenderFactory {
    @Override
    public Render getRender() {
        return new GIFRender();
    }
}
