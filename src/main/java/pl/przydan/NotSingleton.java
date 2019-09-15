package pl.przydan;

public class NotSingleton {

    public static final NotSingleton INSTANCE = new NotSingleton();
    private int magicNumber;



//    public Singleton() {
//        if (INSTANCE != null) {
//            throw new IllegalStateException("Singleton already constructed");
//        }
//    }
//
//    private NotSingleton() {
//
//    }
//    public static NotSingleton getInstance() {
//        return INSTANCE;
//    }
//    public void initial() {
//        NotSingleton.getInstance();
//    }

    public int getMagicNumber() {
        return magicNumber;
    }

    public void setMagicNumber(int magicNumber) {
        this.magicNumber = magicNumber;
    }
}
