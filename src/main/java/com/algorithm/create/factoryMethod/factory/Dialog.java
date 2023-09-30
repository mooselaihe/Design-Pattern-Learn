package com.algorithm.create.factoryMethod.factory;


import com.algorithm.create.factoryMethod.buttons.Button;

public abstract class Dialog {

    public void renderWindow(){
        Button okButton = createButton();
        okButton.render();
    }



    public abstract Button createButton();
}
