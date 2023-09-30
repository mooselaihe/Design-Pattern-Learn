package com.algorithm.create.factoryMethod.factory;

import com.algorithm.create.factoryMethod.buttons.Button;
import com.algorithm.create.factoryMethod.buttons.WindowsButton;

public class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
