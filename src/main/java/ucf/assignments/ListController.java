package ucf.assignments;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Paul Shannon
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class ListController {
    private String title;
    private boolean viewAll;
    private boolean viewComplete;
    private boolean viewIncomplete;

    @FXML
    private TextField listTitle;

    @FXML
    private ListView<?> itemList;

    @FXML
    private TextField itemTitle;

    @FXML
    private TextArea item_description;

    @FXML
    private TextField itemDueDate;

    public void edit_title(ActionEvent actionEvent) {
        //set list title to what TextFieldEntry
    }

    public void open_manage_items(MouseEvent mouseEvent) {
        //create new parent fmxlloader
        //open new scene 'manageItems' using ManageItemsController and FMXL
    }

    public void mark_complete(ActionEvent actionEvent) {
        //select multiple items getting ids of items within array
        //set boolean value for completion status to true
    }

    public void select_view_option(MouseEvent mouseEvent) {
        //if viewAll == true
            //display all items
        //else if viewComplete == true
            //display only items with completionStatus true
        //else
            //display only items with completionStatus false
    }

    public void display_description(MouseEvent mouseEvent) {
        //get description from class
        //display description in text box
    }

    public void add_item(ActionEvent actionEvent) {
        //create new item in array list
        //set item title to the textfield entry itemTitle
        //set item description to the textfield entry item_description
        //set item due date to the textfield entry itemDueDate

    }

    public void remove_selected(ActionEvent actionEvent) {
        //select multiple items
        //remove selected items from the arrayList
    }

    public void saveToFile(){
        //when list event is closed
        //get elements of arrayList
        //add to json file
    }


}
