/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reso.ttp.checkreserv.util;

import com.reso.ttp.checkreserv.resources.Const;
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

/**
 *
 * @author Hirotaka.Sasaki
 */
public class CSVScanner {

    FileReader fr;

    BufferedReader br;

    // Constructor
    public CSVScanner(String source) {
        try {
            this.br = new BufferedReader(new InputStreamReader(new FileInputStream(source), "UTF-8"));
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(CSVScanner.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CSVScanner.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<String[]> read() {
        List<String[]> csv_list = new LinkedList<>();
        String[] line_str_arr;
        String line;
        try {
            line = this.br.readLine();
            while ((line = this.br.readLine()) != null) {
                //区切り文字", "で分割する
                line_str_arr = line.split(Const.PUNCTUATION);
                csv_list.add(line_str_arr);
            }
        } catch (IOException ex) {
            Logger.getLogger(CSVScanner.class.getName()).log(Level.SEVERE, null, ex);
        }

        return csv_list;
    }

}
