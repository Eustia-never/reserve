/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reso.ttp.checkreserv.resources;

import lombok.Data;
import lombok.NonNull;

/**
 *
 * @author user
 */
@Data
public class Person {

	public Person(String id, String name) {
		setId(id);
		setName(name);

	}

	@NonNull
	private String id;

	@NonNull
	private String name;

	private boolean payed;

	private boolean passedBand;
}
