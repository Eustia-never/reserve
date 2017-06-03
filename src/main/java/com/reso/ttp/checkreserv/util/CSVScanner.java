package com.reso.ttp.checkreserv.util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hirotaka.Sasaki
 */
public class CSVScanner {

	FileReader fr;

	BufferedReader br;

	protected void scan(String source) {
		try {
			this.br = new BufferedReader(new InputStreamReader(new FileInputStream(source), "UTF-8"));
		} catch (UnsupportedEncodingException ex) {
			Logger.getLogger(CSVReader.class.getName()).log(Level.SEVERE, null, ex);
		} catch (FileNotFoundException ex) {
			Logger.getLogger(CSVReader.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
