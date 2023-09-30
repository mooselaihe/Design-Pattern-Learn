package com.algorithm.create.abstractFactory.factories;

import com.algorithm.create.abstractFactory.buttons.Button;
import com.algorithm.create.abstractFactory.buttons.WindowsButton;
import com.algorithm.create.abstractFactory.checkboxes.Checkbox;
import com.algorithm.create.abstractFactory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
