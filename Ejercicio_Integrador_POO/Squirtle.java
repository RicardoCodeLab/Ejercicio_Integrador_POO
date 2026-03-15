package Ejercicio_Integrador_POO;
public class Squirtle extends Pokemon implements IAgua{

    public Squirtle() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Squirtle y realizando ataque Placaje");
    }

    @Override
    protected void atacarArañazo() {
        System.out.println("Soy Squirtle y realizando ataque Arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy Squirtle y realizando ataque Mordisco");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Soy Squirtle y estoy atacando con HidroBomba");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Soy Squirtle y estoy atacando con Pistola de Agua");    
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Soy Squirtle y estoy atacando con Burbuja");
    }
    @Override
    public void atacarHidropulso() {
        System.out.println("Soy Squirtle y estoy atacando con Hidropulso");
    }
    
}
