package com.algorithm.creationPatterns.abstractFactory.factories;

import com.algorithm.creationPatterns.abstractFactory.buttons.Button;
import com.algorithm.creationPatterns.abstractFactory.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
