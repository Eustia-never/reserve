package com.reso.ttp.checkreserv;

import com.reso.ttp.checkreserv.resources.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lombok.*;

public class MainApp extends Application {

    @Setter
    @Getter
    private static String fxmlFile;

    public static void main(String[] args) throws Exception {

        setFxmlFile(ConstFxml.MAIN_FILE_NAME);

        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader();
        Parent rootNode = (Parent) loader.load(getClass().getResourceAsStream(getFxmlFile()));

        Scene scene = new Scene(rootNode, 400, 200);
        scene.getStylesheets().add(Const.STYLE_SHEET_NAME);

        stage.setTitle("イベント予約確認");
        stage.setScene(scene);
        stage.show();
    }
}
