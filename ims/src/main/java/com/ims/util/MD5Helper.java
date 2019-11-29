package com.ims.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Helper {
	//全局数组用于封装加密后的密码
	private final static String[] strDigits={
		"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"
	};
	//返回形式为数字跟字符串     1b2j3j5k6k7h2jnkj2kk5k65l7l
	private static String byteToArrayString(byte bByte){
		int iRet = bByte;
		if(iRet<0){
			iRet+=256;
		}
		int iD1 = iRet/16;
		int iD2 = iRet%16;
		return strDigits[iD1]+strDigits[iD2];
	}
	//转换字节数组为16进制字符串
	private static String byteToString(byte[] bByte){
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < bByte.length; i++) {
			sb.append(byteToArrayString(bByte[i]));
		}
		return sb.toString();
	}
	public static String GetMDCode(String strObj){
		String resultString = null;
		resultString = new String(strObj);
		MessageDigest md;
		try {
			md = MessageDigest.getInstance("MD5");
			resultString = byteToString(md.digest(strObj.getBytes()));
			return resultString;
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return null;
	}
	public static void main(String[] args) {
		System.out.println(GetMDCode("中国"));
	}
}
