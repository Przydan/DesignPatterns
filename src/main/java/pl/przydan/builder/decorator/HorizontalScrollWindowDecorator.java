package pl.przydan.builder.decorator;

public class HorizontalScrollWindowDecorator extends WindowDecorator{

    public HorizontalScrollWindowDecorator(Window window) {
        this.window = window;
    }

    public void drawWindow () {
        System.out.println("Print horizontal button");
        window.drawWindow();
    }
}
