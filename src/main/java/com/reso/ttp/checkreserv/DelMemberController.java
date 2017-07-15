package com.reso.ttp.checkreserv;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import com.reso.ttp.checkreserv.resources.Const;
import com.reso.ttp.checkreserv.resources.ConstFxml;
import com.reso.ttp.checkreserv.resources.Person;
import com.reso.ttp.checkreserv.resources.Reso;
import com.reso.ttp.checkreserv.util.CSVReader;
import com.reso.ttp.checkreserv.util.ErrAlert;
import com.reso.ttp.checkreserv.util.ScreenTransition;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

public class DelMemberController implements Initializable {

	@FXML
	private ComboBox<String> userBox;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		showUser();
	}

	@SuppressWarnings("restriction")
	private void showUser() {
		{
			Person user;

			List<List<String>> userList = (new CSVReader()).read(Const.MEM_FILE);

			for (List<String> member : userList) {
				user = new Person(member.get(0), member.get(1));
				userBox.getItems().add(user.getId());
			}
		}
	}

	@SuppressWarnings("restriction")
	@FXML
	public void delete() {
		String member = userBox.getValue();
		if (member != null && !member.equals("")) {

		} else {
			ErrAlert.exec("削除するユーザを選択してください。");
		}

	}

	@FXML
	public void deleteAll() {

	}

	@FXML
	public void back() {
		Reso.FxmlFile = ConstFxml.SEL_MEM_NAME;
		ScreenTransition.execute();
	}
}
