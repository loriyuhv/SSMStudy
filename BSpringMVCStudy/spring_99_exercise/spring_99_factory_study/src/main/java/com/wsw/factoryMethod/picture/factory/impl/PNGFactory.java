package com.wsw.factoryMethod.picture.factory.impl;

import com.wsw.factoryMethod.picture.Render;
import com.wsw.factoryMethod.picture.factory.RenderFactory;
import com.wsw.factoryMethod.picture.impl.PNGRender;

/**
 * @author loriyuhv
 * @ClassName PNGFactory
 * @date 2024/4/10 13:41
 * @description TODO
 */

public class PNGFactory implements RenderFactory {
    @Override
    public Render getRender() {
        return new PNGRender();
    }
}
