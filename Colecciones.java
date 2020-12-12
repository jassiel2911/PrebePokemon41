import java.util.ArrayList;

public class Colecciones {
    
    public void listadopokemones(){
        ArrayList<Pokemon> listapokemones = new ArrayList<>();
         
        Pocion pociones = new Pocion();

        Pokemon pokemon1 = new Pokemon("Pikachu", 250, 160, 180, 150, "OK","Electrico", pociones);
        Pokemon pokemon2 = new Pokemon("Raikou", 173, 200, 160, 150, "OK", "Electrico", pociones);
        Pokemon pokemon3 = new Pokemon("Manectric", 250, 176, 180, 150, "OK","Electrico", pociones);
        Pokemon pokemon4 = new Pokemon("Luxray", 240, 185, 180, 150, "OK","Electrico", pociones);
        Pokemon pokemon5 = new Pokemon("Magnezone", 160, 183, 180, 150, "OK","Electrico", pociones);

        
        //Fuego
        Pokemon pokemon6 = new Pokemon("Charmander", 248, 160, 180, 150, "OK","Fuego", pociones);
        Pokemon pokemon7 = new Pokemon("Vilpix", 150, 200, 160, 150, "OK", "Fuego", pociones);
        Pokemon pokemon8 = new Pokemon("Entei", 157, 160, 180, 150, "OK","Fuego", pociones);
        Pokemon pokemon9 = new Pokemon("Victini", 250, 189, 180, 150, "OK","Fuego", pociones);
        Pokemon pokemon10 = new Pokemon("Torchic", 185, 249, 180, 150, "OK","Fuego", pociones);
        
        //Hierba
        Pokemon pokemon11 = new Pokemon("Bulbasaur", 250, 160, 180, 150, "OK","Hierba", pociones);
        Pokemon pokemon12 = new Pokemon("Oddish", 159, 200, 160, 150, "OK", "Hierba", pociones);
        Pokemon pokemon13 = new Pokemon("Serperior", 179, 160, 180, 150, "OK","Hierba", pociones);
        Pokemon pokemon14 = new Pokemon("Chikorita", 238, 160, 180, 150, "OK","Hierba", pociones);
        Pokemon pokemon15 = new Pokemon("Ludicolo", 154, 160, 180, 150, "OK","Hierba",pociones);

        //Agua
        Pokemon pokemon16 = new Pokemon("Psyduck",250, 160, 180, 150, "OK","Agua", pociones);
        Pokemon pokemon17 = new Pokemon("Gyarados",158, 240, 180, 150, "OK","Agua", pociones);
        Pokemon pokemon18 = new Pokemon("Vaporeon",159, 158, 180, 150, "OK","Agua", pociones);
        Pokemon pokemon19 = new Pokemon("Suicune",243, 181, 180, 150, "OK","Agua", pociones);
        Pokemon pokemon20 = new Pokemon("Milotic",172, 160, 180, 150, "OK","Agua", pociones);

        //llenando arreglo
        listapokemones.add(pokemon1);
        listapokemones.add(pokemon2);
        listapokemones.add(pokemon3);
        listapokemones.add(pokemon4);
        listapokemones.add(pokemon5);
        listapokemones.add(pokemon6);
        listapokemones.add(pokemon7);
        listapokemones.add(pokemon8);
        listapokemones.add(pokemon9);
        listapokemones.add(pokemon10);
        listapokemones.add(pokemon11);
        listapokemones.add(pokemon12);
        listapokemones.add(pokemon13);
        listapokemones.add(pokemon14);
        listapokemones.add(pokemon15);
        listapokemones.add(pokemon16);
        listapokemones.add(pokemon17);
        listapokemones.add(pokemon18);
        listapokemones.add(pokemon19);
        listapokemones.add(pokemon20);

        System.out.println("\nEstos son los pokemones que puden estar en batalla");

        for (int i = 0; i < listapokemones.size(); i++) {
            System.out.println(
                    (i + 1) + "....." + listapokemones.get(i).getApodo() + "     tipo: " + listapokemones.get(i).tipo); 
        }
    }
}
