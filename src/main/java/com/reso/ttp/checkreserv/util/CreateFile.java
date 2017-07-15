/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reso.ttp.checkreserv.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.reso.ttp.checkreserv.resources.Const;

/**
 *
 * @author Hirotaka.Sasaki
 */
public class CreateFile {

    public void exec(LinkedList<String> lists) {

        File file = new File(MakeFileName.exec(lists));

        try {
            file.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(CreateFile.class.getName()).log(Level.SEVERE, null, ex);
        	ex.printStackTrace();
        }

    }

    public void addData(File file, LinkedList<String> lists) {
        String data = null;

        try {
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
            for (String str : lists) {
                data = data + Const.PUNCTUATION + str;
            }
            pw.println(data);
        } catch (IOException ex) {
            Logger.getLogger(CreateFile.class.getName()).log(Level.SEVERE, null, ex);
        	ex.printStackTrace();
        }

    }
}
