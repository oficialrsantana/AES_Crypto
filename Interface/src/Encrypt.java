
import javax.swing.JOptionPane;
import java.security.Key; 
import java.util.logging.Level; 
import java.util.logging.Logger; 
import javax.crypto.Cipher; 
import javax.crypto.spec.SecretKeySpec; 
import sun.misc.BASE64Decoder; 
import sun.misc.BASE64Encoder;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RafaSantana
 */
public class Encrypt extends javax.swing.JFrame {

    private static final String ALGO = "AES"; 
    private byte[] keyValue; 

    public Encrypt(String key) { 
	keyValue = key.getBytes(); 	
    }
    
    public String encrypting(String Data) throws Exception { 
	Key key = generateKey(); 
	Cipher c = Cipher.getInstance(ALGO);  
	c.init(Cipher.ENCRYPT_MODE, key); 
	byte[] encVal = c.doFinal(Data.getBytes()); 
	String encryptedValue = new BASE64Encoder().encode(encVal); 
	return encryptedValue; 	
    } 
    
    private Key generateKey() throws Exception { 
	Key key = new SecretKeySpec(keyValue, ALGO); 
	return key; 
    }
    
    /**
     * Creates new form Encrypt
     */
    public Encrypt() {
        initComponents();
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
        encryptKey = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        baseText = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jButtonEncrypt = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        encryptedText = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Bem vindo ao Sistema de Encriptação");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        jLabel1.setText("Encriptar");

        encryptKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encryptKeyActionPerformed(evt);
            }
        });
        encryptKey.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                encryptKeyKeyTyped(evt);
            }
        });

        jLabel2.setText("Chave:");

        baseText.setColumns(20);
        baseText.setLineWrap(true);
        baseText.setRows(5);
        baseText.setWrapStyleWord(true);
        jScrollPane1.setViewportView(baseText);

        jLabel3.setText("Texto Base");

        jButtonEncrypt.setFont(new java.awt.Font("Lucida Grande", 1, 11)); // NOI18N
        jButtonEncrypt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lock.png"))); // NOI18N
        jButtonEncrypt.setText("Encriptar");
        jButtonEncrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEncryptActionPerformed(evt);
            }
        });

        encryptedText.setColumns(20);
        encryptedText.setLineWrap(true);
        encryptedText.setRows(5);
        encryptedText.setWrapStyleWord(true);
        jScrollPane2.setViewportView(encryptedText);

        jLabel4.setText("Texto Encriptado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButtonEncrypt)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(encryptKey, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(encryptKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEncrypt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void encryptKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encryptKeyActionPerformed

        
        
    }//GEN-LAST:event_encryptKeyActionPerformed

    private void jButtonEncryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEncryptActionPerformed
        
        encryptedText.setText("");
        
        if (encryptKey.getText().isEmpty() || encryptKey.getText().length() != 16 ){
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Por favor insira a chave de criptografia com 16 caracteres.");
            
        }else if (baseText.getText().isEmpty()){
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Por Favor insira o texto a ser encriptado.");

        }else try {                
                Encrypt aes = new Encrypt(encryptKey.getText().trim()); 
		String encdata = aes.encrypting(baseText.getText().trim()); 
		encryptedText.append(encdata); 		
		} catch (Exception ex) {
	Logger.getLogger(Encrypt.class.getName()).log(Level.SEVERE, null, ex); 
		}

        
    }//GEN-LAST:event_jButtonEncryptActionPerformed

    private void encryptKeyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_encryptKeyKeyTyped
        
    if (encryptKey.getText().length() >= 16 ) // limit to 16 characters
            evt.consume();
        
    }//GEN-LAST:event_encryptKeyKeyTyped

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
            java.util.logging.Logger.getLogger(Encrypt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Encrypt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Encrypt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Encrypt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Encrypt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea baseText;
    private javax.swing.JTextField encryptKey;
    private javax.swing.JTextArea encryptedText;
    private javax.swing.JButton jButtonEncrypt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
