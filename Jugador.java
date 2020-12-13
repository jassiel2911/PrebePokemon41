import java.util.ArrayList;
import java.util.Scanner;

public class Jugador{
    static Scanner s=new Scanner(System.in);
    //atributos
    public String nombre;
    public ArrayList<Pokemon> pokemones = new ArrayList<Pokemon>();
    public ArrayList<Pocion> pociones = new ArrayList<Pocion>();

    //constructor
    public Jugador(){
        
    }

    //metodos
    public Pokemon guardarPokemon(Pokemon pokemones){
        Pokemon aux = new Pokemon();
        for(int i = 0; i < this.pokemones.size(); i++){
            if(this.pokemones.get(i).apodo.equals(pokemones.apodo)){
                if(pokemones.vida<0){
                    this. pokemones.remove(i);
                }
            }else{
                aux=elegirPokemon();
            }
        }
        return aux;
    }

    public Pokemon elegirPokemon(){
        String nombre;
        int i;
        listarPokemon();
        System.out.println("Ingresa el apodo del Pokemon que vas a elegir:");
        nombre=s.nextLine();
        for(i = 0; i < this.pokemones.size(); i++){
            if(this.pokemones.get(i).apodo.equalsIgnoreCase(nombre)){
                return getPokemones().get(i);
            }
        }
        return this.pokemones.get(i);
    }   

    public void usarPocion(Pokemon pokeUso){
        int opcion;
        int aux=5;
        System.out.println("Las posiocnes son las siguientes:");
        System.out.println("1. Poción Vida: Recupera 20 % de vida. \n 2. Poción Ataque: Incrementa el ataque en 10 % \n 3. Poción Defensa: Incrementa la defensa en 10 %");
        opcion=s.nextInt();
        if(opcion<=aux){
            switch(opcion){
                case 1:
                    pokeUso.recibePuntosvida();
                break;
                case 2:
                    pokeUso.recibePuntosAtaque();
                break;
                case 3:
                    pokeUso.recibePuntosDefensa();
                break;
            }
        }else{
                System.out.println("Ya agostaste esta pocion");
            }
            
        aux=-opcion;
    }

    public void listarPokemon(){     
        for(int i = 0; i < this.pokemones.size(); i++){
            System.out.println("\n\n"+pokemones.get(i).getApodo()); 
            System.out.println("Ataque: "+pokemones.get(i).getAtaque());
            System.out.println("Defensa: "+pokemones.get(i).getDefensa()); 
            System.out.println("Velocidad: "+pokemones.get(i).getVelocidad()); 
            System.out.println("Estado: "+pokemones.get(i).getEstado());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Pokemon> getPokemones() {
        return pokemones;
    }

    public void setPokemones(ArrayList<Pokemon> pokemones) {
        this.pokemones = pokemones;
    }

    public ArrayList<Pocion> getPociones() {
        return pociones;
    }

    public void setPociones(ArrayList<Pocion> pociones) {
        this.pociones = pociones;
    }
}