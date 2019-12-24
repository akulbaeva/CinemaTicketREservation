package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class SeatSelection implements Initializable {

    @FXML
    private GridPane seat13;

    @FXML
    private Label seatA1;

    @FXML
    private Label seatA2;

    @FXML
    private Label seatA3;

    @FXML
    private Label seatA5;

    @FXML
    private Label seatA6;

    @FXML
    private Label seatA7;

    @FXML
    private Label seatA4;

    @FXML
    private Label seatA8;

    @FXML
    private Label seatA12;

    @FXML
    private Label seatA11;

    @FXML
    private Label seatA10;

    @FXML
    private Label seatA9;

    @FXML
    private Label seatB12;

    @FXML
    private Label seatB11;

    @FXML
    private Label seatB10;

    @FXML
    private Label seatB9;

    @FXML
    private Label seatB8;

    @FXML
    private Label seatB7;

    @FXML
    private Label seatB6;

    @FXML
    private Label seatB5;

    @FXML
    private Label seatB4;

    @FXML
    private Label seatB3;

    @FXML
    private Label seatB2;

    @FXML
    private Label seatB1;

    @FXML
    private Label seatC12;

    @FXML
    private Label seatC11;

    @FXML
    private Label seatC10;

    @FXML
    private Label seatC9;

    @FXML
    private Label seatC8;

    @FXML
    private Label seatC7;

    @FXML
    private Label seatC6;

    @FXML
    private Label seatC5;

    @FXML
    private Label seatC4;

    @FXML
    private Label seatC3;

    @FXML
    private Label seatC2;

    @FXML
    private Label seatC1;

    @FXML
    private Label seatD12;

    @FXML
    private Label seatD11;

    @FXML
    private Label seatD10;

    @FXML
    private Label seatD9;

    @FXML
    private Label seatD8;

    @FXML
    private Label seatD7;

    @FXML
    private Label seatD6;

    @FXML
    private Label seatD5;

    @FXML
    private Label seatD4;

    @FXML
    private Label seatD3;

    @FXML
    private Label seatD2;

    @FXML
    private Label seatD1;

    @FXML
    private Label seatG2;

    @FXML
    private Label seatG1;

    @FXML
    private Label seatE12;

    @FXML
    private Label seatE11;

    @FXML
    private Label seatE10;

    @FXML
    private Label seatE9;

    @FXML
    private Label seatE8;

    @FXML
    private Label seatE7;

    @FXML
    private Label seatE6;

    @FXML
    private Label seatE5;

    @FXML
    private Label seatE4;

    @FXML
    private Label seatE3;

    @FXML
    private Label seatE2;

    @FXML
    private Label seatE1;

    @FXML
    private Label seatF12;

    @FXML
    private Label seatF11;

    @FXML
    private Label seatF10;

    @FXML
    private Label seatF9;

    @FXML
    private Label seatF8;

    @FXML
    private Label seatF7;

    @FXML
    private Label seatF6;

    @FXML
    private Label seatF5;

    @FXML
    private Label seatF4;

    @FXML
    private Label seatF3;

    @FXML
    private Label seatF2;

    @FXML
    private Label seatF1;

    @FXML
    private Label seatG4;

    @FXML
    private Label seatG3;

    @FXML
    private Label seatH2;

    @FXML
    private Label seatH1;

    @FXML
    private Label seatG12;

    @FXML
    private Label seatG11;

    @FXML
    private Label seatG10;

    @FXML
    private Label seatG9;

    @FXML
    private Label seatG8;

    @FXML
    private Label seatG7;

    @FXML
    private Label seatG6;

    @FXML
    private Label seatG5;

    @FXML
    private Label seatH8;

    @FXML
    private Label seatH7;

    @FXML
    private Label seatH6;

    @FXML
    private Label seatH5;

    @FXML
    private Label seatH4;

    @FXML
    private Label seatH3;

    @FXML
    private Label seatH12;

    @FXML
    private Label seatH11;

    @FXML
    private Label seatH10;

    @FXML
    private Label seatH9;

    @FXML
    private Label seatI12;

    @FXML
    private Label seatI11;

    @FXML
    private Label seatI10;

    @FXML
    private Label seatI9;

    @FXML
    private Label seatI8;

    @FXML
    private Label seatI7;

    @FXML
    private Label seatI6;

    @FXML
    private Label seatI5;

    @FXML
    private Label seatI4;

    @FXML
    private Label seatI3;

    @FXML
    private Label seatI2;

    @FXML
    private Label seatI1;

    @FXML
    private Label movieTitle;

    @FXML
    private Button btnPurchaseSeats;

    @FXML
    private ComboBox comboBoxSelectTime;

    private ArrayList<Label> seatList = new ArrayList<Label>();
    private String movieTitleString;
    private String currentTheaterID;

    private MovieShow movie1 = new MovieShow();
    private MovieShow movie2 = new MovieShow();
    private MovieShow movie3 = new MovieShow();
    private MovieShow movie4 = new MovieShow();
    private MovieShow movie5 = new MovieShow();
    private MovieShow movie6 = new MovieShow();
    private MovieShow currentMovie = new MovieShow();

    private Theater theater1 = new Theater();
    private Theater theater2 = new Theater();
    private Theater theater3 = new Theater();
    private Theater theater4 = new Theater();
    private Theater theater5 = new Theater();
    private Theater theater6 = new Theater();
    private Theater currentTheater = new Theater();


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        seatList.add(seatA1);
        seatList.add(seatA2);
        seatList.add(seatA3);
        seatList.add(seatA4);
        seatList.add(seatA5);
        seatList.add(seatA6);
        seatList.add(seatA7);
        seatList.add(seatA8);
        seatList.add(seatA9);
        seatList.add(seatA10);
        seatList.add(seatA11);
        seatList.add(seatA12);

        seatList.add(seatB1);
        seatList.add(seatB2);
        seatList.add(seatB3);
        seatList.add(seatB4);
        seatList.add(seatB5);
        seatList.add(seatB6);
        seatList.add(seatB7);
        seatList.add(seatB8);
        seatList.add(seatB9);
        seatList.add(seatB10);
        seatList.add(seatB11);
        seatList.add(seatB12);

        seatList.add(seatC1);
        seatList.add(seatC2);
        seatList.add(seatC3);
        seatList.add(seatC4);
        seatList.add(seatC5);
        seatList.add(seatC6);
        seatList.add(seatC7);
        seatList.add(seatC8);
        seatList.add(seatC9);
        seatList.add(seatC10);
        seatList.add(seatC11);
        seatList.add(seatC12);

        seatList.add(seatD1);
        seatList.add(seatD2);
        seatList.add(seatD3);
        seatList.add(seatD4);
        seatList.add(seatD5);
        seatList.add(seatD6);
        seatList.add(seatD7);
        seatList.add(seatD8);
        seatList.add(seatD9);
        seatList.add(seatD10);
        seatList.add(seatD11);
        seatList.add(seatD12);

        seatList.add(seatE1);
        seatList.add(seatE2);
        seatList.add(seatE3);
        seatList.add(seatE4);
        seatList.add(seatE5);
        seatList.add(seatE6);
        seatList.add(seatE7);
        seatList.add(seatE8);
        seatList.add(seatE9);
        seatList.add(seatE10);
        seatList.add(seatE11);
        seatList.add(seatE12);

        seatList.add(seatF1);
        seatList.add(seatF2);
        seatList.add(seatF3);
        seatList.add(seatF4);
        seatList.add(seatF5);
        seatList.add(seatF6);
        seatList.add(seatF7);
        seatList.add(seatF8);
        seatList.add(seatF9);
        seatList.add(seatF10);
        seatList.add(seatF11);
        seatList.add(seatF12);

        seatList.add(seatG1);
        seatList.add(seatG2);
        seatList.add(seatG3);
        seatList.add(seatG4);
        seatList.add(seatG5);
        seatList.add(seatG6);
        seatList.add(seatG7);
        seatList.add(seatG8);
        seatList.add(seatG9);
        seatList.add(seatG10);
        seatList.add(seatG11);
        seatList.add(seatG12);

        seatList.add(seatH1);
        seatList.add(seatH2);
        seatList.add(seatH3);
        seatList.add(seatH4);
        seatList.add(seatH5);
        seatList.add(seatH6);
        seatList.add(seatH7);
        seatList.add(seatH8);
        seatList.add(seatH9);
        seatList.add(seatH10);
        seatList.add(seatH11);
        seatList.add(seatH12);

        seatList.add(seatI1);
        seatList.add(seatI2);
        seatList.add(seatI3);
        seatList.add(seatI4);
        seatList.add(seatI5);
        seatList.add(seatI6);
        seatList.add(seatI7);
        seatList.add(seatI8);
        seatList.add(seatI9);
        seatList.add(seatI10);
        seatList.add(seatI11);
        seatList.add(seatI12);


        comboBoxSelectTime.getItems().clear();

        comboBoxSelectTime.getItems().addAll(
                "Select Time",
                "9:00 AM",
                "10:00 AM",
                "5:00 PM",
                "9:00 PM");

        Label seatReference;

        for (int i = 0; i < seatList.size(); i++) {
            seatReference = seatList.get(i);
            seatReference.setDisable(true);
            seatReference.setStyle("-fx-border-radius: 5; -fx-background-color: white;");
        }
    }

    @FXML
    private void windowSetUp(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        stage.setTitle("Moon Cinemas - Seat Reservation Selection");
    }

    @FXML
    void clickGoBackBtn(ActionEvent event) {

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

            controller.saveSeating(theater1, theater2, theater3, theater4,
                    theater5, theater6);
        } catch (IOException ex) {
            System.out.println(ex.toString());
        } finally {

            String[] seats = currentMovie.getSeating();

            for (int i = 0; i < 108; i++) {
                if (seats[i].equals("Selected"))
                    seats[i] = "Open";
            }
        }
    }

    @FXML
    void clickOpenSeat(MouseEvent event) {
        Label seat = (Label) event.getSource();
        Label seatRef = getClickedLabelID(seat.getId());

        if (seat.getText().equals("Open")) {
            seatRef.setText("Selected");
            seatRef.setStyle("-fx-background-color: orange;");
        } else if (seat.getText().equals("Selected")) {
            seatRef.setText("Open");
            seatRef.setStyle("-fx-background-color: white;");
            seatRef.getStylesheets().add("mycss.css");
        }
    }

    private Label getClickedLabelID(String id) {
        Label tempLabel = new Label();

        for (int i = 0; i < seatList.size(); i++) {
            tempLabel = seatList.get(i);

            if (tempLabel.getId().equals(id)) {
                return seatList.get(i);
            }
        }
        return null;
    }

    @FXML
    void clickPurchaseSeatsBtn(ActionEvent event) {
        Alert windowAlert = new Alert(Alert.AlertType.INFORMATION);
        Label tempLabel = new Label();

        ArrayList<String> purchasedSeats = new ArrayList<String>();

        int seatCounter = 0;
        try {
            if (!comboBoxSelectTime.getValue().toString().equals("Select Time")) {

                for (int i = 0; i < seatList.size(); i++) {
                    tempLabel = seatList.get(i);

                    if (tempLabel.getText().equals("Selected")) {
                        seatCounter++;
                        purchasedSeats.add(tempLabel.getId());
                    }
                }

                if (purchasedSeats.size() > 0) {

                    String seatsConfirmed = "";

                    for (int i = 0; i < purchasedSeats.size(); i++) {
                        seatsConfirmed += purchasedSeats.get(i);
                        seatsConfirmed += "\n";
                    }

                    windowAlert.setContentText("You purchased:\n\n" + seatsConfirmed);
                    windowAlert.setTitle("Reservation Confirmation");
                    windowAlert.showAndWait();


                    for (int i = 0; i < seatList.size(); i++) {
                        tempLabel = seatList.get(i);

                        if (tempLabel.getText().equals("Selected")) {
                            tempLabel.setText("Reserved");
                            tempLabel.setStyle("-fx-background-color: red;");
                        }
                    }
                    saveSeatingMap();
                } else {
                    windowAlert.setContentText("No seats were selected.");
                    windowAlert.setTitle("No selection.");
                    windowAlert.showAndWait();
                }
            } else {
                windowAlert.setContentText("You must select a time.");
                windowAlert.setTitle("Time not selected.");
                windowAlert.showAndWait();
            }
        } catch (Exception ex) {
            System.out.println(ex.toString() + " was caught and handled.");
            windowAlert.setContentText("Please make a selection.");
            windowAlert.setTitle("No selection.");
            windowAlert.showAndWait();
        }
    }

    @FXML
    void comboBoxSelectionChanged(ActionEvent event) {
        Label seatRef;
        if (!comboBoxSelectTime.getValue().toString().equals("Select Time")) {
            movieTitle.setText(movieTitleString + " (" +
                    comboBoxSelectTime.getValue().toString() + ")");
            loadSeats();

            for (int i = 0; i < seatList.size(); i++) {
                seatRef = seatList.get(i);
                seatRef.setDisable(false);
            }
        } else {
            movieTitle.setText(movieTitleString);

            for (int i = 0; i < seatList.size(); i++) {
                seatRef = seatList.get(i);
                seatRef.setDisable(true);
            }
        }

        for (int i = 0; i < seatList.size(); i++) {
            seatRef = seatList.get(i);

            if (seatRef.getText().toString().equals("Open")) {
                seatRef.setStyle("-fx-background-color: white;");
            } else if (seatRef.getText().toString().equals("Selected")) {
                seatRef.setText("Open");
                seatRef.setStyle("-fx-background-color: white;");
            }
        }
    }

    private void loadSeats() {
        if (comboBoxSelectTime.getValue().toString().equals("9:00 AM")) {
            currentMovie = currentTheater.getFirstShow();
        } else if (comboBoxSelectTime.getValue().toString().equals("10:00 AM")) {
            currentMovie = currentTheater.getSecondShow();
        } else if (comboBoxSelectTime.getValue().toString().equals("5:00 PM")) {
            currentMovie = currentTheater.getThirdShow();
        } else if (comboBoxSelectTime.getValue().toString().equals("9:00 PM")) {
            currentMovie = currentTheater.getFourthShow();
        } else
            currentMovie = null;

        Label seatReference = new Label();
        String[] seatStats = currentMovie.getSeating();

        for (int i = 0; i < 108; i++) {
            seatReference = seatList.get(i);
            seatReference.setText(seatStats[i]);

            if (seatReference.getText().equals("Reserved"))
                seatReference.setStyle("-fx-background-color: red;");
            else if (seatReference.getText().toString().equals("Open"))
                seatReference.setStyle("-fx-background: white;");
            else if (seatReference.getText().toString().equals("Selected")) {
                seatReference.setText("Open");
                seatReference.setStyle("-fx-background-color: white;");
            }
            seatList.set(i, seatReference);
        }

        currentMovie.setTitle(movieTitleString);
        System.out.println(movieTitleString);
    }


    @FXML
    void mouseEnterOpenSeat(MouseEvent event) {
        Label seatRef = (Label) event.getSource();

        if (seatRef.getText().equals("Open"))
            seatRef.setStyle("-fx-background-color: lightblue;");
    }

    @FXML
    void mouseExitOpenSeat(MouseEvent event) {
        Label seatRef = (Label) event.getSource();

        if (seatRef.getText().equals("Open"))
            seatRef.setStyle("-fx-background-color: white;");
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle.setText(movieTitle);
        movieTitleString = movieTitle;
    }

    public void loadTheaters(String id, Theater theater1, Theater theater2, Theater theater3,
                             Theater theater4, Theater theater5, Theater theater6) {
        currentTheaterID = id;

        if (id.equals("imageMovie1")) {
            currentMovie.setID(id);
            currentMovie.setTitle(movieTitleString);
            currentTheater = theater1;
        } else if (id.equals("imageMovie2")) {
            currentMovie.setID(id);
            currentMovie.setTitle(movieTitleString);
            currentTheater = theater2;
        } else if (id.equals("imageMovie3")) {
            currentMovie.setID(id);
            currentMovie.setTitle(movieTitleString);
            currentTheater = theater3;
        } else if (id.equals("imageMovie4")) {
            currentMovie.setID(id);
            currentMovie.setTitle(movieTitleString);
            currentTheater = theater4;
        } else if (id.equals("imageMovie5")) {
            currentMovie.setID(id);
            currentMovie.setTitle(movieTitleString);
            currentTheater = theater5;
        } else if (id.equals("imageMovie6")) {
            currentMovie.setID(id);
            currentMovie.setTitle(movieTitleString);
            currentTheater = theater6;
        }

        this.theater1 = theater1;
        this.theater2 = theater2;
        this.theater3 = theater3;
        this.theater4 = theater4;
        this.theater5 = theater5;
        this.theater6 = theater6;
    }


    private void saveSeatingMap() {
        Label tempLabel = new Label();

        for (int i = 0; i < 108; i++) {
            tempLabel = seatList.get(i);
            currentMovie.setSeat(i, tempLabel.getText());
        }

        currentMovie.setTitle(movieTitleString);
        currentMovie.setID(currentTheaterID);
        System.out.println("SaveSeatingMap() - " + movieTitleString);

        if (comboBoxSelectTime.getValue().toString().equals("9:00 AM")) {
            currentTheater.setFirstShow(currentMovie);
        } else if (comboBoxSelectTime.getValue().toString().equals("10:00 AM")) {
            currentTheater.setSecondShow(currentMovie);
        } else if (comboBoxSelectTime.getValue().toString().equals("5:00 PM")) {
            currentTheater.setThirdShow(currentMovie);
        } else if (comboBoxSelectTime.getValue().toString().equals("9:00 PM")) {
            currentTheater.setFourthShow(currentMovie);
        }

        if (currentTheaterID.equals("imageMovie1"))
            theater1 = currentTheater;
        else if (currentTheaterID.equals("imageMovie2"))
            theater2 = currentTheater;
        else if (currentTheaterID.equals("imageMovie3"))
            theater3 = currentTheater;
        else if (currentTheaterID.equals("imageMovie4"))
            theater4 = currentTheater;
        else if (currentTheaterID.equals("imageMovie5"))
            theater5 = currentTheater;
        else if (currentTheaterID.equals("imageMovie6"))
            theater6 = currentTheater;
    }
}