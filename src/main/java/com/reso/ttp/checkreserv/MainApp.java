package com.reso.ttp.checkreserv;

import com.reso.ttp.checkreserv.resources.Const;
import com.reso.ttp.checkreserv.resources.ConstFxml;
import com.reso.ttp.checkreserv.resources.Reso;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lombok.Data;

@Data
public class MainApp extends Application {

	public static void main(String[] args) throws Exception {
		launch(args);
	}

	@SuppressWarnings("restriction")
	@Override
	public void start(Stage stage) throws Exception {

		if (Reso.FxmlFile == null) {
			Reso.FxmlFile = ConstFxml.MAIN_FILE_NAME;
		}

		FXMLLoader loader = new FXMLLoader();
		Parent rootNode = (Parent) loader.load(getClass().getResourceAsStream(Reso.FxmlFile));

		Scene scene = new Scene(rootNode, 400, 200);
		scene.getStylesheets().add(Const.STYLE_SHEET_NAME);

		stage.setTitle("イベント予約確認");
		stage.setScene(scene);
		stage.show();
	}
}
