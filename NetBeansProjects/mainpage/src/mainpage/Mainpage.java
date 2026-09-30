/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpage;

import java.awt.Desktop;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URI;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Sonal
 */
public class Mainpage extends Application {
    
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        GridPane logo = new GridPane();
        Image img = new Image(new FileInputStream("C:\\Users\\Sonal\\OneDrive\\Documents\\NetBeansProjects\\mainpage\\src\\mainpage\\logo.png"));
        ImageView imageView =new ImageView(img);
        logo.add(imageView,0,0);      
        logo.setAlignment(Pos.CENTER);
        imageView.setFitHeight(100);
        
        imageView.setFitWidth(100);
        
        Menu menu1 = new Menu("HOME");
        Menu menu2 = new Menu("CHATBOT");
        Menu menu3 = new Menu("");
        Menu menu4 = new Menu("INTERNATIONAL NEWS");
        Menu menu5 = new Menu("NATIONAL NEWS");
        Menu menu6 = new Menu("LOCAL NEWS");


        MenuBar menuBar = new MenuBar();
        menuBar.setStyle("-fx-background-color:white;-fx-font-size:20px;-fx-padding:0px 30px 0px 30px;");
        menuBar.prefWidthProperty().bind(primaryStage.widthProperty());
        menuBar.getMenus().add(menu1);
        menuBar.getMenus().add(menu2);
        menuBar.getMenus().add(menu3);
        menuBar.getMenus().add(menu4);
        menuBar.getMenus().add(menu5);    
        menuBar.getMenus().add(menu6);
        
        
       
        
        
         Hyperlink hyperlink1 = new Hyperlink("UP Board 12th Time Table 2022: \nExam begins from March 24,\n download PDF here");
        hyperlink1.setStyle("-fx-text-fill:black;font-size:15px;-fx-font-weight:bold;");
        hyperlink1.setOnAction(e -> {
            if(Desktop.isDesktopSupported()){
                try {
                    Desktop.getDesktop().browse(new URI("https://timesofindia.indiatimes.com/home/education/news/up-board-12th-time-table-2022-exam-begins-from-march-24-download-pdf-here/articleshow/90372180.cms"));
                } catch (Exception er) {
                    System.out.println(er);
                }    
            }
        });
       
        
          Hyperlink hyperlink2 = new Hyperlink("UP Board 12th Time Table 2022: \nExam begins from March 24,\n download PDF here");
        hyperlink2.setStyle("-fx-text-fill:black;font-size:15px;-fx-font-weight:bold;");
        hyperlink2.setOnAction(e -> {
            if(Desktop.isDesktopSupported()){
                try {
                    Desktop.getDesktop().browse(new URI("https://timesofindia.indiatimes.com/home/education/news/up-board-12th-time-table-2022-exam-begins-from-march-24-download-pdf-here/articleshow/90372180.cms"));
                } catch (Exception er) {
                    System.out.println(er);
                }    
            }
        });
          Hyperlink hyperlink3 = new Hyperlink("UP Board 12th Time Table 2022: \nExam begins from March 24,\n download PDF here");
        hyperlink3.setStyle("-fx-text-fill:black;font-size:15px;-fx-font-weight:bold;");
        hyperlink3.setOnAction(e -> {
            if(Desktop.isDesktopSupported()){
                try {
                    Desktop.getDesktop().browse(new URI("https://timesofindia.indiatimes.com/home/education/news/up-board-12th-time-table-2022-exam-begins-from-march-24-download-pdf-here/articleshow/90372180.cms"));
                } catch (Exception er) {
                    System.out.println(er);
                }    
            }
        });
         GridPane news = new GridPane();
        Image imgnews1 = new Image(new FileInputStream("C:\\Users\\Sonal\\OneDrive\\Documents\\NetBeansProjects\\mainpage\\src\\mainpage\\12thexam.jpg"));
        ImageView imageViewnews1 =new ImageView(imgnews1);
        news.add(imageViewnews1,0,0);
        news.add (hyperlink1,0,1);
        //logo.setAlignment(Pos.CENTER);
        imageViewnews1.setFitHeight(200);
        imageViewnews1.setFitWidth(200);
        Image imgnews2 = new Image(new FileInputStream("C:\\Users\\Sonal\\OneDrive\\Documents\\NetBeansProjects\\mainpage\\src\\mainpage\\12thexam.jpg"));
        ImageView imageViewnews2 =new ImageView(imgnews2);
        news.add(imageViewnews2,1,0);
        news.add (hyperlink2,1,1);
        news.setVgap(30);
        news.setHgap(30);
        //logo.setAlignment(Pos.CENTER);
        imageViewnews2.setFitHeight(200);
        imageViewnews2.setFitWidth(200);
        
        Image imgnews3 = new Image(new FileInputStream("C:\\Users\\Sonal\\OneDrive\\Documents\\NetBeansProjects\\mainpage\\src\\mainpage\\12thexam.jpg"));
        ImageView imageViewnews3 =new ImageView(imgnews3);
        news.add(imageViewnews3,3,0);
        news.add (hyperlink3,3,1);
        imageViewnews3.setFitHeight(200);
        imageViewnews3.setFitWidth(200);
        
        
        GridPane tops =new GridPane();
        tops.add(logo,0,0);
        tops.add(menuBar,0,1);
   
        tops.add(news,0,2);
        tops.setAlignment(Pos.CENTER);
        tops.setVgap(20); 
        tops.setHgap(20);
        
       BorderPane ln = new BorderPane();
       ln.setTop(tops);
       
        
        
        Scene scene2 = new Scene(ln, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene2);
        
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
