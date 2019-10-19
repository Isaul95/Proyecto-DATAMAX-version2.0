package si;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import static si.Apertura.fecha;
import static si.Apertura.monto;
import ticket.ticketcortedecaja;


public class Existencias extends javax.swing.JFrame  implements Runnable{
    Thread hilo;
    String hora,minutos,segundos;
    Statement sent;  
  ResultSet rs;     
  ticketcortedecaja tikectcorte;
float ventasdeldia, gastosdeldia, montodeapertura, diferencia, diferenciafinal;
int apertura;
String  usuarioname=SI_Inicio.text_user.getText();
int  id_usuario=Integer.parseInt(SI_Inicio.iduser.getText());
    Calendar fecha_actual = new GregorianCalendar();
    ArrayList arreglodelaspiezassobranteseninventario = new ArrayList(); // para guardar los id de cada producto que se ha agregado a la tabla venta
   ArrayList datosdelcorteparaelticket = new ArrayList(); // para guardar los id de cada producto que se ha agregado a la tabla venta
  
    public Existencias() {
        initComponents();
         hilo=new Thread(this);
     hilo.start();
        this.setLocationRelativeTo(null); // CENTRAR FORMULARIO
        Fecha.setText(fecha());
        user.setText(usuarioname);
        
    }
    
    public void hora(){
        Calendar calendario=new GregorianCalendar();
        Date horaactual=new Date();
        calendario.setTime(horaactual);
    hora=calendario.get(Calendar.HOUR)>9?""+calendario.get(Calendar.HOUR):"0"+calendario.get(Calendar.HOUR);
    minutos=calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
    segundos= calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);        
     }
    public void run() {
      Thread ct = Thread.currentThread();
      while(ct==hilo){
          hora();
          Reloj.setText(hora+":"+minutos+":"+segundos+" ");
      }
    }
    
    public static String fecha(){ /* SE DECARA LA FECHA DEL SISTEMA */
        Date fecha=new Date();
        SimpleDateFormat formatoFecha= new SimpleDateFormat("YYYY/MM/dd");
        return formatoFecha.format(fecha);
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Corte_btncancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Fecha = new javax.swing.JLabel();
        Reloj = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        existenciadeproductos = new rojerusan.RSTableMetro();
        pagocombobox = new javax.swing.JTextField();
        user = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CORTE DE CAJA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 36))); // NOI18N
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));
        jPanel2.setLayout(null);

        Corte_btncancelar.setBackground(new java.awt.Color(242, 38, 19));
        Corte_btncancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Corte_btncancelar.setText("Regresar");
        Corte_btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Corte_btncancelarActionPerformed(evt);
            }
        });
        jPanel2.add(Corte_btncancelar);
        Corte_btncancelar.setBounds(20, 410, 250, 60);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Puedes buscar desde aquí tu producto");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 60, 340, 29);

        Fecha.setFont(new java.awt.Font("Times New Roman", 1, 27)); // NOI18N
        Fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fecha.setText("DD/MM/YYYY");
        jPanel2.add(Fecha);
        Fecha.setBounds(10, 10, 186, 32);

        Reloj.setFont(new java.awt.Font("Times New Roman", 1, 27)); // NOI18N
        Reloj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Reloj.setText("00:00:00");
        jPanel2.add(Reloj);
        Reloj.setBounds(310, 10, 240, 32);

        existenciadeproductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        existenciadeproductos.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        existenciadeproductos.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        existenciadeproductos.setColorSelForeground(new java.awt.Color(0, 0, 0));
        existenciadeproductos.setGrosorBordeFilas(0);
        existenciadeproductos.setGrosorBordeHead(0);
        existenciadeproductos.setMultipleSeleccion(false);
        existenciadeproductos.setRowHeight(25);
        jScrollPane2.setViewportView(existenciadeproductos);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(360, 70, 270, 400);

        pagocombobox.setBackground(new java.awt.Color(0, 148, 204));
        pagocombobox.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        pagocombobox.setForeground(new java.awt.Color(255, 255, 255));
        pagocombobox.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pagocombobox.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pagocombobox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pagocomboboxFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pagocomboboxFocusLost(evt);
            }
        });
        jPanel2.add(pagocombobox);
        pagocombobox.setBounds(20, 100, 220, 29);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 50, 650, 480);

        user.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jPanel1.add(user);
        user.setBounds(500, 0, 180, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Corte_btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Corte_btncancelarActionPerformed
        // BOTON DE CANCELAR LA INSERCION DE NUEVO USUARIO
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "¿Regresar a pagina anterior?","                    Aviso",dialogButton);
        if(result == 0){
            dispose();   }
    }//GEN-LAST:event_Corte_btncancelarActionPerformed

    private void pagocomboboxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pagocomboboxFocusGained
        // *********************   CAJA DE TEXTO DE PAGOO *********
        if(pagocombobox.getText().trim().equals("00.00")){
            pagocombobox.setText("");
            //user_usuario.setForeground(Color.red);
        }
        pagocombobox.setForeground(Color.blue);
    }//GEN-LAST:event_pagocomboboxFocusGained

    private void pagocomboboxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pagocomboboxFocusLost
        // *********************   CAJA DE TEXTO DE PAGOO *********
        if(pagocombobox.getText().trim().equals("")){
            pagocombobox.setText("00.00");
        }
        pagocombobox.setForeground(new Color(236, 240, 241));
    }//GEN-LAST:event_pagocomboboxFocusLost
     
   
 

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Existencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Existencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Existencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Existencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Existencias().setVisible(true);
            }
        });
    }
SI cc= new SI();
 Connection ca= cc.conexion();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Corte_btncancelar;
    private javax.swing.JLabel Fecha;
    private javax.swing.JLabel Reloj;
    private rojerusan.RSTableMetro existenciadeproductos;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTextField pagocombobox;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}