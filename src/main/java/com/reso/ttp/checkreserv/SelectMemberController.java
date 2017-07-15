/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reso.ttp.checkreserv;

import com.reso.ttp.checkreserv.resources.ConstFxml;
import com.reso.ttp.checkreserv.resources.Reso;
import com.reso.ttp.checkreserv.util.ScreenTransition;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;;

/**
 *
 * @author Hirotaka.Sasaki
 */
public class SelectMemberController {

	@FXML
	private TextField id;

	@FXML
	private TextField firstNameField;

	@FXML
	private TextField lastNameField;

	@FXML
	public void add() {
		Reso.FxmlFile = ConstFxml.ADD_MEM_NAME;
		ScreenTransition.execute();
	}

	@FXML
	public void delete() {
		Reso.FxmlFile = ConstFxml.DEL_MEM_NAME;
		ScreenTransition.execute();
	}

	@FXML
	public void back(){
		Reso.FxmlFile = ConstFxml.MAIN_FILE_NAME;
		ScreenTransition.execute();
	}
}
