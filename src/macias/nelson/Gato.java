package macias.nelson;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Gato extends Animal {


    public Gato(String nombre, String color) {
        super(nombre, color);
    }


   public void saludar() {
        System.out.print("miau");

    }
}
