package com.algorithm.creationPatterns.abstractFactory.app;

import com.algorithm.creationPatterns.abstractFactory.buttons.Button;
import com.algorithm.creationPatterns.abstractFactory.checkboxes.Checkbox;
import com.algorithm.creationPatterns.abstractFactory.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory){
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint(){
        button.paint();;
        checkbox.paint();
    }
}
