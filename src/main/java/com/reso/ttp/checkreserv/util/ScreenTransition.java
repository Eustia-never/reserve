package com.reso.ttp.checkreserv.util;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.reso.ttp.checkreserv.MainApp;
import com.reso.ttp.checkreserv.MainController;

public class ScreenTransition {
	public static void execute() {
		try {
			MainApp app = new MainApp();
			MainApp.fxdate = MainApp.fxmlInstance.getAddMemberInstance();
			app.start(MainApp.localStage);
		} catch (Exception ex) {
			ex.printStackTrace();
			Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

}
