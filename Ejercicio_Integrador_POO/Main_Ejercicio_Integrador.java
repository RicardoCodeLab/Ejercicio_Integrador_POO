package Ejercicio_Integrador_POO;
public class Main_Ejercicio_Integrador {
    public static void main(String[] args) {
        Charmander Charmander1= new Charmander();
        Bulbasaur Bulbasaur1= new Bulbasaur();
        Squirtle Squirtle1= new Squirtle();
        Pikachu Pikachu1= new Pikachu();
        
        Charmander1.atacarMordisco();
        Charmander1.atacarPunioFuego();
        Bulbasaur1.atacarMordisco();
        Bulbasaur1.atacarHojaAfilada();
        Squirtle1.atacarPlacaje();
        Squirtle1.atacarPistolaAgua();
        Pikachu1.atacarArañazo();
        Pikachu1.atacarImpactrueno();
    }
}
