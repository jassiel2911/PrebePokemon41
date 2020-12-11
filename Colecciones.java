import java.util.ArrayList;
//Cambios realizados
//Cambios realizados2 Desde GitHub
public class Colecciones extends Pokemon{


    public Colecciones(String apodo, double vida, double ataque, double defensa, double velocidad, String estado,
            String tipo, Pocion pocionpokemon) {
        super(apodo, vida, ataque, defensa, velocidad, estado, tipo, pocionpokemon);
    }

    public Colecciones(){
        super();
    }

	public void listarPokemones() {

        ArrayList<Pokemon> pokemones = new ArrayList<>();

        Pocion pocion = new Pocion();


        //Electricos
        Pokemon pokemon01 = new Pokemon("Pikachu", 250, 160, 180, 150, "OK","Electrico", pocion);
        Pokemon pokemon02 = new Pokemon("Raikou", 150, 200, 160, 150, "OK", "Electrico", pocion);
        Pokemon pokemon03 = new Pokemon("Manectric", 250, 160, 180, 150, "OK","Electrico", pocion);
        Pokemon pokemon04 = new Pokemon("Luxray", 250, 160, 180, 150, "OK","Electrico", pocion);
        Pokemon pokemon05 = new Pokemon("Magnezone", 250, 160, 180, 150, "OK","Electrico", pocion);

        
        //Fuego
        Pokemon pokemon06 = new Pokemon("Carmander", 250, 160, 180, 150, "OK","Fuego", pocion);
        Pokemon pokemon07 = new Pokemon("Vilpix", 150, 200, 160, 150, "OK", "Fuego", pocion);
        Pokemon pokemon08 = new Pokemon("Entei", 250, 160, 180, 150, "OK","Fuego", pocion);
        Pokemon pokemon09 = new Pokemon("Victini", 250, 160, 180, 150, "OK","Fuego", pocion);
        Pokemon pokemon10 = new Pokemon("Torchic", 250, 160, 180, 150, "OK","Fuego", pocion);
        
        //Hierba
        Pokemon pokemon11 = new Pokemon("Bulbasaur",250, 160, 180, 150, "OK","Hierba", pocion);
        Pokemon pokemon12 = new Pokemon("Oddish", 150, 200, 160, 150, "OK", "Hierba", pocion);
        Pokemon pokemon13 = new Pokemon("Serperior", 250, 160, 180, 150, "OK","Hierba", pocion);
        Pokemon pokemon14 = new Pokemon("Chikorita", 250, 160, 180, 150, "OK","Hierba", pocion);
        Pokemon pokemon15 = new Pokemon("Ludicolo", 250, 160, 180, 150, "OK","Hierba", pocion);

        Pokemon pokemon16 = new Pokemon("Psyduck",250, 160, 180, 150, "OK","Agua", pocion);
        Pokemon pokemon17 = new Pokemon("Gyarados",250, 160, 180, 150, "OK","Agua", pocion);
        Pokemon pokemon18 = new Pokemon("Vaporeon",250, 160, 180, 150, "OK","Agua", pocion);
        Pokemon pokemon19 = new Pokemon("Suicune",250, 160, 180, 150, "OK","Agua", pocion);
        Pokemon pokemon20 = new Pokemon("Milotic",250, 160, 180, 150, "OK","Agua", pocion);
        
        //Electricos
        pokemones.add(1, pokemon01);
        pokemones.add(2, pokemon02);
        pokemones.add(3, pokemon03);
        pokemones.add(4, pokemon04);
        pokemones.add(5, pokemon05);
        //Fuego
        pokemones.add(6,  pokemon06);
        pokemones.add(7,  pokemon07);
        pokemones.add(8,  pokemon08);
        pokemones.add(9,  pokemon09);
        pokemones.add(10, pokemon10);
        //Hierba
        pokemones.add(11, pokemon11);
        pokemones.add(12, pokemon12);
        pokemones.add(13, pokemon13);
        pokemones.add(14, pokemon14);
        pokemones.add(15, pokemon15);
        //Agua
        pokemones.add(16, pokemon16);
        pokemones.add(17, pokemon17);
        pokemones.add(18, pokemon18);
        pokemones.add(19, pokemon19);
        pokemones.add(20, pokemon20);

        System.out.println(pokemones);
    }
}
