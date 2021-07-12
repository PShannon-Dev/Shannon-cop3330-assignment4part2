package ucf.assignments;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Paul Shannon
 */

public class ManageItemsController {

    @FXML
    private TextField newItemDueDate;

    @FXML
    private TextArea newItemDescription;
    public static int indexToEdit;

    public void save_task(ActionEvent actionEvent) {
        //sets item description value to the new description
        ToDoList.mainList.get(indexToEdit).setDescription(newItemDescription.toString());

        //sets item due date value to the new due date
        ToDoList.mainList.get(indexToEdit).setDueDate(newItemDueDate.toString());

    }
}

