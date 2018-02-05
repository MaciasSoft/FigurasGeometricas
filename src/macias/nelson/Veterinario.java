package macias.nelson;

public class Veterinario {
    Animal animal;


    public Veterinario(Animal animal)
    {
        this.animal=animal;
    }
    public void curar()
    {
        if(this.animal instanceof Gato)
        {
            System.out.println("se esta curando al gato");
        }else{
            System.out.println("se esta curando a un perro");
        }
        this.animal.saludar();
    }
}
