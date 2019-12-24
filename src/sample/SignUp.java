package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

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

        try {
            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();

            stage.close();
            stage.setOpacity(0.0);


            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("LogIn.fxml"));

            Parent root = (Parent) fxmlLoader.load();
            Controller controller = fxmlLoader.getController();

            Scene scene = new Scene(root);

            stage.setScene(scene);
            stage.show();
            stage.setOpacity(1.0);

        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }

    @FXML
    void btnSubmitClick(ActionEvent event) {
//        btnSubmit.setOnAction(event1 -> {
        signUpNewUser();
        try {
            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();

            stage.close();
            stage.setOpacity(0.0);


            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SelectMovie.fxml"));

            Parent root = (Parent) fxmlLoader.load();
            Controller controller = fxmlLoader.getController();

            Scene scene = new Scene(root);

            stage.setScene(scene);
            stage.show();
            stage.setOpacity(1.0);

        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
//        });
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
