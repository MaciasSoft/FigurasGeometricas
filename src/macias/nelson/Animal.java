package macias.nelson;

abstract class  Animal {
    String nombre;
    String color;

    public Animal(String nombre,String color)
    {
        this.nombre=nombre;
        this.color=color;
    }
    abstract public void saludar();

}
