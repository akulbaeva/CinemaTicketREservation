package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javafx.scene.image.ImageView;

public class MovieShow  {

    private String id;
    private String title;
    private String date;
    private String time;
    private String theaterRoom;

    private String[] seats = new String[108];

    public MovieShow() {
        id = "None";
        title = "None";
        date = "None";
        time = "None";
        theaterRoom = "None";

        for (int i = 0; i < 108; i++) {
            seats[i] = "Open";
        }
    }

    public MovieShow(String id, String title, String date, String time,
                     String theaterRoom, String[] seats) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.time = time;
        this.theaterRoom = theaterRoom;
        this.seats = seats;
    }

    public void setID(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setRoom(String room) {
        this.theaterRoom = room;
    }

    public void setSeat(int i, String status) {
        seats[i] = status;
    }

    public String getID() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getRoom() {
        return theaterRoom;
    }

    public String[] getSeating() {
        return seats;
    }
}

