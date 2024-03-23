package com.lab.med.medUtility;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashUtility {
	public static String hashPassword(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = digest.digest(password.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : hashBytes) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            // Handle hashing algorithm not found exception
            return null;
        }
    }

//	public static String hashPassword(String password) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
