package com.algorithm.creationPatterns.factoryMethod.factory;


import com.algorithm.creationPatterns.factoryMethod.buttons.Button;

public abstract class Dialog {

    public void renderWindow(){
        Button okButton = createButton();
        okButton.render();
    }



    public abstract Button createButton();
}
