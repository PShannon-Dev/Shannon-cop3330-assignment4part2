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

import java.io.IOException;

public class ToDoList extends Application {

    public static void main(String[] args) {
        launch(args);

        //create file with pathname being on C: drive
        //try catch for file element

        //create jsonArray containing lists

    }

    public void loadFromFile(){
        //read json file contents
        //store all elements in array list
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("ToDoList.fxml"));

            Scene scene = new Scene(root);

            primaryStage.setScene(scene);
            primaryStage.setTitle("ToDoList");
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
