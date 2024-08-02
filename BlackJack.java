import java.util.Random;

public class BlackJack
{
    private Jugador jugador;
    private Casa casa;
    private int carta_jugador;
    private int carta_casa;

    Random rand = new Random();
     public BlackJack(Jugador jugador, Casa casa){
        this.jugador = jugador;
        this.casa = casa;
        Gen_Mano();
        jugador.setCartas("");
        casa.setCartas("");
        casa.setMano(0);
        jugador.setMano(0);

    }
    public void Reset_juego(){jugador.setCartas("");casa.setCartas("");casa.setMano(0);jugador.setMano(0);}
    public void Gen_Mano(){
         carta_jugador = rand.nextInt(1, 10);
         jugador.setCartas(jugador.getCartas() + String.valueOf(carta_jugador) + " ");
         carta_casa = rand.nextInt(1, 10);
         casa.setCartas(casa.getCartas() + String.valueOf(carta_casa) + " ");
         casa.setMano(casa.getMano() + carta_casa);
         jugador.setMano(jugador.getMano() + carta_jugador);
     }

}
