/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package si;
import Controladores.Controladorventa;
import Controladores.Controladorinventarioventas;
import Modelos.Modeloinventarioventas;

/** 
 *
 * @author Alexis
 */
public class Inventarioventas extends javax.swing.JFrame {

    /**
     * Creates new form Inventarioventas
     */
    public Inventarioventas() {
        initComponents();
        Controladorinventarioventas.metodos_al_iniciar_inventarioventas();
             this.setLocationRelativeTo(null); // CENTRAR FORMULARIO
 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel12 = new javax.swing.JPanel();
        Administrador = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        veridventas = new javax.swing.JButton();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        fechainicial = new com.toedter.calendar.JDateChooser();
        fechafinal = new com.toedter.calendar.JDateChooser();
        buscarventasporfecha = new javax.swing.JButton();
        labelparaeltotal = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        totalventarealizada = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        conteodelasventasrealizadas = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        ventaseneldiasumadas = new javax.swing.JLabel();
        imprimirventa = new javax.swing.JButton();
        cancelarventa = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel24 = new javax.swing.JPanel();
        jLabel93 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        gastos_btn_back = new javax.swing.JButton();
        jPanel26 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        ventasacreditopendiente = new javax.swing.JTable();
        deudor = new javax.swing.JLabel();
        veridventasacreditopendiente = new javax.swing.JButton();
        pagarventaacredito = new javax.swing.JButton();
        totalventacreditoenturno = new javax.swing.JLabel();
        labelcredito = new javax.swing.JLabel();
        labelnombre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Administrador.setBackground(new java.awt.Color(0, 51, 102));
        Administrador.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Administrador.setDoubleBuffered(false);
        Administrador.setLayout(null);

        jPanel23.setBackground(new java.awt.Color(0, 51, 102));
        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ventas de hoy realizadas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        veridventas.setBackground(new java.awt.Color(0, 51, 102));
        veridventas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        veridventas.setForeground(new java.awt.Color(255, 255, 255));
        veridventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/si/IconosJava/flecha-hacia-la-izquierda (1).png"))); // NOI18N
        veridventas.setText("Ver las ventas");
        veridventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veridventasActionPerformed(evt);
            }
        });
        jPanel23.add(veridventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 70, -1, -1));

        jLabel91.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(255, 255, 255));
        jLabel91.setText("Hasta");
        jPanel23.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 20, 60, 50));

        jLabel92.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(255, 255, 255));
        jLabel92.setText("Productos vendidos hoy:");
        jPanel23.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 280, 50));

        fechainicial.setBackground(new java.awt.Color(0, 51, 102));
        fechainicial.setForeground(new java.awt.Color(0, 96, 255));
        fechainicial.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jPanel23.add(fechainicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 160, 40));

        fechafinal.setBackground(new java.awt.Color(0, 51, 102));
        fechafinal.setForeground(new java.awt.Color(0, 96, 255));
        fechafinal.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jPanel23.add(fechafinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 20, 160, 40));

        buscarventasporfecha.setBackground(new java.awt.Color(0, 51, 102));
        buscarventasporfecha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buscarventasporfecha.setForeground(new java.awt.Color(255, 255, 255));
        buscarventasporfecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/si/image/magnifier.png"))); // NOI18N
        buscarventasporfecha.setText("Buscar");
        buscarventasporfecha.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        buscarventasporfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarventasporfechaActionPerformed(evt);
            }
        });
        jPanel23.add(buscarventasporfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 20, 130, 40));

        labelparaeltotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelparaeltotal.setForeground(new java.awt.Color(255, 255, 255));
        labelparaeltotal.setText("00.00");
        jPanel23.add(labelparaeltotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 180, 90, 30));

        jLabel99.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(255, 255, 255));
        jLabel99.setText("Desde");
        jPanel23.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 60, 50));

        jLabel103.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(255, 255, 255));
        jLabel103.setText("Ventas de hoy:");
        jPanel23.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 280, 50));

        totalventarealizada.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        totalventarealizada.setForeground(new java.awt.Color(255, 255, 255));
        totalventarealizada.setText("Total de ésta venta:");
        jPanel23.add(totalventarealizada, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 180, 190, 30));

        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("Ventas realizadas:");
        jPanel23.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 210, 180, 50));

        conteodelasventasrealizadas.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        conteodelasventasrealizadas.setForeground(new java.awt.Color(255, 255, 255));
        conteodelasventasrealizadas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        conteodelasventasrealizadas.setText("00");
        jPanel23.add(conteodelasventasrealizadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 210, 120, 50));

        jLabel96.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(255, 255, 255));
        jLabel96.setText("Ventas de hoy : $ ");
        jPanel23.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 250, 170, 50));

        ventaseneldiasumadas.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        ventaseneldiasumadas.setForeground(new java.awt.Color(255, 255, 255));
        ventaseneldiasumadas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ventaseneldiasumadas.setText("00.00");
        jPanel23.add(ventaseneldiasumadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 250, 120, 50));

        imprimirventa.setBackground(new java.awt.Color(0, 51, 102));
        imprimirventa.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        imprimirventa.setForeground(new java.awt.Color(255, 255, 255));
        imprimirventa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/si/IconosJava/flecha-hacia-la-izquierda (1).png"))); // NOI18N
        imprimirventa.setText("Imprimir venta");
        imprimirventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirventaActionPerformed(evt);
            }
        });
        jPanel23.add(imprimirventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 120, 210, -1));

        cancelarventa.setBackground(new java.awt.Color(0, 51, 102));
        cancelarventa.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cancelarventa.setForeground(new java.awt.Color(255, 255, 255));
        cancelarventa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/si/IconosJava/cancelar2.png"))); // NOI18N
        cancelarventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarventaActionPerformed(evt);
            }
        });
        jPanel23.add(cancelarventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 70, 60, 90));

        jTable3 = new javax.swing.JTable(){
            public boolean isCellEditable(int filas, int columnas){
                return false;
            }
        };
        jTable3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(jTable3);

        jPanel23.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 360, 220));

        jTable2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTable2);

        jPanel23.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 500, 220));

        Administrador.add(jPanel23);
        jPanel23.setBounds(10, 70, 1260, 300);

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));

        jLabel93.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel93.setText("                Ventas");

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 0, 0));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/si/IconosJava/salir-flecha-derecha (1).png"))); // NOI18N
        jButton8.setText("Salir");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(322, 322, 322)
                .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 301, Short.MAX_VALUE)
                .addComponent(gastos_btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton8)
                .addGap(41, 41, 41))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(gastos_btn_back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4))
        );

        Administrador.add(jPanel24);
        jPanel24.setBounds(0, 0, 1288, 64);

        jPanel26.setBackground(new java.awt.Color(0, 51, 102));
        jPanel26.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ventas a credito pendiente por pagar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ventasacreditopendiente.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ventasacreditopendiente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        ventasacreditopendiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ventasacreditopendienteMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(ventasacreditopendiente);

        jPanel26.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 590, 250));

        Administrador.add(jPanel26);
        jPanel26.setBounds(10, 370, 610, 290);

        deudor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deudor.setForeground(new java.awt.Color(255, 255, 255));
        Administrador.add(deudor);
        deudor.setBounds(750, 520, 280, 50);

        veridventasacreditopendiente.setBackground(new java.awt.Color(0, 51, 102));
        veridventasacreditopendiente.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        veridventasacreditopendiente.setForeground(new java.awt.Color(255, 255, 255));
        veridventasacreditopendiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/si/IconosJava/flecha-hacia-la-izquierda (1).png"))); // NOI18N
        veridventasacreditopendiente.setText("Ver las ventas");
        veridventasacreditopendiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veridventasacreditopendienteActionPerformed(evt);
            }
        });
        Administrador.add(veridventasacreditopendiente);
        veridventasacreditopendiente.setBounds(620, 610, 189, 46);

        pagarventaacredito.setBackground(new java.awt.Color(0, 51, 102));
        pagarventaacredito.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pagarventaacredito.setForeground(new java.awt.Color(255, 255, 255));
        pagarventaacredito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/si/IconosJava/casilla-de-verificacion (1).png"))); // NOI18N
        pagarventaacredito.setText("Pagar venta");
        pagarventaacredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagarventaacreditoActionPerformed(evt);
            }
        });
        Administrador.add(pagarventaacredito);
        pagarventaacredito.setBounds(860, 610, 170, 46);

        totalventacreditoenturno.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        totalventacreditoenturno.setForeground(new java.awt.Color(255, 255, 255));
        totalventacreditoenturno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalventacreditoenturno.setText("00.00");
        Administrador.add(totalventacreditoenturno);
        totalventacreditoenturno.setBounds(930, 560, 120, 50);

        labelcredito.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelcredito.setForeground(new java.awt.Color(255, 255, 255));
        labelcredito.setText("Total de ésta venta : $");
        Administrador.add(labelcredito);
        labelcredito.setBounds(620, 560, 210, 50);

        labelnombre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelnombre.setForeground(new java.awt.Color(255, 255, 255));
        labelnombre.setText("A nombre de: ");
        Administrador.add(labelnombre);
        labelnombre.setBounds(620, 520, 130, 50);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Administrador, javax.swing.GroupLayout.PREFERRED_SIZE, 1298, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Administrador, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1288, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 1288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 707, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void veridventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veridventasActionPerformed
       Controladorinventarioventas.botonveridventas();
    }//GEN-LAST:event_veridventasActionPerformed

    private void buscarventasporfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarventasporfechaActionPerformed
    Controladorinventarioventas.botonbuscarventas_porfecha();
    }//GEN-LAST:event_buscarventasporfechaActionPerformed

    private void imprimirventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirventaActionPerformed
        Modeloinventarioventas.reimpresiondeventa(Controladorinventarioventas.id);
    }//GEN-LAST:event_imprimirventaActionPerformed

    private void cancelarventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarventaActionPerformed
        Controladorinventarioventas.botoncancelarventa(Controladorinventarioventas.id);
    }//GEN-LAST:event_cancelarventaActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
