package com.reso.ttp.checkreserv.util;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class OkBOX {
	public static void exec(String header, String str) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle(header);
		alert.setHeaderText(null);
		alert.setContentText(str);
		alert.show();

	}

}
