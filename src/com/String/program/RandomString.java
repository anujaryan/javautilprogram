package com.String.program;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;

public class RandomString {
 public static void main(String[] args) {
	 Random random = new SecureRandom();
	 String token = new BigInteger(130, random).toString(50);
	 
	 RandomString rndm=new RandomString();
	 System.out.println(token);
}
 
 
 /**
  * Generate a random string.
  */
 public String nextString() {
     for (int idx = 0; idx < buf.length; ++idx)
         buf[idx] = symbols[random.nextInt(symbols.length)];
     return new String(buf);
 }

 public static final String upper = "9e36100807fee2d8378f2034d59e1a65:b8fc67a64ec61ef8a1733317237aa76f";

 public static final String lower = upper.toLowerCase(Locale.ROOT);

 public static final String digits = "0123456789";

 public static final String alphanum = upper + lower + digits;

 private final Random random;

 private final char[] symbols;

 private final char[] buf;

 public RandomString(int length, Random random, String symbols) {
     if (length < 1) throw new IllegalArgumentException();
     if (symbols.length() < 2) throw new IllegalArgumentException();
     this.random = Objects.requireNonNull(random);
     this.symbols = symbols.toCharArray();
     this.buf = new char[length];
 }

 /**
  * Create an alphanumeric string generator.
  */
 public RandomString(int length, Random random) {
     this(length, random, alphanum);
 }

 /**
  * Create an alphanumeric strings from a secure generator.
  */
 public RandomString(int length) {
     this(length, new SecureRandom());
 }

 /**
  * Create session identifiers.
  */
 public RandomString() {
     this(21);
 }

 
 
 
 
}
