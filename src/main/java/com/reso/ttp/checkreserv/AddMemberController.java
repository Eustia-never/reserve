/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reso.ttp.checkreserv;

import java.util.LinkedList;
import java.util.List;

import com.reso.ttp.checkreserv.resources.Const;
import com.reso.ttp.checkreserv.resources.ConstFxml;
import com.reso.ttp.checkreserv.resources.Reso;
import com.reso.ttp.checkreserv.util.CSVReader;
import com.reso.ttp.checkreserv.util.CSVWriter;
import com.reso.ttp.checkreserv.util.ErrAlert;
import com.reso.ttp.checkreserv.util.OkBOX;
import com.reso.ttp.checkreserv.util.ScreenTransition;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;;

/**
 *
 * @author Hirotaka.Sasaki
 */
public class AddMemberController {

	@FXML
	private TextField id;

	@FXML
	private TextField firstNameField;

	@FXML
	private TextField lastNameField;

	public void add() {
		boolean flg = false;
		List<String> input = new LinkedList<String>() {
			{
				add(id.getText());
				add(firstNameField.getText());
				add(lastNameField.getText());
			}
		};
		for (String str : input) {
			if (str.equals("")) {
				flg = true;
				break;
			}
		}
		if (flg) {
			ErrAlert.exec("テキストボックスに値を入力してください。");
		} else {
			List<List<String>> csv;
			csv = (new CSVReader()).read(Const.MEM_FILE);
			for (List<String> str : csv) {
				if (str.get(0).equals(input.get(0))) {
					ErrAlert.exec("IDが重複しています。");
					flg = true;
					break;
				}
			}
			if (!flg) {
				CSVWriter csvWR = new CSVWriter();
				csvWR.write(Const.MEM_FILE, input, true);
				clear();
				OkBOX.exec("ユーザ追加", "追加に成功しました。");
			}
		}
	}

	public void clear() {
		id.clear();
		firstNameField.clear();
		lastNameField.clear();
	}

	@FXML
	public void back() {
		Reso.FxmlFile = ConstFxml.SEL_MEM_NAME;
		ScreenTransition.execute();
	}
}
