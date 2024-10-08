package quan_ly_nhan_vien.views;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import quan_ly_nhan_vien.utils.DatabaseConnection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.PlainDocument;

public class AdminHomePage extends javax.swing.JFrame {

    public AdminHomePage() {
        initComponents();
        hienthi();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/quan_ly_nhan_vien/utils/Image/Home_icon.png")));
        j1.setVisible(true);
        j2.setVisible(false);
        jPanel2.setVisible(false);
        j4.setVisible(false);
        tab1.setBackground(Color.WHITE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        PlainDocument doc = (PlainDocument) jtfEmployeeID.getDocument();
        doc.setDocumentFilter(new NumberFilter());  // Áp dụng NumberFilter
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        j1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jtfEmployeeID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfFullName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtDateOfBirth = new javax.swing.JTextField();
        jtfPassword = new javax.swing.JTextField();
        jtfAddress = new javax.swing.JTextField();
        jtfJobTitle = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jbtThemNhanVien = new javax.swing.JButton();
        jbtXoaNhanVien = new javax.swing.JButton();
        jbtSuaNhanVien = new javax.swing.JButton();
        jbtLamMoi = new javax.swing.JButton();
        j2 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        j4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        tab1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tab2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tab3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tab4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setBackground(new java.awt.Color(255, 255, 255));

        j1.setBackground(new java.awt.Color(255, 255, 255));
        j1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "employee_id", "fullname", "date_of_birth", "job_title", "address", "password"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        j1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 290));

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("employee_id");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 19, 86, -1));
        jPanel5.add(jtfEmployeeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 15, 120, 25));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("fullname");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 52, 86, -1));
        jPanel5.add(jtfFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 52, 120, 25));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("date_of_birth");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 93, 86, -1));
        jPanel5.add(jtDateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 89, 120, 25));
        jPanel5.add(jtfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 89, 120, 25));
        jPanel5.add(jtfAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 52, 120, 25));
        jPanel5.add(jtfJobTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 15, 120, 25));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("job_title");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 19, 86, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("address");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 52, 86, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("password");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 93, 86, -1));

        jbtThemNhanVien.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbtThemNhanVien.setText("Thêm");
        jbtThemNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtThemNhanVienActionPerformed(evt);
            }
        });
        jPanel5.add(jbtThemNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jbtXoaNhanVien.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbtXoaNhanVien.setText("Xoá");
        jbtXoaNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtXoaNhanVienActionPerformed(evt);
            }
        });
        jPanel5.add(jbtXoaNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, -1));

        jbtSuaNhanVien.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbtSuaNhanVien.setText("Sửa");
        jbtSuaNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSuaNhanVienActionPerformed(evt);
            }
        });
        jPanel5.add(jbtSuaNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, -1));

        jbtLamMoi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbtLamMoi.setText("Làm mới");
        jbtLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtLamMoiActionPerformed(evt);
            }
        });
        jPanel5.add(jbtLamMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, -1, -1));

        j1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 286, 540, 170));

        j2.setBackground(new java.awt.Color(153, 255, 153));
        j2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        j4.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout j4Layout = new javax.swing.GroupLayout(j4);
        j4.setLayout(j4Layout);
        j4Layout.setHorizontalGroup(
            j4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );
        j4Layout.setVerticalGroup(
            j4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 458, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 552, Short.MAX_VALUE)
            .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menuLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(j4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menuLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(j2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menuLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(j1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menuLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
            .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menuLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(j4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menuLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(j2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menuLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(j1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menuLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel1.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 550, 470));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tab1.setBackground(new java.awt.Color(153, 153, 255));
        tab1.setPreferredSize(new java.awt.Dimension(114, 63));
        tab1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab1MouseClicked(evt);
            }
        });
        tab1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Nhân viên");
        tab1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 16, 80, 31));

        jPanel3.add(tab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 82, 170, 62));

        tab2.setBackground(new java.awt.Color(153, 153, 255));
        tab2.setPreferredSize(new java.awt.Dimension(114, 63));
        tab2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab2MouseClicked(evt);
            }
        });
        tab2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Chấm công");
        jLabel2.setPreferredSize(new java.awt.Dimension(77, 21));
        tab2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 16, 85, 31));

        jPanel3.add(tab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 156, 170, -1));

        tab3.setBackground(new java.awt.Color(153, 153, 255));
        tab3.setRequestFocusEnabled(false);
        tab3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab3MouseClicked(evt);
            }
        });
        tab3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Tính lương");
        jLabel3.setPreferredSize(new java.awt.Dimension(77, 21));
        tab3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 16, 87, 31));

        jPanel3.add(tab3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 231, 170, -1));

        tab4.setBackground(new java.awt.Color(153, 153, 255));
        tab4.setPreferredSize(new java.awt.Dimension(114, 63));
        tab4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tab4MouseEntered(evt);
            }
        });
        tab4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("About me");
        tab4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 6, 80, 51));

        jPanel3.add(tab4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 296, 170, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Admin");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 100, 50));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Đăng xuất");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 373, 170, 60));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public class NumberFilter extends DocumentFilter {

        @Override
        public void insertString(DocumentFilter.FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
            if (string != null && string.matches("\\d+")) { // Chỉ cho phép số
                super.insertString(fb, offset, string, attr);
            }
        }

        @Override
        public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
            if (text == null || text.isEmpty() || text.matches("\\d+")) { // Chấp nhận chuỗi rỗng hoặc chỉ cho phép số
                super.replace(fb, offset, length, text, attrs);
            }
        }
    }

    private void tab1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab1MouseClicked
        // TODO add your handling code here:
        j1.setVisible(true);
        j2.setVisible(false);
        jPanel2.setVisible(false);
        j4.setVisible(false);
        tab1.setBackground(Color.WHITE);
        tab2.setBackground(new Color(204, 204, 255));
        tab3.setBackground(new Color(204, 204, 255));
        tab4.setBackground(new Color(204, 204, 255));


    }//GEN-LAST:event_tab1MouseClicked

    private void tab2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab2MouseClicked
        // TODO add your handling code here:
        j1.setVisible(false);
        j2.setVisible(true);
        jPanel2.setVisible(false);
        j4.setVisible(false);
        tab2.setBackground(Color.WHITE);
        tab1.setBackground(new Color(204, 204, 255));
        tab3.setBackground(new Color(204, 204, 255));
        tab4.setBackground(new Color(204, 204, 255));


    }//GEN-LAST:event_tab2MouseClicked

    private void tab3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab3MouseClicked
        // TODO add your handling code here:
        j1.setVisible(false);
        j2.setVisible(false);
        jPanel2.setVisible(true);
        j4.setVisible(false);
        tab3.setBackground(Color.WHITE);
        tab2.setBackground(new Color(204, 204, 255));
        tab1.setBackground(new Color(204, 204, 255));
        tab4.setBackground(new Color(204, 204, 255));


    }//GEN-LAST:event_tab3MouseClicked

    private void tab4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tab4MouseEntered

    private void tab4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab4MouseClicked
        // TODO add your handling code here:
        j1.setVisible(false);
        j2.setVisible(false);
        jPanel2.setVisible(false);
        j4.setVisible(true);
        tab4.setBackground(Color.WHITE);
        tab2.setBackground(new Color(204, 204, 255));
        tab3.setBackground(new Color(204, 204, 255));
        tab1.setBackground(new Color(204, 204, 255));

    }//GEN-LAST:event_tab4MouseClicked

    private void jbtThemNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtThemNhanVienActionPerformed
        try {
            String id = jtfEmployeeID.getText().trim();  // Lấy ID và loại bỏ khoảng trắng
            String ten = jtfFullName.getText().trim();  // Lấy tên và loại bỏ khoảng trắng
            String ngaySinhText = jtDateOfBirth.getText().trim();  // Lấy ngày sinh và loại bỏ khoảng trắng
            String cv = jtfJobTitle.getText().trim();  // Lấy chức vụ
            String dc = jtfAddress.getText().trim();  // Lấy địa chỉ
            String pass = jtfPassword.getText().trim();  // Lấy mật khẩu

            // Kiểm tra xem các trường thông tin có bị rỗng hay không
            if (id.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Tài khoản không được để trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return; // Thoát khỏi phương thức nếu có lỗi
            }
            if (ten.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Tên không được để trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (pass.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Mật khẩu không được để trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Kiểm tra định dạng ngày sinh
            LocalDate ngaySinh = null;
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            try {
                ngaySinh = LocalDate.parse(ngaySinhText, formatter);
            } catch (DateTimeParseException e) {
                JOptionPane.showMessageDialog(this, "Sai định dạng ngày tháng năm sinh", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Kiểm tra năm sinh
            int namSinh = ngaySinh.getYear();
            if (namSinh < 1950 || namSinh > 2008) {
                JOptionPane.showMessageDialog(this, "Năm sinh chỉ được nằm trong khoảng 1950-2008", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Mã hoá mật khẩu
            String hashedPassword = hashPassword(pass);

            // Thêm dữ liệu vào bảng hiển thị
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            model.addRow(new Object[]{id, ten, ngaySinh.format(formatter), cv, dc, hashedPassword});

            // Câu lệnh SQL thêm nhân viên vào database
            String sql = "INSERT INTO employee (employee_id, fullname, date_of_birth, job_title, address, password) VALUES (?, ?, ?, ?, ?, ?)";

            Connection conn = new DatabaseConnection().getJDBCConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ps.setString(2, ten);
            ps.setDate(3, java.sql.Date.valueOf(ngaySinh));
            ps.setString(4, cv);
            ps.setString(5, dc);
            ps.setString(6, hashedPassword);  // Sử dụng mật khẩu đã mã hoá

            int result = ps.executeUpdate();
            if (result > 0) {
                JOptionPane.showMessageDialog(this, "Thêm thành công!");
            } else {
                JOptionPane.showMessageDialog(this, "Thêm thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }

            ps.close();
            conn.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Lỗi: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbtThemNhanVienActionPerformed

    private String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(password.getBytes(StandardCharsets.UTF_8));
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                hexString.append(String.format("%02x", b));
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    private void jbtXoaNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtXoaNhanVienActionPerformed
        int selectedRow = jTable2.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng để xóa.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        String employeeId = (String) model.getValueAt(selectedRow, 0);

        // Kiểm tra xem employeeId có phải là "Admin" không
        if ("Admin".equals(employeeId)) {
            JOptionPane.showMessageDialog(this, "Không thể xóa tài khoản Admin!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa bản ghi này?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            Connection conn = new DatabaseConnection().getJDBCConnection();
            try {

                // Bắt đầu transaction
                conn.setAutoCommit(false); // Tắt tự động cam kết

                // Xóa các bản ghi trong bảng attendance liên quan đến employee
                String deleteAttendanceSql = "DELETE FROM attendance WHERE employee_id = ?";
                PreparedStatement psDeleteAttendance = conn.prepareStatement(deleteAttendanceSql);
                psDeleteAttendance.setString(1, employeeId);
                psDeleteAttendance.executeUpdate();

                // Xóa các bản ghi trong bảng benefits liên quan đến employee
                String deleteBenefitsSql = "DELETE FROM benefits WHERE employee_id = ?";
                PreparedStatement psDeleteBenefits = conn.prepareStatement(deleteBenefitsSql);
                psDeleteBenefits.setString(1, employeeId);
                psDeleteBenefits.executeUpdate();

                // Xóa các bản ghi trong bảng salary liên quan đến employee
                String deleteSalarySql = "DELETE FROM salary WHERE employee_id = ?";
                PreparedStatement psDeleteSalary = conn.prepareStatement(deleteSalarySql);
                psDeleteSalary.setString(1, employeeId);
                psDeleteSalary.executeUpdate();

                // Cuối cùng, xóa bản ghi nhân viên
                String sql = "DELETE FROM employee WHERE employee_id = ?";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, employeeId);

                int result = ps.executeUpdate();
                if (result > 0) {
                    JOptionPane.showMessageDialog(this, "Xóa thành công!");
                    model.removeRow(selectedRow);  // Xóa dòng đã chọn trong bảng
                } else {
                    JOptionPane.showMessageDialog(this, "Xóa không thành công!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }

                // Cam kết transaction
                conn.commit();

                // Đóng tất cả PreparedStatement
                ps.close();
                psDeleteAttendance.close();
                psDeleteBenefits.close();
                psDeleteSalary.close();
                conn.close();

            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
                // Nếu có lỗi xảy ra, rollback transaction
                try {
                    conn.rollback();
                } catch (SQLException rollbackEx) {
                    rollbackEx.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_jbtXoaNhanVienActionPerformed

    private void jbtSuaNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSuaNhanVienActionPerformed
        int selectedRow = jTable2.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng để sửa.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Lấy giá trị employee_id từ dòng đã chọn
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        String employeeId = (String) model.getValueAt(selectedRow, 0);  // Cột 0 là employee_id
        String ten = (String) model.getValueAt(selectedRow, 1);
        String ngaySinh = (String) model.getValueAt(selectedRow, 2);
        String chucVu = (String) model.getValueAt(selectedRow, 3);
        String diaChi = (String) model.getValueAt(selectedRow, 4);
        String matKhau = (String) model.getValueAt(selectedRow, 5);

        // Tạo hộp thoại để người dùng nhập lại thông tin
        JTextField txtEmployeeId = new JTextField(employeeId);
        JTextField txtTen = new JTextField(ten);
        JTextField txtNgaySinh = new JTextField(ngaySinh);
        JTextField txtChucVu = new JTextField(chucVu);
        JTextField txtDiaChi = new JTextField(diaChi);
        JTextField txtMatKhau = new JTextField(matKhau);

        JPanel panel = new JPanel(new GridLayout(0, 2));
        panel.add(new JLabel("ID Nhân viên:"));
        panel.add(txtEmployeeId);
        panel.add(new JLabel("Họ và tên:"));
        panel.add(txtTen);
        panel.add(new JLabel("Ngày sinh (dd/MM/yyyy):"));
        panel.add(txtNgaySinh);
        panel.add(new JLabel("Chức vụ:"));
        panel.add(txtChucVu);
        panel.add(new JLabel("Địa chỉ:"));
        panel.add(txtDiaChi);
        panel.add(new JLabel("Mật khẩu:"));
        panel.add(txtMatKhau);

        int result = JOptionPane.showConfirmDialog(this, panel, "Sửa thông tin", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            try {
                String sql = "UPDATE employee SET fullname = ?, date_of_birth = ?, job_title = ?, address = ?, password = ? WHERE employee_id = ?";
                Connection conn = new DatabaseConnection().getJDBCConnection();
                PreparedStatement ps = conn.prepareStatement(sql);

                ps.setString(1, txtTen.getText());
                ps.setDate(2, java.sql.Date.valueOf(LocalDate.parse(txtNgaySinh.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
                ps.setString(3, txtChucVu.getText());
                ps.setString(4, txtDiaChi.getText());
                ps.setString(5, txtMatKhau.getText());

                int updateResult = ps.executeUpdate();

                if (updateResult > 0) {
                    model.setValueAt(txtTen.getText(), selectedRow, 1);
                    model.setValueAt(txtNgaySinh.getText(), selectedRow, 2);
                    model.setValueAt(txtChucVu.getText(), selectedRow, 3);
                    model.setValueAt(txtDiaChi.getText(), selectedRow, 4);
                    model.setValueAt(txtMatKhau.getText(), selectedRow, 5);

                    JOptionPane.showMessageDialog(this, "Cập nhật thành công!");
                } else {
                    JOptionPane.showMessageDialog(this, "Cập nhật không thành công!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }

                ps.close();
                conn.close();

            } catch (DateTimeParseException e) {
                JOptionPane.showMessageDialog(this, "Ngày sinh không hợp lệ! Vui lòng nhập theo định dạng dd/MM/yyyy hoặc yyyy-MM-dd.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jbtSuaNhanVienActionPerformed

    private void jbtLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtLamMoiActionPerformed
        hienthi();
        jtfEmployeeID.setText("");
        jtfFullName.setText("");
        jtDateOfBirth.setText("");
        jtfJobTitle.setText("");
        jtfAddress.setText("");
        jtfPassword.setText("");
    }//GEN-LAST:event_jbtLamMoiActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn đăng xuất?", "Xác nhận đăng xuất", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            // Người dùng xác nhận muốn đăng xuất
            // Mở lại màn hình đăng nhập
            Login login = new Login();
            login.setVisible(true);
            dispose();  // Đóng AdminHomePage
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    public void hienthi() {
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            Connection conn = new DatabaseConnection().getJDBCConnection();

            // Câu lệnh SQL để lấy dữ liệu
            String sql = "SELECT employee_id, fullname, date_of_birth, job_title, address, password FROM employee";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            model.setRowCount(0); // Xóa các dòng hiện tại trước khi hiển thị dữ liệu mới

            while (rs.next()) {
                String id = rs.getString("employee_id");
                String ten = rs.getString("fullname");
                String ngaySinh = rs.getString("date_of_birth");
                String chucVu = rs.getString("job_title");
                String diaChi = rs.getString("address");
                // Thay thế mật khẩu bằng chuỗi "********"
                String matKhau = "********"; // Hiển thị chuỗi thay vì mật khẩu thực tế

                // Thêm dữ liệu vào bảng
                model.addRow(new Object[]{id, ten, ngaySinh, chucVu, diaChi, matKhau});
            }

            // Đóng kết nối
            rs.close();
            ps.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new AdminHomePage().setVisible(true);

        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel j1;
    private javax.swing.JPanel j2;
    private javax.swing.JPanel j4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton jbtLamMoi;
    private javax.swing.JButton jbtSuaNhanVien;
    private javax.swing.JButton jbtThemNhanVien;
    private javax.swing.JButton jbtXoaNhanVien;
    private javax.swing.JTextField jtDateOfBirth;
    private javax.swing.JTextField jtfAddress;
    private javax.swing.JTextField jtfEmployeeID;
    private javax.swing.JTextField jtfFullName;
    private javax.swing.JTextField jtfJobTitle;
    private javax.swing.JTextField jtfPassword;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel tab1;
    private javax.swing.JPanel tab2;
    private javax.swing.JPanel tab3;
    private javax.swing.JPanel tab4;
    // End of variables declaration//GEN-END:variables
}
