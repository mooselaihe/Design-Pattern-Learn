package com.algorithm.create.factoryMethod.factory;

import com.algorithm.create.factoryMethod.buttons.Button;
import com.algorithm.create.factoryMethod.buttons.HtmlButton;

public class HtmlDialog extends Dialog{
    @Override
    public Button createButton() {
        return new  HtmlButton();
    }
}
