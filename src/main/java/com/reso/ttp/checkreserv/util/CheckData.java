/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reso.ttp.checkreserv.util;

import java.util.Calendar;
import java.util.List;

import com.reso.ttp.checkreserv.resources.Const;

/**
 *
 * @author Hirotaka.Sasaki
 */
public class CheckData {

	public static void dataSize(List<List<String>> lists, int length) {
		for (List<String> list : lists) {
			if (list.size() != length) {
				throw new IllegalArgumentException("File 内の形式が間違っております。 " + list.size());
			}
		}
	}

	public static void dataFormat(String str, String format) {
		switch (format) {
		case Const.DATE:
			Calendar cal = Calendar.getInstance();
			cal.setLenient(true);
			int year = Integer.parseInt(str.substring(0, 4));
			int month = Integer.parseInt(str.substring(4, 6));
			int date = Integer.parseInt(str.substring(6, 8));
			int hour = Integer.parseInt(str.substring(8, 10));
			int min = Integer.parseInt(str.substring(10, 12));

			cal.set(year, month, date, hour, min);
			break;
		default:
			throw new IllegalStateException("定義されていない形式です");
		}
	}
}
