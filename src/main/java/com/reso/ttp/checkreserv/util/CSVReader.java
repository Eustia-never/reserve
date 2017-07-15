/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reso.ttp.checkreserv.util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.reso.ttp.checkreserv.resources.Const;

/**
 *
 * @author Hirotaka.Sasaki
 */
public class CSVReader {
	FileReader fr;

	BufferedReader br;

	private void scan(String source) {
		try {
			this.br = new BufferedReader(new InputStreamReader(new FileInputStream(source), "UTF-8"));
		} catch (UnsupportedEncodingException ex) {
			Logger.getLogger(CSVReader.class.getName()).log(Level.SEVERE, null, ex);
		} catch (FileNotFoundException ex) {
			Logger.getLogger(CSVReader.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public List<List<String>> read(String source) {
		scan(source);
		List<List<String>> csv_list = new LinkedList<>();
		List<String> line_str_arr = null;
		String line;
		try {
			line = this.br.readLine();
			while ((line = this.br.readLine()) != null) {
				line_str_arr = new LinkedList<>();
				// 区切り文字", "で分割する
				for (String str : line.split(Const.PUNCTUATION)) {
					line_str_arr.add(str);
				}
				csv_list.add(line_str_arr);
			}
			br.close();
		} catch (IOException ex) {
			Logger.getLogger(CSVReader.class.getName()).log(Level.SEVERE, "読み込み処理でエラー発生。", ex);
			ex.printStackTrace();
		}
		return csv_list;
	}
}
