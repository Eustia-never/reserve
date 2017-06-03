/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reso.ttp.checkreserv.util;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.reso.ttp.checkreserv.resources.Const;

/**
 *
 * @author Hirotaka.Sasaki
 */
public class CSVReader extends CSVScanner {

	public List<String[]> read(String source) {
		scan(source);
		List<String[]> csv_list = new LinkedList<>();
		String[] line_str_arr;
		String line;
		try {
			line = this.br.readLine();
			while ((line = this.br.readLine()) != null) {
				// 区切り文字", "で分割する
				line_str_arr = line.split(Const.PUNCTUATION);
				csv_list.add(line_str_arr);
			}
		} catch (IOException ex) {
			Logger.getLogger(CSVReader.class.getName()).log(Level.SEVERE, null, ex);
		}
		return csv_list;
	}
}
