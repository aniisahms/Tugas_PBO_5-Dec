/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2_5dec;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author suharso
 */
public class JavaFXApplication2_5Dec extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Register");
        
        Label register = new Label("Register");
        Rectangle rect = new Rectangle(5,95,150,30);
        rect.setFill(Color.BLACK);
        
        Label firstName = new Label("First Name");
        TextField tf1 = new TextField();
        
        Label lastName = new Label("Last Name");
        TextField tf2 = new TextField();
        
        Label email = new Label("E-Mail Address");
        TextField tf3 = new TextField();
        
        Label contact = new Label("Contact No");
        TextField tf4 = new TextField();
        
        Label pw = new Label("Password");
        TextField tf5 = new TextField();
        
        Label confirmPw = new Label("Confirm Password");
        TextField tf6 = new TextField();
        
        GridPane root = new GridPane();
        root.setVgap(10); 
        root.setHgap(20); 
        root.setAlignment(Pos.CENTER);
        
        GridPane.setFillWidth(firstName, true);
        firstName.setMaxWidth(Double.MAX_VALUE);
        firstName.setAlignment(Pos.CENTER_RIGHT);
        
        GridPane.setFillWidth(lastName, true);
        lastName.setMaxWidth(Double.MAX_VALUE);
        lastName.setAlignment(Pos.CENTER_RIGHT);
        
        GridPane.setFillWidth(email, true);
        email.setMaxWidth(Double.MAX_VALUE);
        email.setAlignment(Pos.CENTER_RIGHT);
        
        GridPane.setFillWidth(contact, true);
        contact.setMaxWidth(Double.MAX_VALUE);
        contact.setAlignment(Pos.CENTER_RIGHT);
        
        GridPane.setFillWidth(pw, true);
        pw.setMaxWidth(Double.MAX_VALUE);
        pw.setAlignment(Pos.CENTER_RIGHT);
        
        GridPane.setFillWidth(confirmPw, true);
        confirmPw.setMaxWidth(Double.MAX_VALUE);
        confirmPw.setAlignment(Pos.CENTER_RIGHT);
        
        root.add(rect, 0, 0);
        root.add(register, 0, 0);
        
        root.add(firstName, 0, 1);
        root.add(tf1, 1, 1);
        
        root.add(lastName, 0, 2);
        root.add(tf2, 1, 2);
        
        root.add(email, 0, 3);
        root.add(tf3, 1, 3);
        
        root.add(contact, 0, 4);
        root.add(tf4, 1, 4);
        
        root.add(pw, 0, 5);
        root.add(tf5, 1, 5);
        
        root.add(confirmPw, 0, 6);
        root.add(tf6, 1, 6);
        
        root.add(btn, 1, 7);
        
        register.setTextFill(Color.WHITE);
        btn.setTextFill(Color.WHITE);
        btn.setStyle("-fx-background-color: blue;");
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Register");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
