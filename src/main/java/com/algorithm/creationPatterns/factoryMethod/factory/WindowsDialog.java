package com.algorithm.creationPatterns.factoryMethod.factory;

import com.algorithm.creationPatterns.factoryMethod.buttons.Button;
import com.algorithm.creationPatterns.factoryMethod.buttons.WindowsButton;

public class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
