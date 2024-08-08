package com.algorithm.creationPatterns.abstractFactory.factories;

import com.algorithm.creationPatterns.abstractFactory.buttons.Button;
import com.algorithm.creationPatterns.abstractFactory.buttons.MacOSButton;
import com.algorithm.creationPatterns.abstractFactory.checkboxes.Checkbox;
import com.algorithm.creationPatterns.abstractFactory.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