Controladorinventarioventas.verdescripcionenbaseaventarealizada();
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Controladorventa.botones_salir();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void ventasacreditopendienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ventasacreditopendienteMouseClicked
    Controladorinventarioventas.verdescripciondeventaacredito();
    }//GEN-LAST:event_ventasacreditopendienteMouseClicked

    private void veridventasacreditopendienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veridventasacreditopendienteActionPerformed
        Controladorinventarioventas.botonveridventasacreditopendientes();
    }//GEN-LAST:event_veridventasacreditopendienteActionPerformed

    private void pagarventaacreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagarventaacreditoActionPerformed
      Modeloinventarioventas.pagarventacredito(Controladorinventarioventas.id_ventapencredito);
    }//GEN-LAST:event_pagarventaacreditoActionPerformed

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
            java.util.logging.Logger.getLogger(Inventarioventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventarioventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventarioventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventarioventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventarioventas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel Administrador;
    public static javax.swing.JButton buscarventasporfecha;
    public static javax.swing.JButton cancelarventa;
    public static javax.swing.JLabel conteodelasventasrealizadas;
    public static javax.swing.JLabel deudor;
    public static com.toedter.calendar.JDateChooser fechafinal;
    public static com.toedter.calendar.JDateChooser fechainicial;
    private javax.swing.JButton gastos_btn_back;
    public static javax.swing.JButton imprimirventa;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel103;
    public static javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    public static javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    public static javax.swing.JTable jTable2;
    public static javax.swing.JTable jTable3;
    public static javax.swing.JLabel labelcredito;
    public static javax.swing.JLabel labelnombre;
    public static javax.swing.JLabel labelparaeltotal;
    public static javax.swing.JButton pagarventaacredito;
    public static javax.swing.JLabel totalventacreditoenturno;
    public static javax.swing.JLabel totalventarealizada;
    public static javax.swing.JTable ventasacreditopendiente;
    public static javax.swing.JLabel ventaseneldiasumadas;
    public static javax.swing.JButton veridventas;
    public static javax.swing.JButton veridventasacreditopendiente;
    // End of variables declaration//GEN-END:variables
}
