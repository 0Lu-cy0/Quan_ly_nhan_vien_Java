package quan_ly_nhan_vien.views;

import javax.swing.JOptionPane;
import quan_ly_nhan_vien.controllers.LoginControllers;

public class LoginViews extends javax.swing.JFrame {

    private final LoginControllers loginController;
    private LoginViews loginViews;

    public LoginViews() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Đăng nhập");

        loginController = new LoginControllers(this);

        jtfTaiKhoan.addActionListener(evt -> jtfMatKhau.requestFocus());
        jtfMatKhau.addActionListener(evt -> btnDNhapActionPerformed(null));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jtfMatKhau = new javax.swing.JPasswordField();
        jtfTaiKhoan = new javax.swing.JTextField();
        btnDNhap = new javax.swing.JButton();
        jbtDangKy = new javax.swing.JButton();
        jcbAnHienMatKhau = new javax.swing.JCheckBox();

        jTextField1.setText("jTextField1");

        jLabel3.setBackground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Logo");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 470, 20));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 470, 10));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 470, 10));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 250, 10));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 470, 10));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 470, 10));
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 470, 10));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 470, 130));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("QUẢN LÝ NHÂN VIÊN");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 260, 40));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 250, 10));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 130));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true), "ĐĂNG NHẬP", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 102, 102));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Mật khẩu");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 117, 84, 38));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Tài khoản");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 45, 84, 38));

        jtfMatKhau.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jtfMatKhau.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel4.add(jtfMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 117, 218, 40));

        jtfTaiKhoan.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jtfTaiKhoan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jtfTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTaiKhoanActionPerformed(evt);
            }
        });
        jPanel4.add(jtfTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 45, 218, 40));

        btnDNhap.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDNhap.setForeground(new java.awt.Color(0, 102, 102));
        btnDNhap.setText("Đăng nhập");
        btnDNhap.setBorder(null);
        btnDNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDNhapActionPerformed(evt);
            }
        });
        jPanel4.add(btnDNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 199, 90, 40));

        jbtDangKy.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtDangKy.setForeground(new java.awt.Color(0, 102, 102));
        jbtDangKy.setText("Đăng ký");
        jbtDangKy.setBorder(null);
        jbtDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtDangKyActionPerformed(evt);
            }
        });
        jPanel4.add(jbtDangKy, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 199, 90, 40));

        jcbAnHienMatKhau.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jcbAnHienMatKhau.setForeground(new java.awt.Color(0, 102, 102));
        jcbAnHienMatKhau.setText("Hiển thị");
        jcbAnHienMatKhau.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jcbAnHienMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAnHienMatKhauActionPerformed(evt);
            }
        });
        jPanel4.add(jcbAnHienMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 450, 250));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDangKyActionPerformed
        RegisterViews registerPage = new RegisterViews();
        registerPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtDangKyActionPerformed

    private void jcbAnHienMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAnHienMatKhauActionPerformed
        jtfMatKhau.setEchoChar(jcbAnHienMatKhau.isSelected() ? (char) 0 : '*');
    }//GEN-LAST:event_jcbAnHienMatKhauActionPerformed

    private void btnDNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDNhapActionPerformed
        String username = jtfTaiKhoan.getText().trim();
        String password = new String(jtfMatKhau.getPassword()).trim();

        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ tài khoản và mật khẩu.", "Thông tin không hợp lệ", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Gọi phương thức login của controller với username và password
        loginController.login(username, password);
    }//GEN-LAST:event_btnDNhapActionPerformed

    private void jtfTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTaiKhoanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTaiKhoanActionPerformed

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(LoginViews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginViews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginViews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginViews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginViews().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDNhap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbtDangKy;
    private javax.swing.JCheckBox jcbAnHienMatKhau;
    private javax.swing.JPasswordField jtfMatKhau;
    private javax.swing.JTextField jtfTaiKhoan;
    // End of variables declaration//GEN-END:variables
}