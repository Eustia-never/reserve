package com.reso.ttp.checkreserv;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.reso.ttp.checkreserv.DAO.EventData;
import com.reso.ttp.checkreserv.resources.Const;
import com.reso.ttp.checkreserv.resources.ConstFxml;
import com.reso.ttp.checkreserv.resources.Reso;
import com.reso.ttp.checkreserv.util.CSVReader;
import com.reso.ttp.checkreserv.util.CheckData;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

public class MainController implements Initializable {

	@FXML
	private ComboBox<EventData> eventBox;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		showEvent();
	}

	private void showEvent() {
		{
			EventData eventData;

			List<String[]> eventList = (new CSVReader()).read(Const.EVENT_FILE);
			CheckData.dataSize(eventList, 2);

			for (String[] event : eventList) {
				CheckData.dataFormat(event[0], Const.DATE);
				eventData = new EventData(event[0], event[1]);
				eventBox.getItems().add(eventData);
			}
		}
	}

	@FXML
	public void addEvent() {

	}

	public void addMember() {
		MainApp app = new MainApp();
		Reso.FxmlFile = ConstFxml.ADD_MEM_NAME;
		try {
			MainApp.fxdate = MainApp.fxmlInstance.getAddMemberInstance();
			app.start(MainApp.localStage);
		} catch (Exception ex) {
			StackTraceElement[] stElem = ex.getStackTrace();
			for (int i = 0; i < stElem.length; i++) {
				System.out.print(stElem[i].getClassName() + ": ");
				System.out.print(stElem[i].getMethodName() + ": ");
				System.out.println(stElem[i].getLineNumber() + ";");
			}
			Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

}
