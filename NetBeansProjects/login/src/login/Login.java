/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;
import com.sun.prism.paint.Color;
import java.awt.Desktop;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URI;
import java.sql.*;
import java.sql.DriverManager;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Sonal
 */
public class Login extends Application {
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
       //login page for user 
       
       Text headl =new Text("LOGIN");
       headl.setStyle("-fx-font-size:50px;");
       Label unamel =new Label("USERNAME ");
       Label passwordl =new Label("PASSWORD ");  
       TextField unamelt=new TextField();
       TextField passwordlt=new TextField();  
       Button signin = new Button("SIGN IN");        
       //Button signup = new Button("SIGN UP");
       Button signupl= new Button("SIGN UP");
       Image logimg = new Image(new FileInputStream("C:\\Users\\Sonal\\OneDrive\\Documents\\NetBeansProjects\\login\\src\\login\\book1.jpg"));
       BackgroundImage bg = new BackgroundImage(logimg,BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
       Background bg1 = new Background(bg);
       StackPane login_bg= new StackPane();
       GridPane gridPanel = new GridPane(); 
       //gridPanel.setStyle("-fx-background-fill:white;-fx-background-insets: 0, 1 ;");
       gridPanel.setStyle("-fx-background-color:white");
    
       login_bg.setOpacity(0.9);
       gridPanel.setMinWidth(300);
       gridPanel.setMaxWidth(300);
       gridPanel.setMinHeight(400);
       gridPanel.setMaxHeight(400);
       gridPanel.setPadding(new Insets(15, 15, 15, 15)); 
       gridPanel.setVgap(15); 
       gridPanel.setHgap(15);      
       gridPanel.setAlignment(Pos.CENTER);
       gridPanel.add(headl, 0, 0);
       gridPanel.add(unamel, 0, 1);  
       gridPanel.add(passwordl, 0, 2);
       gridPanel.add(unamelt, 1, 1); 
       gridPanel.add(passwordlt, 1, 2); 
       gridPanel.add(signin, 1,4);
       gridPanel.add(signupl,1,5);
       //gridPanel.add(signup,1,6);    
       login_bg.setBackground(new Background(bg));
       login_bg.getChildren().add(gridPanel);
      
     
      
       signin.disableProperty().bind(unamelt.textProperty().isEmpty());
       signin.disableProperty().bind(passwordlt.textProperty().isEmpty());
        
       
       Text head =new Text("SIGNUP");
       head.setStyle("-fx-font-size:50px;");
       Label fname =new Label("FIRST NAME ");
       Label lname =new Label("LAST NAME ");
       Label emailid =new Label("EMAIL ID ");
       Label uname =new Label("USERNAME ");
       Label password =new Label("PASSWORD ");
       TextField fname1=new TextField();
       TextField lname1=new TextField();
       TextField emailid1=new TextField();  
       TextField uname1=new TextField();
       TextField password1=new TextField();  
       Button signup = new Button("SIGN UP"); 
        
       signup.disableProperty().bind(fname1.textProperty().isEmpty());
       signup.disableProperty().bind(lname1.textProperty().isEmpty());
       signup.disableProperty().bind(emailid1.textProperty().isEmpty());
       signup.disableProperty().bind(uname1.textProperty().isEmpty());
       signup.disableProperty().bind(password1.textProperty().isEmpty());
        
       Pane pane = new HBox(15);
       Image img = new Image(new FileInputStream("C:\\Users\\Sonal\\OneDrive\\Documents\\NetBeansProjects\\login\\src\\login\\signup.jpg"));
       pane.getChildren().add(new ImageView(img));
       
       GridPane gridPane = new GridPane();  
       gridPane.setStyle("-fx-background-color:white;");
       gridPane.setMinSize(400, 200); 
       gridPane.setPadding(new Insets(10, 10, 10, 10)); 
       gridPane.setVgap(20); 
       gridPane.setHgap(20);      
       gridPane.setAlignment(Pos.CENTER);
       gridPane.add(head,0,0);
       gridPane.add(fname, 0, 1);  
       gridPane.add(lname, 0, 2); 
       gridPane.add(emailid, 0, 3); 
       gridPane.add(uname, 0,4);
       gridPane.add(password, 0,5);
       gridPane.add(fname1, 1, 1); 
       gridPane.add(lname1, 1, 2); 
       gridPane.add(emailid1, 1, 3); 
       gridPane.add(uname1, 1, 4); 
       gridPane.add(password1, 1, 5); 
       gridPane.add(signup, 1, 6);
       HBox login =new HBox();
       login.getChildren().add(gridPane);
       login.getChildren().add(pane);
        
         
        
       GridPane logo = new GridPane();
       Image imgg = new Image(new FileInputStream("C:\\Users\\Sonal\\OneDrive\\Documents\\NetBeansProjects\\login\\src\\login\\logo.png"));
       ImageView imageView =new ImageView(imgg);
       logo.add(imageView,0,0);      
       logo.setAlignment(Pos.CENTER);
       imageView.setFitHeight(100);
        
       imageView.setFitWidth(100);
        
       Menu menu1 = new Menu("HOME");
       Menu menu2 = new Menu("CHATBOT");
       Menu menu3 = new Menu("REMOVE ACCOUNT");
       Menu menu4 = new Menu("INTERNATIONAL");
       Menu menu5 = new Menu("NATIONAL");
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
                }
                catch (Exception er) {
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
        
           Hyperlink hyperlink4 = new Hyperlink("UP Board 12th Time Table 2022: \nExam begins from March 24,\n download PDF here");
        hyperlink4.setStyle("-fx-text-fill:black;font-size:15px;-fx-font-weight:bold;");
        hyperlink4.setOnAction(e -> {
            if(Desktop.isDesktopSupported()){
                try {
                    Desktop.getDesktop().browse(new URI("https://timesofindia.indiatimes.com/home/education/news/up-board-12th-time-table-2022-exam-begins-from-march-24-download-pdf-here/articleshow/90372180.cms"));
                } catch (Exception er) {
                    System.out.println(er);
                }    
            }
        });
        
         Hyperlink hyperlink5 = new Hyperlink("UP Board 12th Time Table 2022: \nExam begins from March 24,\n download PDF here");
        hyperlink5.setStyle("-fx-text-fill:black;font-size:15px;-fx-font-weight:bold;");
        hyperlink5.setOnAction(e -> {
            if(Desktop.isDesktopSupported()){
                try {
                    Desktop.getDesktop().browse(new URI("https://timesofindia.indiatimes.com/home/education/news/up-board-12th-time-table-2022-exam-begins-from-march-24-download-pdf-here/articleshow/90372180.cms"));
                } catch (Exception er) {
                    System.out.println(er);
                }    
            }
        });
       
        
          Hyperlink hyperlink6 = new Hyperlink("UP Board 12th Time Table 2022: \nExam begins from March 24,\n download PDF here");
        hyperlink6.setStyle("-fx-text-fill:black;font-size:15px;-fx-font-weight:bold;");
        hyperlink6.setOnAction(e -> {
            if(Desktop.isDesktopSupported()){
                try {
                    Desktop.getDesktop().browse(new URI("https://timesofindia.indiatimes.com/home/education/news/up-board-12th-time-table-2022-exam-begins-from-march-24-download-pdf-here/articleshow/90372180.cms"));
                } catch (Exception er) {
                    System.out.println(er);
                }    
            }
        });
          Hyperlink hyperlink7 = new Hyperlink("UP Board 12th Time Table 2022: \nExam begins from March 24,\n download PDF here");
        hyperlink7.setStyle("-fx-text-fill:black;font-size:15px;-fx-font-weight:bold;");
        hyperlink7.setOnAction(e -> {
            if(Desktop.isDesktopSupported()){
                try {
                    Desktop.getDesktop().browse(new URI("https://timesofindia.indiatimes.com/home/education/news/up-board-12th-time-table-2022-exam-begins-from-march-24-download-pdf-here/articleshow/90372180.cms"));
                } catch (Exception er) {
                    System.out.println(er);
                }    
            }
        });
        
           Hyperlink hyperlink8 = new Hyperlink("UP Board 12th Time Table 2022: \nExam begins from March 24,\n download PDF here");
        hyperlink8.setStyle("-fx-text-fill:black;font-size:15px;-fx-font-weight:bold;");
        hyperlink8.setOnAction(e -> {
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
        Image imgnews2 = new Image(new FileInputStream("C:\\Users\\Sonal\\OneDrive\\Documents\\NetBeansProjects\\login\\src\\login\\ukrain.jpg"));
        ImageView imageViewnews2 =new ImageView(imgnews2);
        news.add(imageViewnews2,1,0);
        news.add (hyperlink2,1,1);
        news.setVgap(30);
        news.setHgap(30);
        //logo.setAlignment(Pos.CENTER);
        imageViewnews2.setFitHeight(200);
        imageViewnews2.setFitWidth(200);
        
        Image imgnews3 = new Image(new FileInputStream("C:\\Users\\Sonal\\OneDrive\\Documents\\NetBeansProjects\\login\\src\\login\\tree.jpg"));
        ImageView imageViewnews3 =new ImageView(imgnews3);
        news.add(imageViewnews3,3,0);
        news.add (hyperlink3,3,1);
        imageViewnews3.setFitHeight(200);
        imageViewnews3.setFitWidth(200);
        
        Image imgnews4 = new Image(new FileInputStream("C:\\Users\\Sonal\\OneDrive\\Documents\\NetBeansProjects\\login\\src\\login\\login.jpg"));
        ImageView imageViewnews4 =new ImageView(imgnews4);
        news.add(imageViewnews4,4,0);
        news.add (hyperlink4,4,1);
        imageViewnews4.setFitHeight(200);
        imageViewnews4.setFitWidth(200);
        
        
        Image imgnews5 = new Image(new FileInputStream("C:\\Users\\Sonal\\OneDrive\\Documents\\NetBeansProjects\\login\\src\\login\\trer.jpg"));
        ImageView imageViewnews5 =new ImageView(imgnews5);
        news.add(imageViewnews5,0,2);
        news.add (hyperlink5,0,3);
        //logo.setAlignment(Pos.CENTER);
        imageViewnews5.setFitHeight(200);
        imageViewnews5.setFitWidth(200);
        Image imgnews6 = new Image(new FileInputStream("C:\\Users\\Sonal\\OneDrive\\Documents\\NetBeansProjects\\login\\src\\login\\tempp.jpg"));
        ImageView imageViewnews6 =new ImageView(imgnews6);
        news.add(imageViewnews6,1,2);
        news.add (hyperlink6,1,3);
        news.setVgap(30);
        news.setHgap(30);
        //logo.setAlignment(Pos.CENTER);
        imageViewnews6.setFitHeight(200);
        imageViewnews6.setFitWidth(200);
        
        Image imgnews7 = new Image(new FileInputStream("C:\\Users\\Sonal\\OneDrive\\Documents\\NetBeansProjects\\login\\src\\login\\red.jpg"));
        ImageView imageViewnews7 =new ImageView(imgnews7);
        news.add(imageViewnews7,3,2);
        news.add (hyperlink7,3,3);
        imageViewnews7.setFitHeight(200);
        imageViewnews7.setFitWidth(200);
        
        Image imgnews8 = new Image(new FileInputStream("C:\\Users\\Sonal\\OneDrive\\Documents\\NetBeansProjects\\login\\src\\login\\sea.jpg"));
        ImageView imageViewnews8 =new ImageView(imgnews8);
        news.add(imageViewnews8,4,2);
        news.add (hyperlink8,4,3);
        imageViewnews8.setFitHeight(200);
        imageViewnews8.setFitWidth(200);
        
        
        
        GridPane tops =new GridPane();
        tops.add(logo,0,0);
        tops.add(menuBar,0,1);
   
        tops.add(news,0,2);
        tops.setAlignment(Pos.CENTER);
        tops.setVgap(20); 
        tops.setHgap(20);
        
       BorderPane ln = new BorderPane();
       ln.setTop(tops);
       
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
        
        btnc.setText("SEND");
        Button btnn=new Button("BACK");
       
        VBox vboxc = new VBox();
        vboxc.setAlignment(Pos.CENTER);
        //Graphic ll = new Graphic();
        HBox hboxc = new HBox();
      hboxc.setSpacing(20);
      hboxc.getChildren().addAll(umessc, btnc);
      vboxc.getChildren().addAll(logoc,menuBarc,messagec,hboxc,btnn);
           vboxc.setSpacing(20);
        
      Button btnd = new Button("DELECT");
      Button bac= new Button("BACK");
    Label dele= new Label("ENTER USERNAME TO DELECT");
       TextField ti= new TextField(); 
       
       GridPane gg= new GridPane();      
       gg.add(dele,0,0);
         gg.add(ti,1,0);
       gg.add(btnd,0,1);    
       gg.add(bac,1,1);
        
        Scene scene2 = new Scene(ln, 300, 250);
        
         
         
         
          Scene scenen = new Scene(gg,250,300);
      Scene scene = new Scene(login, 300, 250);
      
              
       Scene scenel = new Scene(login_bg, 300, 250);
       //scenel.setFill(Color.BLACK);
       //login 
        signin.setOnAction(el->{
             
        try{
            
                 Class.forName("org.apache.derby.jdbc.ClientDriver");
                 Connection con2 =DriverManager.getConnection("jdbc:derby://localhost:1527/signup","signup","signup");
                 PreparedStatement ps2=con2.prepareStatement("select uname,password from signup where uname=? and password=?");
                 //message.appendText(ii);
                 
                 
                 ps2.setString(1,(unamelt.getText()));   
                 ps2.setString(2,(passwordlt.getText()));
               
                 ResultSet rs=ps2.executeQuery();
                 
          
                 System.out.println("done231");
                 
                 while(rs.next()){
                     
                    
                     String unamm =rs.getString(1);
                     String pass =rs.getString(2);
                     
                    
                     System.out.println(unamm);
                     System.out.println("done23");
           
             if(!(unamelt.getText().equals(unamm)) &&!( passwordlt.getText().equals(pass))){
             
           System.out.println("dooooooneeeeeee"); 
                 primaryStage.setScene(scene2);
                 
        }  
             
             
             
             
             
             
             
             
    
             
             else{
                 
                 primaryStage.setScene(scene);
                 //signin.setStyle("-fx-background-color:red;");
         System.out.println("doooooone"); 
             }
           System.out.println("done"); 
                 }
                 
           System.out.println("done22");
             }
        catch(Exception e2){
                 System.out.println(e2);
                 
           System.out.println("done2");
             }
       
        
       
                 
        }); 
         btnn.setOnAction(i ->
         {
             primaryStage.setScene(scene2);
             primaryStage.show();
         });
         //login signup button 
        signupl.setOnAction(ee ->
     {
          primaryStage.setScene(scene);
          primaryStage.show();
     });
       
        signup.setOnAction(e->{
             try{
                 Class.forName("org.apache.derby.jdbc.ClientDriver");
                 Connection con =DriverManager.getConnection("jdbc:derby://localhost:1527/signup","signup","signup");
                 PreparedStatement ps =con.prepareStatement("insert into signup(fname,lname,emailid,uname,password)values(?,?,?,?,?)");
                 ps.setString(1,fname1.getText());
                 
                 ps.setString(2,lname1.getText());
                 ps.setString(3,emailid1.getText());
                 ps.setString(4,uname1.getText());
                 ps.setInt(5,Integer.parseInt(password1.getText()));
                 int i = ps.executeUpdate();
                System.out.println("dsdsd");
                
                 primaryStage.setScene(scenel);
                         
                 
             }
             catch(Exception e1){
                 System.out.println(e1);
                 
                System.out.println("EEEEE");
             }
             
        });
        
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
        
        
        menu2.setOnAction(mm->{
            primaryStage.setScene(scenec);
        });
       
        
        signup.setOnAction(e->{
                 primaryStage.setScene(scenel);
        });
        menu3.setOnAction(tt->{
            
         primaryStage.setScene(scenen);
        });
        bac.setOnAction(eee->{
              
         primaryStage.setScene(scene2);
        });
            
        btnd.setOnAction(tt->{
        try{
            
                 Class.forName("org.apache.derby.jdbc.ClientDriver");
                 Connection con2d =DriverManager.getConnection("jdbc:derby://localhost:1527/signup","signup","signup");
                 PreparedStatement ps2d=con2d.prepareStatement("delete from signup where uname=? ");
                 //message.appendText(ii);
                 
                 
                 ps2d.setString(1,(ti.getText()));
                  ps2d.executeUpdate();
                 //String newLine = System.getProperty("line.separator");
                 //Text.appendText("\n")
                 
           System.out.println("done22");
             }
        catch(Exception e2){
                 System.out.println(e2);
                 
           System.out.println("done2");
             }
       
        });
       
      
 
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scenel);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
