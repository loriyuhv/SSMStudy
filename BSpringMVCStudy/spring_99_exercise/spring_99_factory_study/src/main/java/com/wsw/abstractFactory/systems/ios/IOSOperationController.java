package com.wsw.abstractFactory.systems.ios;

import com.wsw.abstractFactory.systems.OperationController;

/**
 * @author loriyuhv
 * @ClassName IOSOperationController
 * @date 2024/4/10 14:00
 * @description TODO
 */

public class IOSOperationController implements OperationController {
    @Override
    public void controller() {
        System.out.println("ios operation controller system...");
    }
}
