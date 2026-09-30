/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Desktop;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URI;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
//import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.image.Image ;
import javafx.scene.image.ImageView;

/**
 *
 * @author Sonal
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
       /* Text heading= new Text("NEWS");
        //heading.setStyle(" -fx-fill:white;-fx-font-size:40px;-fx-padding:20px");
        VBox headingb=new VBox();
        //headingb.setStyle("-fx-background-color:black;");
        headingb.getChildren().add(heading);
        VBox news= new VBox();
        
        Hyperlink myHyperlink = new Hyperlink();
        myHyperlink.setText("My Link Text");

myHyperlink.setOnAction(e -> {
    if(Desktop.isDesktopSupported())
    {
        try {
            Desktop.getDesktop().browse(new URI("https://timesofindia.indiatimes.com/home/education/news/up-board-12th-time-table-2022-exam-begins-from-march-24-download-pdf-here/articleshow/90372180.cms"));
        } catch (Exception er) {
           System.out.println(er);
        }     
    }
});*/
//news.getChildren().add(myHyperlink);
Pane pane = new HBox(15);
Image img = new Image(new FileInputStream("C:\\Users\\Sonal\\OneDrive\\Documents\\NetBeansProjects\\main\\src\\main\\12thexam.jpg"));
pane.getChildren().add(new ImageView(img));


        
        Scene scene = new Scene(pane, 300, 250);
        //Scene scenev = new Scene(news1, 400, 350);
        
        primaryStage.setTitle("Hello World!");
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
