package pl.przydan.builder.decorator;

import javax.swing.*;

public class DecoratorMain {
    public static void main(String[] args) {
        Window w = new Window();

        HorizontalScrollWindowDecorator scrollWindowDecorator = new HorizontalScrollWindowDecorator(w);

        scrollWindowDecorator.drawWindow();


    }
}
