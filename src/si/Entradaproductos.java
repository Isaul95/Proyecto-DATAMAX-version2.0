/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package si;
import Controladores.Controladorventa;
import Controladores.Controladorentradaproductos;
import Modelos.Modeloentradaproductos;
import static si.Entradaproductos.JtablepaLaVenta;

/**
 *
 * @author Alexis
 */
public class Entradaproductos extends javax.swing.JFrame {
public static boolean seagregoexterno=false;
 
    /**
     * Creates new form Entradaproductos
     */
    public Entradaproductos() {
        initComponents();
        Controladorentradaproductos.metodos_al_iniciar_entradasproductos();
             this.setLocationRelativeTo(null); // CENTRAR FORMULARIO
    }
    public Entradaproductos(boolean seagregoexterno){
    this.seagregoexterno=seagregoexterno;
    if(this.seagregoexterno==true){
       Modeloentradaproductos.ParaLAVenta(JtablepaLaVenta);
    }
} 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        agregar_articulo = new javax.swing.JPanel();
        producto_sobrante3 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jLabel83 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        gastos_btn_back = new javax.swing.JButton();
        jPanel32 = new javax.swing.JPanel();
        ventascanceladaseneldia5 = new javax.swing.JLabel();
        agregar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        JtablepaLaVenta = new javax.swing.JTable();
        jPanel33 = new javax.swing.JPanel();
        jLabel102 = new javax.swing.JLabel();
        ventascanceladaseneldia3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Jtable_ProductosEntradas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        agregar_articulo.setBackground(new java.awt.Color(0, 51, 102));
        agregar_articulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        agregar_articulo.setDoubleBuffered(false);
        agregar_articulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        producto_sobrante3.setBackground(new java.awt.Color(0, 51, 102));
        producto_sobrante3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        producto_sobrante3.setDoubleBuffered(false);
        producto_sobrante3.setLayout(null);

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));

        jLabel83.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel83.setText("Entradas");

        jButton10.setBackground(new java.awt.Color(255, 255, 255));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 0, 0));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/si/IconosJava/salir-flecha-derecha (1).png"))); // NOI18N
        jButton10.setText("Salir");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        gastos_btn_back.setBackground(new java.awt.Color(255, 255, 255));
        gastos_btn_back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        gastos_btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/si/IconosJava/salir-flecha-derecha (1).png"))); // NOI18N
        gastos_btn_back.setText("Regresar");
        gastos_btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gastos_btn_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap(300, Short.MAX_VALUE)
                .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(323, 323, 323)
                .addComponent(gastos_btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton10)
                .addGap(41, 41, 41))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel83, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(gastos_btn_back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(12, Short.MAX_VALUE))))
        );

        producto_sobrante3.add(jPanel31);
        jPanel31.setBounds(0, 0, 1290, 68);

        jPanel32.setBackground(new java.awt.Color(0, 51, 102));
        jPanel32.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "   Inventario actualizado", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel32.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ventascanceladaseneldia5.setFont(new java.awt.Font("Trebuchet MS", 1, 22)); // NOI18N
        ventascanceladaseneldia5.setForeground(new java.awt.Color(255, 0, 0));
        ventascanceladaseneldia5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ventascanceladaseneldia5.setText("productos en existencia en inventario del dia de hoy");
        jPanel32.add(ventascanceladaseneldia5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 650, 50));

        agregar.setBackground(new java.awt.Color(0, 51, 102));
        agregar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        agregar.setForeground(new java.awt.Color(0, 255, 102));
        agregar.setText("Agregar producto externo");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        jPanel32.add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 290, 40));

        JtablepaLaVenta = new javax.swing.JTable(){
            public boolean isCellEditable(int filas, int columnas){
                return false;
            }
        };
        JtablepaLaVenta.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        JtablepaLaVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(JtablepaLaVenta);

        jPanel32.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 600, -1));

        producto_sobrante3.add(jPanel32);
        jPanel32.setBounds(610, 80, 670, 570);

        jPanel33.setBackground(new java.awt.Color(0, 51, 102));
        jPanel33.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "   Entrada piezas de productos a inventario   ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel33.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel102.setFont(new java.awt.Font("Trebuchet MS", 1, 22)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(255, 0, 0));
        jLabel102.setText("   Ingresar cantidad de piezas a cada producto para ");
        jPanel33.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 550, 50));

        ventascanceladaseneldia3.setFont(new java.awt.Font("Trebuchet MS", 1, 22)); // NOI18N
        ventascanceladaseneldia3.setForeground(new java.awt.Color(255, 0, 0));
        ventascanceladaseneldia3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ventascanceladaseneldia3.setText("el inventario de hoy");
        jPanel33.add(ventascanceladaseneldia3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 530, 50));

        Jtable_ProductosEntradas = new javax.swing.JTable(){
            public boolean isCellEditable(int filas, int columnas){
                if(columnas==1){
                    return true;
                }else{
                    return false;
                }
            }
        };
        Jtable_ProductosEntradas.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        Jtable_ProductosEntradas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(Jtable_ProductosEntradas);

        jPanel33.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 530, -1));

        producto_sobrante3.add(jPanel33);
        jPanel33.setBounds(0, 80, 600, 570);

        agregar_articulo.add(producto_sobrante3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 670));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1288, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(agregar_articulo, javax.swing.GroupLayout.PREFERRED_SIZE, 1288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 707, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(agregar_articulo, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        Controladorventa.botones_salir();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        if(Controladorventa.noduplicarexternos==false){new ProductosExternos().setVisible(true); }
    }//GEN-LAST:event_agregarActionPerformed

    private void gastos_btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gastos_btn_backActionPerformed
       dispose();
    }//GEN-LAST:event_gastos_btn_backActionPerformed

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
            java.util.logging.Logger.getLogger(Entradaproductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Entradaproductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Entradaproductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Entradaproductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Entradaproductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable Jtable_ProductosEntradas;
    public static javax.swing.JTable JtablepaLaVenta;
    private javax.swing.JButton agregar;
    public static javax.swing.JPanel agregar_articulo;
    private javax.swing.JButton gastos_btn_back;
    private javax.swing.JButton jButton10;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JPanel producto_sobrante3;
    private javax.swing.JLabel ventascanceladaseneldia3;
    private javax.swing.JLabel ventascanceladaseneldia5;
    // End of variables declaration//GEN-END:variables
}
