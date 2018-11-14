package com.security;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class SecureRandomMessageDigest {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		
		SecureRandom sc=SecureRandom.getInstance("SHA1PRNG");
		
		sc.setSeed(71);
		byte[] message=new byte[20];
		sc.nextBytes(message);
		System.out.println(message);
		
		
	}
}
