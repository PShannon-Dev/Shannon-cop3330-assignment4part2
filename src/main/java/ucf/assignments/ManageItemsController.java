package ucf.assignments;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Paul Shannon
 */
public class ManageItemsController {

    @FXML
    private TextField itemTitle;

    @FXML
    private TextField itemDueDate;

    @FXML
    private TextArea itemDescription;

    @FXML
    private ListView<String> itemList;


    public void add_item(javafx.scene.input.MouseEvent mouseEvent) {
        //create new item in array list
        //set item title to the textfield entry itemTitle
        //set item description to the textfield entry item_description
        //set item due date to the textfield entry itemDueDate
    }

    public void remove_item(MouseEvent mouseEvent) {
        //select multiple items
        //remove selected items from the arraylist using ids
    }
}

