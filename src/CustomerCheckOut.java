
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.beans.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Sudhir Kushwaha
 */
public class CustomerCheckOut extends javax.swing.JFrame {
int days;
double pri;
    /**
     * Creates new form CustomerCheckOut
     */
    public CustomerCheckOut() {
        initComponents();
        SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd ");
        Date d = new Date();
        txtoutdate.setText(date.format(d));

        s();

    }

    public void s() {

        Statement st = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        java.sql.Connection con = null;
        int q, i;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "Sudhir@123");
            pst = con.prepareStatement("Select * from customer where status=?");
            pst.setString(1, "NULL");
            rs = pst.executeQuery();
            ResultSetMetaData stData = (ResultSetMetaData) rs.getMetaData();
            q = stData.getColumnCount();
            DefaultTableModel RecordTable = (DefaultTableModel) jTable1.getModel();
            RecordTable.setRowCount(0);
            while (rs.next()) {
                Vector columnData = new Vector();
                for (i = 1; i <= q; i++) {
                    columnData.add(rs.getString("name"));
                    columnData.add(rs.getString("mobile"));
                    columnData.add(rs.getString("email"));
                    columnData.add(rs.getString("date"));
                    columnData.add(rs.getString("nationality"));
                    columnData.add(rs.getString("gender"));
                    columnData.add(rs.getString("id"));
                    columnData.add(rs.getString("address"));
                    columnData.add(rs.getString("roomnumber"));
                    columnData.add(rs.getString("bed"));
                    columnData.add(rs.getString("roomtype"));
                    columnData.add(rs.getString("price"));

                }
                RecordTable.addRow(columnData);
            }
        } catch (Exception e) {

        }
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
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtroomnumber = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtdate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtoutdate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtmobile = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtdays = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtamount = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/out.jpg"))); // NOI18N
        jLabel1.setText("Customer Check Out");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 70));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Room Number");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, -1, 28));

        txtroomnumber.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtroomnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtroomnumberActionPerformed(evt);
            }
        });
        getContentPane().add(txtroomnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 104, 40));

        jButton2.setBackground(new java.awt.Color(153, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(240, 240, 240));
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, -1, 40));

        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Mobile Number", "Email ID", "Check IN Date", "Nationality", "Gender", "Adhar Number", "Address", "Room Number", "Bed", "Room Type", "Price Per Day"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 471, 1140, 300));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Customer Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 232, 43));

        txtname.setEditable(false);
        txtname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 250, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Check in Date");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 240, 36));

        txtdate.setEditable(false);
        txtdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 249, 43));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Check out Date(Today)");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 260, 36));

        txtoutdate.setEditable(false);
        txtoutdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtoutdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 250, 37));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Customer Mobile Number");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 250, 36));

        txtmobile.setEditable(false);
        txtmobile.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtmobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 250, 39));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Price Per Day");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 242, 40));

        txtdays.setEditable(false);
        txtdays.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtdays, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 249, 38));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Number of Days");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 249, 50));

        txtprice.setEditable(false);
        txtprice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 250, 38));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Total Amount to Collect From Customer");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 220, 282, 37));

        txtamount.setEditable(false);
        txtamount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 260, 270, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Email");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 120, 250, 36));

        txtemail.setEditable(false);
        txtemail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 170, 270, 40));

        jButton3.setBackground(new java.awt.Color(153, 0, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Check Out");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 370, 130, 40));

        jButton4.setBackground(new java.awt.Color(153, 0, 0));
        jButton4.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 370, 80, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bac.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtroomnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtroomnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtroomnumberActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtname.setText("");
        txtemail.setText("");
        txtmobile.setText("");
        txtprice.setText("");
        txtdate.setText("");
        PreparedStatement pst = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "Sudhir@123");
            pst = con.prepareStatement("select name,mobile,email,date,price from customer where roomnumber=? AND status=?");
            pst.setString(1, txtroomnumber.getText().trim());
            pst.setString(2, "NULL");
            rs = pst.executeQuery();
            if (rs.next()) {
                txtname.setText(rs.getString("name"));
                txtemail.setText(rs.getString("email"));
                txtmobile.setText(rs.getString("mobile"));
                txtdate.setText(rs.getString("date"));
                txtprice.setText(rs.getString("price"));
            }
            
            ZoneId z=ZoneId.of("Asia/Colombo");
            LocalDate todays=LocalDate.now(z);
            String s1=todays.toString();
            SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd");
            String f1=rs.getString("date");
            String f2=s1;
            try{
                Date d1=sim.parse(f1);
                Date d2=sim.parse(f2);
                long diff=d2.getTime()-d1.getTime();
                int days=(int)(diff/(1000*24*60*60));
                if(days==0)
                    txtamount.setText("1");
                else
                    txtdays.setText(String.valueOf(days));
                double p=Double.parseDouble(rs.getString("price"));
                double pri=days*p;
                if(days==0)
                    txtamount.setText(String.valueOf(p));
                else
                    txtamount.setText(String.valueOf(pri));
            }catch(Exception e){
            }  
        } catch (ClassNotFoundException | SQLException ex) {
           txtdays.setText("");
            txtamount.setText("");
             JOptionPane.showMessageDialog(this,"Record Not Found.");
            
            //Logger.getLogger(CustomerCheckOut.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        txtname.setText("");
        txtemail.setText("");
        txtmobile.setText("");
        txtdate.setText("");
        txtprice.setText("");
        txtdays.setText("");
        txtamount.setText("");
        txtroomnumber.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel RecordTable = (DefaultTableModel) jTable1.getModel();
        int SelectedRows = jTable1.getSelectedRow();
        txtname.setText(RecordTable.getValueAt(SelectedRows, 0).toString());
        txtmobile.setText(RecordTable.getValueAt(SelectedRows, 1).toString());
        txtemail.setText(RecordTable.getValueAt(SelectedRows, 2).toString());
        txtdate.setText(RecordTable.getValueAt(SelectedRows, 3).toString());
        txtroomnumber.setText(RecordTable.getValueAt(SelectedRows, 8).toString());
        txtprice.setText(RecordTable.getValueAt(SelectedRows, 11).toString());
        
        
            ZoneId z=ZoneId.of("Asia/Colombo");
            LocalDate todays=LocalDate.now(z);
            String s1=todays.toString();
            SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd");
            String f1=RecordTable.getValueAt(SelectedRows, 3).toString();
            String f2=s1;
            try{
                Date d1=sim.parse(f1);
                Date d2=sim.parse(f2);
                long diff=d2.getTime()-d1.getTime();
                 days=(int)(diff/(1000*24*60*60));
                if(days==0)
                    txtdays.setText("1");
                else
                    txtdays.setText(String.valueOf(days));
                double p=Double.parseDouble(RecordTable.getValueAt(SelectedRows,11).toString());
                 pri=days*p;
                if(days==0)
                    txtamount.setText(String.valueOf(p));
                else
                    txtamount.setText(String.valueOf(pri));
            }catch(Exception e){
            }
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (txtname.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please Enter Room Number And Search it,Then Check Out Customer");
        } else {
            try {
                PreparedStatement pst = null;
                Class.forName("com.mysql.cj.jdbc.Driver");
                java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "Sudhir@123");
                pst = con.prepareStatement("update customer set status=? where roomnumber=?");
                pst.setString(1, "check out");
                pst.setString(2, txtroomnumber.getText());
                pst.executeUpdate();
                pst = con.prepareStatement("update customer set amount=?,outdate=?,days=? where roomnumber=? AND date=?");
                pst.setString(1, txtamount.getText());
                pst.setString(2, txtoutdate.getText());
                pst.setString(3, txtdays.getText());
                pst.setString(4, txtroomnumber.getText());
                pst.setString(5, txtdate.getText());
                pst.executeUpdate();
                pst = con.prepareStatement("update room set status=? where roomnumber=?");
                pst.setString(1, "Not Booked");
                pst.setString(2, txtroomnumber.getText());
                pst.executeUpdate();
                //JOptionPane.showMessageDialog(this,"Check Out Successfully\n Goto to Cutomer Bill Details menu and Print Bill");
                int yes=JOptionPane.showConfirmDialog(this,"Check out Successfully.\nDo you want to see & print bill?","Check outed",JOptionPane.YES_NO_OPTION);
                if(JOptionPane.YES_OPTION==yes)
                    new CustomerDetailsBill().setVisible(true);
                else{
                s();
                txtname.setText("");
                txtemail.setText("");
                txtmobile.setText("");
                txtdate.setText("");
                txtprice.setText("");
                txtdays.setText("");
                txtamount.setText("");
                txtroomnumber.setText("");
                        }
            } catch (ClassNotFoundException | SQLException e) {
            }

        }

    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerCheckOut().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtamount;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtdays;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtmobile;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtoutdate;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtroomnumber;
    // End of variables declaration//GEN-END:variables
}
