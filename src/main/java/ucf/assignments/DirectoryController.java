package ucf.assignments;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Paul Shannon
 */
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DirectoryController {
    @FXML
    private TextField directory;

    @FXML
    private Label Prompt;

    //set method for when it is called in the program
    public String getDirectory() {
        String temp = directory.getText();
        return temp;
    }


    //get directory in the ToDoList class to create file


    public void confirm_selection(ActionEvent actionEvent) {
        ToDoList ToDo = new ToDoList();

        //tries to take in string value for directory
        try {
            //pass directory to the ToDoList class to create a directory
            boolean check = ToDo.createJson(getDirectory());

            //if created open main window
            if(check){
                ToDoList.hasDirectory = true;
            }
            else{
                Prompt.setText("Sorry, this is not a valid entry.  Please enter a valid directory.");
            }
        }
        catch (Exception e){
            //print that it is not a valid entry
            Prompt.setText("Sorry, this is not a valid entry.  Please enter a valid directory.");
        }
    }
}
