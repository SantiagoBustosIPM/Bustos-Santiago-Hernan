package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class ClubDeFutbol {
    //------------------------------------------------------TITULARES-------------------------------------------------------------------------------
    JugadorDeFutbol jugador1=new JugadorDeFutbol("Lisandro","Lopez",37, 10, "delantero");
    JugadorDeFutbol jugador2=new JugadorDeFutbol("Marcelo","Diaz",35, 1, "arquero");
    JugadorDeFutbol jugador3=new JugadorDeFutbol("Gabriel","Arias",33, 2, "defensa");
    JugadorDeFutbol jugador4=new JugadorDeFutbol("Matias","Zaracho",29, 5, "mediocampista");
    JugadorDeFutbol jugador5=new JugadorDeFutbol("Matias","Ibañez",39, 6, "mediocampista");
    //---------------------------------------------------------RESERVA-------------------------------------------------------------------------------
    JugadorDeFutbol jugador6=new JugadorDeFutbol("Benjamin","Garre",38, 7, "mediocampista");
    JugadorDeFutbol jugador7=new JugadorDeFutbol("Dario","Cvitanich",35, 9, "delantero");
    JugadorDeFutbol jugador8=new JugadorDeFutbol("Matias","Rojas",33, 12, "arquero");
    JugadorDeFutbol jugador9=new JugadorDeFutbol("Ivan","Pillud",31, 3, "defensa");
    JugadorDeFutbol jugador10=new JugadorDeFutbol("Augusto","Solari",34, 8, "mediocampista");
    //-----------------------------------------------------------PARTIDOS----------------------------------------------------------------------------
    Partido partido1=new Partido("14/09/2012","15:00","Racing","5-2","Racing vs Atlanta","Local");
    Partido partido2=new Partido("28/09/2012","14:30","Arquitecto Ricardo Etcheverri","5-3","Racing vs Ferro","Visitante");
    Partido partido3=new Partido("02/09/2012","10:55","Presbítero Bartolomé Grella","4-3","Racing vs Patronato","Visitante");
    Partido partido4=new Partido("08/10/2012","15:30","Racing","2-0","Racing vs Aldosivi","Local");
    Partido partido5=new Partido("19/10/2012","13:40","Florencio Sola","1-1","Racing vs Banfield","Visitante");
    Partido partido6=new Partido("30/10/2012","17:50","Monumental","2-1","Racing vs River Plate","Visitante");
    Partido partido7=new Partido("06/11/2012","20:00","Racing","3-0","Racing vs Temperley","Local");
    //------------------------------------------------------------------------------------------------------------------------------------------------
    HashSet<Partido> partidosDelClub= new HashSet<>();
    HashSet<JugadorDeFutbol> hashSetJugadoresTitulares= new HashSet<>();
    HashSet<JugadorDeFutbol> hashSetJugadoresReserva= new HashSet<>();
    HashSet<JugadorDeFutbol> hashSetJugadores= new HashSet<>();

    EquipoDeFutbol club=new EquipoDeFutbol("Racing",7,0,0,27,21,"Racing");
    HashSet<String> equiposQueParticipanDelTorneo=new HashSet<>();
    public int menuGeneral(){
        System.out.println("\n");
        System.out.println("--------------------------------------");
        System.out.println("|Racing Club");
        System.out.println("|1) Ver Todos los clubes que juegan.                                            |");
        System.out.println("|2) Ver informacion del Club.                                                   |");
        System.out.println("|3) Ver todos los partidos ganados, empatados y perdidos.                       |");
        System.out.println("|4) Ver informacion de jugador.                                                 |");
        System.out.println("|5) Salir.                                                                      | ");
		System.out.println("--------------------------------------");
        System.out.println("Ingrese: ");
        Scanner valorDelNumeroDelMenuIngresado = new Scanner(System.in);
        int valorDelMenu = valorDelNumeroDelMenuIngresado.nextInt();
        while (valorDelMenu>5 || valorDelMenu<1){
            System.out.println("Numero Invalido, ingrese de vuelta el numero.");
            valorDelMenu = valorDelNumeroDelMenuIngresado.nextInt();
        }
        System.out.println("--------------------------------------------------------------------------------- \n");
        return valorDelMenu;
    }
    public void muestraEquiposDeFutbolQueJueganEnElTorneo(){
        int indice=1;
        equiposQueParticipanDelTorneo.add("River.");
        equiposQueParticipanDelTorneo.add("Racing.");
        equiposQueParticipanDelTorneo.add("San Lorenzo.");
        equiposQueParticipanDelTorneo.add("Ferro.");
        equiposQueParticipanDelTorneo.add("Temperley.");
        equiposQueParticipanDelTorneo.add("Las toronjas.");
        equiposQueParticipanDelTorneo.add("Carazones FC.");
        equiposQueParticipanDelTorneo.add("Misos.");
        System.out.println("--------------------------------");
        for(String muestraEquiposDeFutbol:equiposQueParticipanDelTorneo){
            System.out.println(indice+") "+muestraEquiposDeFutbol);
            indice++;
        }
        System.out.println("--------------------------------");
    }
    public void muestraInfoDelClub(){
        int index=0;
        int index2=0;
        hashSetJugadoresTitulares.add(jugador1);
        hashSetJugadoresTitulares.add(jugador2);
        hashSetJugadoresTitulares.add(jugador3);
        hashSetJugadoresTitulares.add(jugador4);
        hashSetJugadoresTitulares.add(jugador5);
        hashSetJugadoresReserva.add(jugador6);
        hashSetJugadoresReserva.add(jugador7);
        hashSetJugadoresReserva.add(jugador8);
        hashSetJugadoresReserva.add(jugador9);
        hashSetJugadoresReserva.add(jugador10);
        System.out.println("________________________________________________________________");
        System.out.print("Nombre del club: " + club.getNombre() + "\n");
        System.out.print("Estadio: " + club.getEstadio() + "\n");
        System.out.print("Puntos Obtenidos del torneo: " + club.getPuntosDelTorneo() + " (Ganador)." + "\n");
        System.out.print("Jugadores titulares: ");
        for(JugadorDeFutbol jugadoresTitulares : hashSetJugadoresTitulares){
            if(index==4){
                System.out.print(jugadoresTitulares.getNombre() + ". ");
            }
            else{
                System.out.print(jugadoresTitulares.getNombre() + ", ");
            }
            index++;
        }
        System.out.println("");
        System.out.print("Jugadores de reserva: ");
        for(JugadorDeFutbol jugadoresDeReserva : hashSetJugadoresReserva){

            if(index2==4){
                System.out.print(jugadoresDeReserva.getNombre() + ". ");
            }
            else{
                System.out.print(jugadoresDeReserva.getNombre() + ", ");
            }
            index2++;
        }
        System.out.println("");
        System.out.print("Goles en todo el torneo: " + club.getGoles() + "\n");
        System.out.println("________________________________________________________________");


    }
    public void muestraPartidosGanadosPerdidosYEmpatados(){
        partidosDelClub.add(partido1);
        partidosDelClub.add(partido2);
        partidosDelClub.add(partido3);
        partidosDelClub.add(partido4);
        partidosDelClub.add(partido5);
        partidosDelClub.add(partido6);
        partidosDelClub.add(partido7);

        System.out.println("~~~~~~" + club.getNombre() + "~~~~~~");
        for (Partido partidos:partidosDelClub){
            System.out.println("-------------------------------------------------------");
            System.out.println("Se enfrentaron: " + partidos.getRivales());
            System.out.println("El resultado del partido fue: " + partidos.getResultado());
            System.out.println("Fue el dia: " + partidos.getFecha());
            System.out.println("Hora del partido: " + partidos.getHora());
            System.out.println("En el estadio: " + partidos.getEstadio());
            System.out.println("Jugo de: " + partidos.getLocalOVisitante());
            System.out.println("-------------------------------------------------------");
        }
        System.out.println("Partidos ganados: " + club.getPartidosGanados());
        System.out.println("Partidos empatados: " + club.getPartidosEmpatados());
        System.out.println("Partidos perdidos: " + club.getPartidosPerdidos());
    }
    public void MuestraInfoDelJugador(){
        hashSetJugadores.add(jugador1);
        hashSetJugadores.add(jugador2);
        hashSetJugadores.add(jugador3);
        hashSetJugadores.add(jugador4);
        hashSetJugadores.add(jugador5);
        hashSetJugadores.add(jugador6);
        hashSetJugadores.add(jugador7);
        hashSetJugadores.add(jugador8);
        hashSetJugadores.add(jugador9);
        hashSetJugadores.add(jugador10);
        System.out.println("    Jugadores de Boca Juniors (Futsal)");
        for(JugadorDeFutbol jugador: hashSetJugadores){
            System.out.println("-------------------------------");
            System.out.println("Nombre: " + jugador.getNombre());
            System.out.println("Apellido: " + jugador.getApellido());
            System.out.println("Edad: " + jugador.getEdad());
            System.out.println("Numero de remera: " + jugador.getNumeroDeRemera());
            System.out.println("Posicion: " + jugador.getPosicionJugador());
            System.out.println("-------------------------------");
        }
    }
    public static void main(String[] args) {
        ClubDeFutbol partidos= new ClubDeFutbol();
        boolean estarEnElMenu=true;
        while(estarEnElMenu){
            switch (partidos.menuGeneral()){
                case 1:
                    partidos.muestraEquiposDeFutbolQueJueganEnElTorneo();
                    break;

                case 2:
                    partidos.muestraInfoDelClub();
                    break;

                case 3:
                    partidos.muestraPartidosGanadosPerdidosYEmpatados();
                    break;

                case 4:
                    partidos.MuestraInfoDelJugador();
                    break;

                default:
                    System.out.println("Saliendo.");
                    estarEnElMenu=false;
                    break;
            }
        }

    }
}
