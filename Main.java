import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Casa casa = new Casa();
        Scanner sc = new Scanner(System.in);
        System.out.println("BIENVENIDO A BLACKJACK \n1. Nuevo Usuario \n2. Salir");
        switch (sc.nextInt()){
            case 1:
                System.out.println("Ingrese su nombre:");
                Jugador jugador = new Jugador(sc.next());
                BlackJack juego = new BlackJack(jugador, casa);
                System.out.println("Que desea hacer? \n1. Nuevo Juego\n2. Revisar victorias \n3. Salir");
                int x = sc.nextInt();
                while (x!=3){
                    if(x==1) {
                        juego.Reset_juego();
                        juego.Gen_Mano();
                        juego.Gen_Mano();
                        System.out.println("Sus cartas son: \n" + jugador.getCartas() + "\nLas cartas de la casa son: \n" + casa.getCartas() + "\nQue desea hacer? \n1. Deal \n2. Call");
                        int opc = sc.nextInt();
                        while (opc != 2) {
                            if (22 > jugador.getMano()) {
                                juego.Gen_Mano();
                                System.out.println("Sus cartas son: ");
                                System.out.println(jugador.getCartas());
                                System.out.println("Las cartas de la casa son: ");
                                System.out.println(casa.getCartas());
                                System.out.println("Que desea hacer? \n1. Deal \n2. Call");
                                opc = sc.nextInt();
                            } else {
                                System.out.println("Ha perdido");
                                jugador.setJuegos(jugador.getJuegos()+1);
                                break;
                            }
                        }
                        if (jugador.getMano() > casa.getMano()) {
                            System.out.println("Ha ganado");
                            jugador.setBJ_W(jugador.getBJ_W() + 1);
                            jugador.setJuegos(jugador.getJuegos()+1);
                        } else if(jugador.getMano()== casa.getMano()){
                            System.out.println("Ha empatado");
                            jugador.setJuegos(jugador.getJuegos()+1);
                        } else if (casa.getMano()>21) {
                            System.out.println("Ha ganado");
                            jugador.setBJ_W(jugador.getBJ_W()+1);
                            jugador.setJuegos(jugador.getJuegos()+1);
                        }else {System.out.println("Ha perdido");jugador.setJuegos(jugador.getJuegos()+1);}
                        System.out.println("Que desea hacer? \n1. Nuevo Juego\n2. Revisar victorias \n3. Salir");
                        x = sc.nextInt();
                    } else if (x == 2) {
                        System.out.println("Usted tiene " + jugador.getBJ_W() + " Victoria/s de " + jugador.getJuegos() + " Juegos\n" + "Que desea hacer? \n1. Nuevo Juego\n2. Revisar victorias \n3. Salir");
                        x = sc.nextInt();
                    }else{System.out.println("Ingrese un valor valido \nQue desea hacer? \n1. Nuevo Juego\n2. Revisar victorias \n3. Salir");x = sc.nextInt();}
                }
            case 2:
                return;
        }


    }

}
