package com.reso.ttp.checkreserv.resources;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import lombok.Data;

@Data
public class FXMLInstance {
	private static FXData mainApp = null;

	private static FXData addMember = null;

	private static FXData addEvent = null;

	public FXData getMainAppInstance() {
		return getInstance(mainApp);
	}

	public FXData getAddMemberInstance() {
		return getInstance(addMember);
	}

	public FXData getAddEventInstance() {
		return getInstance(addEvent);
	}

	private FXData getInstance(FXData fxdata) {
		if (fxdata == null) {
			try {
				fxdata  = new FXData ();
				fxdata.setLoader(new FXMLLoader());
				fxdata.setParent((Parent) fxdata.getLoader().load(getClass().getResourceAsStream(Reso.FxmlFile)));
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}
		return fxdata;
	}
}
