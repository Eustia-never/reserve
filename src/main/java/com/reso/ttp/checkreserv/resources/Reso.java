/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reso.ttp.checkreserv.resources;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import lombok.Data;

/**
 *
 * @author user
 */
@Data
public class Reso {

    private List<Event> events = new LinkedList<Event>();

}
