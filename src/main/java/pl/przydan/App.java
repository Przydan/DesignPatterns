package pl.przydan;

public class App {
    public static void main(String[] args) {
        System.out.println("test");


        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        singleton.setMagicNumber(5);
        singleton2.setMagicNumber(5);

        System.out.println(singleton2.getMagicNumber());

    }
}
