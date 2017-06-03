package com.reso.ttp.checkreserv;

import com.reso.ttp.checkreserv.resources.Const;
import com.reso.ttp.checkreserv.resources.ConstFxml;
import com.reso.ttp.checkreserv.resources.FXData;
import com.reso.ttp.checkreserv.resources.FXMLInstance;
import com.reso.ttp.checkreserv.resources.Reso;

import javafx.application.Application;
import javafx.stage.Stage;
import lombok.Data;

@Data
public class MainApp extends Application {

	public static FXMLInstance fxmlInstance;

	public static FXData fxdate;

	public static Stage localStage;

	public static void main(String[] args) throws Exception {
		launch(args);
	}

	@SuppressWarnings("restriction")
	@Override
	public void start(Stage stage) throws Exception {
		if (Reso.FxmlFile == null) {
			localStage = stage;
			Reso.FxmlFile = ConstFxml.MAIN_FILE_NAME;
			fxmlInstance = new FXMLInstance();
			fxdate = fxmlInstance.getMainAppInstance();
		}

		Reso.rootNode = fxdate.getParent();
		Reso.getSceneInstance().setRoot(fxdate.getParent());
		Reso.getSceneInstance().getStylesheets().add(Const.STYLE_SHEET_NAME);
		stage.setTitle("イベント予約確認");
		stage.setScene(Reso.getSceneInstance());
		stage.show();
	}
}
