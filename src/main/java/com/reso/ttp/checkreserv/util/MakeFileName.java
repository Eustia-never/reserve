/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reso.ttp.checkreserv.util;

import java.util.LinkedList;

/**
 *
 * @author Hirotaka.Sasaki
 */
public class MakeFileName {

    private static final String UNDERBAR = "_";

    public static String exec(LinkedList<String> lists) {
        String output = null;

        for (String list : lists) {
            output = output + UNDERBAR + list;
        }
        return output;
    }
}
