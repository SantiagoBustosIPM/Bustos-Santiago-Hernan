package com.company;

import java.util.*;

public class Restaurante {

    Scanner ingreso = new Scanner(System.in);
	
    HashMap<Integer,Integer> cantidadUsosDeMesa  = new HashMap<Integer, Integer>();
	
    HashMap<String,Integer>  cantidadPedidoPlato = new HashMap<String, Integer>();
	
    HashSet<String>          platosDelDia        = new HashSet<String>();
	
    HashSet<Integer>         mesasOcupadas       = new HashSet<Integer>();
	
    ArrayList<Pedido>        pedidosActivos      = new ArrayList<Pedido>();
	
    String basura;
	
    String nombreRestaurante = "";
	
    int platoMasPedido_numero;
	
    int platoMenosPedido_numero;
	
    int numeroMesa;
	
    int cantidadUsosMesa;
	
    String platoMasPedido_nombre = "";
	
    String platoMenosPedido_nombre = "";
	
    boolean quitarMesasOcupadas_boleano = true;
	
    boolean desocupoMesa = false;
	
    boolean salirMenu = true;

    public void nombreYMesasDelRestaurante(){
		
        System.out.println("-BIENVENIDO-");
		
        System.out.println("-Nombre Restaurante-");
		
        System.out.print("Ingrese ");
		
        nombreRestaurante = ingreso.nextLine();
		
        System.out.println("Mesas en el Restaurante");
		
        System.out.print("Ingrese ");
		
        int mesasRestaurante = ingreso.nextInt();
		
        basura = ingreso.nextLine();
		
        System.out.println("-------------------------------------");
		

        for (int i=1; i<=mesasRestaurante; i++){
            cantidadUsosDeMesa.put(i, 0);
        }
    }

    public boolean comprobarSiExistePlato(String plato, ArrayList<String> platos){
        if(platosDelDia.contains(plato)){
            platos.add(plato);
            cantidadPedidoPlato.put(plato,cantidadPedidoPlato.get(plato)+1);
            return true;
        }
        else if(plato.equals("listo")){
            return false;
        }
        else{
            System.out.println("Ingresar plato a agregar: ");
            return true;
        }

    }

    public void agregarOQuitarPlato(){
		
        int respuestaAgregarOQuitarPlato = 0;
		
        System.out.println("Agregar o Quitar plato?");
		
        System.out.println("Agregar");
		
        System.out.println("Quitar");
		
        System.out.println("No hacer nada");
		
        while(respuestaAgregarOQuitarPlato>3 || respuestaAgregarOQuitarPlato<1){
			
            System.out.print("Ingrese ");
			
            respuestaAgregarOQuitarPlato = ingreso.nextInt();
			
            basura = ingreso.nextLine();
			
			
        }
        switch (respuestaAgregarOQuitarPlato){
			
            case 1:
			
                System.out.println("-");
                System.out.println("Cantidad de platos a ingresar");
                int platosAgregar = ingreso.nextInt();
                basura = ingreso.nextLine();
                for(int i=0; i<platosAgregar; i++){
                    System.out.println("Nombre del plato a ingresar");
                    String platoIngresado = ingreso.nextLine();
                    platosDelDia.add(platoIngresado);
                    cantidadPedidoPlato.put(platoIngresado,0);
                }
                break;
				
            case 2:
			
                System.out.println("-");
                System.out.println("Platos a eliminar");
                int platosQuitar = ingreso.nextInt();
                basura = ingreso.nextLine();
                String platoBorrar;
                while(platosQuitar > 0){
                    do{
                        System.out.print("Nombre de plato/s a eliminar ");
                        platoBorrar = ingreso.nextLine();
                    }while(!platosDelDia.contains(platoBorrar));
                    platosDelDia.remove(platoBorrar);
                    System.out.println("Plato/s Eliminados");
                    platosQuitar--;
                }
				
                break;
				
            default:
			
                System.out.println("-");
				
                break;
        }
    }

    public void mostrarCartaDePlatos(){
        System.out.println("MENU");
        int indice = 1;
        for(String plato_aux : platosDelDia){
            System.out.println(indice + ") " + plato_aux);
            indice++;
        }
        agregarOQuitarPlato();
    }

