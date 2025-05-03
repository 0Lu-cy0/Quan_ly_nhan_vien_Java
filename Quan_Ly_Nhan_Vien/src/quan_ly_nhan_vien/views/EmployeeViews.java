package quan_ly_nhan_vien.views;

import com.toedter.calendar.JDateChooser;
import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import quan_ly_nhan_vien.utils.DatabaseConnection;
import quan_ly_nhan_vien.utils.HashPassword;
import javax.swing.JDialog;
import javax.swing.SwingUtilities;

public class EmployeeViews extends javax.swing.JPanel {

    public EmployeeViews() {
        initComponents();
        hienthi(); // Thêm dòng này để hiển thị dữ liệu ngay khi khởi tạo
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        j1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbEmployee = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jtfiEmployeeID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfPhone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfAddress = new javax.swing.JTextField();
        jtfEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jlbPhone = new javax.swing.JLabel();
        jbtThemNhanVien = new javax.swing.JButton();
        jbtSuaNhanVien = new javax.swing.JButton();
        jbtLamMoi = new javax.swing.JButton();
        jdcDateOfBirth = new com.toedter.calendar.JDateChooser();
        jtffullname = new javax.swing.JTextField();
        jbtXuat = new javax.swing.JButton();
        jbtNhap = new javax.swing.JButton();
        jbtRSMatKhau = new javax.swing.JButton();
        jbtThongBao = new javax.swing.JButton();
        jcbbTimKiem = new javax.swing.JComboBox<>();
        jtfTimKiem = new javax.swing.JTextField();
        jbtTimKiem1 = new javax.swing.JButton();

        j1.setBackground(new java.awt.Color(255, 255, 255));
        j1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtbEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Full Name", "Email", "Phone Number", "Address", "Date Of Birth", "Role"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtbEmployee);

        j1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 540, 250));

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ID");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 19, 86, -1));
        jPanel5.add(jtfiEmployeeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 120, 25));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Full name");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 52, 100, -1));
        jPanel5.add(jtfPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 120, 25));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Date Of Birth");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 86, -1));
        jPanel5.add(jtfAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 52, 120, 25));
        jPanel5.add(jtfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 15, 120, 25));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Email");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 19, 86, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Address");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 52, 86, -1));

        jlbPhone.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jlbPhone.setForeground(new java.awt.Color(255, 255, 255));
        jlbPhone.setText("Phone number");
        jPanel5.add(jlbPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 93, 86, -1));

        jbtThemNhanVien.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbtThemNhanVien.setForeground(new java.awt.Color(0, 102, 102));
        jbtThemNhanVien.setText("Thêm");
        jbtThemNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtThemNhanVienActionPerformed(evt);
            }
        });
        jPanel5.add(jbtThemNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 70, -1));

        jbtSuaNhanVien.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbtSuaNhanVien.setForeground(new java.awt.Color(0, 102, 102));
        jbtSuaNhanVien.setText("Sửa");
        jbtSuaNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSuaNhanVienActionPerformed(evt);
            }
        });
        jPanel5.add(jbtSuaNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        jbtLamMoi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbtLamMoi.setForeground(new java.awt.Color(0, 102, 102));
        jbtLamMoi.setText("Làm mới");
        jbtLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtLamMoiActionPerformed(evt);
            }
        });
        jPanel5.add(jbtLamMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 100, -1));
        jPanel5.add(jdcDateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 120, -1));
        jPanel5.add(jtffullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 120, 25));

        jbtXuat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtXuat.setForeground(new java.awt.Color(0, 102, 102));
        jbtXuat.setText("Xuất");
        jbtXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtXuatActionPerformed(evt);
            }
        });
        jPanel5.add(jbtXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 140, 80, 24));

        jbtNhap.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtNhap.setForeground(new java.awt.Color(0, 102, 102));
        jbtNhap.setText("Nhập");
        jbtNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtNhapActionPerformed(evt);
            }
        });
        jPanel5.add(jbtNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, -1, 24));

        jbtRSMatKhau.setForeground(new java.awt.Color(0, 102, 102));
        jbtRSMatKhau.setText("RS Mật khẩu");
        jbtRSMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtRSMatKhauActionPerformed(evt);
            }
        });
        jPanel5.add(jbtRSMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));

        j1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 286, 540, 170));

        jbtThongBao.setBackground(new java.awt.Color(0, 102, 102));
        jbtThongBao.setForeground(new java.awt.Color(255, 255, 255));
        jbtThongBao.setText("Thông báo");
        jbtThongBao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtThongBaoActionPerformed(evt);
            }
        });
        j1.add(jbtThongBao, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 100, -1));

        jcbbTimKiem.setBackground(new java.awt.Color(0, 102, 102));
        jcbbTimKiem.setForeground(new java.awt.Color(255, 255, 255));
        jcbbTimKiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Full Name", "Email", "Phone Number", "Address", "Date Of Birth", "Role" }));
        jcbbTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbbTimKiemActionPerformed(evt);
            }
        });
        j1.add(jcbbTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 100, -1));

        jtfTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfTimKiemKeyPressed(evt);
            }
        });
        j1.add(jtfTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 200, -1));

        jbtTimKiem1.setBackground(new java.awt.Color(0, 102, 102));
        jbtTimKiem1.setForeground(new java.awt.Color(255, 255, 255));
        jbtTimKiem1.setText("Tìm kiếm");
        jbtTimKiem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtTimKiem1ActionPerformed(evt);
            }
        });
        j1.add(jbtTimKiem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 548, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 4, Short.MAX_VALUE)
                    .addComponent(j1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 4, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(j1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtThemNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtThemNhanVienActionPerformed
        try {
            // Lấy dữ liệu từ các trường nhập
            String id = jtfiEmployeeID.getText().trim();
            String ten = jtffullname.getText().trim();
            String email = jtfEmail.getText().trim();
            String address = jtfAddress.getText().trim();
            String phonenb = jtfPhone.getText().trim();

            // Kiểm tra nếu các trường không được để trống
            if (id.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Mã nhân viên không được để trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (ten.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Tên nhân viên không được để trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (email.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Email không được để trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (phonenb.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Số điện thoại không được để trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Validate email
            String emailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
            if (!email.matches(emailPattern)) {
                JOptionPane.showMessageDialog(this, "Email không đúng định dạng, vui lòng nhập lại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Validate phone number (chỉ cho phép số, độ dài từ 10-11 chữ số)
            String phonePattern = "^[0-9]{10,11}$";
            if (!phonenb.matches(phonePattern)) {
                JOptionPane.showMessageDialog(this, "Số điện thoại không đúng định dạng (chỉ gồm số và có độ dài 10-11 chữ số)!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Kiểm tra ngày sinh
            Date ngaySinhDate = (Date) jdcDateOfBirth.getDate();
            if (ngaySinhDate == null) {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn ngày sinh", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            LocalDate ngaySinh = ngaySinhDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            int namSinh = ngaySinh.getYear();

            // Kiểm tra năm sinh trong khoảng từ 1950 đến 2008
            if (namSinh < 1950 || namSinh > 2008) {
                JOptionPane.showMessageDialog(this, "Năm sinh chỉ được nằm trong khoảng 1950-2008", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Kiểm tra xem email đã tồn tại trong cơ sở dữ liệu chưa
            String checkEmailSQL = "SELECT COUNT(*) FROM employees WHERE email = ?";
            Connection conn = new DatabaseConnection().getJDBCConnection();
            PreparedStatement psCheckEmail = conn.prepareStatement(checkEmailSQL);
            psCheckEmail.setString(1, email);
            ResultSet rsEmail = psCheckEmail.executeQuery();
            rsEmail.next();
            if (rsEmail.getInt(1) > 0) {
                JOptionPane.showMessageDialog(this, "Email này đã tồn tại, vui lòng chọn email khác!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                rsEmail.close();
                psCheckEmail.close();
                return;
            }
            rsEmail.close();
            psCheckEmail.close();

            // Kiểm tra xem số điện thoại đã tồn tại trong cơ sở dữ liệu chưa
            String checkPhoneSQL = "SELECT COUNT(*) FROM employees WHERE phone_number = ?";
            PreparedStatement psCheckPhone = conn.prepareStatement(checkPhoneSQL);
            psCheckPhone.setString(1, phonenb);
            ResultSet rsPhone = psCheckPhone.executeQuery();
            rsPhone.next();
            if (rsPhone.getInt(1) > 0) {
                JOptionPane.showMessageDialog(this, "Số điện thoại này đã tồn tại, vui lòng chọn số điện thoại khác!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                rsPhone.close();
                psCheckPhone.close();
                return;
            }
            rsPhone.close();
            psCheckPhone.close();

            // Mã hóa mật khẩu mặc định
            String defaultPassword = "88888888";
            String hashedPassword = HashPassword.hashPassword(defaultPassword);

            // Thực hiện câu lệnh SQL để thêm nhân viên vào bảng employees
            String sql = "INSERT INTO employees (employee_id, full_name, email, phone_number, address, date_of_birth) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ps.setString(2, ten);
            ps.setString(3, email);
            ps.setString(4, phonenb);
            ps.setString(5, address);
            ps.setDate(6, java.sql.Date.valueOf(ngaySinh));

            int result = ps.executeUpdate();
            if (result > 0) {
                JOptionPane.showMessageDialog(this, "Thêm nhân viên thành công!");

                // Thêm dữ liệu vào bảng attendances
                String sqlChamCong = "INSERT INTO attendances (employee_id, day, status) VALUES (?, CURRENT_DATE, 'N/A')";
                PreparedStatement psChamCong = conn.prepareStatement(sqlChamCong);
                psChamCong.setString(1, id);
                psChamCong.executeUpdate();
                psChamCong.close();

                // Thêm tài khoản cho nhân viên vào bảng accounts với role_id mặc định là 0 (Unactive)
                String sqlAccount = "INSERT INTO accounts (employee_id, username, password, email, role_id) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement psAccount = conn.prepareStatement(sqlAccount);
                psAccount.setString(1, id);
                psAccount.setString(2, email);
                psAccount.setString(3, hashedPassword);
                psAccount.setString(4, email);
                psAccount.setInt(5, 0); // Gán role_id = 0 (Unactive)
                psAccount.executeUpdate();
                psAccount.close();
            } else {
                JOptionPane.showMessageDialog(this, "Thêm nhân viên thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }

            // Đóng kết nối
            ps.close();
            conn.close();

        } catch (SQLException ex) {
            if (ex.getErrorCode() == 1062) {
                JOptionPane.showMessageDialog(this, "Mã nhân viên đã tồn tại, vui lòng chọn mã nhân viên khác!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Lỗi SQL: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Lỗi: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbtThemNhanVienActionPerformed

    private void jbtSuaNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSuaNhanVienActionPerformed
    int selectedRow = jtbEmployee.getSelectedRow();

    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng để sửa.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
    }

    DefaultTableModel model = (DefaultTableModel) jtbEmployee.getModel();
    String employeeId = model.getValueAt(selectedRow, 0).toString();
    String ten = (String) model.getValueAt(selectedRow, 1);
    String email = (String) model.getValueAt(selectedRow, 2);
    String soDienThoai = (String) model.getValueAt(selectedRow, 3);
    String diaChi = (String) model.getValueAt(selectedRow, 4);
    String ngaySinh = (String) model.getValueAt(selectedRow, 5);
    String roleName = model.getValueAt(selectedRow, 6).toString(); // Lấy role_name thay vì role_id

    JTextField txtEmployeeId = new JTextField(employeeId);
    txtEmployeeId.setEditable(false);
    JTextField txtTen = new JTextField(ten);
    JTextField txtEmail = new JTextField(email);
    JTextField txtSoDienThoai = new JTextField(soDienThoai);
    JTextField txtDiaChi = new JTextField(diaChi);

    JDateChooser dateChooser = new JDateChooser();
    dateChooser.setDateFormatString("dd/MM/yyyy");
    try {
        if (ngaySinh != null && !ngaySinh.isEmpty() && !ngaySinh.equals("N/A")) {
            SimpleDateFormat sdfInput = new SimpleDateFormat("dd/MM/yyyy");
            Date parsedDate = sdfInput.parse(ngaySinh);
            dateChooser.setDate(parsedDate);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }

    // Cập nhật JComboBox để chỉ hiển thị "Unactive" và "Employee"
    JComboBox<String> cboRole = new JComboBox<>();
    cboRole.addItem("Unactive");
    cboRole.addItem("Employee");
    cboRole.setSelectedItem(roleName);

    JPanel panel = new JPanel(new GridLayout(0, 2));
    panel.add(new JLabel("Employee ID:"));
    panel.add(txtEmployeeId);
    panel.add(new JLabel("Full Name:"));
    panel.add(txtTen);
    panel.add(new JLabel("Email:"));
    panel.add(txtEmail);
    panel.add(new JLabel("Phone Number:"));
    panel.add(txtSoDienThoai);
    panel.add(new JLabel("Address:"));
    panel.add(txtDiaChi);
    panel.add(new JLabel("Date of Birth (dd/MM/yyyy):"));
    panel.add(dateChooser);
    panel.add(new JLabel("Role:"));
    panel.add(cboRole);

    int result = JOptionPane.showConfirmDialog(this, panel, "Sửa thông tin", JOptionPane.OK_CANCEL_OPTION);

    if (result == JOptionPane.OK_OPTION) {
        try {
            String newTen = txtTen.getText().trim();
            String newEmail = txtEmail.getText().trim();
            String newSoDienThoai = txtSoDienThoai.getText().trim();
            String newDiaChi = txtDiaChi.getText().trim();

            // Kiểm tra các trường không được để trống
            if (newTen.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Tên nhân viên không được để trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (newEmail.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Email không được để trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (newSoDienThoai.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Số điện thoại không được để trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Validate email
            String emailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
            if (!newEmail.matches(emailPattern)) {
                JOptionPane.showMessageDialog(this, "Email không đúng định dạng, vui lòng nhập lại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Validate phone number
            String phonePattern = "^[0-9]{10,11}$";
            if (!newSoDienThoai.matches(phonePattern)) {
                JOptionPane.showMessageDialog(this, "Số điện thoại không đúng định dạng (chỉ gồm số và có độ dài 10-11 chữ số)!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Kiểm tra ngày sinh
            Date newNgaySinhDate = dateChooser.getDate();
            if (newNgaySinhDate == null) {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn ngày sinh!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
            LocalDate newNgaySinhLocal = newNgaySinhDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            int namSinh = newNgaySinhLocal.getYear();
            if (namSinh < 1950 || namSinh > 2008) {
                JOptionPane.showMessageDialog(this, "Năm sinh chỉ được nằm trong khoảng 1950-2008!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Kiểm tra trùng email và số điện thoại (trừ bản ghi hiện tại)
            try (Connection conn = new DatabaseConnection().getJDBCConnection()) {
                // Kiểm tra email
                String checkEmailSQL = "SELECT COUNT(*) FROM employees WHERE email = ? AND employee_id != ?";
                PreparedStatement psCheckEmail = conn.prepareStatement(checkEmailSQL);
                psCheckEmail.setString(1, newEmail);
                psCheckEmail.setString(2, employeeId);
                ResultSet rsEmail = psCheckEmail.executeQuery();
                rsEmail.next();
                if (rsEmail.getInt(1) > 0) {
                    JOptionPane.showMessageDialog(this, "Email này đã tồn tại, vui lòng chọn email khác!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    rsEmail.close();
                    psCheckEmail.close();
                    return;
                }
                rsEmail.close();
                psCheckEmail.close();

                // Kiểm tra số điện thoại
                String checkPhoneSQL = "SELECT COUNT(*) FROM employees WHERE phone_number = ? AND employee_id != ?";
                PreparedStatement psCheckPhone = conn.prepareStatement(checkPhoneSQL);
                psCheckPhone.setString(1, newSoDienThoai);
                psCheckPhone.setString(2, employeeId);
                ResultSet rsPhone = psCheckPhone.executeQuery();
                rsPhone.next();
                if (rsPhone.getInt(1) > 0) {
                    JOptionPane.showMessageDialog(this, "Số điện thoại này đã tồn tại, vui lòng chọn số điện thoại khác!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    rsPhone.close();
                    psCheckPhone.close();
                    return;
                }
                rsPhone.close();
                psCheckPhone.close();

                // Cập nhật dữ liệu
                conn.setAutoCommit(false);

                String sqlUpdateEmployee = "UPDATE employees SET full_name = ?, email = ?, phone_number = ?, address = ?, date_of_birth = ? WHERE employee_id = ?";
                try (PreparedStatement psEmployee = conn.prepareStatement(sqlUpdateEmployee)) {
                    psEmployee.setString(1, newTen);
                    psEmployee.setString(2, newEmail);
                    psEmployee.setString(3, newSoDienThoai);
                    psEmployee.setString(4, newDiaChi);
                    psEmployee.setString(5, new SimpleDateFormat("yyyy-MM-dd").format(newNgaySinhDate));
                    psEmployee.setString(6, employeeId);
                    int updateResult = psEmployee.executeUpdate();

                    if (updateResult > 0) {
                        String sqlUpdateAccount = "UPDATE accounts SET email = ?, role_id = ? WHERE employee_id = ?";
                        try (PreparedStatement psAccount = conn.prepareStatement(sqlUpdateAccount)) {
                            psAccount.setString(1, newEmail);
                            int newRoleId = cboRole.getSelectedItem().equals("Unactive") ? 0 : 2; // Chỉ có Unactive (0) hoặc Employee (2)
                            psAccount.setInt(2, newRoleId);
                            psAccount.setString(3, employeeId);
                            psAccount.executeUpdate();
                        }

                        model.setValueAt(newTen, selectedRow, 1);
                        model.setValueAt(newEmail, selectedRow, 2);
                        model.setValueAt(newSoDienThoai, selectedRow, 3);
                        model.setValueAt(newDiaChi, selectedRow, 4);
                        model.setValueAt(new SimpleDateFormat("dd/MM/yyyy").format(newNgaySinhDate), selectedRow, 5);
                        model.setValueAt(cboRole.getSelectedItem(), selectedRow, 6);

                        conn.commit();
                        JOptionPane.showMessageDialog(this, "Cập nhật thành công!");
                    } else {
                        conn.rollback();
                        JOptionPane.showMessageDialog(this, "Cập nhật không thành công!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Lỗi khi cập nhật thông tin: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_jbtSuaNhanVienActionPerformed

    private void jbtLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtLamMoiActionPerformed
        hienthi();
        jtfiEmployeeID.setText("");
        jtffullname.setText("");
        jtfPhone.setText("");
        jdcDateOfBirth.setDate(null);
        jtfEmail.setText("");
        jtfAddress.setText("");
    }//GEN-LAST:event_jbtLamMoiActionPerformed

    private void jbtThongBaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtThongBaoActionPerformed
        // Tạo dialog hiển thị yêu cầu sửa thông tin
    Window parentWindow = SwingUtilities.getWindowAncestor(this);
    if (parentWindow == null || !(parentWindow instanceof Frame)) {
        JOptionPane.showMessageDialog(this, "Không tìm thấy container cha hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Ép kiểu Window thành Frame
    Frame parentFrame = (Frame) parentWindow;

    // Tạo dialog hiển thị yêu cầu sửa thông tin
    JDialog notificationDialog = new JDialog(parentFrame, "Thông báo yêu cầu sửa thông tin", true);
    notificationDialog.setSize(600, 400);
    notificationDialog.setLayout(new BorderLayout());
    notificationDialog.setLocationRelativeTo(parentFrame);

        // Truy vấn danh sách yêu cầu từ change_requests
        String sql = "SELECT cr.request_id, e.full_name, cr.field_name, cr.old_value, cr.new_value, cr.request_date " +
                     "FROM change_requests cr " +
                     "JOIN employees e ON cr.employee_id = e.employee_id " +
                     "WHERE cr.status = 'pending'";
        
        DefaultTableModel model = new DefaultTableModel(
            new String[]{"ID", "Tên nhân viên", "Trường", "Giá trị cũ", "Giá trị mới", "Ngày gửi"}, 0
        );
        JTable requestTable = new JTable(model);

        try (Connection conn = new DatabaseConnection().getJDBCConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("request_id"),
                    rs.getString("full_name"),
                    convertFieldNameToDisplay(rs.getString("field_name")),
                    rs.getString("old_value") != null ? rs.getString("old_value") : "N/A",
                    rs.getString("new_value"),
                    rs.getString("request_date")
                });
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi tải danh sách yêu cầu: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Panel chứa các nút
        JPanel buttonPanel = new JPanel();
        JButton btnApprove = new JButton("Xác nhận");
        JButton btnReject = new JButton("Xóa (Từ chối)");
        buttonPanel.add(btnApprove);
        buttonPanel.add(btnReject);

        // Thêm các thành phần vào dialog
        notificationDialog.add(new JScrollPane(requestTable), BorderLayout.CENTER);
        notificationDialog.add(buttonPanel, BorderLayout.SOUTH);

        // Xử lý nút Xác nhận
        btnApprove.addActionListener(e -> {
            int selectedRow = requestTable.getSelectedRow();
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(notificationDialog, "Vui lòng chọn một yêu cầu để xác nhận!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int requestId = (int) model.getValueAt(selectedRow, 0);
            String fieldName = convertFieldNameToDB((String) model.getValueAt(selectedRow, 2));
            String newValue = (String) model.getValueAt(selectedRow, 4);
            String employeeName = (String) model.getValueAt(selectedRow, 1);

            // Lấy employee_id từ tên nhân viên
            int employeeId = getEmployeeIdFromName(employeeName);
            if (employeeId == -1) {
                JOptionPane.showMessageDialog(notificationDialog, "Không tìm thấy nhân viên!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            boolean success = approveChangeRequest(employeeId, requestId, fieldName, newValue);
            if (success) {
                model.removeRow(selectedRow);
                JOptionPane.showMessageDialog(notificationDialog, "Yêu cầu đã được xác nhận!", "Thành công", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Xử lý nút Xóa (Từ chối)
        btnReject.addActionListener(e -> {
            int selectedRow = requestTable.getSelectedRow();
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(notificationDialog, "Vui lòng chọn một yêu cầu để từ chối!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int requestId = (int) model.getValueAt(selectedRow, 0);
            String rejectReason = JOptionPane.showInputDialog(notificationDialog, "Nhập lý do từ chối:");
            if (rejectReason != null && !rejectReason.trim().isEmpty()) {
                boolean success = rejectChangeRequest(requestId, rejectReason);
                if (success) {
                    model.removeRow(selectedRow);
                    JOptionPane.showMessageDialog(notificationDialog, "Yêu cầu đã bị từ chối!", "Thành công", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        // Hiển thị dialog
        notificationDialog.setVisible(true);
    }//GEN-LAST:event_jbtThongBaoActionPerformed

    // Hàm chuyển tên trường từ DB sang dạng hiển thị
// Các phương thức hỗ trợ
    private String convertFieldNameToDisplay(String dbFieldName) {
        switch (dbFieldName) {
            case "full_name": return "Full Name";
            case "email": return "Email";
            case "phone_number": return "Phone Number";
            case "address": return "Address";
            case "date_of_birth": return "Date of Birth";
            default: return dbFieldName;
        }
    }

    private String convertFieldNameToDB(String displayName) {
        switch (displayName) {
            case "Full Name": return "full_name";
            case "Email": return "email";
            case "Phone Number": return "phone_number";
            case "Address": return "address";
            case "Date of Birth": return "date_of_birth";
            default: return displayName;
        }
    }

    private int getEmployeeIdFromName(String fullName) {
        String sql = "SELECT employee_id FROM employees WHERE full_name = ?";
        try (Connection conn = new DatabaseConnection().getJDBCConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, fullName);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt("employee_id");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return -1;
    }

    private boolean approveChangeRequest(int employeeId, int requestId, String fieldName, String newValue) {
        try (Connection conn = new DatabaseConnection().getJDBCConnection()) {
            conn.setAutoCommit(false);
            String sqlUpdateEmployee = "UPDATE employees SET " + fieldName + " = ? WHERE employee_id = ?";
            try (PreparedStatement psEmployee = conn.prepareStatement(sqlUpdateEmployee)) {
                psEmployee.setString(1, newValue);
                psEmployee.setInt(2, employeeId);
                int rowsAffected = psEmployee.executeUpdate();

                if (rowsAffected > 0) {
                    if (fieldName.equals("email")) {
                        String sqlUpdateAccount = "UPDATE accounts SET email = ? WHERE employee_id = ?";
                        try (PreparedStatement psAccount = conn.prepareStatement(sqlUpdateAccount)) {
                            psAccount.setString(1, newValue);
                            psAccount.setInt(2, employeeId);
                            psAccount.executeUpdate();
                        }
                    }
                    String sqlUpdateRequest = "UPDATE change_requests SET status = 'approved' WHERE request_id = ?";
                    try (PreparedStatement psRequest = conn.prepareStatement(sqlUpdateRequest)) {
                        psRequest.setInt(1, requestId);
                        psRequest.executeUpdate();
                    }
                    conn.commit();
                    return true;
                } else {
                    conn.rollback();
                    return false;
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi xác nhận yêu cầu: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    private boolean rejectChangeRequest(int requestId, String reason) {
        String sql = "UPDATE change_requests SET status = 'rejected', admin_comment = ? WHERE request_id = ?";
        try (Connection conn = new DatabaseConnection().getJDBCConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, reason);
            ps.setInt(2, requestId);
            int rowsAffected = ps.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi từ chối yêu cầu: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    private void jcbbTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbbTimKiemActionPerformed
        jtfTimKiem.setText("");
        jtfTimKiem.requestFocus();
    }//GEN-LAST:event_jcbbTimKiemActionPerformed

    private void jtfTimKiemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfTimKiemKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jbtThongBao.doClick();
        }
    }//GEN-LAST:event_jtfTimKiemKeyPressed

    private void jbtXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtXuatActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Chọn nơi lưu file Excel");
        int userSelection = fileChooser.showSaveDialog(this);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            try (Workbook workbook = new XSSFWorkbook()) {
                Sheet sheet = workbook.createSheet("Employee Data");

                // Lấy model của bảng
                DefaultTableModel model = (DefaultTableModel) jtbEmployee.getModel();

                // Tạo hàng tiêu đề
                Row headerRow = sheet.createRow(0);
                for (int i = 0; i < model.getColumnCount(); i++) {
                    Cell cell = headerRow.createCell(i);
                    cell.setCellValue(model.getColumnName(i));
                }

                // Ghi dữ liệu từ bảng vào file Excel
                for (int i = 0; i < model.getRowCount(); i++) {
                    Row row = sheet.createRow(i + 1);
                    for (int j = 0; j < model.getColumnCount(); j++) {
                        Cell cell = row.createCell(j);
                        Object value = model.getValueAt(i, j);
                        if (value != null) {
                            cell.setCellValue(value.toString());
                        }
                    }
                }

                // Lưu file Excel
                try (FileOutputStream fos = new FileOutputStream(fileToSave + ".xlsx")) {
                    workbook.write(fos);
                }

                JOptionPane.showMessageDialog(this, "Xuất file Excel thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Lỗi khi xuất file: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jbtXuatActionPerformed

    private void jbtNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtNhapActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Chọn file Excel để nhập");
        int userSelection = fileChooser.showOpenDialog(this);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try (FileInputStream fis = new FileInputStream(selectedFile); Workbook workbook = new XSSFWorkbook(fis)) {

                Sheet sheet = workbook.getSheetAt(0);
                Connection conn = new DatabaseConnection().getJDBCConnection();
                if (conn == null) {
                    JOptionPane.showMessageDialog(this, "Không thể kết nối đến cơ sở dữ liệu.", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Câu lệnh SQL
                String selectSQL = "SELECT * FROM employees WHERE employee_id = ?";
                String updateSQL = "UPDATE employees SET full_name = ?, email = ?, phone_number = ?, address = ?, date_of_birth = ? WHERE employee_id = ?";
                String insertSQL = "INSERT INTO employees (employee_id, full_name, email, phone_number, address, date_of_birth) VALUES (?, ?, ?, ?, ?, ?)";

                PreparedStatement selectStmt = conn.prepareStatement(selectSQL);
                PreparedStatement updateStmt = conn.prepareStatement(updateSQL);
                PreparedStatement insertStmt = conn.prepareStatement(insertSQL);

                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                DefaultTableModel model = (DefaultTableModel) jtbEmployee.getModel();
                model.setRowCount(0); // Xóa dữ liệu cũ trên bảng giao diện

                // Duyệt qua các hàng trong file Excel (bỏ qua hàng tiêu đề)
                for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                    Row row = sheet.getRow(i);
                    if (row == null) {
                        continue;
                    }

                    // Lấy dữ liệu từ file Excel
                    Cell idCell = row.getCell(0);
                    Cell nameCell = row.getCell(1);
                    Cell emailCell = row.getCell(2);
                    Cell phoneCell = row.getCell(3);

                    if (idCell == null || idCell.getCellType() != CellType.NUMERIC
                            || nameCell == null || nameCell.getCellType() != CellType.STRING
                            || emailCell == null || emailCell.getCellType() != CellType.STRING
                            || phoneCell == null || phoneCell.getCellType() != CellType.STRING) {

                        JOptionPane.showMessageDialog(this, "Dòng " + (i + 1) + " bị thiếu thông tin quan trọng (ID, Tên, Email, hoặc Số điện thoại). Bỏ qua dòng này.", "Lỗi", JOptionPane.ERROR_MESSAGE);
                        continue;
                    }

                    int employeeId = (int) idCell.getNumericCellValue();
                    String fullName = nameCell.getStringCellValue().trim();
                    String email = emailCell.getStringCellValue().trim();
                    String phoneNumber = phoneCell.getStringCellValue().trim();

                    // Các cột không bắt buộc
                    String address = (row.getCell(4) != null && row.getCell(4).getCellType() == CellType.STRING)
                            ? row.getCell(4).getStringCellValue().trim()
                            : "N/A";

                    Date dateOfBirth = (row.getCell(5) != null && row.getCell(5).getCellType() == CellType.NUMERIC)
                            ? row.getCell(5).getDateCellValue()
                            : null;

                    // Kiểm tra nhân viên trong database
                    selectStmt.setInt(1, employeeId);
                    ResultSet rs = selectStmt.executeQuery();

                    if (rs.next()) {
                        // Nhân viên đã tồn tại, kiểm tra và cập nhật nếu cần
                        boolean isUpdated = false;

                        if (!fullName.equals(rs.getString("full_name"))) {
                            isUpdated = true;
                        }
                        if (!email.equals(rs.getString("email"))) {
                            isUpdated = true;
                        }
                        if (!phoneNumber.equals(rs.getString("phone_number"))) {
                            isUpdated = true;
                        }
                        if (!address.equals(rs.getString("address"))) {
                            isUpdated = true;
                        }
                        if (dateOfBirth != null && !sdf.format(dateOfBirth).equals(rs.getString("date_of_birth"))) {
                            isUpdated = true;
                        }

                        if (isUpdated) {
                            updateStmt.setString(1, fullName);
                            updateStmt.setString(2, email);
                            updateStmt.setString(3, phoneNumber);
                            updateStmt.setString(4, address);
                            updateStmt.setDate(5, dateOfBirth != null ? new java.sql.Date(dateOfBirth.getTime()) : null);
                            updateStmt.setInt(6, employeeId);
                            updateStmt.executeUpdate();
                        }
                    } else {
                        // Nhân viên chưa tồn tại, thêm mới
                        insertStmt.setInt(1, employeeId);
                        insertStmt.setString(2, fullName);
                        insertStmt.setString(3, email);
                        insertStmt.setString(4, phoneNumber);
                        insertStmt.setString(5, address);
                        insertStmt.setDate(6, dateOfBirth != null ? new java.sql.Date(dateOfBirth.getTime()) : null);
                        insertStmt.executeUpdate();
                    }

                    // Thêm vào bảng giao diện
                    Vector<Object> rowData = new Vector<>();
                    rowData.add(employeeId);
                    rowData.add(fullName);
                    rowData.add(email);
                    rowData.add(phoneNumber);
                    rowData.add(address != null && !address.isEmpty() ? address : "N/A");
                    rowData.add(dateOfBirth != null ? sdf.format(dateOfBirth) : "N/A");
                    model.addRow(rowData);

                    rs.close();
                }

                // Đóng kết nối
                selectStmt.close();
                updateStmt.close();
                insertStmt.close();
                conn.close();
                workbook.close();

                JOptionPane.showMessageDialog(this, "Nhập dữ liệu từ file Excel thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);

            } catch (IOException | SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Lỗi khi nhập dữ liệu: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jbtNhapActionPerformed

    private void jbtTimKiem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtTimKiem1ActionPerformed
        String searchText = jtfTimKiem.getText().trim();
        String searchCriteria = jcbbTimKiem.getSelectedItem().toString();

        if (searchText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập từ khóa tìm kiếm!");
            return;
        }

        if (!validateSearchCriteria(searchCriteria, searchText)) {
            JOptionPane.showMessageDialog(this, "Dữ liệu tìm kiếm không hợp lệ!");
            return;
        }

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = new DatabaseConnection().getJDBCConnection();
            if (conn == null) {
                JOptionPane.showMessageDialog(this, "Không thể kết nối đến cơ sở dữ liệu.", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String sql = "";
            if ("ID".equals(searchCriteria)) {
                try {
                    Integer.parseInt(searchText);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "EmployeeID phải là một số nguyên!");
                    return;
                }
                sql = "SELECT e.employee_id, e.full_name, e.email, e.phone_number, e.address, e.date_of_birth, a.role_id "
                        + "FROM employees e LEFT JOIN accounts a ON e.employee_id = a.employee_id WHERE e.employee_id = ?";
                ps = conn.prepareStatement(sql);
                ps.setInt(1, Integer.parseInt(searchText));
            } else if ("Full Name".equals(searchCriteria)) {
                sql = "SELECT e.employee_id, e.full_name, e.email, e.phone_number, e.address, e.date_of_birth, a.role_id "
                        + "FROM employees e LEFT JOIN accounts a ON e.employee_id = a.employee_id WHERE e.full_name LIKE ?";
                ps = conn.prepareStatement(sql);
                ps.setString(1, "%" + searchText + "%");
            } else if ("Phone Number".equals(searchCriteria)) {
                sql = "SELECT e.employee_id, e.full_name, e.email, e.phone_number, e.address, e.date_of_birth, a.role_id "
                        + "FROM employees e LEFT JOIN accounts a ON e.employee_id = a.employee_id WHERE e.phone_number LIKE ?";
                ps = conn.prepareStatement(sql);
                ps.setString(1, "%" + searchText + "%");
            } else if ("Email".equals(searchCriteria)) {
                sql = "SELECT e.employee_id, e.full_name, e.email, e.phone_number, e.address, e.date_of_birth, a.role_id "
                        + "FROM employees e LEFT JOIN accounts a ON e.employee_id = a.employee_id WHERE e.email LIKE ?";
                ps = conn.prepareStatement(sql);
                ps.setString(1, "%" + searchText + "%");
            } else if ("Address".equals(searchCriteria)) {
                sql = "SELECT e.employee_id, e.full_name, e.email, e.phone_number, e.address, e.date_of_birth, a.role_id "
                        + "FROM employees e LEFT JOIN accounts a ON e.employee_id = a.employee_id WHERE e.address LIKE ?";
                ps = conn.prepareStatement(sql);
                ps.setString(1, "%" + searchText + "%");
            }

            if (ps == null) {
                JOptionPane.showMessageDialog(this, "Tiêu chí tìm kiếm không hợp lệ.");
                return;
            }

            rs = ps.executeQuery();
            DefaultTableModel model = new DefaultTableModel(
                    new String[]{"EmployeeID", "Full Name", "Email", "Phone Number", "Address", "Date of Birth", "Role"},
                    0
            );

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            while (rs.next()) {
                int employeeId = rs.getInt("employee_id");
                String fullName = rs.getString("full_name");
                String email = rs.getString("email");
                String phoneNumber = rs.getString("phone_number");

                String address = rs.getString("address");
                address = (address != null) ? address : "N/A";

                Date dateOfBirth = rs.getDate("date_of_birth");
                String dob = (dateOfBirth != null) ? sdf.format(dateOfBirth) : "N/A";

                // Cập nhật hiển thị role_id
                int roleId = rs.getInt("role_id");
                String role = rs.wasNull() ? "N/A" : (roleId == 0 ? "Unactive" : roleId == 1 ? "Admin" : roleId == 2 ? "Employee" : "Unknown");

                model.addRow(new Object[]{employeeId, fullName, email, phoneNumber, address, dob, role});
            }

            jtbEmployee.setModel(model);

            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Không tìm thấy kết quả nào!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi tìm kiếm: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jbtTimKiem1ActionPerformed

    private void jbtRSMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtRSMatKhauActionPerformed
        // Giả định jtfEmployeeId là JTextField chứa employee_id
        String employeeIdText = jtfiEmployeeID.getText().trim();
        if (employeeIdText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập Employee ID!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int employeeId;
        try {
            employeeId = Integer.parseInt(employeeIdText);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Employee ID phải là số nguyên!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Xác nhận hành động từ người dùng
        int confirm = JOptionPane.showConfirmDialog(this, 
            "Bạn có chắc chắn muốn reset mật khẩu của nhân viên này thành '88888888'?", 
            "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        // Mật khẩu mặc định và mã hóa
        String defaultPassword = "88888888";
        String hashedPassword = HashPassword.hashPassword(defaultPassword);

        // Cập nhật mật khẩu trong bảng accounts
        String sql = "UPDATE accounts SET password = ? WHERE employee_id = ?";
        try (Connection conn = new DatabaseConnection().getJDBCConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, hashedPassword); // Lưu mật khẩu đã mã hóa
            ps.setInt(2, employeeId);
            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Reset mật khẩu thành công! Mật khẩu mới: 88888888", 
                    "Thành công", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Không tìm thấy tài khoản để reset mật khẩu!", 
                    "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi reset mật khẩu: " + ex.getMessage(), 
                "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbtRSMatKhauActionPerformed

    public boolean validateSearchCriteria(String criteria, String searchValue) {
        if ("ID".equals(criteria)) {
            try {
                Integer.parseInt(searchValue); // Kiểm tra xem có phải số nguyên không
            } catch (NumberFormatException e) {
                return false; // Không phải số nguyên hợp lệ
            }
        } else if ("Phone Number".equals(criteria) || "Email".equals(criteria) || "Address".equals(criteria) || "Full Name".equals(criteria)) {
            if (searchValue.isEmpty()) {
                return false; // Không được để trống
            }
        } else if ("Month".equals(criteria)) {
            if (!isValidMonth(searchValue)) {
                return false; // Tháng không hợp lệ
            }
        }
        return true; // Tìm kiếm hợp lệ
    }

    public boolean isValidMonth(String month) {
        try {
            int m = Integer.parseInt(month);
            return m >= 1 && m <= 12; // Kiểm tra tháng có hợp lệ không (1-12)
        } catch (NumberFormatException e) {
            return false; // Nếu không phải số hợp lệ
        }
    }

    public void hienthi() {
    try {
        DefaultTableModel model = (DefaultTableModel) jtbEmployee.getModel();
        model.setRowCount(0);

        Connection conn = new DatabaseConnection().getJDBCConnection();
        if (conn == null) {
            JOptionPane.showMessageDialog(this, "Không thể kết nối đến cơ sở dữ liệu.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Thêm điều kiện WHERE để loại bỏ admin (role_id != 1)
        String sql = "SELECT e.employee_id, e.full_name, e.email, e.phone_number, e.address, e.date_of_birth, a.role_id "
                + "FROM employees e "
                + "LEFT JOIN accounts a ON e.employee_id = a.employee_id "
                + "WHERE a.role_id != 1 OR a.role_id IS NULL"; // Loại bỏ admin, nhưng vẫn giữ các tài khoản không có role
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        int recordCount = 0;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        while (rs.next()) {
            recordCount++;
            Vector<Object> row = new Vector<>();

            row.add(rs.getInt("employee_id"));
            row.add(rs.getString("full_name"));
            row.add(rs.getString("email"));
            row.add(rs.getString("phone_number"));

            String address = rs.getString("address");
            row.add(address != null ? address : "N/A");

            Date dob = rs.getDate("date_of_birth");
            row.add(dob != null ? sdf.format(dob) : "N/A");

            // Cập nhật hiển thị role_id
            int roleId = rs.getInt("role_id");
            String roleName = rs.wasNull() ? "N/A" : (roleId == 0 ? "Unactive" : roleId == 2 ? "Employee" : "Unknown");
            row.add(roleName);

            model.addRow(row);
        }

        if (recordCount == 0) {
            JOptionPane.showMessageDialog(this, "Không có dữ liệu nào để hiển thị.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }

        rs.close();
        ps.close();
        conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Lỗi khi tải dữ liệu: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
    }
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel j1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtLamMoi;
    private javax.swing.JButton jbtNhap;
    private javax.swing.JButton jbtRSMatKhau;
    private javax.swing.JButton jbtSuaNhanVien;
    private javax.swing.JButton jbtThemNhanVien;
    private javax.swing.JButton jbtThongBao;
    private javax.swing.JButton jbtTimKiem1;
    private javax.swing.JButton jbtXuat;
    private javax.swing.JComboBox<String> jcbbTimKiem;
    private com.toedter.calendar.JDateChooser jdcDateOfBirth;
    private javax.swing.JLabel jlbPhone;
    private javax.swing.JTable jtbEmployee;
    private javax.swing.JTextField jtfAddress;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfPhone;
    private javax.swing.JTextField jtfTimKiem;
    private javax.swing.JTextField jtffullname;
    private javax.swing.JTextField jtfiEmployeeID;
    // End of variables declaration//GEN-END:variables
}
