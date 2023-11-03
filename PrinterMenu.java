import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;

public class PrinterMenu extends JFrame {

    private JLabel lblPrinter1;
    private JLabel lblPrinter2;
    private JLabel lblPrinter3;
    private JCheckBox chkPrinter1;
    private JCheckBox chkPrinter2;
    private JCheckBox chkPrinter3;
    private JButton btnOpenWebPage;

    public PrinterMenu() {
        initComponentss();
    }
    private void initComponentss() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Menu De Impresoras");

        JPanel panel = new JPanel();
        getContentPane().add(panel);
        panel.setLayout(null);

        lblPrinter1 = new JLabel("Konica Minolta Finanzas");
        lblPrinter1.setBounds(20, 20, 200, 20);
        panel.add(lblPrinter1);

        lblPrinter2 = new JLabel("Konica Minolta Trafico");
        lblPrinter2.setBounds(20, 80, 200, 20);
        panel.add(lblPrinter2);

        lblPrinter3 = new JLabel("Konica Minolta Calidad");
        lblPrinter3.setBounds(20, 140, 200, 20);
        panel.add(lblPrinter3);

        chkPrinter1 = new JCheckBox();
        chkPrinter1.setBounds(200, 20, 20, 20);
        panel.add(chkPrinter1);

        chkPrinter2 = new JCheckBox();
        chkPrinter2.setBounds(200, 80, 20, 20);
        panel.add(chkPrinter2);

        chkPrinter3 = new JCheckBox();
        chkPrinter3.setBounds(200, 140, 20, 20);
        panel.add(chkPrinter3);

        btnOpenWebPage = new JButton("Entrar a Impresora");
        btnOpenWebPage.setBounds(50, 200, 150, 30);
        panel.add(btnOpenWebPage);

        btnOpenWebPage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebPage();
            }
        });
        setSize(280, 280);
        setLocationRelativeTo(null);
    }
    private void openWebPage() {
        String selectedPrinterIP = null;

        if (chkPrinter1.isSelected()) {
            selectedPrinterIP = "10.122.8.158"; 
        } else if (chkPrinter2.isSelected()) {
            selectedPrinterIP = "10.122.8.155"; 
        } else if (chkPrinter3.isSelected()) {
            selectedPrinterIP = "10.122.8.159"; 
         } else {
            JOptionPane.showMessageDialog(this, "Please select a printer", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            Desktop.getDesktop().browse(new URI("http://" + selectedPrinterIP));
        } catch (IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrinterMenu().setVisible(true);
            }
        });
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Konica Minolta Finanzas");

        jLabel2.setText("Konica Minolta Trafico");

        jLabel3.setText("Konica Minolta Calidad");

        jButton1.setText("Entrar a Impresora");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(jCheckBox1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox2)))
                .addGap(46, 46, 46))
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addComponent(jLabel1))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jCheckBox2))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox3)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}