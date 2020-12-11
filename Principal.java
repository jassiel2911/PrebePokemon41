public class Principal{
    public static void main(String[] args){
        System.out.println("*******BIENVENIDO A POKEMON*******");
        System.out.println("Pokemones disponibles para la batalla.");
        System.out.println("Apodo: " +/**/ "Vida base: " + /**/ "Defensa base: " + /**/ "Velocidad base: " 
        + /**/ "Estado inicial: " + /**/ "Tipo: " /* + */);
        Colecciones a = new Colecciones();
        a.listarPokemones();
        int eleccion = 1;
        System.out.println("Quieres elegir a tus pokemones (1) o que te sean asignados aleatoriamente (2)?");
        if(eleccion == 1){
            System.out.println("Elige a tus pokemones");
        }else{
            if(eleccion == 2){
                System.out.println("Estos son tus pokemones para pelear: ");
            }
        }
    }
}