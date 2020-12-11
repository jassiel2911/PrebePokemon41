public class Pokemon {
    public String apodo;
    public double vida;
    public double ataque;
    public double defensa;
    public double velocidad;
    public String estado;
    public String tipo;
    public Pocion pocion_pokemon;

    public Pokemon(String apodo,double vida,double ataque,double defensa,double velocidad,
                    String estado,String tipo,Pocion pocionpokemon){
        this.apodo=apodo;
        this.vida=vida;
        this.ataque=ataque;
        this.defensa=defensa;
        this.velocidad=velocidad;
        this.estado=estado;
        this.tipo=tipo;
        this.pocion_pokemon=pocionpokemon;
    }

    public Pokemon(){

    }

    public double danio(double pts_Vida){
        if(pts_Vida == 0){
            System.out.println("El pokemon ya esta muy debil y no puede seguir jugando. :-(");
        }

        return 0;
    }

    public float recibePuntosvida(){
        this.vida = this.vida + pocion_pokemon.pts_vida();

        return 0;
    }

    public float recibePuntosAtaque(){
        this.ataque = this.ataque +pocion_pokemon.pts_ataque();

        return 0;
    }

    public float recibePuntosDefensa(){
        this.defensa = this.defensa + pocion_pokemon.pts_defensa();

        return 0;
    }

    public double calculadorElemental(Pokemon contrincante){

        if(this.tipo == "Fuego"){
            if(contrincante.tipo == "Hierba"){
                contrincante.vida = contrincante.vida- (this.vida*2);
            }
            else if(contrincante.tipo == "Agua" || contrincante.tipo == "Fuego"){
                contrincante.vida = contrincante.vida-(this.vida*0.5);
            }
            else{
                contrincante.vida = contrincante.vida-this.vida;
            }
        }

        if(this.tipo == "Agua"){
            if(contrincante.tipo == "Fuego"){
                contrincante.vida = contrincante.vida- (this.vida*2);
            }
            else if(contrincante.tipo == "Agua" || contrincante.tipo == "Hierba"){
                contrincante.vida = contrincante.vida-(this.vida*0.5);
            }
            else{
                contrincante.vida = contrincante.vida-this.vida;
            }
        }

        if(this.tipo == "Hierba"){
            if(contrincante.tipo == "Agua"){
                contrincante.vida = contrincante.vida- (this.vida*2);
            }
            else if(contrincante.tipo == "Hierba" || contrincante.tipo == "Fuego"){
                contrincante.vida = contrincante.vida-(this.vida*0.5);
            }
            else{
                contrincante.vida = contrincante.vida-this.vida;
            }
        }

        if(this.tipo == "Electrico"){
            if(contrincante.tipo == "Agua"){
                contrincante.vida = contrincante.vida- (this.vida*2);
            }
            else if(contrincante.tipo == "Hierba" || contrincante.tipo == "Electrico"){
                contrincante.vida = contrincante.vida-(this.vida*0.5);
            }
            else{
                contrincante.vida = contrincante.vida-this.vida;
            }
        }
        danio(contrincante.vida);
        return contrincante.vida;
    }

    public double ataque1(Pokemon contrincante){
        double resultado = 0;

        if((this.ataque - contrincante.defensa) <= 0){
            System.out.println("Tu ataque no fue suficinete");
         } else{
            double multipicadorElemental= calculadorElemental(contrincante);
            resultado = (this.ataque - contrincante.defensa)* multipicadorElemental;
            System.out.println("Haz causado un daño a "+ contrincante.apodo +"de: "+resultado);
         }
        return 0;
    }

    public double ataque2(Pokemon contrincante){
        double resultado = 0;

        if((this.ataque - contrincante.defensa) <= 0){
            System.out.println("Tu ataque no fue suficinete");
         } else{
            resultado = (this.ataque - contrincante.defensa);
            System.out.println("Haz causado un daño a "+ contrincante.apodo +"de: "+resultado);
        //
        //verificar puntos de ataque para modificar estado
        // 
        }
        return 0;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    public double getDefensa() {
        return defensa;
    }

    public void setDefensa(double defensa) {
        this.defensa = defensa;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Pocion getPocion_pokemon() {
        return pocion_pokemon;
    }

    public void setPocion_pokemon(Pocion pocion_pokemon) {
        this.pocion_pokemon = pocion_pokemon;
    }
}