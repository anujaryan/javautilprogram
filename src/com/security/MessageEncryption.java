package com.security;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

public class MessageEncryption {

	//message encryption Function...
	public String getEncryption(String message) {
		
		return null;
	}
	
	
	public static void main(String[] args) {
		
		
		byte[] message="I am a superman, sshhh don't tell anyone".getBytes();
		System.out.println(message);
		
		try {
			//byte[] message = "I am a superman, sshhh don't tell anyone".getBytes();
			KeyGenerator keygenerator = KeyGenerator.getInstance("DES");
			SecretKey desKey = keygenerator.generateKey();
			Cipher desCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
			// Initialize the cipher for encryption
			desCipher.init(Cipher.ENCRYPT_MODE, desKey);
			// Encrypt message and return
			byte[] encryptedMessage = desCipher.doFinal(message);
			System.out.println(encryptedMessage);
			
			
			
		} catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException | BadPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}
	
}
