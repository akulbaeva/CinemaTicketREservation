package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;


public class LogIn {

    @FXML
    private Label label;

    @FXML
    private Rectangle rectangleMovie1;
    @FXML
    private Rectangle rectangleMovie2;
    @FXML
    private Rectangle rectangleMovie3;
    @FXML
    private Rectangle rectangleMovie4;
    @FXML
    private Rectangle rectangleMovie5;
    @FXML
    private Rectangle rectangleMovie6;

    @FXML
    private ImageView imageMovie1;
    @FXML
    private ImageView imageMovie2;
    @FXML
    private ImageView imageMovie3;
    @FXML
    private ImageView imageMovie4;
    @FXML
    private ImageView imageMovie5;
    @FXML
    private ImageView imageMovie6;

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

                Scene scene = new Scene(FXMLLoader.load(getClass().getResource("SelectMovie.fxml")));
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



    @FXML
    private void mouseEnterMovie1() {
        rectangleMovie1.setStyle("-fx-fill: white;");
    }
    @FXML
    private void mouseLeaveMovie1() {
        rectangleMovie1.setStyle("-fx-fill:  #2a3457;");
    }
    @FXML
    private void mouseEnterMovie2() {
        rectangleMovie2.setStyle("-fx-fill: white;");
    }
    @FXML
    private void mouseLeaveMovie2() {
        rectangleMovie2.setStyle("-fx-fill:  #2a3457;");
    }
    @FXML
    private void mouseEnterMovie3() {
        rectangleMovie3.setStyle("-fx-fill: white;");
    }
    @FXML
    private void mouseLeaveMovie3() {
        rectangleMovie3.setStyle("-fx-fill:  #2a3457;");
    }
    @FXML
    private void mouseEnterMovie4() {
        rectangleMovie4.setStyle("-fx-fill: white;");
    }
    @FXML
    private void mouseLeaveMovie4() {
        rectangleMovie4.setStyle("-fx-fill:  #2a3457;");
    }
    @FXML
    private void mouseEnterMovie5() {
        rectangleMovie5.setStyle("-fx-fill: white;");
    }
    @FXML
    private void mouseLeaveMovie5() {
        rectangleMovie5.setStyle("-fx-fill:  #2a3457;");
    }
    @FXML
    private void mouseEnterMovie6() {
        rectangleMovie6.setStyle("-fx-fill: white;");
    }
    @FXML
    private void mouseLeaveMovie6() {
        rectangleMovie6.setStyle("-fx-fill:  #2a3457;");
    }

}
