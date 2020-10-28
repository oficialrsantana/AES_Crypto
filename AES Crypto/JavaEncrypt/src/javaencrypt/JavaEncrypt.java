/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RafaSantana
 */

package javaencrypt;

import java.security.Key; 
import java.util.logging.Level; 
import java.util.logging.Logger; 
import javax.crypto.Cipher; 
import javax.crypto.spec.SecretKeySpec; 
import sun.misc.BASE64Decoder; 
import sun.misc.BASE64Encoder;


public class JavaEncrypt {

    private static final String ALGO = "AES"; 
    private byte[] keyValue; 

    public JavaEncrypt(String key) { 
	keyValue = key.getBytes(); 	
    }
    
    public String encrypt(String Data) throws Exception { 
	Key key = generateKey(); 
	Cipher c = Cipher.getInstance(ALGO);  
	c.init(Cipher.ENCRYPT_MODE, key); 
	byte[] encVal = c.doFinal(Data.getBytes()); 
	String encryptedValue = new BASE64Encoder().encode(encVal); 
	return encryptedValue; 	
    }

    public String decrypt(String encryptedData) throws Exception { 
	Key key = generateKey(); 
	Cipher c = Cipher.getInstance(ALGO); 
	c.init(Cipher.DECRYPT_MODE, key); 
	byte[] decordedValue = new BASE64Decoder().decodeBuffer(encryptedData); 
	byte[] decValue = c.doFinal(decordedValue); 
	String decryptedValue = new String(decValue); 
	return decryptedValue; 
    } 

    private Key generateKey() throws Exception { 
	Key key = new SecretKeySpec(keyValue, ALGO); 
	return key; 
    } 

    public static void main (String args[]) { 
            try { 
                JavaEncrypt aes = new JavaEncrypt("1234567890qwerty"); 
		String encdata = aes.encrypt("Hello World!"); 
		System.out.println("Encrypted Data - " + encdata); 
		String decdata = aes.decrypt(encdata); 
		System.out.println("Decrypted Data - " + decdata);
		} catch (Exception ex) {
	Logger.getLogger(JavaEncrypt.class.getName()).log(Level.SEVERE, null, ex); 
		}

        }
    
    
}
