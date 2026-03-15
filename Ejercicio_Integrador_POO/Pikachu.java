package Ejercicio_Integrador_POO;
public class Pikachu extends Pokemon implements IElectrico{

    public Pikachu() {
    }
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Pikachu y realizando ataque Placaje");
    }

    @Override
    protected void atacarArañazo() {
        System.out.println("Soy Pikachu y realizando ataque Arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy Pikachu y realizando ataque Mordisco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Soy Pikachu y estoy atacando con Impactrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Soy Squirtle y estoy atacando con Puño Trueno");
    }

    @Override
    public void atacarRayo() {
        System.out.println("Soy Squirtle y estoy atacando con Rayo");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("Soy Squirtle y estoy atacando con Rayo Carga");
    }
    
}
