package com.algorithm.create.abstractFactory.factories;

import com.algorithm.create.abstractFactory.buttons.Button;
import com.algorithm.create.abstractFactory.buttons.MacOSButton;
import com.algorithm.create.abstractFactory.checkboxes.Checkbox;
import com.algorithm.create.abstractFactory.checkboxes.MacOSCheckbox;

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
