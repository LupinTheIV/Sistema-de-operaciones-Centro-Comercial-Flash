/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.BorderLayout;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Santy
 */
public class CalcularSalario extends javax.swing.JFrame {

    /**
     * Creates new form CalcularSalario
     */
    public CalcularSalario() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        ImageIcon logo = new ImageIcon("Icono_RFlash.png");
        lblLogo.setBounds(80,10,55,55);
        Icon icono = new ImageIcon(logo.getImage().getScaledInstance(55, 55, Image.SCALE_SMOOTH));
        lblLogo.setIcon(icono);
        this.jpnTitulo.add(lblLogo);
        this.getContentPane().setLayout(new BorderLayout());
        
        ImageIcon logo2 = new ImageIcon("Icono_RFlash.png");
        lblLogo2.setBounds(50,20,50,50);
        Icon icono2 = new ImageIcon(logo2.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH));
        lblLogo2.setIcon(icono2);
        this.jpnTitulo.add(lblLogo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnTitulo = new javax.swing.JPanel();
        lblCentro1 = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jpnInfo = new javax.swing.JPanel();
        lblCentro2 = new javax.swing.JLabel();
        lblTextoIntro = new javax.swing.JLabel();
        lblInfoContacto = new javax.swing.JLabel();
        lblInfoCont = new javax.swing.JLabel();
        lblLogo2 = new javax.swing.JLabel();
        jpnContenido = new javax.swing.JPanel();
        lblSubtitulo = new javax.swing.JLabel();
        lblInstruccion = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        lblCantHoras = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtCantHoras = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblVerify = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnTitulo.setBackground(new java.awt.Color(255, 255, 255));
        jpnTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCentro1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblCentro1.setText("Centro Comercial Flash");

        lblLogo.setText("jLabel1");

        btnVolver.setBackground(new java.awt.Color(255, 255, 255));
        btnVolver.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnVolver.setText("Menú Principal");

        javax.swing.GroupLayout jpnTituloLayout = new javax.swing.GroupLayout(jpnTitulo);
        jpnTitulo.setLayout(jpnTituloLayout);
        jpnTituloLayout.setHorizontalGroup(
            jpnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnTituloLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(lblCentro1)
                .addGap(27, 27, 27)
                .addComponent(btnVolver)
                .addGap(33, 33, 33))
        );
        jpnTituloLayout.setVerticalGroup(
            jpnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCentro1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jpnInfo.setBackground(new java.awt.Color(255, 237, 178));
        jpnInfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 206, 83)));

        lblCentro2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblCentro2.setText("Centro Comercial Flash");

        lblTextoIntro.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblTextoIntro.setText("<html>Somos el lugar ideal para nuestros<p>visitantes, ven y encuentra las<p>mejores tiendas y centros<p>recreativos<p>©Derechos de autor de ejemplo <html>");

        lblInfoContacto.setText("Información de Contacto ");

        lblInfoCont.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblInfoCont.setText("<html>-Dirección: Calle 124 No.65-03<p>-Horario: 8:00 am a 9:00 pm<p>-Número: 315244664<html>");

        javax.swing.GroupLayout jpnInfoLayout = new javax.swing.GroupLayout(jpnInfo);
        jpnInfo.setLayout(jpnInfoLayout);
        jpnInfoLayout.setHorizontalGroup(
            jpnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnInfoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jpnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTextoIntro, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpnInfoLayout.createSequentialGroup()
                        .addComponent(lblLogo2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCentro2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInfoContacto)
                    .addComponent(lblInfoCont))
                .addGap(45, 45, 45))
        );
        jpnInfoLayout.setVerticalGroup(
            jpnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCentro2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInfoContacto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblLogo2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTextoIntro)
                    .addComponent(lblInfoCont))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jpnContenido.setBackground(new java.awt.Color(255, 255, 255));

        lblSubtitulo.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblSubtitulo.setText("Calcular Salario");

        lblInstruccion.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblInstruccion.setText("Digite la información en los espacios correspondientes: ");

        lblCedula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCedula.setText("Cédula:");

        lblCantHoras.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCantHoras.setText("Cantidad de horas trabajadas:");

        txtCantHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantHorasActionPerformed(evt);
            }
        });

        btnCalcular.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCalcular.setText("Calcular");

        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCancelar.setText("Cancelar");

        lblVerify.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jpnContenidoLayout = new javax.swing.GroupLayout(jpnContenido);
        jpnContenido.setLayout(jpnContenidoLayout);
        jpnContenidoLayout.setHorizontalGroup(
            jpnContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnContenidoLayout.createSequentialGroup()
                .addGroup(jpnContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jpnContenidoLayout.createSequentialGroup()
                            .addGap(199, 199, 199)
                            .addComponent(lblSubtitulo))
                        .addGroup(jpnContenidoLayout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(lblInstruccion))
                        .addGroup(jpnContenidoLayout.createSequentialGroup()
                            .addGap(75, 75, 75)
                            .addGroup(jpnContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblCedula)
                                .addComponent(lblCantHoras))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jpnContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCedula)
                                .addComponent(txtCantHoras, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))))
                    .addGroup(jpnContenidoLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(btnCancelar))
                    .addGroup(jpnContenidoLayout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(lblVerify, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnContenidoLayout.setVerticalGroup(
            jpnContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnContenidoLayout.createSequentialGroup()
                .addComponent(lblSubtitulo)
                .addGap(18, 18, 18)
                .addGroup(jpnContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpnContenidoLayout.createSequentialGroup()
                        .addComponent(lblInstruccion)
                        .addGap(18, 18, 18)
                        .addComponent(lblCedula))
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCantHoras)
                    .addComponent(txtCantHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcular)
                    .addComponent(btnCancelar))
                .addGap(18, 18, 18)
                .addComponent(lblVerify, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCantHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantHorasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantHorasActionPerformed

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
            java.util.logging.Logger.getLogger(CalcularSalario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalcularSalario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalcularSalario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalcularSalario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalcularSalario().setVisible(true);
            }
        });
    }

    public JButton getBtnCalcular() {
        return btnCalcular;
    }

    public void setBtnCalcular(JButton btnCalcular) {
        this.btnCalcular = btnCalcular;
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public void setBtnCancelar(JButton btnCancelar) {
        this.btnCancelar = btnCancelar;
    }

    public JButton getBtnVolver() {
        return btnVolver;
    }

    public void setBtnVolver(JButton btnVolver) {
        this.btnVolver = btnVolver;
    }

    public JLabel getLblVerify() {
        return lblVerify;
    }

    public void setLblVerify(JLabel lblVerify) {
        this.lblVerify = lblVerify;
    }

    public JTextField getTxtCantHoras() {
        return txtCantHoras;
    }

    public void setTxtCantHoras(JTextField txtCantHoras) {
        this.txtCantHoras = txtCantHoras;
    }

    public JTextField getTxtCedula() {
        return txtCedula;
    }

    public void setTxtCedula(JTextField txtCedula) {
        this.txtCedula = txtCedula;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel jpnContenido;
    private javax.swing.JPanel jpnInfo;
    private javax.swing.JPanel jpnTitulo;
    private javax.swing.JLabel lblCantHoras;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCentro1;
    private javax.swing.JLabel lblCentro2;
    private javax.swing.JLabel lblInfoCont;
    private javax.swing.JLabel lblInfoContacto;
    private javax.swing.JLabel lblInstruccion;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblLogo2;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblTextoIntro;
    private javax.swing.JLabel lblVerify;
    private javax.swing.JTextField txtCantHoras;
    private javax.swing.JTextField txtCedula;
    // End of variables declaration//GEN-END:variables
}
