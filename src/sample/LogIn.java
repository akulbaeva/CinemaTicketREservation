package sample;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import sample.Theater;
import sample.animation.Shake;


public class LogIn implements Initializable {

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
    private Button btnSignUp;

    private Theater theater1 = new Theater();
    private Theater theater2 = new Theater();
    private Theater theater3 = new Theater();
    private Theater theater4 = new Theater();
    private Theater theater5 = new Theater();
    private Theater theater6 = new Theater();


    @FXML
    public void btnLogInClick(ActionEvent event) {
        final Alert[] message = {null};

        btnLogIn.setOnAction(event1 -> {

            String loginText = tfUsername.getText().trim();
            String loginPass = pfPassword.getText().trim();

            if (!loginText.equals("") && !loginPass.equals("")) {
                loginUser(loginText, loginPass);
            } else {
                Shake userLogInAnim = new Shake(tfUsername);
                Shake userPassAnim = new Shake(pfPassword);

                userLogInAnim.playAnimation();
                userPassAnim.playAnimation();
                message[0] = new Alert(Alert.AlertType.NONE, "Username or Password is empty", ButtonType.OK);
                message[0].showAndWait();
            }
        });
    }

    private void loginUser(String loginText, String loginPass) {
        final Alert[] message = {null};

        DatabaseHandler dbHandler = new DatabaseHandler();
        User user = new User();
        user.setUserName(loginText);
        user.setPassword(loginPass);
        ResultSet result = dbHandler.getUser(user);

        int counter = 0;

        try {
            while (result.next()) {
                counter++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (counter >= 1) {
//            System.out.println("success!");
            btnLogIn.setOnAction(event1 -> {
                btnLogIn.getScene().getWindow().hide();

                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("SelectMovie.fxml"));
                try {
                    loader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                Parent root = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.showAndWait();

            });
        } else {
            Shake userLogInAnim = new Shake(tfUsername);
            Shake userPassAnim = new Shake(pfPassword);

            userLogInAnim.playAnimation();
            userPassAnim.playAnimation();
            message[0] = new Alert(Alert.AlertType.NONE, "Log in failed", ButtonType.OK);
            message[0].showAndWait();
        }
    }


    @FXML
    void btnSignUpClick(ActionEvent actionEvent) {

        try {
            Node node = (Node) actionEvent.getSource();
            Stage stage = (Stage) node.getScene().getWindow();

            stage.close();
            stage.setOpacity(0.0);


            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SignUp.fxml"));

            Parent root = (Parent) fxmlLoader.load();
            SignUp controller = fxmlLoader.getController();

            Scene scene = new Scene(root);

            stage.setScene(scene);
            stage.show();
            stage.setOpacity(1.0);

        } catch (IOException ex) {
            System.out.println(ex.toString());
        }

    }

//    @FXML
//    private void handleButtonAction(ActionEvent event) {
//        System.out.println("You clicked me!");
//        label.setText("Hello World!");
//    }

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

    @FXML
    private void clickMovie(MouseEvent event) {

        try {
            ImageView moviePoster = (ImageView) event.getSource();

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.close();
            stage.setOpacity(0.0);

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SeatSelection.fxml"));

            Parent root = (Parent) fxmlLoader.load();
            SeatSelection controller = fxmlLoader.getController();

            if (moviePoster.getId().equals("imageMovie1")) {
                controller.setMovieTitle("The Greatest Showman");
            } else if (moviePoster.getId().equals("imageMovie2")) {
                controller.setMovieTitle("Indiana Jones - Raiders of The " +
                        " Lost Ark");
            } else if (moviePoster.getId().equals("imageMovie3")) {
                controller.setMovieTitle("E.T. The Extra-Terrestrial");
            } else if (moviePoster.getId().equals("imageMovie4")) {
                controller.setMovieTitle("Jurassic Park");
            } else if (moviePoster.getId().equals("imageMovie5")) {
                controller.setMovieTitle("Predator");
            } else if (moviePoster.getId().equals("imageMovie6")) {
                controller.setMovieTitle("Gemini");
            }

            controller.loadTheaters(moviePoster.getId(), theater1, theater2, theater3,
                    theater4, theater5, theater6);

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            stage.setOpacity(1.0);

        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }

    public void saveSeating(Theater stage1, Theater stage2, Theater stage3,
                            Theater stage4, Theater stage5, Theater stage6) {
        theater1 = stage1;
        theater2 = stage2;
        theater3 = stage3;
        theater4 = stage4;
        theater5 = stage5;
        theater6 = stage6;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
