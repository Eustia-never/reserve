package com.reso.ttp.checkreserv;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import com.reso.ttp.checkreserv.DAO.EventData;
import com.reso.ttp.checkreserv.resources.Const;
import com.reso.ttp.checkreserv.resources.ConstFxml;
import com.reso.ttp.checkreserv.resources.Reso;
import com.reso.ttp.checkreserv.util.CSVReader;
import com.reso.ttp.checkreserv.util.CheckData;
import com.reso.ttp.checkreserv.util.ScreenTransition;

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

			List<List<String>> eventList = (new CSVReader()).read(Const.EVENT_FILE);
			CheckData.dataSize(eventList, 2);

			for (List<String> event : eventList) {
				CheckData.dataFormat(event.get(0), Const.DATE);
				eventData = new EventData(event.get(0), event.get(1));
				eventBox.getItems().add(eventData);
			}
		}
	}

	@FXML
	public void addEvent() {

	}

	public void addMember() {
		Reso.FxmlFile = ConstFxml.SEL_MEM_NAME;
		ScreenTransition.execute();
	}
}
