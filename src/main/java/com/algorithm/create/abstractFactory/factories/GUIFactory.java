package com.algorithm.create.abstractFactory.factories;

import com.algorithm.create.abstractFactory.buttons.Button;
import com.algorithm.create.abstractFactory.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
