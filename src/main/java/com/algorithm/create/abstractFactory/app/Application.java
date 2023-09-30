package com.algorithm.create.abstractFactory.app;

import com.algorithm.create.abstractFactory.buttons.Button;
import com.algorithm.create.abstractFactory.checkboxes.Checkbox;
import com.algorithm.create.abstractFactory.factories.GUIFactory;

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
