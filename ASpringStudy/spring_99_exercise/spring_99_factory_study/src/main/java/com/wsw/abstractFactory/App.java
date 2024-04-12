package com.wsw.abstractFactory;

import com.wsw.abstractFactory.systems.OperationController;
import com.wsw.abstractFactory.systems.UIController;
import com.wsw.abstractFactory.systems.factory.impl.AndroidFactory;

/**
 * @author loriyuhv
 * @ClassName App
 * @date 2024/4/10 13:57
 * @description TODO
 */

public class App {
    public static void main(String[] args) {
        AndroidFactory androidFactory = new AndroidFactory();
        OperationController operationController = androidFactory.createOperationController();
        operationController.controller();
        UIController uiController = androidFactory.createUIController();
        uiController.display();
    }
}
