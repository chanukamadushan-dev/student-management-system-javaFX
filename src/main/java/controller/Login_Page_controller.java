package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Login_Page_controller {

    @FXML
    private Button btnLogIn;

    @FXML
    private TextField txtPassword;

    @FXML
    private TextField txtUserName;

    @FXML
    void btnLogInOnAction(ActionEvent event) {
        String name = txtUserName.getText();
        String password = txtPassword.getText();

        boolean b = checkUserNameAndPassword(name, password);

        if (b){
            System.out.println("Logged successfully");
        }else{
            System.out.println("Wrong password");
        }
    }

    private boolean checkUserNameAndPassword(String name, String password) {
        if(name.equals("pamod") && password.equals("2004")){
            return true;
        }
        return false;
    }

    public void txtUserNameOnAction(ActionEvent actionEvent) {
        txtPassword.requestFocus();
    }

    public void txtPasswordOnAction(ActionEvent actionEvent) {
        btnLogInOnAction(actionEvent);
    }
}
