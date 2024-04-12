package com.wsw.abstractFactory.systems.android;

import com.wsw.abstractFactory.systems.OperationController;

/**
 * @author loriyuhv
 * @ClassName AndroidOperationController
 * @date 2024/4/10 13:58
 * @description TODO
 */

public class AndroidOperationController implements OperationController {
    @Override
    public void controller() {
        System.out.println("Android operation controller system...");
    }
}
