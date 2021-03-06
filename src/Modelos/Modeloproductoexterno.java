package Modelos;

import Controladores.Controladorproductoexterno;
import static Controladores.Controladorproductoexterno.piezaendb;
import static Controladores.Controladorproductoexterno.solodosdecimales;
import static Controladores.Controladorproductoexterno.totalapagar;
import Controladores.Controladorventa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import si.ProductosExternos;
import static si.ProductosExternos.cantidad;
import si.SI;
import ticket.TicketVentaExterna;

public class Modeloproductoexterno extends Controladorproductoexterno {

    public static SI cc = new SI();
    public static Statement sent;
    public static ResultSet rs;

    public static void LlenarTableDatos(JTable tablaD) { // recibe como parametro 
        Object[] columna = new Object[3];  //crear un obj con el nombre de colunna

        DefaultTableModel modeloT = new DefaultTableModel();
        tablaD.setModel(modeloT);  // add modelo ala tabla         
        modeloT.addColumn("Producto");
        modeloT.addColumn("Pieza");
        modeloT.addColumn("Prceio");
        String sSQL="";
        if (ProductosExternos.combosucursal.getSelectedItem().toString().equals("Blanca")) {
             sSQL = "SELECT nombre, pieza,precio FROM productoexternoblanca";
             ProductosExternos.EtiquetaSucursal.setText("Productos de Blanca");
            } else if (ProductosExternos.combosucursal.getSelectedItem().toString().equals("Zapata")) {
                ProductosExternos.EtiquetaSucursal.setText("Productos de Zapata");
                 sSQL = "SELECT nombre, pieza,precio FROM productoexternozapata";
            } else if (ProductosExternos.combosucursal.getSelectedItem().toString().equals("Mercado")) {
                 sSQL = "SELECT nombre, pieza,precio FROM productoexternocentral";
                 ProductosExternos.EtiquetaSucursal.setText("Productos de Central");
            } else {
                 sSQL = "SELECT nombre, pieza,precio FROM productoexternojuarez";
                 ProductosExternos.EtiquetaSucursal.setText("Productos de Juarez");
            }
         try {
            Connection ca = cc.conexion();
            PreparedStatement ps = ca.prepareStatement(sSQL);
            try (ResultSet rs = ps.executeQuery(sSQL)) {
                while (rs.next()) {
                    columna[0] = rs.getString(1);
                    columna[1] = rs.getFloat(2);
                    columna[2] = rs.getFloat(3);
                    modeloT.addRow(columna);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR EN METODO: LlenarTableDatosblanca", "DEVELOPER HELPER", JOptionPane.ERROR_MESSAGE);
        } finally {
            cc.getClose();
        }
    }

    public static void piezasenbase(String pieza) {
        try {
            Connection ca = cc.conexion(); // CONEXION DB //SOLO SE LLAMA A LA CANTIDAD PORQUE EN EL TICKET YA SE DEFINIRÁN LOS NOMBRES DE CADA ARTICULO
            sent = (Statement) ca.createStatement();
            ProductosExternos.combosucursal.getSelectedItem().toString();
            if (ProductosExternos.combosucursal.getSelectedItem().toString().equals("Blanca")) {
                rs = sent.executeQuery("select pieza,precio from productoexternoblanca where nombre = '" + pieza + "' ");
                JOptionPane.showMessageDialog(null,"Entro al select de blanca");
            } else if (ProductosExternos.combosucursal.getSelectedItem().toString().equals("Zapata")) {
                rs = sent.executeQuery("select pieza,precio from productoexternozapata where nombre = '" + pieza + "' ");
            } else if (ProductosExternos.combosucursal.getSelectedItem().toString().equals("Mercado")) {
                rs = sent.executeQuery("select pieza,precio from productoexternocentral where nombre = '" + pieza + "' ");
            }else{
                rs = sent.executeQuery("select pieza,precio from productoexternojuarez where nombre = '" + pieza + "' ");
            }
            while (rs.next()) {
                piezaendb = rs.getFloat(1);
                precioendb = rs.getFloat(2);

            }
            JOptionPane.showMessageDialog(null,"Entro al select de blanca,valores: "+piezaendb+" valor: "+precioendb);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "piezasenbase");
        } finally {
            cc.getClose();
        }
    }

    public static void piezasenproductos(String pieza) {
        try {
            Connection ca = cc.conexion(); // CONEXION DB //SOLO SE LLAMA A LA CANTIDAD PORQUE EN EL TICKET YA SE DEFINIRÁN LOS NOMBRES DE CADA ARTICULO
            sent = (Statement) ca.createStatement();
            rs = sent.executeQuery("select cantidad from productos where nombre_producto = '" + pieza + "' ");
            while (rs.next()) {
                piezaendb = rs.getFloat(1);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "piezasenproductos");
        } finally {
            cc.getClose();
        }
    }

    public static void totalapagarmetodo() {
        try {
            Connection ca = cc.conexion(); // CONEXION DB //SOLO SE LLAMA A LA CANTIDAD PORQUE EN EL TICKET YA SE DEFINIRÁN LOS NOMBRES DE CADA ARTICULO
            sent = (Statement) ca.createStatement();
            ProductosExternos.combosucursal.getSelectedItem().toString();
            if (ProductosExternos.combosucursal.getSelectedItem().toString().equals("Blanca")) {
                rs = sent.executeQuery("select SUM(total) from productoexternoblanca WHERE nombre IN ('Pechuga', 'Muslo', 'Pierna', 'Ala', 'Huacal', 'Cadera')");
            } else if (ProductosExternos.combosucursal.getSelectedItem().toString().equals("Zapata")) {
                rs = sent.executeQuery("select SUM(total) from productoexternozapata WHERE nombre IN ('Pechuga', 'Muslo', 'Pierna', 'Ala', 'Huacal', 'Cadera')");
            } else if (ProductosExternos.combosucursal.getSelectedItem().toString().equals("Mercado")) {
                rs = sent.executeQuery("select SUM(total) from productoexternocentral WHERE nombre IN ('Pechuga', 'Muslo', 'Pierna', 'Ala', 'Huacal', 'Cadera')");
            } 
            else {
                rs = sent.executeQuery("select SUM(total) from productoexternojuarez WHERE nombre IN ('Pechuga', 'Muslo', 'Pierna', 'Ala', 'Huacal', 'Cadera')");
            }
            while (rs.next()) {
                totalapagar = rs.getFloat(1);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "totalapagarmetodo");
        } finally {
            cc.getClose();
        }
    }

    public static void nombresypiezas() {
        try {
            Connection ca = cc.conexion(); // CONEXION DB //SOLO SE LLAMA A LA CANTIDAD PORQUE EN EL TICKET YA SE DEFINIRÁN LOS NOMBRES DE CADA ARTICULO
            sent = (Statement) ca.createStatement();
            if (ProductosExternos.combosucursal.getSelectedItem().toString().equals("Blanca")) {
                rs = sent.executeQuery("select nombre, pieza from productoexternoblanca where pieza != 0");
            } else if (ProductosExternos.combosucursal.getSelectedItem().toString().equals("Zapata")) {
                rs = sent.executeQuery("select nombre, pieza from productoexternozapata where pieza != 0");
            } else if (ProductosExternos.combosucursal.getSelectedItem().toString().equals("Mercado")) {
                rs = sent.executeQuery("select nombre, pieza from productoexternocentral where pieza != 0");
            }else{
                 rs = sent.executeQuery("select nombre, pieza from productoexternojuarez where pieza != 0");
            }
            while (rs.next()) {
                nombres.add(rs.getString(1));
                piezas.add(rs.getFloat(2));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "nombresypiezas");
        } finally {
            cc.getClose();
        }
    }

    public static void vaciandotablas() {
        try {
            Connection ca = cc.conexion(); // CONEXION DB // el id del usuario para obtener el id del usuario y comprobar si hay o no algun registro
            String sql = "UPDATE `productoexternoblanca` SET `pieza`=0 ,`total`=0";
            PreparedStatement pst = ca.prepareCall(sql);
            int a = pst.executeUpdate();
            if (a > 0) {   // UPDATE `productoexternoblanca` SET `pieza`=0;              
            }
        } catch (Exception w) {
            JOptionPane.showMessageDialog(null, "error en id usuario" + w);
        }//fin del id del usuario para comprobar si hay o no elementos ya guardados
        finally {
            cc.getClose();
        }
        try {
            Connection ca = cc.conexion(); // CONEXION DB // el id del usuario para obtener el id del usuario y comprobar si hay o no algun registro
            String sql = "UPDATE `productoexternocentral` SET `pieza`=0 ,`total`=0";
            PreparedStatement pst = ca.prepareCall(sql);
            int a = pst.executeUpdate();
            if (a > 0) {   // UPDATE `productoexternoblanca` SET `pieza`=0;              
            }
        } catch (Exception w) {
            JOptionPane.showMessageDialog(null, "error en id usuario" + w);
        }//fin del id del usuario para comprobar si hay o no elementos ya guardados
        finally {
            cc.getClose();
        }
        try {
            Connection ca = cc.conexion(); // CONEXION DB // el id del usuario para obtener el id del usuario y comprobar si hay o no algun registro
            String sql = "UPDATE `productoexternozapata` SET `pieza`=0 ,`total`=0";
            PreparedStatement pst = ca.prepareCall(sql);
            int a = pst.executeUpdate();
            if (a > 0) {   // UPDATE `productoexternoblanca` SET `pieza`=0;              
            }
        } catch (Exception w) {
            JOptionPane.showMessageDialog(null, "error en id usuario" + w);
        }//fin del id del usuario para comprobar si hay o no elementos ya guardados
        finally {
            cc.getClose();
        }
        try {
            Connection ca = cc.conexion(); // CONEXION DB // el id del usuario para obtener el id del usuario y comprobar si hay o no algun registro
            String sql = "UPDATE `productoexternojuarez` SET `pieza`=0 ,`total`=0";
            PreparedStatement pst = ca.prepareCall(sql);
            int a = pst.executeUpdate();
            if (a > 0) {   // UPDATE `productoexternoblanca` SET `pieza`=0;              
            }
        } catch (Exception w) {
            JOptionPane.showMessageDialog(null, "error en id usuario" + w);
        }//fin del id del usuario para comprobar si hay o no elementos ya guardados
        finally {
            cc.getClose();
        }
    }

    public static void productospaExtras() { // recibe como parametro                          
        try {
            Connection ca = cc.conexion(); // CONEXION DB 
            ArrayList columna1 = new ArrayList();
            ArrayList columna2 = new ArrayList();
            ArrayList columna3 = new ArrayList();
            sent = (Statement) ca.createStatement();
            if (ProductosExternos.combosucursal.getSelectedItem().toString().equals("Blanca")) {
                rs = sent.executeQuery("SELECT nombre, pieza, total FROM productoexternoblanca where pieza != 0");
            } else if (ProductosExternos.combosucursal.getSelectedItem().toString().equals("Zapata")) {
                rs = sent.executeQuery("SELECT nombre, pieza, total FROM productoexternozapata where pieza != 0");
            } else if (ProductosExternos.combosucursal.getSelectedItem().toString().equals("Mercado")) {
                rs = sent.executeQuery("SELECT nombre, pieza, total FROM productoexternocentral where pieza != 0");
            }
            else{
                rs = sent.executeQuery("SELECT nombre, pieza, total FROM productoexternojuarez where pieza != 0");
            }
            while (rs.next()) {
                columna1.add(rs.getString(1));
                columna2.add(rs.getFloat(2));
                columna3.add(rs.getFloat(3));
            }
            String nombresuc = ProductosExternos.combosucursal.getSelectedItem().toString();
            ticketVentasExternas = new TicketVentaExterna();
            ticketVentasExternas.TicketVentaExterna(nombresuc, Float.parseFloat(ProductosExternos.pago.getText().toString()), columna1, columna2, columna3);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR EN METODO: productosvendidoseneldia", "DEVELOPER HELPER", JOptionPane.ERROR_MESSAGE);
        } finally {
            cc.getClose();
        }
    }

    public static void agregaraproductos() {
        nombresypiezas();
        for (int i = 0; i < nombres.size(); i++) {
            piezasenproductos(nombres.get(i).toString());
            piezaendb += Float.parseFloat(piezas.get(i).toString());
            try {
                Connection ca = cc.conexion(); // CONEXION DB  //la insersion a la tabla ventas
                PreparedStatement ps = ca.prepareStatement("UPDATE productos SET cantidad='" + piezaendb + "'WHERE nombre_producto= '" + nombres.get(i).toString() + "' ");
                int a = ps.executeUpdate();
                if (a > 0) {
                    ProductosExternos.pago.setText("");
                }
            } catch (SQLException e) { //fin de la insersion a la tabla ventas
                JOptionPane.showMessageDialog(null, "Error de datos por id vacio " + e);
            }//fin de la insersion a la tabla ventas
            finally {
                cc.getClose();
            }
        }
        nombres.clear();
        piezas.clear();
    }

    public static void updatetablas(float cantidadnumerica) {
        try {
            Connection ca = cc.conexion(); // CONEXION DB  //la insersion a la tabla ventas
            PreparedStatement ps;
            if (ProductosExternos.combosucursal.getSelectedItem().toString().equals("Blanca")) {
                 ps = ca.prepareStatement("UPDATE productoexternoblanca SET pieza='" + cantidadnumerica + "',total = '" + solodosdecimales.format(total).replace(",", ".") + "',fecha = '" + Controladorventa.fecha() + "',tiendaexterna = '" + ProductosExternos.combosucursal.getSelectedItem().toString() + "'WHERE nombre= '" + ProductosExternos.combopieza.getSelectedItem().toString() + "' ");
            } else if (ProductosExternos.combosucursal.getSelectedItem().toString().equals("Zapata")) {
                 ps = ca.prepareStatement("UPDATE productoexternozapata SET pieza='" + cantidadnumerica + "',total = '" + solodosdecimales.format(total).replace(",", ".") + "',fecha = '" + Controladorventa.fecha() + "',tiendaexterna = '" + ProductosExternos.combosucursal.getSelectedItem().toString() + "'WHERE nombre= '" + ProductosExternos.combopieza.getSelectedItem().toString() + "' ");
            } else if (ProductosExternos.combosucursal.getSelectedItem().toString().equals("Mercado")) {
                 ps = ca.prepareStatement("UPDATE productoexternocentral SET pieza='" + cantidadnumerica + "',total = '" + solodosdecimales.format(total).replace(",", ".") + "',fecha = '" + Controladorventa.fecha() + "',tiendaexterna = '" + ProductosExternos.combosucursal.getSelectedItem().toString() + "'WHERE nombre= '" + ProductosExternos.combopieza.getSelectedItem().toString() + "' ");
            } else {
                 ps = ca.prepareStatement("UPDATE productoexternojuarez SET pieza='" + cantidadnumerica + "',total = '" + solodosdecimales.format(total).replace(",", ".") + "',fecha = '" + Controladorventa.fecha() + "',tiendaexterna = '" + ProductosExternos.combosucursal.getSelectedItem().toString() + "'WHERE nombre= '" + ProductosExternos.combopieza.getSelectedItem().toString() + "' ");
            }
             a = ps.executeUpdate();
            LlenarTableDatos(ProductosExternos.J_tableLlenados);
            if (a > 0) {
                updateexitoso();
            }
        } catch (SQLException e) { //fin de la insersion a la tabla ventas
            JOptionPane.showMessageDialog(null, "updateblanca " + e);
        }//fin de la insersion a la tabla ventas
        finally {
            cc.getClose();
        }
    }

    public static void limpiarventa(){
                     total = 0;// HASTA EL 01/06/2020 SE TENIA EL PRECIO DE 33.00
                       vaciandotablas();
                         LlenarTableDatos(ProductosExternos.J_tableLlenados);
                         ProductosExternos.pago.setText(String.valueOf(total));
}
public static void proceso(){
    piezasenbase(ProductosExternos.combopieza.getSelectedItem().toString());
                        cantidadnumerica = piezaendb+Float.parseFloat(ProductosExternos.cantidad.getText());
                        total = Float.parseFloat(String.valueOf(cantidadnumerica * precioendb));// HASTA EL 01/06/2020 SE TENIA EL PRECIO DE 33.00
                        updatetablas(cantidadnumerica);
}
    public static void agregarexternos() {
        boolean pass2 = Controladorventa.validarFormularioparaentradadeproductos(cantidad.getText());
        if (pass2) {//ESTO VALIDA QUE EL TEXTO ESCRITO NO TENGA INCOHERENCIAS
            float cantidadnumerica = Float.parseFloat(cantidad.getText().toString());
            switch (ProductosExternos.combopieza.getSelectedItem().toString()) {
                case "Pechuga":
                     proceso();
                    break;
                case "Muslo":
                     proceso();
                    break;
                case "Pierna":
                    proceso();
                    break;
                case "Ala":
                   proceso();
                    break;
                case "Huacal":
                     proceso();
                    break;
                case "Cadera":
                     proceso();
                    break;
                default:
                    total = 0;
                    piezasenbase(ProductosExternos.combopieza.getSelectedItem().toString());
                    cantidadnumerica = piezaendb+Float.parseFloat(ProductosExternos.cantidad.getText());
                     updatetablas(cantidadnumerica);
                    break;
            }
        }//ESTO VALIDA QUE EL TEXTO ESCRITO NO TENGA INCOHERENCIAS
    }

    public static void updateexitoso() {
        cantidad.setText("");
        totalapagarmetodo();
        ProductosExternos.pago.setText(solodosdecimales.format(totalapagar).replace(",", "."));
    }
}
