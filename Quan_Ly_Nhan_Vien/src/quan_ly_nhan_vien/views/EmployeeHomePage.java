package quan_ly_nhan_vien.views;

import java.awt.GridLayout;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import quan_ly_nhan_vien.utils.DatabaseConnection;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EmployeeHomePage extends javax.swing.JFrame {

    DatabaseConnection dbConnection = new DatabaseConnection();
    private String employeeID; // Biến lưu trữ ID nhân viên
    private String username; // Biến lưu trữ tên đăng nhập
    private String password; // Biến lưu trữ mật khẩu

    public EmployeeHomePage(String username, String password) {
        initComponents();
        this.username = username;
        this.password = password;
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Nhân viên");
        // Gọi hàm load thông tin nhân viên
        loadEmployeeData(username); // Sử dụng employeeID đã lưu
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jbtDoiMatKhau = new javax.swing.JButton();
        jbtDangXuat = new javax.swing.JButton();
        jbtXemLichSuChamCong = new javax.swing.JButton();
        jbtYeuCauSuaThongTin = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jtfPhoneNumber = new javax.swing.JTextField();
        jtfAddress = new javax.swing.JTextField();
        jtfLuong = new javax.swing.JTextField();
        jtfHoVaTen = new javax.swing.JTextField();
        jtfNgayThangNamSinh = new javax.swing.JTextField();
        jtfEmail = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtDoiMatKhau.setForeground(new java.awt.Color(0, 102, 102));
        jbtDoiMatKhau.setText("Đổi mật khẩu");
        jbtDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtDoiMatKhauActionPerformed(evt);
            }
        });
        jPanel3.add(jbtDoiMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 120, 50));

        jbtDangXuat.setForeground(new java.awt.Color(0, 102, 102));
        jbtDangXuat.setText("Đăng xuất");
        jbtDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtDangXuatActionPerformed(evt);
            }
        });
        jPanel3.add(jbtDangXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 120, 50));

        jbtXemLichSuChamCong.setForeground(new java.awt.Color(0, 102, 102));
        jbtXemLichSuChamCong.setText("Xem lịch sử chấm công");
        jbtXemLichSuChamCong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtXemLichSuChamCongActionPerformed(evt);
            }
        });
        jPanel3.add(jbtXemLichSuChamCong, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 160, 50));

        jbtYeuCauSuaThongTin.setForeground(new java.awt.Color(0, 102, 102));
        jbtYeuCauSuaThongTin.setText("Yêu cầu sửa thông tin");
        jbtYeuCauSuaThongTin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtYeuCauSuaThongTinActionPerformed(evt);
            }
        });
        jPanel3.add(jbtYeuCauSuaThongTin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 160, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 470, 180));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true), "Thông tin nhân viên", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(0, 102, 102));
        jPanel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtfPhoneNumber.setEditable(false);
        jtfPhoneNumber.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jtfPhoneNumber.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true), "Phone Number", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        jtfPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPhoneNumberActionPerformed(evt);
            }
        });
        jPanel4.add(jtfPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 452, 50));

        jtfAddress.setEditable(false);
        jtfAddress.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jtfAddress.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true), "Địa chỉ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        jtfAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfAddressActionPerformed(evt);
            }
        });
        jPanel4.add(jtfAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 452, 50));

        jtfLuong.setEditable(false);
        jtfLuong.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jtfLuong.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true), "Lương", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        jtfLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfLuongActionPerformed(evt);
            }
        });
        jPanel4.add(jtfLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 452, 50));

        jtfHoVaTen.setEditable(false);
        jtfHoVaTen.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jtfHoVaTen.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true), "Họ và tên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        jtfHoVaTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfHoVaTenActionPerformed(evt);
            }
        });
        jPanel4.add(jtfHoVaTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 29, 452, 50));

        jtfNgayThangNamSinh.setEditable(false);
        jtfNgayThangNamSinh.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jtfNgayThangNamSinh.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true), "Ngày, tháng, năm sinh", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        jtfNgayThangNamSinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNgayThangNamSinhActionPerformed(evt);
            }
        });
        jPanel4.add(jtfNgayThangNamSinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 452, 50));

        jtfEmail.setEditable(false);
        jtfEmail.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jtfEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true), "Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        jtfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEmailActionPerformed(evt);
            }
        });
        jPanel4.add(jtfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 452, 50));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 470, 400));

        jPanel6.setBackground(new java.awt.Color(0, 102, 102));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("QUẢN LÝ NHÂN VIÊN");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 260, 40));
        jPanel6.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 250, 10));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 130));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDangXuatActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn đăng xuất?", "Xác nhận đăng xuất", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            // Người dùng xác nhận muốn đăng xuất
            // Mở lại màn hình đăng nhập
            LoginViews login = new LoginViews();
            login.setVisible(true);
            dispose();  // Đóng AdminHomePage
        }
    }//GEN-LAST:event_jbtDangXuatActionPerformed

    private void jbtDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDoiMatKhauActionPerformed
        String username = jtfPhoneNumber.getText();  // Lấy tên tài khoản hiện tại từ ô jtfTaiKhoan
        ChangePassword changePasswordPage = new ChangePassword(username);  // Truyền username qua trang đổi mật khẩu 
        changePasswordPage.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbtDoiMatKhauActionPerformed

    private void loadEmployeeData(String input) {
        String query = "SELECT e.full_name, e.email, e.phone_number, e.address, e.date_of_birth, s.net_salary "
                + "FROM employees e "
                + "LEFT JOIN accounts a ON e.employee_id = a.employee_id "
                + "LEFT JOIN salaries s ON e.employee_id = s.employee_id "
                + "WHERE a.username = ? OR a.email = ? OR e.phone_number = ?";

        try (Connection connection = dbConnection.getJDBCConnection(); PreparedStatement ps = connection.prepareStatement(query)) {

            ps.setString(1, input);
            ps.setString(2, input);
            ps.setString(3, input);

            ResultSet rs = ps.executeQuery();
            if (!rs.next()) {
                JOptionPane.showMessageDialog(this, "Không tìm thấy thông tin nhân viên!", "Thông báo", JOptionPane.ERROR_MESSAGE);
                return;
            }

            jtfEmail.setText(rs.getString("email"));
            jtfHoVaTen.setText(rs.getString("full_name"));
            jtfPhoneNumber.setText(rs.getString("phone_number"));

            String address = rs.getString("address");
            if (address == null || address.trim().isEmpty()) {
                jtfAddress.setText("Chưa có thông tin, liên hệ Admin để cập nhật!");
                jtfAddress.setForeground(java.awt.Color.RED);
            } else {
                jtfAddress.setText(address);
                jtfAddress.setForeground(java.awt.Color.BLACK);
            }

            String dob = rs.getString("date_of_birth");
            if (dob == null || dob.trim().isEmpty()) {
                jtfNgayThangNamSinh.setText("Chưa có thông tin, liên hệ Admin để cập nhật!");
                jtfNgayThangNamSinh.setForeground(java.awt.Color.RED);
            } else {
                jtfNgayThangNamSinh.setText(dob);
                jtfNgayThangNamSinh.setForeground(java.awt.Color.BLACK);
            }

            float salary = rs.getFloat("net_salary");
            if (rs.wasNull()) {
                jtfLuong.setText("Chưa có thông tin, liên hệ Admin để cập nhật!");
                jtfLuong.setForeground(java.awt.Color.RED);
            } else {
                jtfLuong.setText(String.format("%,.0f", salary));
                jtfLuong.setForeground(java.awt.Color.BLACK);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi kết nối cơ sở dữ liệu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void jtfPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPhoneNumberActionPerformed

    }//GEN-LAST:event_jtfPhoneNumberActionPerformed

    private void jtfAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfAddressActionPerformed
        this.setEnabled(false);
    }//GEN-LAST:event_jtfAddressActionPerformed

    private void jtfLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfLuongActionPerformed
        this.setEnabled(false);
    }//GEN-LAST:event_jtfLuongActionPerformed

    private void jtfHoVaTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfHoVaTenActionPerformed
        this.setEnabled(false);
    }//GEN-LAST:event_jtfHoVaTenActionPerformed

    private void jtfNgayThangNamSinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNgayThangNamSinhActionPerformed
        this.setEnabled(false);
    }//GEN-LAST:event_jtfNgayThangNamSinhActionPerformed

    private void jtfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEmailActionPerformed

    private void jbtXemLichSuChamCongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtXemLichSuChamCongActionPerformed
        // Kiểm tra xem thông tin nhân viên đã được tải chưa
        if (jtfEmail.getText().isEmpty() || jtfPhoneNumber.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng tải thông tin nhân viên trước!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Lấy employee_id từ email hoặc số điện thoại
        int employeeId = getEmployeeIdFromInput(jtfEmail.getText(), jtfPhoneNumber.getText());
        if (employeeId == -1) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy nhân viên!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Mở dialog AttendanceDate ở chế độ chỉ xem
        AttendanceDate attendanceDialog = new AttendanceDate(this, employeeId, false); // Truyền true cho chế độ chỉ xem
        attendanceDialog.setLocationRelativeTo(this);
        attendanceDialog.setTitle("Lịch sử chấm công - Chỉ xem");
        attendanceDialog.setVisible(true);
    }//GEN-LAST:event_jbtXemLichSuChamCongActionPerformed

    private void jbtYeuCauSuaThongTinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtYeuCauSuaThongTinActionPerformed
        // Kiểm tra xem thông tin nhân viên đã được tải chưa
        if (jtfEmail.getText().isEmpty() || jtfHoVaTen.getText().isEmpty() || jtfPhoneNumber.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng tải thông tin nhân viên trước!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Tạo dialog để yêu cầu sửa thông tin
        JDialog requestDialog = new JDialog(this, "Yêu cầu sửa thông tin", true);
        requestDialog.setSize(400, 250);
        requestDialog.setLayout(new GridLayout(5, 2, 10, 10));
        requestDialog.setLocationRelativeTo(this);

        // Các thành phần giao diện
        JLabel lblField = new JLabel("Chọn thông tin cần sửa:");
        JComboBox<String> cboField = new JComboBox<>(new String[]{
            "Full Name", "Email", "Phone Number", "Address", "Date of Birth"
        });

        JLabel lblOldValue = new JLabel("Giá trị hiện tại:");
        JTextField txtOldValue = new JTextField(20);
        txtOldValue.setEditable(false); // Chỉ đọc

        JLabel lblNewValue = new JLabel("Giá trị mới:");
        JTextField txtNewValue = new JTextField(20);

        JButton btnSend = new JButton("Gửi yêu cầu");
        JButton btnCancel = new JButton("Hủy");

        // Thêm các thành phần vào dialog
        requestDialog.add(lblField);
        requestDialog.add(cboField);
        requestDialog.add(lblOldValue);
        requestDialog.add(txtOldValue);
        requestDialog.add(lblNewValue);
        requestDialog.add(txtNewValue);
        requestDialog.add(new JLabel()); // Placeholder
        requestDialog.add(btnSend);
        requestDialog.add(new JLabel()); // Placeholder
        requestDialog.add(btnCancel);

        // Load giá trị hiện tại từ các JTextField khi chọn trường
        cboField.addActionListener(e -> {
            String selectedField = cboField.getSelectedItem().toString();
            String currentValue = getCurrentValueFromUI(selectedField);
            txtOldValue.setText(currentValue);
        });

        // Xử lý nút Gửi
        btnSend.addActionListener(e -> {
            String selectedField = cboField.getSelectedItem().toString();
            String fieldNameInDB = convertFieldToDBName(selectedField);
            String oldValue = txtOldValue.getText().trim();
            String newValue = txtNewValue.getText().trim();

            if (newValue.isEmpty()) {
                JOptionPane.showMessageDialog(requestDialog, "Vui lòng nhập giá trị mới!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Lấy employee_id từ database dựa trên thông tin đã load
            int employeeId = getEmployeeIdFromInput(jtfEmail.getText(), jtfPhoneNumber.getText());
            if (employeeId == -1) {
                JOptionPane.showMessageDialog(requestDialog, "Không tìm thấy nhân viên!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Gửi yêu cầu vào database
            boolean success = sendChangeRequest(employeeId, fieldNameInDB, oldValue, newValue);
            if (success) {
                JOptionPane.showMessageDialog(requestDialog, "Yêu cầu đã được gửi thành công!", "Thành công", JOptionPane.INFORMATION_MESSAGE);
                requestDialog.dispose();
            } else {
                JOptionPane.showMessageDialog(requestDialog, "Lỗi khi gửi yêu cầu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        });

        // Xử lý nút Hủy
        btnCancel.addActionListener(e -> requestDialog.dispose());

        // Hiển thị dialog
        requestDialog.setVisible(true);
    }

    private String getCurrentValueFromUI(String fieldName) {
        switch (fieldName) {
            case "Full Name": return jtfHoVaTen.getText();
            case "Email": return jtfEmail.getText();
            case "Phone Number": return jtfPhoneNumber.getText();
            case "Address": return jtfAddress.getText().equals("Chưa có thông tin, liên hệ Admin để cập nhật!") ? "" : jtfAddress.getText();
            case "Date of Birth": return jtfNgayThangNamSinh.getText().equals("Chưa có thông tin, liên hệ Admin để cập nhật!") ? "" : jtfNgayThangNamSinh.getText();
            default: return "";
        }
    }

    // Hàm chuyển tên trường hiển thị sang tên cột trong database
    private String convertFieldToDBName(String displayName) {
        switch (displayName) {
            case "Full Name": return "full_name";
            case "Email": return "email";
            case "Phone Number": return "phone_number";
            case "Address": return "address";
            case "Date of Birth": return "date_of_birth";
            default: return "";
        }
    }

    // Hàm lấy employee_id từ email hoặc phone_number
    private int getEmployeeIdFromInput(String email, String phoneNumber) {
        String query = "SELECT employee_id FROM employees WHERE email = ? OR phone_number = ?";
        try (Connection conn = new DatabaseConnection().getJDBCConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, email);
            ps.setString(2, phoneNumber);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt("employee_id");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return -1; // Trả về -1 nếu không tìm thấy
    }

    // Hàm gửi yêu cầu sửa thông tin vào bảng change_requests
    private boolean sendChangeRequest(int employeeId, String fieldName, String oldValue, String newValue) {
        String sql = "INSERT INTO change_requests (employee_id, field_name, old_value, new_value) VALUES (?, ?, ?, ?)";
        try (Connection conn = new DatabaseConnection().getJDBCConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, employeeId);
            ps.setString(2, fieldName);
            ps.setString(3, oldValue.isEmpty() ? null : oldValue); // Gửi null nếu không có giá trị cũ
            ps.setString(4, newValue);
            int rowsAffected = ps.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi gửi yêu cầu: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }//GEN-LAST:event_jbtYeuCauSuaThongTinActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbtDangXuat;
    private javax.swing.JButton jbtDoiMatKhau;
    private javax.swing.JButton jbtXemLichSuChamCong;
    private javax.swing.JButton jbtYeuCauSuaThongTin;
    private javax.swing.JTextField jtfAddress;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfHoVaTen;
    private javax.swing.JTextField jtfLuong;
    private javax.swing.JTextField jtfNgayThangNamSinh;
    private javax.swing.JTextField jtfPhoneNumber;
    // End of variables declaration//GEN-END:variables
}
