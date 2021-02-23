package Controladores;

import Modelos.Modelogastos;
import Modelos.Modeloproductoexterno;
import java.text.DecimalFormat;
import java.util.ArrayList;
import static si.ProductosExternos.J_tableLlenados;
import ticket.TicketVentaExterna;

public class Controladorproductoexterno {
    public static float piezaendb=0,precioendb=0;
    public static float totalapagar=0;
   public static  float cantidadnumerica=0, total=0;
   public static   DecimalFormat solodosdecimales = new DecimalFormat("#.##");
         public static   ArrayList nombres = new ArrayList();
       public static      ArrayList piezas = new ArrayList();
 
public static       TicketVentaExterna ticketVentasExternas;
public static int a=0;
    public static void alpagarproductos(String nom, float total){
           if(total!=0){
               Modelogastos.insertarengastos(nom, total);
               Modeloproductoexterno.productospaExtras();
               Modeloproductoexterno.agregaraproductos();   // UPDATE `productoexternoblanca` SET `pieza`=0;
               Modeloproductoexterno.vaciandotablas(); 
              Modeloproductoexterno.LlenarTableDatos(J_tableLlenados); 
                Controladorventa.noduplicarexternos=false;
           }
           else{
               Modeloproductoexterno.agregaraproductos();   // UPDATE `productoexternoblanca` SET `pieza`=0;
    Modeloproductoexterno.vaciandotablas(); 
              Modeloproductoexterno.LlenarTableDatos(J_tableLlenados); 
                Controladorventa.noduplicarexternos=false;
           }
   
    }
    public static void alagregarenexterno(){
        Modeloproductoexterno.agregarexternos();
    }
    public static void limpiarventa(){
        Modeloproductoexterno.limpiarventa();
    }
}
