public class Principal{
    public static void main(String[] args){
        System.out.println("*******BIENVENIDO A POKEMON*******");
        System.out.println("Quieres elegir a tus pokemones o que te sean asignados aleatoriamente?");
        //Implementar el menú
        System.out.println("Mostrar pokemones disponibles para la batalla.");
        Colecciones a = new Colecciones();
        a.listarPokemones();
    }
}