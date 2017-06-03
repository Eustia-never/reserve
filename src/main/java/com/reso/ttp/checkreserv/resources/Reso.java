/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reso.ttp.checkreserv.resources;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import lombok.Data;

/**
 *
 * @author Hirotaka.Sasaki
 */
@Data
public class Reso {

	private static Reso reso;

	private static Scene scene = null;

	public static Parent rootNode = null;

	public static FXMLLoader loader;

	public static String FxmlFile = null;

	public static Reso getInstance() {
		if (reso == null) {
			reso = new Reso();
		}
		return reso;
	}

	public static Scene getSceneInstance() {
		if (scene == null) {
			scene = new Scene(rootNode, 400, 200);
		}
		return scene;
	}

	@SuppressWarnings({ "restriction" })
	public void exec(Parent rootNode) {
	}
}
