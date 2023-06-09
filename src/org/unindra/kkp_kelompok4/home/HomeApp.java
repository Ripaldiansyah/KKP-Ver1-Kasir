package org.unindra.kkp_kelompok4.home;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.EventQueue;
import org.unindra.kkp_kelompok4.cashier.Cashier;
/**
 *
 * @author fadli
 */
public class HomeApp extends javax.swing.JFrame {

    /**
     * Creates new form HomeDesainApp
     */
    public HomeApp() {
        initComponents();
        execute();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        timeLabel();
        
    }
    
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_nav = new javax.swing.JPanel();
        labelMinimarket = new javax.swing.JLabel();
        labelIcon = new javax.swing.JLabel();
        labelTime = new javax.swing.JLabel();
        labelKasir = new javax.swing.JLabel();
        Seperate = new javax.swing.JLabel();
        labelDate = new javax.swing.JLabel();
        labelNama = new javax.swing.JLabel();
        panel_side = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        menus = new javax.swing.JPanel();
        panel_content = new javax.swing.JPanel();
        panel_Utama = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panel_nav.setBackground(new java.awt.Color(0, 0, 255));
        panel_nav.setPreferredSize(new java.awt.Dimension(830, 70));
        panel_nav.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelMinimarket.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        labelMinimarket.setForeground(new java.awt.Color(255, 255, 255));
        labelMinimarket.setText("MINIMARKET XYZ");
        panel_nav.add(labelMinimarket, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 406, -1));

        labelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/unindra/kkp_kelompok4/resource/image/HomeApp/Shopping.png"))); // NOI18N
        panel_nav.add(labelIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 6, 92, -1));

        labelTime.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelTime.setForeground(new java.awt.Color(255, 255, 255));
        labelTime.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelTime.setText("00-00-0000 00:00:00");
        panel_nav.add(labelTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 30, 185, 30));

        labelKasir.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        labelKasir.setForeground(new java.awt.Color(255, 255, 255));
        labelKasir.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelKasir.setText("Kasir");
        panel_nav.add(labelKasir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 10, 122, -1));

        Seperate.setFont(new java.awt.Font("Century Gothic", 0, 48)); // NOI18N
        Seperate.setForeground(new java.awt.Color(255, 255, 255));
        Seperate.setText("|");
        panel_nav.add(Seperate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 0, -1, -1));

        labelDate.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        labelDate.setForeground(new java.awt.Color(255, 255, 255));
        labelDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDate.setText("Tanggal dan waktu");
        panel_nav.add(labelDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 10, 122, -1));

        labelNama.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelNama.setForeground(new java.awt.Color(255, 255, 255));
        labelNama.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelNama.setText("Nama Kasir");
        panel_nav.add(labelNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 30, 360, 30));

        getContentPane().add(panel_nav, java.awt.BorderLayout.PAGE_START);

        panel_side.setBackground(new java.awt.Color(255, 255, 255));
        panel_side.setMinimumSize(new java.awt.Dimension(250, 100));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);

        menus.setBackground(new java.awt.Color(255, 255, 255));
        menus.setLayout(new javax.swing.BoxLayout(menus, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(menus);

        javax.swing.GroupLayout panel_sideLayout = new javax.swing.GroupLayout(panel_side);
        panel_side.setLayout(panel_sideLayout);
        panel_sideLayout.setHorizontalGroup(
            panel_sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_sideLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        panel_sideLayout.setVerticalGroup(
            panel_sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_sideLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE))
        );

        getContentPane().add(panel_side, java.awt.BorderLayout.LINE_START);

        panel_content.setBackground(new java.awt.Color(255, 255, 255));

        panel_Utama.setBackground(new java.awt.Color(255, 255, 255));
        panel_Utama.setLayout(new javax.swing.BoxLayout(panel_Utama, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout panel_contentLayout = new javax.swing.GroupLayout(panel_content);
        panel_content.setLayout(panel_contentLayout);
        panel_contentLayout.setHorizontalGroup(
            panel_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_contentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_Utama, javax.swing.GroupLayout.DEFAULT_SIZE, 1306, Short.MAX_VALUE))
        );
        panel_contentLayout.setVerticalGroup(
            panel_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_contentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_Utama, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panel_content, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1589, 731));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        panel_Utama.add(new Cashier());
        panel_Utama.repaint();
        panel_Utama.revalidate();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(HomeApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new HomeApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Seperate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDate;
    private javax.swing.JLabel labelIcon;
    private javax.swing.JLabel labelKasir;
    private javax.swing.JLabel labelMinimarket;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelTime;
    private javax.swing.JPanel menus;
    private javax.swing.JPanel panel_Utama;
    private javax.swing.JPanel panel_content;
    private javax.swing.JPanel panel_nav;
    private javax.swing.JPanel panel_side;
    // End of variables declaration//GEN-END:variables

   private void execute() {
    //inisiasi gambar icon
   ImageIcon cashier = new ImageIcon(getClass().getResource("/org/unindra/kkp_kelompok4/resource/image/HomeApp/cashier.png"));
   ImageIcon iconMaster = new ImageIcon(getClass().getResource("/org/unindra/kkp_kelompok4/resource/image/HomeApp/master.png"));
   ImageIcon iconTransaksi = new ImageIcon(getClass().getResource("/org/unindra/kkp_kelompok4/resource/image/HomeApp/transaksi.png"));
   ImageIcon iconReport = new ImageIcon(getClass().getResource("/org/unindra/kkp_kelompok4/resource/image/HomeApp/report.png"));
  
   //inisiasi subMenu
   ImageIcon iconBarang = new ImageIcon( getClass().getResource("/org/unindra/kkp_kelompok4/resource/image/HomeApp/subMaster.png"));
    
   //Membuaat SubMenu
   MenuIcon subMaster1= new MenuIcon(null,true,iconBarang,"Barang1",null);
   MenuIcon subMaster2= new MenuIcon(null,true,iconBarang,"Barang2",null);
   MenuIcon subMaster3= new MenuIcon(null,true,iconBarang,"Barang3",null);
   
   MenuIcon transaksi1= new MenuIcon(null,true,iconBarang,"Transaksi1",null);
   MenuIcon transaksi2= new MenuIcon(null,true,iconBarang,"Transaksi2",null);
   MenuIcon transaksi3= new MenuIcon(null,true,iconBarang,"Transaksi3",null);
   
   //mwmbuat icon

   MenuIcon menuCashier = new MenuIcon(cashier,false,null,"Cashier",null);
   MenuIcon menuMaster = new MenuIcon(iconMaster,false,null,"Master",null,subMaster1,subMaster2,subMaster3);
   MenuIcon menuTransaksi= new MenuIcon(iconTransaksi,false,null,"Transaksi",null,transaksi1,transaksi2,transaksi3);
   MenuIcon menuReport= new MenuIcon(iconReport,false,null,"Report",null);
   
   //memanggil icon
   addMenu(menuCashier,menuMaster,menuTransaksi,menuReport);
 
   
    }
   
   
   private void timeLabel(){
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime currentTime = LocalDateTime.now();

        Thread thread = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                String formattedTime = formatter.format(currentTime);
                EventQueue.invokeLater(() -> labelTime.setText(formattedTime));
            }
        });
        thread.start();
   }
    private void addMenu(MenuIcon...menu){
        for (int i = 0; i< menu.length;i++){
            menus.add(menu[i]);
            ArrayList<MenuIcon>subMenu =menu[i].getSubMenu();
            for(MenuIcon m : subMenu){
                addMenu(m);
            }
        }
        menus.revalidate();
    }
}
