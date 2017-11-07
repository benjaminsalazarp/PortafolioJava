
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import Clases.ConnectAPI;
import Clases.Actividad;
import com.google.gson.Gson;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pixie
 */
public class MantenedorActividad extends javax.swing.JFrame {

    /**
     * Creates new form Actividad
     */
    public MantenedorActividad() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnIngresar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNombreActividad = new javax.swing.JTextField();
        btn_Atras = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cboEliminar = new javax.swing.JComboBox<>();
        btnEliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaEliminar = new javax.swing.JTable();
        btnEliminarBuscar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaConsultar = new javax.swing.JTable();
        cboConsultar = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnListar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaListar = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre Actividad:");

        btn_Atras.setText("Atrás");
        btn_Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnIngresar)
                    .addComponent(jLabel2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(txtNombreActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jButton2)
                        .addGap(30, 30, 30)
                        .addComponent(btn_Atras)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresar)
                    .addComponent(jButton2)
                    .addComponent(btn_Atras))
                .addContainerGap(133, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Insertar", jPanel1);

        jLabel3.setText("ID Actividad:");

        cboEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboEliminarMouseClicked(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tablaEliminar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaEliminar);

        btnEliminarBuscar.setText("Buscar");
        btnEliminarBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarBuscarActionPerformed(evt);
            }
        });

        jLabel6.setText("Seleccione Actividad a Eliminar:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel3)
                        .addGap(29, 29, 29)
                        .addComponent(cboEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnEliminarBuscar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminar)
                .addGap(114, 114, 114))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarBuscar))
                .addGap(15, 15, 15)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnEliminar)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Eliminar", jPanel2);

        jLabel4.setText("ID Actividad:");

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        tablaConsultar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tablaConsultar);

        cboConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboConsultarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(cboConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnConsultar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btnConsultar)
                    .addComponent(cboConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consultar", jPanel3);

        jLabel1.setText("LISTAR ACTIVIDADES ");

        btnListar.setText("LISTAR");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        tablaListar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tablaListar);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(btnListar))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnListar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Listar", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarBuscarActionPerformed
        // TODO add your handling code here:
        //API
        DefaultTableModel modelo = new DefaultTableModel();
        
        Actividad actividades = null;
         ConnectAPI cap = new ConnectAPI();
         String actividad_id = cboEliminar.getSelectedItem().toString().trim().toLowerCase();
         try{
             modelo.setColumnIdentifiers(new Object[]{"actividad_id","nombre"});
             actividades = cap.consultarActividad(actividad_id);
              modelo.addRow(new Object[]{actividades.getActividad_id().toString(),actividades.getNombre().toString()});
              tablaEliminar.setModel(modelo);
         }catch(Exception e)
         {
             e.printStackTrace();
         }
        
        /* BASE DATOS
        try{
            String actividad = cboEliminar.getSelectedItem().toString().trim().toLowerCase();
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@165.227.213.232:1521:dbportafolio","C##_equipo2","portafolio02");
            Statement sent = conn.createStatement();
            ResultSet rs = sent.executeQuery("select * from actividad where actividad_id ="+actividad);
            modelo.setColumnIdentifiers(new Object[]{"actividad_id","nombre"});
            while(rs.next())
            {

                modelo.addRow(new Object[]{rs.getString("actividad_id"),rs.getString("nombre")});
            }
            tablaEliminar.setModel(modelo);
            conn.close();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
           */ 
    }//GEN-LAST:event_btnEliminarBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        ConnectAPI c = new ConnectAPI();
        boolean exito = false;
        String actividad_id = cboEliminar.getSelectedItem().toString().trim().toLowerCase();

        try{
            exito = c.eliminarActividad(actividad_id);
            if(exito==true)
            {
                System.out.println("Eliminado con exito");
                JOptionPane.showMessageDialog(null, "Actividad Eliminada con Exito");

            }else
            {
                System.out.println("error else");
            }
        }catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Error");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void cboEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboEliminarMouseClicked
        // TODO add your handling code here:
        try{
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@165.227.213.232:1521:dbportafolio","C##_equipo2","portafolio02");
            Statement sent = conn.createStatement();
            ResultSet rs = sent.executeQuery("Select actividad_id from actividad");
            while(rs.next())
            {

                this.cboEliminar.addItem(rs.getString("actividad_id"));

            }
            conn.close();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_cboEliminarMouseClicked

    private void btn_AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AtrasActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new LoginAdmin().setVisible(true);
    }//GEN-LAST:event_btn_AtrasActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // DESDE LA API
        String nombre_Actividad = txtNombreActividad.getText().trim();
        Actividad ac = null;
        ConnectAPI c = new ConnectAPI();
        try{
            ac = c.agregarActividad(nombre_Actividad);
            JOptionPane.showMessageDialog(null, "Datos insertados existosamente");
            JOptionPane.showMessageDialog(null,"ID Nueva Actividad:"+ac.getActividad_id());
        }catch(Exception e)
        {
            e.printStackTrace();
        }

        /*
        try {
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","orc");
            //Inserción de datos a bd SIN PAQUETES

            CallableStatement cs = conn.prepareCall("{call mantenedor_actividad.insertarActividad (?,?)}");
            cs.setString(1,txtNombreActividad.getText());
            cs.setString(2,txtNombreActividad.getText());

            cs.executeUpdate();
            //Confirmación de inserción de datos
            JOptionPane.showMessageDialog(null, "Datos insertados existosamente");
            conn.close();
            cs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }*/
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void cboConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboConsultarMouseClicked
         try{
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@165.227.213.232:1521:dbportafolio","C##_equipo2","portafolio02");
            Statement sent = conn.createStatement();
            ResultSet rs = sent.executeQuery("Select actividad_id from actividad");
            while(rs.next())
            {

                this.cboConsultar.addItem(rs.getString("actividad_id"));

            }
            conn.close();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
         
    }//GEN-LAST:event_cboConsultarMouseClicked

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
       
         DefaultTableModel modelo = new DefaultTableModel();
         Actividad actividades = null;
         ConnectAPI cap = new ConnectAPI();
         String actividad_id = cboConsultar.getSelectedItem().toString().trim().toLowerCase();
         try{
             modelo.setColumnIdentifiers(new Object[]{"actividad_id","nombre"});
             actividades = cap.consultarActividad(actividad_id);
             modelo.addRow(new Object[]{actividades.getActividad_id().toString(),actividades.getNombre().toString()});
             tablaConsultar.setModel(modelo);
         }catch(Exception e)
         {
             e.printStackTrace();
         }
        /*try{
           String actividad_id = cboConsultar.getSelectedItem().toString().trim();
           DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
           Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@165.227.213.232:1521:dbportafolio","C##_equipo2","portafolio02");
           Statement sent = conn.createStatement();
           ResultSet rs = sent.executeQuery("select * from actividad where actividad_id='"+actividad_id+"'");
           modelo.setColumnIdentifiers(new Object[]{"actividad_id","nombre"});
           while(rs.next())
           {
               modelo.addRow(new Object[]{rs.getString("actividad_id"),rs.getString("nombre")});
           }
           tablaConsultar.setModel(modelo);
           conn.close();
       }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
           */
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        DefaultTableModel modelo = new DefaultTableModel();
        Actividad[] actividad = null;
        ConnectAPI c = new ConnectAPI();
        
        try
        {
            modelo.setColumnIdentifiers(new Object[]{"actividad_id","nombre",});
            actividad = c.listarActividades();
            for (int i = 0; i < actividad.length; i++) {
                System.out.println(actividad[i]);
                modelo.addRow(new Object[]{actividad[i].getActividad_id(),actividad[i].getNombre()});
                
            }
            tablaListar.setModel(modelo);
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnListarActionPerformed

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
            java.util.logging.Logger.getLogger(Actividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Actividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Actividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Actividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MantenedorActividad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarBuscar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btn_Atras;
    private javax.swing.JComboBox<String> cboConsultar;
    private javax.swing.JComboBox<String> cboEliminar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tablaConsultar;
    private javax.swing.JTable tablaEliminar;
    private javax.swing.JTable tablaListar;
    private javax.swing.JTextField txtNombreActividad;
    // End of variables declaration//GEN-END:variables
}