    public int menuYDevolucionMenu(){
        int respuestaIngresadaMenu = 0;
        System.out.println("MENU");
        System.out.println("Opciones : ");
        System.out.println("1) Nuevo pedido");
        System.out.println("2) Modificar platos de la carta");
        System.out.println("3) Eliminar mesas ocupadas");
        System.out.println("4) Listar pedidos a entregar");
        System.out.println("5) Finalizar turno");
        System.out.println("---------------------------");
        while(respuestaIngresadaMenu>5 || respuestaIngresadaMenu<1){
            System.out.print("Ingrese ");
            respuestaIngresadaMenu = ingreso.nextInt();
            basura = ingreso.nextLine();
        }
        return respuestaIngresadaMenu;
    }

    public void IngresarPedido(){
        ArrayList<String> platos = new ArrayList<String>();
        int respuestaIngresadaMesa;
        System.out.println("Nuevo pedido: ");
        System.out.println("Numero de mesa de pedido");
        do{
            System.out.print("Ingrese ");
            respuestaIngresadaMesa = ingreso.nextInt();
            basura = ingreso.nextLine();
        }while(!cantidadUsosDeMesa.containsKey(respuestaIngresadaMesa));

        cantidadUsosDeMesa.put(respuestaIngresadaMesa,cantidadUsosDeMesa.get(respuestaIngresadaMesa)+1);

        mesasOcupadas.add(respuestaIngresadaMesa);

        System.out.println("Platos pedidos, o utilize ""Listo"" Para salir");

        String plato = "";
        do{
            System.out.print("Ingrese ");
            plato = ingreso.nextLine();
        }while(comprobarSiExistePlato(plato, platos));

        Pedido pedido = new Pedido(respuestaIngresadaMesa,platos);
        pedidosActivos.add(pedido);
    }

    public void quitarMesasOcupadas(){
        int mesasRestauranteDisponibles;
        if(mesasOcupadas.isEmpty()){
            System.out.println("No hay mesas ocupadas");
        }
        else{
            quitarMesasOcupadas_boleano = true;
            System.out.println("-");
            System.out.println("Mesas a liberar");
            for(int mesasOcupadas_aux: mesasOcupadas){
                System.out.println("-" + mesasOcupadas_aux);
            }
            System.out.println("-");
            while(quitarMesasOcupadas_boleano){
                do{
                    System.out.print("Ingrese ");
                    mesasRestauranteDisponibles = ingreso.nextInt();
                    basura = ingreso.nextLine();
                }while(mesasRestauranteDisponibles>cantidadUsosDeMesa.size() || mesasRestauranteDisponibles<1 && mesasRestauranteDisponibles!=0);

                if(mesasOcupadas.contains(mesasRestauranteDisponibles)){
                    mesasOcupadas.remove(mesasRestauranteDisponibles);
                    System.out.println("Mesa: " + mesasRestauranteDisponibles + " Libre");
                    for(int i=0; i<pedidosActivos.size(); i++){
                        if((pedidosActivos.get(i)).getNumeroDeMesa() == mesasRestauranteDisponibles){
                            pedidosActivos.remove(i);
                        }
                    }
                    quitarMesasOcupadas_boleano = false;
                    desocupoMesa = true;
                }

                if(mesasRestauranteDisponibles == 0){
                    quitarMesasOcupadas_boleano = false;
                }
                else if(desocupoMesa == false){
                    System.out.println("Ingrese mesas ocupadas");
                }
            }



        }



    }

    public void mostrarPedidosActivos(){
        System.out.println("_");
        System.out.println("Proximos pedidos: ");

        for(Pedido pedido_aux : pedidosActivos){
            System.out.print("Mesa: ");
            System.out.println(pedido_aux.getNumeroDeMesa());
            System.out.print("Platos pedidos: ");
            for(String plato_aux : pedido_aux.getPlatos()){
                System.out.print(plato_aux + ", ");
            }
            System.out.println("");
        }
        System.out.println("_");

    }

