package com.reso.ttp.checkreserv.util;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class ErrAlert {
	public static void exec(String str){
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("エラー");
		alert.setHeaderText(null);
		alert.setContentText(str);
		alert.show();

	}

}
