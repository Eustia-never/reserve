package com.reso.ttp.checkreserv.util;

import java.time.LocalDate;
import java.time.Period;
import java.util.LinkedList;
import java.util.List;

import com.reso.ttp.checkreserv.resources.Const;

public class DeleteEvent {

	public static LocalDate deleteDate = null;

	public static boolean flg = false;

	private static final int DELETE_DATE = 1;

	public static void execute() {
		if (!flg) {
			delete();
			flg = true;
		} else {
			if (Period.between(deleteDate, LocalDate.now()).getDays() > DELETE_DATE) {
				delete();
			}
		}
	}

	private static void delete() {
		List<String[]> event = (new CSVReader()).read(Const.EVENT_FILE);
		List<String[]> output = new LinkedList<>();
		for (String[] str : event) {
			if (LocalDate.parse(str[0]).isAfter(deleteDate)) {
				output.add(str);
			}
		}
		deleteDate = LocalDate.now();
	}
}
