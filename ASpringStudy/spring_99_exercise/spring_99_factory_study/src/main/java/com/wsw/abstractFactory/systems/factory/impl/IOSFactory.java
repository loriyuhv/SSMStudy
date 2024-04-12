package com.wsw.abstractFactory.systems.factory.impl;

import com.wsw.abstractFactory.systems.OperationController;
import com.wsw.abstractFactory.systems.UIController;
import com.wsw.abstractFactory.systems.factory.SystemFactory;
import com.wsw.abstractFactory.systems.ios.IOSOperationController;
import com.wsw.abstractFactory.systems.ios.IOSUIController;

/**
 * @author loriyuhv
 * @ClassName IOSFactory
 * @date 2024/4/10 14:05
 * @description TODO
 */

public class IOSFactory implements SystemFactory {
    @Override
    public OperationController createOperationController() {
        return new IOSOperationController();
    }

    @Override
    public UIController createUIController() {
        return new IOSUIController();
    }
}
