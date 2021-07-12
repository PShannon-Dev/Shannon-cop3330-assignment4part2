package ucf.assignments;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Paul Shannon
 */
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ResourceBundle;

public class ToDoListController implements Initializable{

    @FXML
    private ListView<String> ViewToDoList;

    @FXML
    private ChoiceBox<String> displayOptions;

    private String[] options = {"All Tasks", "Complete Tasks", "Incomplete Tasks"};


    public void open_item_add(ActionEvent actionEvent) {
        //open the add item dialog
        try {
            FXMLLoader addItemLoader = new FXMLLoader(getClass().getResource("AddItem.fxml"));
            Parent root = (Parent) addItemLoader.load();
            Stage stage = new Stage();

            stage.setTitle("Add Task");
            stage.setScene(new Scene(root));
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.show();

        } catch (Exception e) {
            System.out.println("There was an issue opening the Add Task Dialog...");
        }
    }

    public void remove_item(ActionEvent actionEvent) {
        //get selected item
        int index = ViewToDoList.getSelectionModel().getSelectedIndex();

        //remove from list
        ToDoList.mainList.remove(index);

        ViewToDoList.getItems().clear();
        display(actionEvent);
    }

    public void clear_list(ActionEvent actionEvent) {
        //clears list
        ToDoList.mainList.clear();
        ViewToDoList.getItems().addAll(getViewableList());

        //re-displays list as empty
        display(actionEvent);
    }

    public void save_list(ActionEvent actionEvent) {
        if(!ToDoList.hasDirectory){
                try {
                    FXMLLoader addItemLoader = new FXMLLoader(getClass().getResource("Directory.fxml"));
                    Parent root = (Parent) addItemLoader.load();
                    Stage stage = new Stage();

                    stage.setTitle("Add Task");
                    stage.setScene(new Scene(root));
                    stage.initModality(Modality.APPLICATION_MODAL);
                    stage.show();

                } catch (Exception e) {
                    System.out.println("There was an issue opening the Add Task Dialog...");
                }
            }
        else{
            //save json file
        }
    }

    public void open_task_edit_window(ActionEvent actionEvent) {
        //open the add item dialog
        try {
            FXMLLoader addItemLoader = new FXMLLoader(getClass().getResource("ManageItem.fxml"));
            Parent root = (Parent) addItemLoader.load();
            Stage stage = new Stage();

            stage.setTitle("Add Task");
            stage.setScene(new Scene(root));
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.show();

            //passes index of item to be editted
            ManageItemsController.indexToEdit = ViewToDoList.getSelectionModel().getSelectedIndex();
        } catch (Exception e) {
            System.out.println("There was an issue opening the Add Task Dialog...");
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //display options in choice box
        displayOptions.setValue("Display Options");
        displayOptions.getItems().addAll(options);
        displayOptions.setOnAction(this::display);
    }

    public void display(ActionEvent actionEvent){
        //gets selected option, calls function that to display correct tasks
        String choice = displayOptions.getValue();

        //handles event that choice box signifies
        if(choice.equals("All Tasks")){
            ViewToDoList.getItems().clear();
            for(int i = 0; i < ToDoList.mainList.size(); i ++){
                ViewToDoList.getItems().addAll(ToDoList.mainList.get(i).getDescription() + ToDoList.mainList.get(i).getDueDate());
            }
        }

        else if(choice.equals("Complete Tasks")){
            ViewToDoList.getItems().clear();
            //clear ListView prior to depicting

            //loops and determines completion status of each
            for (int i = 0; i < ToDoList.mainList.size(); i++) {
                if(ToDoList.mainList.get(i).isCompleted())
                    ViewToDoList.getItems().add(ToDoList.mainList.get(i).getDescription() + ToDoList.mainList.get(i).getDueDate());
            }
        }

        else {
            ViewToDoList.getItems().clear();
            //loops and determines completion status of each
            for (int i = 0; i < ToDoList.mainList.size(); i++) {
                if(!ToDoList.mainList.get(i).isCompleted())
                    ViewToDoList.getItems().add(ToDoList.mainList.get(i).getDescription() + ToDoList.mainList.get(i).getDueDate());
            }
        }
    }

    public ObservableList<String> getViewableList(){
        //creates array to return
        ObservableList<String> tempArray = FXCollections.observableArrayList();

        //iterates until list is empty
        for (int i = 0; i < ToDoList.mainList.size(); i ++){
            tempArray.add(ToDoList.mainList.get(i).getDescription().toString() + ToDoList.mainList.get(i).getDueDate().toString());
        }

        //returns arraylist
        return tempArray;
    }

    public void mark_complete(ActionEvent actionEvent) {
        //sets value of item in list to complete
        int indexToUpdate = ViewToDoList.getSelectionModel().getSelectedIndex();
        ToDoList.mainList.get(indexToUpdate).setCompletionStatus(true);
    }
}

