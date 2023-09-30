package com.algorithm.create.factoryMethod;

import com.algorithm.create.factoryMethod.factory.Dialog;
import com.algorithm.create.factoryMethod.factory.HtmlDialog;
import com.algorithm.create.factoryMethod.factory.WindowsDialog;

public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();

    }

    static void configure(){
        if (System.getProperty("os.name").equals("Windows 10")){
            dialog = new WindowsDialog();
        }else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic(){
        dialog.renderWindow();
    }


}
