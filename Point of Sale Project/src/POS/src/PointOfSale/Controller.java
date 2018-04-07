package PointOfSale;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;


import java.util.Calendar;



public class Controller {

     public Controller(){

     }

    //date goes here
    @FXML
    private Text Date() {
        Calendar rightnow = Calendar.getInstance();

        return Date();
    }



    //database preview

    @FXML
    private TableView<?> Inventory;

    @FXML
    private TableColumn<?, ?> ID;

    @FXML
    private TableColumn<?, ?> Price;

    @FXML
    private TableColumn<?, ?> Name;


    //select button

    @FXML
    private Button select;


    /*
    Receipt preview
    */
    @FXML
    private TableColumn<?, ?> Pname;

    @FXML
    private TableColumn<?, ?> Pcost;

    @FXML
    private TableColumn<?, ?> Ptax;


    @FXML
    private TableView<?> Preview;

    @FXML
    private TextArea ItemPreview;



    @FXML
    private TextArea TotalItems;

    @FXML
    private TextArea SalesTotal;



    @FXML
    private Button clearOrder;

    @FXML
    private Button exit;


    //confirm order
    @FXML
    void confirmOrderClicked(ActionEvent event) {

       System.out.println("Confirm order clicked");


    }

    //clear order
    @FXML
    void clearOrderClicked(ActionEvent event) {


    }

    //end program
    @FXML
    void endProgramClicked(ActionEvent event) {

    }


    //add item to order
    @FXML
    void addItemToOrderClicked(ActionEvent event) {

    }

    //item removal
    @FXML
    void removeItemClicked(ActionEvent event) {



    }


    //coupon application
    @FXML
    void applyCouponClicked(ActionEvent event){

    }

}



