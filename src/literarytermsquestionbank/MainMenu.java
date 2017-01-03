/* Created by A. Tan
 * on 2 January
 * as the main menu for the literary terms practice bank
 */

package literarytermsquestionbank;

import java.awt.Cursor;

/**
 *
 * @author Aaron
 */
public class MainMenu extends javax.swing.JFrame {

    /** Creates new form MainMenu */
    public MainMenu() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        shortStoriesLabel = new javax.swing.JLabel();
        RomeoAndJulietLabel = new javax.swing.JLabel();
        ChristmasCarolLabel = new javax.swing.JLabel();
        listLabel = new javax.swing.JLabel();
        helpLabel = new javax.swing.JLabel();
        creditsLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 1118, 800));
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setMinimumSize(new java.awt.Dimension(691, 822));
        mainPanel.setPreferredSize(new java.awt.Dimension(1180, 800));
        mainPanel.setLayout(null);

        shortStoriesLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shortStoriesLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                shortStoriesLabelMouseEntered(evt);
            }
        });
        mainPanel.add(shortStoriesLabel);
        shortStoriesLabel.setBounds(60, 20, 160, 580);

        RomeoAndJulietLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RomeoAndJulietLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RomeoAndJulietLabelMouseEntered(evt);
            }
        });
        mainPanel.add(RomeoAndJulietLabel);
        RomeoAndJulietLabel.setBounds(220, 130, 130, 470);

        ChristmasCarolLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChristmasCarolLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ChristmasCarolLabelMouseEntered(evt);
            }
        });
        mainPanel.add(ChristmasCarolLabel);
        ChristmasCarolLabel.setBounds(490, 40, 130, 560);

        listLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                listLabelMouseEntered(evt);
            }
        });
        mainPanel.add(listLabel);
        listLabel.setBounds(790, 40, 70, 560);

        helpLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                helpLabelMouseEntered(evt);
            }
        });
        mainPanel.add(helpLabel);
        helpLabel.setBounds(860, 130, 130, 470);

        creditsLabel.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        creditsLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        creditsLabel.setText("<html><em>Made by Aaron Tan</em></html>");
        creditsLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        mainPanel.add(creditsLabel);
        creditsLabel.setBounds(920, 620, 70, 10);

        titleLabel.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        titleLabel.setText("<html><em>Literary Terms Practice Bank</em></html>");
        titleLabel.setToolTipText("");
        mainPanel.add(titleLabel);
        titleLabel.setBounds(40, 610, 940, 80);

        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/literarytermsquestionbank/BookShelf_w_Titles_v2.png"))); // NOI18N
        mainPanel.add(backgroundImage);
        backgroundImage.setBounds(30, 20, 990, 800);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // These methods make the mouse cursor turn into a hand when the mouse is over the books
    private void ChristmasCarolLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChristmasCarolLabelMouseEntered
        // For example, this method sets the cursor to a hand when the mouse is hovering over A Christmas Carol
        ChristmasCarolLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_ChristmasCarolLabelMouseEntered

    private void shortStoriesLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shortStoriesLabelMouseEntered
        shortStoriesLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_shortStoriesLabelMouseEntered

    private void RomeoAndJulietLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RomeoAndJulietLabelMouseEntered
        RomeoAndJulietLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_RomeoAndJulietLabelMouseEntered

    private void listLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listLabelMouseEntered
        listLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_listLabelMouseEntered

    private void helpLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpLabelMouseEntered
        helpLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_helpLabelMouseEntered
    
    // These methods hide the main menu and open the correct frame for the selection
    private void shortStoriesLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shortStoriesLabelMouseClicked
        this.setVisible(false); // Hides the main menu
        new ShortStories().setVisible(true); // Shows the short stories frame
    }//GEN-LAST:event_shortStoriesLabelMouseClicked

    private void RomeoAndJulietLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RomeoAndJulietLabelMouseClicked
        this.setVisible(false);
        new RomeoAndJuliet().setVisible(true);
    }//GEN-LAST:event_RomeoAndJulietLabelMouseClicked

    private void ChristmasCarolLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChristmasCarolLabelMouseClicked
        this.setVisible(false);
        new AChristmasCarol().setVisible(true);
    }//GEN-LAST:event_ChristmasCarolLabelMouseClicked

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ChristmasCarolLabel;
    private javax.swing.JLabel RomeoAndJulietLabel;
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JLabel creditsLabel;
    private javax.swing.JLabel helpLabel;
    private javax.swing.JLabel listLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel shortStoriesLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

}
