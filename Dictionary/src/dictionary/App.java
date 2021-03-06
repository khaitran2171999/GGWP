/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;
import com.sun.jmx.defaults.JmxProperties;
import java.io.IOException;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.html.parser.DTDConstants;
import jdk.nashorn.internal.ir.BreakNode;

/**
 *
 * @author admin
 */
public class App extends javax.swing.JFrame {
    DictionaryManagement dictionaryManagement = new DictionaryManagement();
    DictionaryCommandline dictionaryCommandline = new DictionaryCommandline();
    Word word = new Word();
    DefaultListModel model = new DefaultListModel();
    DefaultListModel listtarget = new DefaultListModel();
    DefaultListModel listexplain;

     private Object enterForm;
    private JTextField targetAddTextField;

    public App() {
        initComponents();
        dictionaryManagement.insertFromFile();
        nhaplieu();
        
    }
    private void nhaplieu(){
        for(int i =0; i < dictionaryManagement.dictionary.listWord.size(); i++ ){
            model.addElement(dictionaryManagement.dictionary.listWord.get(i).getWord_taget());
        }
        jList1.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Timkiem = new javax.swing.JButton();
        text_timkiem = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Quit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        voice = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 51));

        Timkiem.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Timkiem.setForeground(new java.awt.Color(0, 0, 0));
        Timkiem.setIcon(new javax.swing.ImageIcon("F:\\laptrinhhuongdoituong_netbean\\Dictionary\\icon\\if_Search_131849.png")); // NOI18N
        Timkiem.setText("Tìm");
        Timkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimkiemActionPerformed(evt);
            }
        });

        text_timkiem.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        text_timkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_timkiemActionPerformed(evt);
            }
        });
        text_timkiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                text_timkiemKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text_timkiemKeyReleased(evt);
            }
        });

        Add.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Add.setIcon(new javax.swing.ImageIcon("F:\\laptrinhhuongdoituong_netbean\\Dictionary\\icon\\if_Add_131846.png")); // NOI18N
        Add.setText("Add");
        Add.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                AddInputMethodTextChanged(evt);
            }
        });
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Delete.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Delete.setIcon(new javax.swing.ImageIcon("F:\\laptrinhhuongdoituong_netbean\\Dictionary\\icon\\if_Erase_131842.png")); // NOI18N
        Delete.setText("Delete");
        Delete.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                DeleteComponentAdded(evt);
            }
        });
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Quit.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Quit.setIcon(new javax.swing.ImageIcon("F:\\laptrinhhuongdoituong_netbean\\Dictionary\\icon\\if_Exit_131885.png")); // NOI18N
        Quit.setText("Quit");
        Quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ENGLISH");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("VIETNAMESE");

        jList1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {""};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {""};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        voice.setIcon(new javax.swing.ImageIcon("F:\\laptrinhhuongdoituong_netbean\\Dictionary\\icon\\Google-Play-Music-icon.png")); // NOI18N
        voice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voiceActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("MV Boli", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("WELCOME TO DICTONARY !!");

        jButton1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("F:\\laptrinhhuongdoituong_netbean\\Dictionary\\icon\\if_Pencil_131733.png")); // NOI18N
        jButton1.setText("Edit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(71, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(voice, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(text_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Quit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Delete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)))
                .addGap(105, 105, 105))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Timkiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(text_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(voice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(Quit, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimkiemActionPerformed
        String text = text_timkiem.getText().trim();
        int k = dictionaryManagement.thutu_target(text);
        
          
            if(k == dictionaryManagement.dictionary.listWord.size()){
                JOptionPane.showMessageDialog(rootPane, "Không có từ này !");
                
            }
            else{
                listexplain = new DefaultListModel();
                listexplain.addElement(dictionaryManagement.dictionary.listWord.get(k).getWord_explain());        
                jList2.setModel(listexplain);    
            }   
        // TODO add your handling code here:
        
      
    }//GEN-LAST:event_TimkiemActionPerformed

    private void text_timkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_timkiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_timkiemActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
        
        String Eng_word = JOptionPane.showInputDialog(null,"Add word", "English");
        int k = dictionaryManagement.thutu_target(Eng_word);
            Word word1 = new Word();
            if((k != -1 )&& (k!= dictionaryManagement.dictionary.listWord.size())){
                JOptionPane.showMessageDialog(null, "Từ đã tồn tại!");
            }else{
                String Viet_word = JOptionPane.showInputDialog(null,"Add word", "Vietnamese");
                    
                    word1.setWord_taget(Eng_word);
                    word1.setWord_explain(Viet_word);
                    dictionaryManagement.dictionary.listWord.add(word1);
                    dictionaryManagement.outputFile();
                    model.clear();
                    nhaplieu();
                   
            }
        
    }//GEN-LAST:event_AddActionPerformed

    private void QuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_QuitActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        String En_word = JOptionPane.showInputDialog("Delete", "English");
        int k = dictionaryManagement.thutu_target(En_word);
        
            if(k != dictionaryManagement.dictionary.listWord.size()){
                dictionaryManagement.dictionary.listWord.remove(k);
                dictionaryManagement.outputFile();
                model.remove(k); 
                model.clear();
                nhaplieu(); 
        }
        else{
            JOptionPane.showMessageDialog(null, "Từ không tồn tại, mời kiểm tra.");
            
        }
        


    }//GEN-LAST:event_DeleteActionPerformed

    private void voiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voiceActionPerformed
        // TODO add your handling code here:
        model.clear();
        nhaplieu();
        
    }//GEN-LAST:event_voiceActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        // TODO add your handling code here:
        
        String target = jList1.getSelectedValue();
        
        for (int i = 0; i < dictionaryManagement.dictionary.listWord.size(); i++){
            if(target.equals(dictionaryManagement.dictionary.listWord.get(i).getWord_taget())){ 
                listexplain = new DefaultListModel();
                listexplain.addElement(dictionaryManagement.dictionary.listWord.get(i).getWord_explain());        
                jList2.setModel(listexplain);
                break;
            }
            
        }
    }//GEN-LAST:event_jList1MouseClicked

    private void text_timkiemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_timkiemKeyPressed
       
    }//GEN-LAST:event_text_timkiemKeyPressed

    private void text_timkiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_timkiemKeyReleased
        // TODO add your handling code here:
       
       
        String kt = text_timkiem.getText();
        
        listtarget.clear();
        for(int i = 0; i<dictionaryManagement.dictionary.listWord.size(); i++){
            if (dictionaryManagement.dictionary.listWord.get(i).getWord_taget().startsWith(kt) == true)
                listtarget.addElement((dictionaryManagement.dictionary.listWord.get(i).getWord_taget()));
        }
        jList1.setModel(listtarget);
        
    }//GEN-LAST:event_text_timkiemKeyReleased

    private void AddInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_AddInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_AddInputMethodTextChanged

    private void DeleteComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_DeleteComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteComponentAdded

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String edit_word = JOptionPane.showInputDialog(null, "Edit_word", "English");
        int k = dictionaryManagement.thutu_target(edit_word);
        if(k == dictionaryManagement.dictionary.listWord.size()){
            JOptionPane.showConfirmDialog(null, "Từ này chưa có bạn có muốn thêm không?");
            String Viet_word = JOptionPane.showInputDialog(null,"Add word", "Vietnamese");
                    word.setWord_taget(edit_word);
                    word.setWord_explain(Viet_word);
                    dictionaryManagement.dictionary.listWord.add(word);
                    dictionaryManagement.outputFile();
                    nhaplieu();
        }
        else{
            String Eng_word = JOptionPane.showInputDialog(null,"English_word replace", "English");
            String Viet_word = JOptionPane.showInputDialog(null, "Vietnamese_word replace", "Vietnames");
            dictionaryManagement.dictionary.listWord.get(k).setWord_taget(Eng_word);
            dictionaryManagement.dictionary.listWord.get(k).setWord_explain(Viet_word);
            dictionaryManagement.outputFile();
            model.clear();
            nhaplieu();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Quit;
    private javax.swing.JButton Timkiem;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField text_timkiem;
    private javax.swing.JButton voice;
    // End of variables declaration//GEN-END:variables

    private void JTextArea(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
