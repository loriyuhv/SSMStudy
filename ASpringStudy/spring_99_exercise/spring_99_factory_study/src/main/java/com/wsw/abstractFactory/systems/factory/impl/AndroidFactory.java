package com.wsw.abstractFactory.systems.factory.impl;

import com.wsw.abstractFactory.systems.OperationController;
import com.wsw.abstractFactory.systems.UIController;
import com.wsw.abstractFactory.systems.android.AndroidOperationController;
import com.wsw.abstractFactory.systems.android.AndroidUIController;
import com.wsw.abstractFactory.systems.factory.SystemFactory;

/**
 * @author loriyuhv
 * @ClassName AndroidFactory
 * @date 2024/4/10 14:04
 * @description TODO
 */

public class AndroidFactory implements SystemFactory {
    @Override
    public OperationController createOperationController() {
        return new AndroidOperationController();
    }

    @Override
    public UIController createUIController() {
        return new AndroidUIController();
    }
}
