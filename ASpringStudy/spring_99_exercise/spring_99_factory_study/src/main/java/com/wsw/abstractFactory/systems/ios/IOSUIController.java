package com.wsw.abstractFactory.systems.ios;

import com.wsw.abstractFactory.systems.UIController;

/**
 * @author loriyuhv
 * @ClassName IOSUIController
 * @date 2024/4/10 14:01
 * @description TODO
 */

public class IOSUIController implements UIController {
    @Override
    public void display() {
        System.out.println("ios ui controller system...");
    }
}
