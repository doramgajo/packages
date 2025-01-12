package gui;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import crud.CrudTrucks;
import classes.Truck;


public class AddTruck extends javax.swing.JDialog {
    
    App app;

    /**
     * Creates new form AnadirEditarCamion
     */
    public AddTruck(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        app = (App) parent;
        setTitle("Añadir camión");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campoPlaca = new javax.swing.JTextField();
        campoModelo = new javax.swing.JTextField();
        comboTipoCamion = new javax.swing.JComboBox<>();
        campoPotencia = new javax.swing.JTextField();
        botonAnadirCamion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("CV");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 35);
        getContentPane().add(jLabel1, gridBagConstraints);

        jLabel2.setText("Placa:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(25, 25, 5, 5);
        getContentPane().add(jLabel2, gridBagConstraints);

        jLabel3.setText("Tipo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 25, 5, 5);
        getContentPane().add(jLabel3, gridBagConstraints);

        jLabel4.setText("Potencia:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 25, 5, 5);
        getContentPane().add(jLabel4, gridBagConstraints);

        jLabel5.setText("Modelo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 25, 5, 5);
        getContentPane().add(jLabel5, gridBagConstraints);

        campoPlaca.setPreferredSize(new java.awt.Dimension(175, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(25, 5, 5, 25);
        getContentPane().add(campoPlaca, gridBagConstraints);

        campoModelo.setPreferredSize(new java.awt.Dimension(175, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 25);
        getContentPane().add(campoModelo, gridBagConstraints);

        comboTipoCamion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Camión ligero", "Camión mediano", "Camión semipesado", "Camión pesado" }));
        comboTipoCamion.setPreferredSize(new java.awt.Dimension(175, 25));
        comboTipoCamion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoCamionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 25);
        getContentPane().add(comboTipoCamion, gridBagConstraints);

        campoPotencia.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        campoPotencia.setText("500");
        campoPotencia.setToolTipText("Añadir camión");
        campoPotencia.setPreferredSize(new java.awt.Dimension(175, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(campoPotencia, gridBagConstraints);

        botonAnadirCamion.setText("Añadir camión");
        botonAnadirCamion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAnadirCamionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 25, 25);
        getContentPane().add(botonAnadirCamion, gridBagConstraints);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonAnadirCamionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAnadirCamionActionPerformed

        try {
            if (campoPlaca.getText().isBlank() || campoModelo.getText().isBlank() || campoPotencia.getText().isBlank()) {
                JOptionPane.showMessageDialog(null, "Por favor, rellene todos los campos correctamente.");
            } else if (!campoPotencia.getText().matches("[1-9]\\d{2,3}")) {
                JOptionPane.showMessageDialog(null, "Inserte una potencia correcta.");
            } else if (!campoPlaca.getText().toUpperCase().matches("[A-Z]{4}\\d{3}")) {
                JOptionPane.showMessageDialog(null, "Inserte una placa correcta (Formato AAAA000).");
            } else if (CrudTrucks.comprobarExistencia(campoPlaca.getText())) {
                JOptionPane.showMessageDialog(null, "Ya existe un camión con el número de placa '" + campoPlaca.getText() +"'.");
            } else {
                CrudTrucks.crear(new Truck(campoPlaca.getText(), campoModelo.getText(), comboTipoCamion.getSelectedItem().toString(), campoPotencia.getText()));
                JOptionPane.showMessageDialog(null, "Datos añadidos correctamente.");
                app.actualizarTablas();
                dispose();
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AddTruck.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_botonAnadirCamionActionPerformed

    private void comboTipoCamionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoCamionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTipoCamionActionPerformed

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
            java.util.logging.Logger.getLogger(AddTruck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddTruck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddTruck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddTruck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddTruck dialog = new AddTruck(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAnadirCamion;
    private javax.swing.JTextField campoModelo;
    private javax.swing.JTextField campoPlaca;
    private javax.swing.JTextField campoPotencia;
    private javax.swing.JComboBox<String> comboTipoCamion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
