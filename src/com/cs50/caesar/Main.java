package com.cs50.caesar;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		String crypt1 = "or fher gb qevax lbhe Binygvar";
		String crypt2 = "uggcf://lbhgh.or/bUt5FWLEUN0";
		
		Decrypt encrypt = new Decrypt();
		String str = encrypt.decryption(crypt1);
		System.out.println(str);
		str = encrypt.decryption(crypt2);
		System.out.println(str);
	}

}
