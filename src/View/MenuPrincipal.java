/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Decorador.Jugadores;

/**
 *
 * @author Ricardo
 */
public class MenuPrincipal extends javax.swing.JFrame {
 CrearPartidos cp =new CrearPartidos();
 Jugadores j = new Jugadores();

 
    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuPartido = new javax.swing.JMenu();
        itemCrear = new javax.swing.JMenuItem();
        itemInscribir = new javax.swing.JMenuItem();
        menuSancion = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        menuUsuarios = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        ItemCalificar = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Menu Principal");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/anotacion-de-futbol-con-la-pelota-entrando-a-la-porteria-por-el-angulo-superior-derecho.png"))); // NOI18N

        jLabel2.setText("Presentado por:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("RICARDO BETANCOURTH BOLIVAR");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("CRISTIAN CAMILO GALLEGO");

        MenuPartido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/balon-en-variante-de-futbol (1).png"))); // NOI18N
        MenuPartido.setText("Partido");

        itemCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/esquema-de-meta-del-balompie.png"))); // NOI18N
        itemCrear.setText("Crear partido");
        itemCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCrearActionPerformed(evt);
            }
        });
        MenuPartido.add(itemCrear);

        itemInscribir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/futbolista.png"))); // NOI18N
        itemInscribir.setText("Inscribir jugador ocacional");
        itemInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemInscribirActionPerformed(evt);
            }
        });
        MenuPartido.add(itemInscribir);

        jMenuBar1.add(MenuPartido);

        menuSancion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tarjetas-roja-y-amarilla.png"))); // NOI18N
        menuSancion.setText("Sanciones");

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lista-numerada.png"))); // NOI18N
        jMenuItem3.setText("Listar jugadores sancionados");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menuSancion.add(jMenuItem3);

        jMenuBar1.add(menuSancion);

        menuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/grupo-de-usuarios.png"))); // NOI18N
        menuUsuarios.setText("Usuarios");

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/agregar-usuario.png"))); // NOI18N
        jMenuItem5.setText("Agregar o eliminar usuario");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        menuUsuarios.add(jMenuItem5);

        jMenuBar1.add(menuUsuarios);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tick-dentro-de-circulo.png"))); // NOI18N
        jMenu1.setText("Calificar Jugadores");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        ItemCalificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/subir.png"))); // NOI18N
        ItemCalificar.setText("Subir Calificación");
        ItemCalificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemCalificarActionPerformed(evt);
            }
        });
        jMenu1.add(ItemCalificar);

        jMenuBar1.add(jMenu1);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/herramienta-de-trabajo-de-ajustes.png"))); // NOI18N
        jMenu3.setText("Opciones");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/salir-opcion.png"))); // NOI18N
        jMenuItem4.setText("Salir");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(253, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCrearActionPerformed
       
        cp.setVisible(true);
    }//GEN-LAST:event_itemCrearActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        Usuarios user = new Usuarios();
        user.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Sanciones san = new Sanciones();
        san.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void itemInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemInscribirActionPerformed
        CrearJugador j = new CrearJugador();
        j.setVisible(true);
    }//GEN-LAST:event_itemInscribirActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed

    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
     System.exit(WIDTH);
       
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void ItemCalificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemCalificarActionPerformed
       Calificacion c = new Calificacion();
        c.setVisible(true);
    }//GEN-LAST:event_ItemCalificarActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ItemCalificar;
    public static javax.swing.JMenu MenuPartido;
    public static javax.swing.JMenuItem itemCrear;
    public static javax.swing.JMenuItem itemInscribir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    public static javax.swing.JMenu menuSancion;
    public static javax.swing.JMenu menuUsuarios;
    // End of variables declaration//GEN-END:variables

   
}
