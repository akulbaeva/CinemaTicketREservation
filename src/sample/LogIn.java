package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;


public class LogIn {

    @FXML
    private TextField tfUsername;

    @FXML
    private PasswordField pfPassword;

    @FXML
    private Button btnLogIn;

    @FXML
    private Button btnSignIn;

    @FXML
    void btnLogInClick(ActionEvent event) {
        Alert message = null;

        if(tfUsername.getText().equals("com-18") && pfPassword.getText().equals("com")){
            try{
                Node node = (Node) event.getSource();
                Stage stage = (Stage) node.getScene().getWindow();

                stage.close();

                stage.setOpacity(0.0);

                Scene scene = new Scene(FXMLLoader.load(getClass().getResource("FXMLDocument.fxml")));
                stage.setScene(scene);;
                stage.setMaximized(true);
                stage.setResizable(true);
                stage.show();

                stage.setOpacity(0.0);
            } catch (IOException e) {
                System.out.println(e.toString());
            }
        } else {
            message = new Alert(Alert.AlertType.NONE, "Log in failed" , ButtonType.OK);
            message.showAndWait();
        }
    }

}
