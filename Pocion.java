public class Pocion {
    
    //metodos
    double pts_vida(){
        System.out.println("Poción Vida: Recuperaste 20 % de vida");
        double nueva_vida = 0.20;

        return nueva_vida;
    }

    double pts_ataque(){
        System.out.println("Poción Ataque: Incrementaste el ataque al 10 %");
        double nuevo_ataque = 0.10;

        return nuevo_ataque;
    }

    double pts_defensa(){
        System.out.println("Poción Defensa: Incrementaste la defensa al 10 %");
        double nueva_defensa = 0.10;

        return nueva_defensa;
    }
}
