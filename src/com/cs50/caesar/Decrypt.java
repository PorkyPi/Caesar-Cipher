package com.cs50.caesar;

public class Decrypt {
	
	public String decryption(String str){
		
		int shift = 13;
		char[] arr = str.toCharArray();
		String encryptStr = new String();
		
		for(int i = 0; i < arr.length; i++){
			
			if(Character.isLowerCase(arr[i])){
				if(Character.isLowerCase(arr[i] + shift)){
					encryptStr += (char) (arr[i] + shift);
				} else {
					encryptStr += (char) (arr[i] - shift);
				}
			} else if(Character.isUpperCase(arr[i])){
				if(Character.isUpperCase(arr[i] + shift)){
					encryptStr += (char) (arr[i] + shift);
				} else {
					encryptStr += (char) (arr[i] - shift);
				}
			} else {
				encryptStr += arr[i];
			}
		}
		
		return encryptStr;
	}
}
