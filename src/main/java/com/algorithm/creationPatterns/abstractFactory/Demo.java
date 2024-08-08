package com.algorithm.creationPatterns.abstractFactory;

import com.algorithm.creationPatterns.abstractFactory.app.Application;
import com.algorithm.creationPatterns.abstractFactory.factories.GUIFactory;
import com.algorithm.creationPatterns.abstractFactory.factories.MacOSFactory;
import com.algorithm.creationPatterns.abstractFactory.factories.WindowsFactory;

public class Demo {

    private static Application configApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configApplication();
        app.paint();
    }

}
