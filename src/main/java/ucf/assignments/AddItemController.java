package ucf.assignments;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Paul Shannon
 */
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AddItemController {
    @FXML
    public TextField newItemDueDate;
    @FXML
    public TextArea newItemDescription;
    @FXML
    public Button saveButton;

    public void save_task(ActionEvent actionEvent) {
        try {
            //create item object, passing new input into it, completion is false by default
            Item newItem = new Item(newItemDescription.toString(),newItemDueDate.toString(), false);

            //adds item to arraylist
            ToDoList.mainList.add(newItem);
        }
        catch (Exception e){
            System.out.println("Invalid Data Entry...");
        }
    }
}