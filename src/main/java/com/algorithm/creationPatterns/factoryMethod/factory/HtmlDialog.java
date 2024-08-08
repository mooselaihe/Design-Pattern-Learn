package com.algorithm.creationPatterns.factoryMethod.factory;

import com.algorithm.creationPatterns.factoryMethod.buttons.Button;
import com.algorithm.creationPatterns.factoryMethod.buttons.HtmlButton;

public class HtmlDialog extends Dialog{
    @Override
    public Button createButton() {
        return new  HtmlButton();
    }
}
