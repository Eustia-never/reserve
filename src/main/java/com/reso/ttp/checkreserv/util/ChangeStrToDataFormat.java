package com.reso.ttp.checkreserv.util;

public class ChangeStrToDataFormat {

	public static String exec(String str) {
		String chenged = null;
		chenged = str.substring(0, 4)+"/"+str.substring(4,6)+"/"+str.substring(6,8)+" "+str.substring(8,10)+":"+str.substring(10,12);

		return chenged;
	}
}