    public void menuTerminoJornada(){
        boolean obtuvoValorPlatos = false;

        for(HashMap.Entry<String,Integer>  cantidadPedidoPlato_aux : cantidadPedidoPlato.entrySet()){
            if(obtuvoValorPlatos == false){
                obtuvoValorPlatos = true;
                platoMasPedido_numero = cantidadPedidoPlato_aux.getValue();
                platoMenosPedido_numero = cantidadPedidoPlato_aux.getValue();
            }
            int value = cantidadPedidoPlato_aux.getValue();
            if(platoMasPedido_numero<value){
                platoMasPedido_numero = value;
                platoMasPedido_nombre = cantidadPedidoPlato_aux.getKey();

            }
            if(platoMenosPedido_numero>value){
                platoMenosPedido_numero = value;
                platoMenosPedido_nombre = cantidadPedidoPlato_aux.getKey();
            }
        }

        for(HashMap.Entry<Integer,Integer>  cantidadUsosDeMesa_aux : cantidadUsosDeMesa.entrySet()){
            if(obtuvoValorPlatos){
                obtuvoValorPlatos = false;
                cantidadUsosMesa = cantidadUsosDeMesa_aux.getValue();
            }
            int value = cantidadUsosDeMesa_aux.getValue();
            if(cantidadUsosMesa<value){
                cantidadUsosMesa = value;
                numeroMesa = cantidadUsosDeMesa_aux.getKey();

            }
        }


        System.out.print("Plato del dia: ");
        for(HashMap.Entry<String,Integer>  cantidadPedidoPlato_aux : cantidadPedidoPlato.entrySet()){
            if(cantidadPedidoPlato_aux.getValue() == platoMasPedido_numero){
                System.out.print(cantidadPedidoPlato_aux.getKey() + ", ");
            }
        }
        System.out.println("Pedido " + platoMasPedido_numero +" veces.");

        System.out.print("Peor plato del dia: ");
        for(HashMap.Entry<String,Integer>  cantidadPedidoPlato_aux : cantidadPedidoPlato.entrySet()){
            if(cantidadPedidoPlato_aux.getValue() == platoMenosPedido_numero){
                System.out.print(cantidadPedidoPlato_aux.getKey() + ", ");
            }
        }
        System.out.println("Pedido " + platoMenosPedido_numero +" veces.");


        System.out.print("Mesa mas ocupada ");
        for(HashMap.Entry<Integer,Integer>  cantidadPedidoPlato_aux : cantidadUsosDeMesa.entrySet()){
            if(cantidadPedidoPlato_aux.getValue() == cantidadUsosMesa){
                System.out.print(cantidadPedidoPlato_aux.getKey() + ", ");
            }
        }
        System.out.println("con " + cantidadUsosMesa + " usos.");

        salirMenu = false;
    }


    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();
        restaurante.platosDelDia.add("Paella valenciana");
        restaurante.platosDelDia.add("Pizza");
        restaurante.platosDelDia.add("Pulpo a la gallega");
        restaurante.platosDelDia.add("Sopa de pollo");
        restaurante.platosDelDia.add("Causa limeña");
        restaurante.cantidadPedidoPlato.put("Paella_valenciana",0);
        restaurante.cantidadPedidoPlato.put("Pizza",0);
        restaurante.cantidadPedidoPlato.put("Pulpo_a_la_gallega",0);
        restaurante.cantidadPedidoPlato.put("Sopa_de_pollo",0);
        restaurante.cantidadPedidoPlato.put("Causa_limeña",0);


        restaurante.nombreYMesasDelRestaurante(); 

        while(restaurante.salirMenu){
            switch (restaurante.menuYDevolucionMenu()) {
                case 1:
                        restaurante.IngresarPedido(); 
                    break;
                case 2:
                        restaurante.mostrarCartaDePlatos(); 
                    break;
                case 3:
                        restaurante.quitarMesasOcupadas();
                    break;
                case 4:
                    restaurante.mostrarPedidosActivos(); 
                    break;
                default:
                        restaurante.menuTerminoJornada(); 
                    break;
            }

        }
    }
}

