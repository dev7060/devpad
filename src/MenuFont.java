package com.devproductions.dev.devpad;
import java.awt.GraphicsEnvironment;
import java.awt.Font;
/**
 *
 * @author user
 */
public class MenuFont extends javax.swing.JFrame {

    /**
     * Creates new form MenuFont
     */
    MainFrame obj;
    java.awt.Font viewDetails;
    //java.awt.Font newDetails;
    public MenuFont(MainFrame obj) {
        this.obj = obj;
        viewDetails = obj.getTextAreaObj().getFont();
        initComponents();
        setResizable(false);
        setLocationRelativeTo(obj);
        System.out.println(viewDetails.getFamily());
        System.out.println(viewDetails.getSize());
        System.out.println(viewDetails.getStyle());
        jList1.setSelectedValue(viewDetails.getFamily(), rootPaneCheckingEnabled);
        jList3.setSelectedValue(Integer.toString(viewDetails.getSize()) , rootPaneCheckingEnabled);
        //newDetails = new java.awt.Font(viewDetails.getFamily(), viewDetails.getStyle(), viewDetails.getSize());
        if(viewDetails.getStyle()==0){
            jList2.setSelectedIndex(0);
        }else if(viewDetails.getStyle()==1){
            jList2.setSelectedIndex(2);
        }else if(viewDetails.getStyle()==2){
            jList2.setSelectedIndex(1);
        }else{
            jList2.setSelectedIndex(3);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Font:");

        jLabel2.setText("Font style:");

        jLabel3.setText("Size:");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Regular", "Italic", "Bold", "Bold Italic" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList2.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList2ValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jList2);

        jList3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "8", "9", "10", "11", "12", "14", "16", "18", "20", "22", "24", "26", "28", "36", "48", "72"};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList3.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList3ValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(jList3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 137, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {                                    
        // TODO add your handling code here:
        //System.out.println(jList1.getSelectedValue());
        viewDetails = new Font(jList1.getSelectedValue(), viewDetails.getStyle(), viewDetails.getSize());
        obj.getTextAreaObj().setFont(viewDetails);
    }                                   

    private void jList2ValueChanged(javax.swing.event.ListSelectionEvent evt) {                                    
        // TODO add your handling code here:
        if(jList2.getSelectedIndex()==0){
            viewDetails = new Font(viewDetails.getFamily(), 0, viewDetails.getSize());
            obj.getTextAreaObj().setFont(viewDetails);
        }else if(jList2.getSelectedIndex()==1){
            viewDetails = new Font(viewDetails.getFamily(), 2, viewDetails.getSize());
            obj.getTextAreaObj().setFont(viewDetails);
        }else if(jList2.getSelectedIndex()==2){
            viewDetails = new Font(viewDetails.getFamily(), 1, viewDetails.getSize());
            obj.getTextAreaObj().setFont(viewDetails);
        }else{
            viewDetails = new Font(viewDetails.getFamily(), 3, viewDetails.getSize());
            obj.getTextAreaObj().setFont(viewDetails);
        }
    }                                   

    private void jList3ValueChanged(javax.swing.event.ListSelectionEvent evt) {                                    
        // TODO add your handling code here:
        viewDetails = new Font(viewDetails.getFamily(), viewDetails.getStyle(), Integer.parseInt(jList3.getSelectedValue()));
         obj.getTextAreaObj().setFont(viewDetails);
    }                                   

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
            java.util.logging.Logger.getLogger(MenuFont.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuFont.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuFont.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuFont.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuFont(new MainFrame()).setVisible(true);
            }
        });
    }                 
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration                   
}
