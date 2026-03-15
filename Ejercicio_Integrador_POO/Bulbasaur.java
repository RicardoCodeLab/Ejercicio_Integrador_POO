package Ejercicio_Integrador_POO;
public class Bulbasaur extends Pokemon implements IPlanta{

    public Bulbasaur() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Bulbasaur y realizando ataque Placaje");
    }

    @Override
    protected void atacarArañazo() {
        System.out.println("Soy Bulbasaur y realizando ataque Arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy Bulbasaur y realizando ataque Mordisco");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Soy Bulbasaur y estoy atacando con Paralisar");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Soy Bulbasaur y estoy atacando con Drenaje");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Soy Bulbasaur y estoy atacando con Hoja Afilada");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Soy Bulbasaur y estoy atacando con Latigo Cepa");
    }
    
}
