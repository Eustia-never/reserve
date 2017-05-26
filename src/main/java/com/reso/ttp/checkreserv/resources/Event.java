/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reso.ttp.checkreserv.resources;

import java.util.LinkedList;
import java.util.List;

import lombok.Data;
import lombok.NonNull;

/**
 *
 * @author Hirotaka.Sasaki
 */
@Data
public class Event {

    @NonNull
    private String name;

    @NonNull
    private String date;

    private List<Person> persons = new LinkedList<>();

    public Event(String name, String date) {
        this.name = name;
        this.date = date;
    }

}
