package com.wsw.abstractFactory.systems.android;

import com.wsw.abstractFactory.systems.UIController;

/**
 * @author loriyuhv
 * @ClassName AndroidUIController
 * @date 2024/4/10 14:02
 * @description TODO
 */

public class AndroidUIController implements UIController {
    @Override
    public void display() {
        System.out.println("android ui controller system ...");
    }
}
