/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reso.ttp.checkreserv.util;

import com.reso.ttp.checkreserv.resources.Const;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Hirotaka.Sasaki
 */
public class CSVScannerTest {

    public CSVScannerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    CSVScanner scna;

    String pass;

    @Before
    public void setUp() {
        pass = Const.CURRETN_DIRECTORY;
//        pass = pass.replace(Const.CURRENT, "");
    }

    @Test
    public void test() {
        System.out.print(pass);
//        scna = new CSVScanner(Const.EVENT_FILE);
//        List<String[]> file = scna.read();
//        assertEquals(file.get(0)[0], "日付");
//        assertEquals(file.get(1)[1], "20170101");
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
