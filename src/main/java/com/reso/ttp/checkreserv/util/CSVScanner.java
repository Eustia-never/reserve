/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reso.ttp.checkreserv.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
            this.fr = new FileReader(source);
            this.br = new BufferedReader(fr);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CSVScanner.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<String[]> read() {
        List<String[]> csv_list = new LinkedList<>();
        String[] line_str_arr;
        String line;
        try {
            while ((line = this.br.readLine()) != null) {
                //区切り文字","で分割する
                line_str_arr = line.split(",");
                csv_list.add(line_str_arr);
            }
            this.fr.close();
        } catch (IOException ex) {
            Logger.getLogger(CSVScanner.class.getName()).log(Level.SEVERE, null, ex);
        }

        return csv_list;
    }

}
