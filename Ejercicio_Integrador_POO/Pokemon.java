package Ejercicio_Integrador_POO;
public abstract class Pokemon {
     protected int num_pokedex;
     protected String nombrePokemon;
     protected double pesoPokemon;
     protected String sexo;
     protected int temporada;
     protected String tipo;
    
    protected abstract void atacarPlacaje();
    protected abstract void atacarArañazo();
    protected abstract void atacarMordisco();
    
}
