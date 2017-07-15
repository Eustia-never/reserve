package com.reso.ttp.checkreserv.util;

import java.io.File;
import java.io.IOException;
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
		List<List<String>> event = (new CSVReader()).read(Const.EVENT_FILE);
		List<List<String>> output = new LinkedList<>();
		File file;
		String fileName;
		boolean flg = false;
		for (List<String> str : event) {
			if (LocalDate.parse(str.get(0)).isAfter(deleteDate)) {
				output.add(str);
			} else {
				flg = true;
				fileName = str.get(0) + "_" + str.get(1) + Const.CSV;
				file = new File(Const.EVENT_PASS + fileName);
				file.delete();
			}
		}
		if (flg) {
			try {
				deleteDate = LocalDate.now();
				file = new File(Const.EVENT_FILE);
				file.delete();
				file.createNewFile();
				CSVWriter csv = new CSVWriter();
				for (List<String> str : output) {
					csv.write(Const.EVENT_FILE, str, false);
				}
				csv.getBw().close();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}
	}
}
