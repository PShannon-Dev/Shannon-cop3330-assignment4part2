package ucf.assignments;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Paul Shannon
 */
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class ToDoListController {

    @FXML
    private ListView<List> toDoLists;

    @FXML
    private TextField listName;

    public void remove_selected_list(javafx.event.ActionEvent actionEvent) {
        //select multiple using listOfLists.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        //remove selected lists from the json file
    }

    public void add_list(javafx.scene.input.MouseEvent mouseEvent) {
        //set list name to the textfield entry listName
    }

    public void open_list(MouseEvent mouseEvent) {
        //new scene
        //display new modal window List
    }
}

