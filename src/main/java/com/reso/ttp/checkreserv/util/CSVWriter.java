package com.reso.ttp.checkreserv.util;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.reso.ttp.checkreserv.resources.Const;

import lombok.Data;

@Data
public class CSVWriter {

	private FileWriter fw;

	private BufferedWriter bw;

	private void scan(String source) {
		try {
			this.bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(source, true), "UTF-8"));
		} catch (UnsupportedEncodingException ex) {
			Logger.getLogger(CSVWriter.class.getName()).log(Level.SEVERE, null, ex);
		} catch (FileNotFoundException ex) {
			Logger.getLogger(CSVWriter.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public void write(String source, List<String> str, boolean mode) {
		scan(source);
		String output = null;

		for (String tmp : str) {
			if (output == null) {
				output = tmp;
			} else {
				output = output + Const.PUNCTUATION + tmp;
			}
		}
		try {
			bw.write(output + "\n");
			if (mode) {
				bw.close();
			}
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			Logger.getLogger(CSVReader.class.getName()).log(Level.SEVERE, "書き込み処理でエラー発生。", e);
			e.printStackTrace();
		}
	}
}
