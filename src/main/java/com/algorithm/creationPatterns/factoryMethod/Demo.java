package com.algorithm.creationPatterns.factoryMethod;

import com.algorithm.creationPatterns.factoryMethod.factory.Dialog;
import com.algorithm.creationPatterns.factoryMethod.factory.HtmlDialog;
import com.algorithm.creationPatterns.factoryMethod.factory.WindowsDialog;

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
