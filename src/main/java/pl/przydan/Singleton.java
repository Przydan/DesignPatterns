package pl.przydan;

import java.io.Serializable;
import java.io.SerializablePermission;

public class Singleton {

    public static final Singleton INSTANCE = new Singleton();
    private int magicNumber;

//    public Singleton() {
//        if (INSTANCE != null) {
//            throw new IllegalStateException("Singleton already constructed");
//        }
//    }

    private Singleton() {

    }
    public static  Singleton getInstance() {
        return INSTANCE;
    }
    public void initial() {
        Singleton.getInstance();
    }

    public int getMagicNumber() {
        return magicNumber;
    }

    public void setMagicNumber(int magicNumber) {
        this.magicNumber = magicNumber;
    }
}
