/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package DigitalLibrary;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;

/**
 *
 * @author ACER
 */
public class MenuPustakawan extends javax.swing.JFrame {
   public Connection con;
   public Statement st;
   public ResultSet rs;
   public DefaultTableModel model;
   int baris;
   private String kode_koleksi;
   private String judul;
   private String kode_penerbit;
   private String kode_pengarang;
   private String tahun_terbit;
   private String klasifikasi;

    /**
     * Creates new form MenuPustakawan
     */
    public MenuPustakawan() {
        initComponents();
        String[] kolom ={"no","kode_koleksi","judul","kode_penerbit","kode_pengarang", "tahun_terbit","klasifikasi"};
        model = new DefaultTableModel (kolom, 0);
        tabelkoleksi.setModel(model);
        tampil();
    }
    public void tampil(){
        koneksiDB classKoneksi = new koneksiDB();
        int jumlahrow = tabelkoleksi.getRowCount();
        for(int n=0;n<jumlahrow;n++){
            model.removeRow(0);
        }
        String cari  = caribuku.getText();
        try{
            con = classKoneksi.getKoneksi();
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM koleksi WHERE judul LIKE '%"+cari+"%'");
            int no = 1;
            while(rs.next()){
                String[] row = {Integer.toString(no),rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)};
                model.addRow(row);
                no++;
            }
            tabelkoleksi.setModel(model);
                
        }catch(SQLException ex){
            System.out.print(ex.getMessage());
        }
    }
     //fungsi bersih data
    public void bersihdata() {
    tno.setText("");
    tkode_k.setText("");
    tjudul.setText("");
    tk_penerbit.setText("");
    ttahun.setText("");
    tk_pengarang.setText("");
    tklasifikasi.setText("");
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelkoleksi = new javax.swing.JTable();
        caribuku = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        bcari = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tjudul = new javax.swing.JTextField();
        ttahun = new javax.swing.JTextField();
        tk_penerbit = new javax.swing.JTextField();
        tk_pengarang = new javax.swing.JTextField();
        tklasifikasi = new javax.swing.JTextField();
        bsave = new javax.swing.JButton();
        bupdate = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        tno = new javax.swing.JTextField();
        tkode_k = new javax.swing.JTextField();
        bdelete = new javax.swing.JButton();
        bclear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel3.setText("-");

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DigitalLibrary/icons8-customer-50.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("PERPUSTAKAAN DIGITAL");

        jLabel2.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel2.setText("TooRead");

        jLabel5.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel5.setText("-");

        jLabel4.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel4.setText("Gudangnya Ilmu");

        tabelkoleksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelkoleksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelkoleksiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelkoleksi);

        caribuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caribukuActionPerformed(evt);
            }
        });
        caribuku.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                caribukuKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        bcari.setText("SEARCH");
        bcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcariActionPerformed(evt);
            }
        });

        jLabel7.setText("KODE KOLEKSI");

        jLabel8.setText("JUDUL");

        jLabel9.setText("KODE PENERBIT");

        jLabel10.setText("KODE PENGARANG");

        jLabel11.setText("TAHUN TERBIT");

        jLabel12.setText("KLASIFIKASI");

        tjudul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tjudulActionPerformed(evt);
            }
        });

        bsave.setText("SAVE");
        bsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsaveActionPerformed(evt);
            }
        });

        bupdate.setText("UPDATE");

        jLabel13.setText("NO");

        bdelete.setText("DELETE");

        bclear.setText("CLEAR");
        bclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bclearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(72, 72, 72))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(208, 208, 208)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tno, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tkode_k, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9))
                                    .addGap(28, 28, 28)
                                    .addComponent(tjudul, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(tk_penerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addGap(87, 87, 87)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tklasifikasi, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tk_pengarang, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ttahun, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(bsave)
                                        .addGap(18, 18, 18)
                                        .addComponent(bclear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(caribuku, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bupdate, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                            .addComponent(bdelete, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                            .addComponent(bcari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel10)
                    .addComponent(tk_pengarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(ttahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(tkode_k, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tjudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(tklasifikasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tk_penerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bsave, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bclear, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caribuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bcari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(205, 205, 205))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(691, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel3)
                .addContainerGap(579, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tabelkoleksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelkoleksiMouseClicked
        // TODO add your handling code here:
        baris=tabelkoleksi.getSelectedRow();

        tno.setText(String.valueOf(tabelkoleksi.getValueAt(baris, 0)));
        tkode_k.setText(String.valueOf(tabelkoleksi.getValueAt(baris, 1)));
        tjudul.setText(String.valueOf(tabelkoleksi.getValueAt(baris, 2)));
        tk_penerbit.setText(String.valueOf(tabelkoleksi.getValueAt(baris, 3)));
        ttahun.setText(String.valueOf(tabelkoleksi.getValueAt(baris, 4)));
        tk_pengarang.setText(String.valueOf(tabelkoleksi.getValueAt(baris, 5)));
        tklasifikasi.setText(String.valueOf(tabelkoleksi.getValueAt(baris, 6)));
    }//GEN-LAST:event_tabelkoleksiMouseClicked

    private void caribukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caribukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caribukuActionPerformed

    private void caribukuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caribukuKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_caribukuKeyReleased

    private void bcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcariActionPerformed
        // TODO add your handling code here:
        tampil();
    }//GEN-LAST:event_bcariActionPerformed

    private void tjudulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tjudulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tjudulActionPerformed

    private void bsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsaveActionPerformed
        // TODO add your handling code here:
        if(tkode_k.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Kode Koleksi tidak boleh kosong");
        }else if(tjudul.getText().equals(""))
        {
          JOptionPane.showMessageDialog(null, "Judul tidak boleh kosong");  
        }else if(tk_penerbit.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Kode Penerbit tidak boleh kosong"); 
        }else if(tk_pengarang.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Kode Pengarang tidak boleh kosong") ;
        }else if(ttahun.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Tahun Terbit tidak boleh kosong") ;
        }else if(tklasifikasi.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Klasifikasi tidak boleh kosong") ;
        }
        else
     
        try {
            koneksiDB classKoneksi = new koneksiDB();
            st = con.createStatement();
            st.executeUpdate("insert into koleksi values("
                +"'"+tkode_k.getText()+"',"
                +"'"+tjudul.getText()+"',"
                +"'"+tk_penerbit.getText()+"',"
                +"'"+tk_pengarang.getText()+"',"
                +"'"+ttahun.getText()+"',"
                +"'"+tklasifikasi.getText()+"')");

            JOptionPane.showMessageDialog(rootPane, "berhasil disimpan");
            bersihdata();
            tampil();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_bsaveActionPerformed

    private void bclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bclearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bclearActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPustakawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPustakawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPustakawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPustakawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPustakawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bcari;
    private javax.swing.JButton bclear;
    private javax.swing.JButton bdelete;
    private javax.swing.JButton bsave;
    private javax.swing.JButton bupdate;
    private javax.swing.JTextField caribuku;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelkoleksi;
    private javax.swing.JTextField tjudul;
    private javax.swing.JTextField tk_penerbit;
    private javax.swing.JTextField tk_pengarang;
    private javax.swing.JTextField tklasifikasi;
    private javax.swing.JTextField tkode_k;
    private javax.swing.JTextField tno;
    private javax.swing.JTextField ttahun;
    // End of variables declaration//GEN-END:variables
}
