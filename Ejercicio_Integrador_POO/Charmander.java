package Ejercicio_Integrador_POO;
public class Charmander extends Pokemon implements IFuego {

    public Charmander() {
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Soy Charmander y estoy atacando con Puno de Fuego");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Soy Charmander y estoy atacando con Ascuas");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Soy Charmander y estoy atacando con Lanza Llamas");
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Charmander y realizando ataque Placaje");
    }

    @Override
    protected void atacarArañazo() {
        System.out.println("Soy Charmander y realizando ataque Arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy Charmander y realizando ataque Mordisco");
    }
    
}
