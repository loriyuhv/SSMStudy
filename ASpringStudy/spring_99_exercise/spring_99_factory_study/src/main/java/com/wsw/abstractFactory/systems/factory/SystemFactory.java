package com.wsw.abstractFactory.systems.factory;

import com.wsw.abstractFactory.systems.OperationController;
import com.wsw.abstractFactory.systems.UIController;

/**
 * @author loriyuhv
 * @ClassName SystemFactory
 * @date 2024/4/10 14:03
 * @description TODO
 */

public interface SystemFactory {
    OperationController createOperationController();
    UIController createUIController();
}
