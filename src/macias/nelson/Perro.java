package macias.nelson;

public class Perro extends Animal{
    private String raza;

    public Perro(String nombre, String color,String raza)
    {
        super(nombre,color);
        this.raza=raza;

    }
    public  void saludar()
    {
        System.out.println("grrrr");

    }

}
