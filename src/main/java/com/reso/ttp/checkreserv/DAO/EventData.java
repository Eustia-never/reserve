/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reso.ttp.checkreserv.DAO;

import com.reso.ttp.checkreserv.util.ChangeStrToDataFormat;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author Hirotaka.Sasaki
 */
@Data
@AllArgsConstructor
public class EventData {
	private String date;
	private String eventName;

	@Override
	public String toString() {
		return ChangeStrToDataFormat.exec(date) + " " + eventName;
	}
}
