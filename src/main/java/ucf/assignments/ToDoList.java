package ucf.assignments;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Paul Shannon
 */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class ToDoList extends Application {

    public static ArrayList<Item> mainList = new ArrayList<Item>(100);

    public static void main(String[] args) {
        launch(args);
    }

    public boolean createJson(String path){
        File toDoJson = new File(path);

        //using path create folder
        return toDoJson.mkdir();
    }

    public static boolean hasDirectory = false;

    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ToDoList.fxml")));

            Scene scene = new Scene(root);

            primaryStage.setScene(scene);
            primaryStage.setTitle("ToDo List");
            primaryStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
