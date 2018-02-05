package macias.nelson;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal g;
        Animal p;
        Veterinario vet;
        g=new Gato("nlk","kjdhfkj");
        p=new Perro("kjfh","jhsgf","bulldog");
        vet=new Veterinario(p);
        vet.curar();
        //g.saludar();
        /*
        p.saludar();*/

    }
}
