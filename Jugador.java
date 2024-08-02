public class Jugador
{
    private String nombre;
    private int BJ_W;
    private String cartas;
    private int Mano;
    private int Juegos;


    public Jugador(String nombre){
        this.nombre=nombre;
        this.BJ_W = 0;
    }

    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getNombre() {return nombre;}

    public void setBJ_W(int BJ_W) {this.BJ_W = BJ_W;}
    public int getBJ_W() {return BJ_W;}

    public void setCartas(String cartas) {this.cartas = cartas;}
    public String getCartas() {return cartas;}

    public void setMano(int mano) {Mano = mano;}
    public int getMano() {return Mano;}

    public void setJuegos(int juegos) {Juegos = juegos;}
    public int getJuegos() {return Juegos;}
}
