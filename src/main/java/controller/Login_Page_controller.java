package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.example.Starter;

import java.io.IOException;

public class Login_Page_controller {

    LogInController logInController = new LogInController();
    @FXML
    private Button btnLogIn;

    @FXML
    private TextField txtPassword;

    @FXML
    private TextField txtUserName;

    @FXML
    void btnLogInOnAction(ActionEvent event) throws IOException {


        if (logInController.checkUserNameAndPassword(txtUserName.getText(), txtPassword.getText())){
            Stage stage = new Stage();
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/home_page.fxml"))));
            stage.show();
            System.out.println("Logged successfully");
        }else{
            System.out.println("Wrong password");
        }
    }
    public void txtUserNameOnAction(ActionEvent actionEvent) {
        txtPassword.requestFocus();
    }

    public void txtPasswordOnAction(ActionEvent actionEvent) throws IOException {
        btnLogInOnAction(actionEvent);
    }
}
