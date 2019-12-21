package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SignUp {

    @FXML
    private TextField tfFirstName;

    @FXML
    private TextField tfLastName;

    @FXML
    private TextField tfUserName;

    @FXML
    private PasswordField pfPassword;

    @FXML
    private Button btnBack;

    @FXML
    private Button btnSubmit;

    @FXML
    void btnBackClick(ActionEvent event) {

    }

    @FXML
    void btnSubmitClick(ActionEvent event) {
        btnSubmit.setOnAction(event1 -> {
            signUpNewUser();
        });
    }

    private void signUpNewUser() {
        DatabaseHandler dbHandler = new DatabaseHandler();

        String firstName = tfFirstName.getText();
        String lastName = tfLastName.getText();
        String userName = tfUserName.getText();
        String Password = pfPassword.getText();

        User user = new User(firstName, lastName, userName, Password);


        dbHandler.signUpUser(user);

    }

}
