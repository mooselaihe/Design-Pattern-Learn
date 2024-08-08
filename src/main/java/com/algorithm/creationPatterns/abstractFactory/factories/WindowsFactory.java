package com.algorithm.creationPatterns.abstractFactory.factories;

import com.algorithm.creationPatterns.abstractFactory.buttons.Button;
import com.algorithm.creationPatterns.abstractFactory.buttons.WindowsButton;
import com.algorithm.creationPatterns.abstractFactory.checkboxes.Checkbox;
import com.algorithm.creationPatterns.abstractFactory.checkboxes.WindowsCheckbox;

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
