/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reso.ttp.checkreserv;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 *
 * @author Hirotaka.Sasaki
 */
public class AddMemberController {

    @FXML
    private TextField id;

    @FXML
    private TextField firstNameField;

    @FXML
    private TextField lastNameField;

    public void addMember() {
    }

    public void clear() {
        id.clear();
        firstNameField.clear();
        lastNameField.clear();
    }
}
