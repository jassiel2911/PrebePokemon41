public class Principal {
    

    public static void main(String[] args){

        Bienvenida a = new Bienvenida();
        a.inicio();
        
        Colecciones b = new Colecciones();
        b.listadopokemones();

        Batalla c = new Batalla();
        c.turno();
    }
}       