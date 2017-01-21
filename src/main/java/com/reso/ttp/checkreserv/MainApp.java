package com.reso.ttp.checkreserv;

import com.reso.ttp.checkreserv.resources.Const;
import com.reso.ttp.checkreserv.resources.Reso;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.inject.Inject;
import lombok.*;

@Data
public class MainApp extends Application {

    private String fxmlFile;

    @Inject
    Reso reso;

    public void main(String[] args) throws Exception {
        launch(args);

        setFxmlFile(Const.mainFileName);

    }

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader();
        Parent rootNode = (Parent) loader.load(getClass().getResourceAsStream(getFxmlFile()));

        Scene scene = new Scene(rootNode, 400, 200);
        scene.getStylesheets().add(Const.styleSheetName);

        stage.setTitle("イベント予約確認");
        stage.setScene(scene);
        stage.show();
    }
}
