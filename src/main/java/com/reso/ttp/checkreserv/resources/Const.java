/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reso.ttp.checkreserv.resources;

/**
 *
 * @author Hirotaka.Sasaki
 */
public class Const {

    public static final String STYLE_SHEET_NAME = "/styles/styles.css";

    public static final String CSV = ".csv";

    public static final String CONSTPASS = "com/reso/ttp/checkreserv/resources";

    public static final String PATH = System.getProperty("user.dir");

    public static final String PUNCTUATION = ", ";

    public static final String RESOURCE = PATH.replace(CONSTPASS, "") + "/src/main/resources";

    public static final String EVENT_PASS = RESOURCE + "/data/event/";

    public static final String EVENT_FILE = RESOURCE + "/data/event.csv";

    public static final String MEM_FILE = RESOURCE + "/data/member.csv";

    public static final String DATE = "date";
}
