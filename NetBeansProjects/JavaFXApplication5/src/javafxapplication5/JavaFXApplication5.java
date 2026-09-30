/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication5;

import java.awt.Desktop;
import java.awt.Image;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.sql.*;
import java.sql.DriverManager;
import javafx.application.Application;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
import javax.imageio.ImageIO;

/**
 *
 * @author Sonal
 */
public class JavaFXApplication5 extends Application {
    
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
         GridPane logoc = new GridPane();
        javafx.scene.image.Image imgc = new javafx.scene.image.Image(new FileInputStream("C:\\Users\\Sonal\\OneDrive\\Documents\\NetBeansProjects\\JavaFXApplication5\\src\\javafxapplication5\\logo.png"));
        ImageView imageViewc =new ImageView(imgc);
        logoc.add(imageViewc,0,0);      
        logoc.setAlignment(Pos.CENTER);
        imageViewc.setFitHeight(100);
        
        imageViewc.setFitWidth(100);
        
        Menu menu1c = new Menu("HOME");
        Menu menu2c = new Menu("CHATBOT");
        Menu menu3c = new Menu("");
        Menu menu4c = new Menu("INTERNATIONAL NEWS");
        Menu menu5c = new Menu("NATIONAL NEWS");
        Menu menu6c = new Menu("LOCAL NEWS");


        MenuBar menuBarc = new MenuBar();
        menuBarc.setStyle("-fx-background-color:white;-fx-font-size:20px;-fx-padding:0px 30px 0px 30px;");
        menuBarc.prefWidthProperty().bind(primaryStage.widthProperty());
        menuBarc.getMenus().add(menu1c);
        menuBarc.getMenus().add(menu2c);
        menuBarc.getMenus().add(menu3c);
        menuBarc.getMenus().add(menu4c);
        menuBarc.getMenus().add(menu5c);    
        menuBarc.getMenus().add(menu6c);
        
        
        TextArea  messagec = new TextArea();
        
        messagec.setStyle("-fx-font-size:20px;");
        messagec.setPrefColumnCount(25);
        messagec.setPrefRowCount(50);
        Text newlinec = new Text();
        TextField umessc = new TextField();
        umessc.setStyle("-fx-font-size:20px;");
        umessc.setAlignment(Pos.CENTER);
        String text= umessc.getText();
        //text.getStyleClass().add("-fx-text-alignment: center;");

        //TextAreaField();
        Button btnc = new Button();
        btnc.setAlignment(Pos.CENTER);
        
        btnc.setText("Say 'Hello World'");
       
        VBox vboxc = new VBox();
        vboxc.setAlignment(Pos.CENTER);
        //Graphic ll = new Graphic();
        HBox hboxc = new HBox();
      hboxc.setSpacing(20);
      hboxc.getChildren().addAll(umessc, btnc);
      vboxc.getChildren().addAll(logoc,menuBarc,messagec,hboxc);
           vboxc.setSpacing(20);
        
       BorderPane footer= new BorderPane();
        footer.setBottom(footer);
        btnc.setOnAction(e->{
            
        
        
        try{
            
                 Class.forName("org.apache.derby.jdbc.ClientDriver");
                 Connection con2c =DriverManager.getConnection("jdbc:derby://localhost:1527/signup","signup","signup");
                 PreparedStatement ps2c=con2c.prepareStatement("select breply from bot where uinput = ?");
                 //message.appendText(ii);
                 
                 
                 ps2c.setString(1,(umessc.getText()));
                 //String newLine = System.getProperty("line.separator");
                 //Text.appendText("\n");
                 umessc.clear();
                 ResultSet rs=ps2c.executeQuery();
                 
           System.out.println("done231");
                 while(rs.next()){
                     
                    
                     String breply =rs.getString(1);
                     messagec.appendText(breply);
                    
                     System.out.println(breply);
                     
           System.out.println("done23");
                 }
                 
           System.out.println("done22");
             }
        catch(Exception e2c){
                 System.out.println(e2c);
                 
           System.out.println("done2");
             }
       
        });
        
        
        Scene scenec = new Scene(vboxc, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scenec);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
