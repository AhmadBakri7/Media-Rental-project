package application;
	
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import java.util.*;


public class Main extends Application {
	static MediaRentalManger R = new MediaRentalManger();
	@Override
	public void start(Stage primaryStage) {

		 primaryStage.setMaximized(true);
		 
		 GridPane GP = new  GridPane();
		 GP.setPadding(new Insets(10));
		 GP.setVgap(20);
		 GP.setHgap(10);
		 GP.setStyle("-fx-background-color:000000");
		 
		 Image image = new Image ("Mediamarkt.png");
		 //System.out.println(image.errorProperty());
		 ImageView imageview = new ImageView();
		 imageview.setImage(image);
		 
		 imageview.setFitHeight(250);
		 imageview.setFitWidth(700);
		 
		 Font myfont = Font.font("Roboto",FontWeight.BOLD,FontPosture.ITALIC,50);
		 Label label = new Label("Rental Media System");
		// label.setFont(new Font("Cambria",40));
		 label.setFont(myfont);
		 Button B1 = new Button("");
		 Button B2 = new Button("");
		 Button B3 = new Button("");
		 Button B4 = new Button("File Writer");
		 Button B5 = new Button("Exit");
		 
		 GP.add(imageview, 20, 1);
		 GP.add(B1, 6, 1);
		 GP.add(B2, 6, 2);
		 GP.add(B3, 6, 4);
         GP.add(label, 20, 3);
         GP.add(B4, 22, 1);
         GP.add(B5, 22, 4);
         
         Image imagec = new Image ("Customer4.jpg");
		 //System.out.println(image.errorProperty());
		 ImageView imageviewc = new ImageView();
		 imageviewc.setImage(imagec);
         B1.setGraphic(imageviewc);
         imageviewc.setFitHeight(150);
		 imageviewc.setFitWidth(300);
		 
		  Image imagem = new Image ("Media1.jpg");
			 //System.out.println(image.errorProperty());
			 ImageView imageviewm = new ImageView();
			 imageviewm.setImage(imagem);
	         B2.setGraphic(imageviewm);
	         imageviewm.setFitHeight(150);
			 imageviewm.setFitWidth(300);
			 
		 Image imager = new Image ("Rent33.jpg");
			 //System.out.println(image.errorProperty());
			 ImageView imageviewr = new ImageView();
			 imageviewr.setImage(imager);
	         B3.setGraphic(imageviewr);
	         imageviewr.setFitHeight(150);
			 imageviewr.setFitWidth(300);
			 
			// B4.setMaxHeight(300);
			// B4.setMaxWidth(500);
			 B4.setPrefSize(300, 800);
			 B5.setPrefSize(100, 100);
			 
			 B5.setOnAction(p22->{
				 primaryStage.close();
			 });
         
         B1.setOnAction(q->{
        	 
        	 Stage cust = new Stage();
        	 //cust.setMaximized(true);
        	 
        	 VBox vBoxCust = new VBox(10);
        	 vBoxCust.setStyle("-fx-background-color:e1e2df");
        	 vBoxCust.setAlignment(Pos.CENTER);
        	 vBoxCust.setPadding(new Insets(10));
        	 
    		 Button C1 = new Button("Add new Customer");
    		 Button C2 = new Button("Delete Customer");
    		 Button C3 = new Button("Update Information about Customer");
    		 Button C4 = new Button("Search a Customer by id");
    		 Button C5 = new Button("Return to main page");
   		 
    		 C1.setStyle("-fx-text-fill:#0000ff;-fx-background-radius:10px");
    		 C2.setStyle("-fx-text-fill:#0000ff;-fx-background-radius:10px");
    		 C3.setStyle("-fx-text-fill:#0000ff;-fx-background-radius:10px");
    		 C4.setStyle("-fx-text-fill:#0000ff;-fx-background-radius:10px");
    		 C5.setStyle("-fx-text-fill:#0000ff;-fx-background-radius:10px");
    		 
    		 
    		 vBoxCust.getChildren().addAll(C1,C2,C3,C4,C5);
    		 
    		 C1.setOnAction(w->{
    			 
    			 Stage AddCust = new Stage();
    			 
    			 GridPane GP2 = new GridPane();
    			 GP2.setVgap(20);
    			 GP2.setHgap(20);
    			 GP2.setStyle("-fx-background-color:e1e2df");
            	
    			 Label lA1 = new Label("Customer ID:");
    			 TextField TlA1 = new TextField("");
    			  			
    			 
    			 Label lA2 = new Label("Customer Name");
    			 TextField TlA2 = new TextField(""); 
    			 TlA2.setDisable(true);
    			 TlA1.setOnKeyTyped(p9->{
    				 TlA2.setDisable(false);
    			 });
    			 
    			 //TlA2.setText("Ahmad");
    			 Label lA3 = new Label("Customer Address");
    			 TextField TlA3 = new TextField("");   
    			 TlA3.setDisable(true);
    			 TlA2.setOnKeyTyped(p8->{
    				 TlA3.setDisable(false);
    			 });
    			 
    			 Label lA4 = new Label("Customer Mobile");
    			 TextField TlA4 = new TextField(""); 
    			 TlA4.setDisable(true);
    			 TlA3.setOnKeyTyped(p7->{
    				 TlA4.setDisable(false);
    			 });
    			 
    			 Label lA5 = new Label("Customer plan");
    			 TextField TlA5 = new TextField("");
    			 TlA5.setDisable(true);
    			 TlA4.setOnKeyTyped(p6->{
    				 TlA5.setDisable(false);
    			 });
    		 
    			 
    			 Button pA1 =new Button("Add");
    			 Button pA2 =new Button("Back");
    			 
    			 pA1.setOnAction(M->{
    				 
    				 R.addCustomer(TlA1.getText(), TlA2.getText(), TlA3.getText(), TlA4.getText(), TlA5.getText());
    				 TlA1.clear();
    				  TlA2.clear();
    				   TlA3.clear();
    				    TlA4.clear();
    				     TlA5.clear();
    			 });
    			 pA2.setOnAction(N->{
    				 
    				 AddCust.close();	 
    			 });		 
    			 
    			 Image image1 = new Image ("https://img.icons8.com/nolan/344/add.png");
    			 ImageView imageview1 = new ImageView();
    			 imageview1.setImage(image1);
    			 imageview1.setPreserveRatio(true);
    			 
    			 Image image2 = new Image ("https://img.icons8.com/nolan/344/back.png");
    			 ImageView imageview2 = new ImageView();
    			 imageview2.setImage(image2);
    			 imageview2.setPreserveRatio(true);
			 
    			 pA1.setGraphic(imageview1);
    			 imageview1.setFitHeight(35);	 
    			 imageview1.setFitWidth(40);
    			 
    			 pA2.setGraphic(imageview2);
    			 imageview2.setFitHeight(35);	 
    			 imageview2.setFitWidth(40);
    			 		 
    			   GP2.addRow(1, lA1 ,TlA1);
    			   GP2.addRow(3, lA2 ,TlA2);
    			   GP2.addRow(5, lA3 ,TlA3);
    			   GP2.addRow(7, lA4 ,TlA4);
    			   GP2.addRow(9, lA5 ,TlA5);
    			   GP2.add(pA1, 1, 10);
    			   GP2.add(pA2, 5, 10);

    			   Scene s1 = new Scene(GP2,500,450);
    			   AddCust.setScene(s1);
    			   AddCust.setTitle("Add Customer");
    			   AddCust.show();
    			   
    			 
    		 });
    		 C2.setOnAction(e->{
                 Stage DeleteCust = new Stage();
    			 
                 
    			 GridPane GP3 = new GridPane();
            	 GP3.setStyle("-fx-background-color:e1e2df");
    			 GP3.setVgap(20);
    			 GP3.setHgap(20);
            	
    			 Label lD1 = new Label("Customer ID:");
    			 TextField TlD1 = new TextField("");
    			 
    			 Label lD2 = new Label("Customer Name");
    			 TextField TlD2 = new TextField("");
    			 
    			 Label lD3 = new Label("Customer Address");
    			 TextField TlD3 = new TextField("");
    			 
    			 Label lD4 = new Label("Customer Mobile");
    			 TextField TlD4 = new TextField("");
    			 
    			 Label lD5 = new Label("Customer plane");
    			 TextField TlD5 = new TextField("");
    			 
    			 Button pD1 =new Button("Delete");
    			 Button pD2 =new Button("Back");
    			 Button pD3 = new Button("Find");
    			 
    			 pD1.setOnAction(B->{
    				 
    				 for (int i=0;i<R.getCustomer().size();i++) {
    					 if (R.getCustomer().get(i).getID().equals(TlD1.getText())) {
    						 
    						 R.getCustomer().remove(R.getCustomer().get(i));
    					 }
    				 }
    			 });
    			 pD2.setOnAction(V->{
    				 DeleteCust.close();
    			 });
    			 pD3.setOnAction(C->{
    				 
    				 for (int i=0;i<R.getCustomer().size();i++) {
    					 if (R.getCustomer().get(i).getID().equals(TlD1.getText())) {
    						 
    						 TlD2.setText(R.getCustomer().get(i).getName());
    						 TlD3.setText(R.getCustomer().get(i).getAddress());
    						 TlD4.setText(R.getCustomer().get(i).getMobileNumber());
    						 TlD5.setText(R.getCustomer().get(i).getPlan()); 						 
    					 }
    				 }
    			 });
    			 
    			 Image image3 = new Image ("Delete3.jpg");
    			 ImageView imageview3 = new ImageView();
    			 imageview3.setImage(image3);
    			 
    			 Image image4 = new Image ("https://img.icons8.com/nolan/344/back.png");
    			 ImageView imageview4 = new ImageView();
    			 imageview4.setImage(image4);
    			 
    			 Image image5 = new Image ("https://img.icons8.com/external-kiranshastry-gradient-kiranshastry/344/external-find-hotel-kiranshastry-gradient-kiranshastry.png");
    			 ImageView imageview5 = new ImageView();
    			 imageview5.setImage(image5);
			 
    			 pD1.setGraphic(imageview3);
    			 imageview3.setFitHeight(35);	 
    			 imageview3.setFitWidth(40);
    			 
    			 pD2.setGraphic(imageview4);
    			 imageview4.setFitHeight(35);	 
    			 imageview4.setFitWidth(40);
    			 
    			 pD3.setGraphic(imageview5);
    			 imageview5.setFitHeight(35);	 
    			 imageview5.setFitWidth(40);
    			 
    			   GP3.addRow(1, lD1 ,TlD1);
    			   GP3.addRow(3, lD2 ,TlD2);
    			   GP3.addRow(5, lD3 ,TlD3);
    			   GP3.addRow(7, lD4 ,TlD4);
    			   GP3.addRow(9, lD5 ,TlD5);
    			   GP3.add(pD1, 3, 10);
    			   GP3.add(pD2, 6, 10);
    			   GP3.add(pD3, 1, 10);

    			   Scene s2 = new Scene(GP3,500,450);
    			   DeleteCust.setScene(s2);
    			   DeleteCust.setTitle("Delete Customer");
    			   DeleteCust.show();
    		 });
    		 C3.setOnAction(r->{
    			  Stage updateCust = new Stage();
     			 
     			 GridPane GP4 = new GridPane();
            	 GP4.setStyle("-fx-background-color:e1e2df");
     			 GP4.setVgap(20);
     			 GP4.setHgap(20);
     			 
     		 Label lU1 = new Label("Customer ID:");
   			 TextField TlU1 = new TextField("");
   			 
   			 Label lU2 = new Label("Customer Name");
   			 TextField TlU2 = new TextField("");
   			 
   			 Label lU3 = new Label("Customer Address");
   			 TextField TlU3 = new TextField("");
   			 
   			 Label lU4 = new Label("Customer Mobile");
   			 TextField TlU4 = new TextField("");
   			 
   			 Label lU5 = new Label("Customer plan");
   			 TextField TlU5 = new TextField("");
   			 
   			 Button pU1 =new Button("update");
			 Button pU2 =new Button("Back");
			 Button pU3 = new Button("Find");
			 
			 pU1.setOnAction(X->{
				 
				 for (int i =0 ;i<R.getCustomer().size();i++) {					 
					 if (R.getCustomer().get(i).getID().equals(TlU1.getText())) {
						 
						 R.getCustomer().get(i).setName(TlU2.getText());
						 R.getCustomer().get(i).setAddress(TlU3.getText());
						 R.getCustomer().get(i).setMobileNumber(TlU4.getText());
						 R.getCustomer().get(i).setPlan(TlU5.getText());
						 
						 
					 }
				 }
			 });
			 pU2.setOnAction(Z->{
				 updateCust.close();
			 });
			 pU3.setOnAction(L->{
				 for (int i =0 ;i<R.getCustomer().size();i++) {					 
					 if (R.getCustomer().get(i).getID().equals(TlU1.getText())) {
						 
						 TlU2.setText(R.getCustomer().get(i).getName());
						 TlU3.setText(R.getCustomer().get(i).getAddress());
						 TlU4.setText(R.getCustomer().get(i).getMobileNumber());
						 TlU5.setText(R.getCustomer().get(i).getPlan()); 
					 }
				 }
				 
			 });
			 
			 Image image6 = new Image ("https://img.icons8.com/nolan/344/approve-and-update.png");
			 ImageView imageview6 = new ImageView();
			 imageview6.setImage(image6);
			 
			 Image image7 = new Image ("https://img.icons8.com/nolan/344/back.png");
			 ImageView imageview7 = new ImageView();
			 imageview7.setImage(image7);
			 
			 Image image8 = new Image ("https://img.icons8.com/external-kiranshastry-gradient-kiranshastry/344/external-find-hotel-kiranshastry-gradient-kiranshastry.png");
			 ImageView imageview8 = new ImageView();
			 imageview8.setImage(image8);
		 
			 pU1.setGraphic(imageview6);
			 imageview6.setFitHeight(35);	 
			 imageview6.setFitWidth(40);
			 
			 pU2.setGraphic(imageview7);
			 imageview7.setFitHeight(35);	 
			 imageview7.setFitWidth(40);
			 
			 pU3.setGraphic(imageview8);
			 imageview8.setFitHeight(35);	 
			 imageview8.setFitWidth(40);
			 
			   GP4.addRow(1, lU1 ,TlU1);
			   GP4.addRow(3, lU2 ,TlU2);
			   GP4.addRow(5, lU3 ,TlU3);
			   GP4.addRow(7, lU4 ,TlU4);
			   GP4.addRow(9, lU5 ,TlU5);
			   GP4.add(pU1, 3, 10);
			   GP4.add(pU2, 6, 10);
			   GP4.add(pU3, 1, 10);
			   
			   Scene s3 = new Scene(GP4,500,450);
			   updateCust .setScene(s3);
			   updateCust .setTitle("Update Info about Customer");
			   updateCust.show();
    		 });
    		 C4.setOnAction(t->{
                 Stage searchCust = new Stage();
     			 
     			 GridPane GP5 = new GridPane();
            	 GP5.setStyle("-fx-background-color:e1e2df");
     			 GP5.setVgap(20);
     			 GP5.setHgap(20);
     			 
     			 Label lS1 = new Label("Customer ID:");
      			 TextField TlS1 = new TextField("");
      			 
      			 Label lS2 = new Label("Customer Name");
      			 TextField TlS2 = new TextField("");
      			 
      			 Label lS3 = new Label("Customer Address");
      			 TextField TlS3 = new TextField("");
      			 
      			 Label lS4 = new Label("Customer Mobile");
      			 TextField TlS4 = new TextField("");
      			 
      			 Label lS5 = new Label("Customer plane");
      			 TextField TlS5 = new TextField("");
      			 
      			 Button pS1 =new Button("search");
    			 Button pS2 =new Button("Back");
    			 
    			 pS1.setOnAction(K->{
    				 for (int i =0 ;i<R.getCustomer().size();i++) {					 
    					 if (R.getCustomer().get(i).getID().equals(TlS1.getText())) {
    						 
    						 TlS2.setText(R.getCustomer().get(i).getName());
    						 TlS3.setText(R.getCustomer().get(i).getAddress());
    						 TlS4.setText(R.getCustomer().get(i).getMobileNumber());
    						 TlS5.setText(R.getCustomer().get(i).getPlan()); 
    					 }
    				 }
    			 });
    			 pS2.setOnAction(J->{
    				 searchCust.close();
    			 });
    			 
    			 Image image9 = new Image ("https://img.icons8.com/external-icongeek26-linear-colour-icongeek26/344/external-search-project-work-icongeek26-linear-colour-icongeek26.png");
    			 ImageView imageview9 = new ImageView();
    			 imageview9.setImage(image9);
    			 
    			 Image image10 = new Image ("https://img.icons8.com/nolan/344/back.png");
    			 ImageView imageview10 = new ImageView();
    			 imageview10.setImage(image10);
			 
    			 pS1.setGraphic(imageview9);
    			 imageview9.setFitHeight(35);	 
    			 imageview9.setFitWidth(40);
    			 
    			 pS2.setGraphic(imageview10);
    			 imageview10.setFitHeight(35);	 
    			 imageview10.setFitWidth(40);
    			 
    			 
    		   GP5.addRow(1, lS1 ,TlS1);
  			   GP5.addRow(3, lS2 ,TlS2);
  			   GP5.addRow(5, lS3 ,TlS3);
  			   GP5.addRow(7, lS4 ,TlS4);
  			   GP5.addRow(9, lS5 ,TlS5);
  			   GP5.add(pS1, 3, 10);
  			   GP5.add(pS2, 6, 10);
    			 
    			 Scene s4 = new Scene(GP5,500,450);
    			 searchCust .setScene(s4);
    			 searchCust .setTitle("search Customer By id");
    			 searchCust.show();
    		 });
    		 C5.setOnAction(y->{
    			 cust.close();
    		 });
    		 Scene custS = new Scene(vBoxCust,300,300);
    		 cust.setTitle("About Customer");
    		 cust.setScene(custS);
    		 cust.show();
    		 
         });
         
       B2.setOnAction(u->{
    	   
    	   Stage Med = new Stage();
    	   
    	   VBox vboxmedia = new VBox(10);
      	   vboxmedia.setStyle("-fx-background-color:e1e2df");
    	   vboxmedia.setAlignment(Pos.CENTER);
    	   vboxmedia.setPadding(new Insets(10));
    	   
      	 Button M1 = new Button("Add new Media");
		 Button M2 = new Button("Delete Media");
		 Button M3 = new Button("Update Information about Media");
		 Button M4 = new Button("Search a Media by code");
		 Button M5 = new Button("Print All Media information");
		 Button M6 = new Button("Return to main page");
		 
		 M1.setStyle("-fx-text-fill:#0000ff;-fx-background-radius:10px");
		 M2.setStyle("-fx-text-fill:#0000ff;-fx-background-radius:10px");
		 M3.setStyle("-fx-text-fill:#0000ff;-fx-background-radius:10px");
		 M4.setStyle("-fx-text-fill:#0000ff;-fx-background-radius:10px");
		 M5.setStyle("-fx-text-fill:#0000ff;-fx-background-radius:10px");
		 M6.setStyle("-fx-text-fill:#0000ff;-fx-background-radius:10px");
      
		// vboxmedia.setStyle("-fx-background-color:black");
		 vboxmedia.getChildren().addAll(M1,M2,M3,M4,M5,M6);
          
		 M1.setOnAction(i->{
			 Stage Addmed = new Stage();
			 
			 GridPane SP = new GridPane();
        	 SP.setStyle("-fx-background-color:e1e2df");
			 SP.setAlignment(Pos.CENTER);
			 
			 ComboBox <String> cb = new ComboBox<>();
			 cb.getItems().addAll("Movie","Album","Game");
			 Button Backk = new Button("Back");
			 
			 SP.addRow(0, cb);
			 SP.addRow(2, Backk);
			 Backk.setOnAction(h1->{
				 Addmed.close();
			 });
			 cb.setOnAction(o->{
				 
				 if (cb.getValue().equals("Movie")){
					 
					 Stage Mov = new Stage();
					 
					 GridPane MovB = new GridPane();
		        	 MovB.setStyle("-fx-background-color:e1e2df");
					 MovB.setVgap(10);
					 MovB.setHgap(10);
					 MovB.setPadding(new Insets(10));
					 
					 Label Movl = new Label("Code:");
		   			 TextField Movt = new TextField("");
		   			 
		   			 Label Movl1 = new Label("Title");
		   			 TextField Movt1 = new TextField("");
		   			 
		   			 Label Movl2 = new Label("NumberOfcopies");
		   			 TextField Movt2 = new TextField("");
		   			 
		   			 Label Movl3 = new Label("Rating");
		   			 TextField Movt3 = new TextField("");
		   			 
		   			 Button MovB1 =new Button("Add");
					 Button MovB2=new Button("Back");
					 
					 MovB1.setOnAction(H->{
					  R.addMovie(Movt.getText(), Movt1.getText(), Integer.parseInt(Movt2.getText()), Movt3.getText());
					  Movt.clear();
					   Movt1.clear();
					    Movt2.clear();
					     Movt3.clear();
					 });
					 MovB2.setOnAction(G->{
						 Mov.close();
					 });
					 
					 Image imagemov1 = new Image ("https://img.icons8.com/nolan/344/add.png");
	    			 ImageView imageviewmov1 = new ImageView();
	    			 imageviewmov1.setImage(imagemov1);
	    			 
	    			 Image imagemov2 = new Image ("https://img.icons8.com/nolan/344/back.png");
	    			 ImageView imageviewmov2 = new ImageView();
	    			 imageviewmov2.setImage(imagemov2);
				 
	    			 MovB1.setGraphic(imageviewmov1);
	    			 imageviewmov1.setFitHeight(35);	 
	    			 imageviewmov1.setFitWidth(40);
	    			 
	    			 MovB2.setGraphic(imageviewmov2);
	    			 imageviewmov2.setFitHeight(35);	 
	    			 imageviewmov2.setFitWidth(40);
		   			 
					 MovB.addRow(1, Movl ,Movt);
					 MovB.addRow(3, Movl1 ,Movt1);
					 MovB.addRow(5, Movl2 ,Movt2);
					 MovB.addRow(7, Movl3 ,Movt3);
					 MovB.add(MovB1, 3, 10);
					 MovB.add(MovB2, 6, 10);
					 
					 Scene mov = new Scene (MovB,500,300);
					 Mov.setScene(mov);
					 Mov.setTitle("Add new movie");
					 Mov.show();				 				 
				 }
				 
				 else if (cb.getValue().equals("Album")) {
					 
                     Stage Alb = new Stage();
					 
					 GridPane AlbB = new GridPane();
		        	 AlbB.setStyle("-fx-background-color:e1e2df");
					 AlbB.setVgap(10);
					 AlbB.setHgap(10);
					 AlbB.setPadding(new Insets(10));
					 
					 Label Albl = new Label("Code:");
		   			 TextField Albt = new TextField("");
		   			 
		   			 Label Albl1 = new Label("Title");
		   			 TextField Albt1 = new TextField("");
		   			 
		   			 Label Albl2 = new Label("NumberOfcopies");
		   			 TextField Albt2 = new TextField("");
		   			 
		   			 Label Albl3 = new Label("Artist");
		   			 TextField Albt3 = new TextField("");
		   			 
		   			 Label Albl4 = new Label("song");
		   			 TextField Albt4 = new TextField("");
		   			 
		   			 Button AlbB1 =new Button("Add");
					 Button AlbB2=new Button("Back");
					 
					 AlbB1.setOnAction(F->{
						 R.addAlbum(Albt.getText(), Albt1.getText(), Integer.parseInt(Albt2.getText()), Albt3.getText(), Albt4.getText());
						 Albt.clear();
						  Albt1.clear();
						   Albt2.clear();
						    Albt3.clear();
						     Albt4.clear();
					 });
					 AlbB2.setOnAction(D->{
						 Alb.close();
					 });
					 
					 Image imageAlb1 = new Image ("https://img.icons8.com/nolan/344/add.png");
	    			 ImageView imageviewAlb1 = new ImageView();
	    			 imageviewAlb1.setImage(imageAlb1);
	    			 
	    			 Image imageAlb2 = new Image ("https://img.icons8.com/nolan/344/back.png");
	    			 ImageView imageviewAlb2 = new ImageView();
	    			 imageviewAlb2.setImage(imageAlb2);
				 
	    			 AlbB1.setGraphic(imageviewAlb1);
	    			 imageviewAlb1.setFitHeight(35);	 
	    			 imageviewAlb1.setFitWidth(40);
	    			 
	    			 AlbB2.setGraphic(imageviewAlb2);
	    			 imageviewAlb2.setFitHeight(35);	 
	    			 imageviewAlb2.setFitWidth(40);
		   			 
	    			 AlbB.addRow(1, Albl ,Albt);
	    			 AlbB.addRow(3, Albl1 ,Albt1);
	    			 AlbB.addRow(5, Albl2 ,Albt2);
	    			 AlbB.addRow(7, Albl3 ,Albt3);
	    			 AlbB.addRow(9, Albl4 ,Albt4);
	    			 AlbB.add(AlbB1, 3, 11);
	    			 AlbB.add(AlbB2, 6, 11);
					 
					 Scene Album = new Scene (AlbB,400,400);
					 Alb.setScene(Album);
					 Alb.setTitle("Add new Album");
					 Alb.show();
				 }
				 
                 else if (cb.getValue().equals("Game")) {
					 
                     Stage Gam = new Stage();
					 
					 GridPane GameB = new GridPane();
		        	 GameB.setStyle("-fx-background-color:e1e2df");
					 GameB.setVgap(10);
					 GameB.setHgap(10);
					 GameB.setPadding(new Insets(10));
					 
					 Label Gamel = new Label("Code:");
		   			 TextField Gamet = new TextField("");
		   			 
		   			 Label Gamel1 = new Label("Title");
		   			 TextField Gamet1 = new TextField("");
		   			 
		   			 Label Gamel2 = new Label("NumberOfcopies");
		   			 TextField  Gamet2 = new TextField("");
		   			 
		   			 Label Gamel3 = new Label("Weight");
		   			 TextField Gamet3 = new TextField("");
		   			 
		   			 Button GameB1 =new Button("Add");
					 Button GameB2=new Button("Back");
					 
					 GameB1.setOnAction(S->{
						 R.addGame(Gamet.getText(), Gamet1.getText(), Integer.parseInt(Gamet2.getText()), Double.parseDouble(Gamet3.getText()));
						 Gamet.clear();
						  Gamet1.clear();
						   Gamet2.clear();
						    Gamet3.clear();
					 });
					 GameB2.setOnAction(Q->{
						 Gam.close();
					 });
					 
					 Image imageGame1 = new Image ("https://img.icons8.com/nolan/344/add.png");
	    			 ImageView imageviewGame1 = new ImageView();
	    			 imageviewGame1.setImage(imageGame1);
	    			 
	    			 Image imageGame2 = new Image ("https://img.icons8.com/nolan/344/back.png");
	    			 ImageView imageviewGame2 = new ImageView();
	    			 imageviewGame2.setImage(imageGame2);
				 
	    			 GameB1.setGraphic(imageviewGame1);
	    			 imageviewGame1.setFitHeight(35);	 
	    			 imageviewGame1.setFitWidth(40);
	    			 
	    			 GameB2.setGraphic(imageviewGame2);
	    			 imageviewGame2.setFitHeight(35);	 
	    			 imageviewGame2.setFitWidth(40);
		   			 
	    			 GameB.addRow(1, Gamel ,Gamet);
	    			 GameB.addRow(3, Gamel1 ,Gamet1);
	    			 GameB.addRow(5, Gamel2 ,Gamet2);
	    			 GameB.addRow(7, Gamel3 ,Gamet3);
	    			 GameB.add(GameB1, 3, 10);
	    			 GameB.add(GameB2, 6, 10);
					 
					 Scene Game = new Scene (GameB,400,400);
					 Gam.setScene(Game);
					 Gam.setTitle("Add new Game");
					 Gam.show();
				 }
			 });
			 
			 Scene s5 = new Scene(SP,400,400);
			 Addmed.setScene(s5);
			 Addmed.setTitle("Add New Media");
			 Addmed.show();		 
		 });
		 M2.setOnAction(p->{
			 
			 Stage DeleteMed = new Stage();
			 
			 GridPane Deletep = new GridPane();
        	 Deletep.setStyle("-fx-background-color:e1e2df");
			 Deletep.setVgap(20);
			 Deletep.setHgap(20);
			 
			 Label lDelete1 = new Label("Code:");
			 TextField TlDelete1 = new TextField("");
			 
			 Label lDelete2 = new Label("Title");
			 TextField TlDelete2 = new TextField("");
			 
			 Label lDelete3 = new Label("NumberOfCopies");
			 TextField TlDelete3 = new TextField("");
			 
			 Label lDelete4 = new Label("MediaType");
			 TextField TlDelete4 = new TextField("");
			 
			 
			 Button pDelete1 =new Button("Delete");
			 Button pDelete2 =new Button("Back");
			 Button pDelete3 = new Button("Find");
			 
			 pDelete1.setOnAction(W->{
				 for (int i =0;i<R.getMedia().size();i++) {
					 if(R.getMedia().get(i).getCode().equals(TlDelete1.getText())) {
						 
						 R.getMedia().remove(R.getMedia().get(i));
					 }
				 }
			 });
			 
			 pDelete2.setOnAction(E->{
				 DeleteMed.close();
			 });
			 
			 pDelete3.setOnAction(T->{
				 
				 for (int i=0;i<R.getMedia().size();i++) {
					 if (R.getMedia().get(i).getCode().equals(TlDelete1.getText())) {
						 
						 TlDelete2.setText(R.getMedia().get(i).getTitle());
						 TlDelete3.setText(String.valueOf(R.getMedia().get(i).getCopiesAvailable()));
						 if (R.getMedia().get(i) instanceof Movie) {
							 TlDelete4.setText("Movie");
						 }
							 else if (R.getMedia().get(i) instanceof Album) {
								 TlDelete4.setText("Album");
						 }
							 else if (R.getMedia().get(i) instanceof Game) {
								 TlDelete4.setText("Game");

							 }
							 
						 }
						 
					 }
				 
			 });
			 
			 Image imageDelete1 = new Image ("Delete3.jpg");
			 ImageView imageviewDelete1 = new ImageView();
			 imageviewDelete1.setImage(imageDelete1);
			 
			 Image imageDelete2 = new Image ("https://img.icons8.com/nolan/344/back.png");
			 ImageView imageviewDelete2 = new ImageView();
			 imageviewDelete2.setImage(imageDelete2);
			 
			 Image imageDelete3 = new Image ("https://img.icons8.com/external-kiranshastry-gradient-kiranshastry/344/external-find-hotel-kiranshastry-gradient-kiranshastry.png");
			 ImageView imageviewDelete3 = new ImageView();
			 imageviewDelete3.setImage(imageDelete3);
		 
			 pDelete1.setGraphic(imageviewDelete1);
			 imageviewDelete1.setFitHeight(35);	 
			 imageviewDelete1.setFitWidth(40);
			 
			 pDelete2.setGraphic(imageviewDelete2);
			 imageviewDelete2.setFitHeight(35);	 
			 imageviewDelete2.setFitWidth(40);
			 
			 pDelete3.setGraphic(imageviewDelete3);
			 imageviewDelete3.setFitHeight(35);	 
			 imageviewDelete3.setFitWidth(40);
			 
			 Deletep.addRow(1, lDelete1 ,TlDelete1);
			 Deletep.addRow(3, lDelete2 ,TlDelete2);
			 Deletep.addRow(5, lDelete3 ,TlDelete3);
			 Deletep.addRow(7, lDelete4 ,TlDelete4);
			 Deletep.add(pDelete1, 3, 9);
			 Deletep.add(pDelete2, 6, 9);
			 Deletep.add(pDelete3, 1, 9);
			 
			 Scene Deletem = new Scene(Deletep,400,400);
			 DeleteMed.setScene(Deletem);
			 DeleteMed.setTitle("Delete media");
			 DeleteMed.show();
			 
		 });
		 M3.setOnAction(a->{
			 
             Stage Updatemed = new Stage();
			 
			 VBox SPU = new VBox();
        	 SPU.setStyle("-fx-background-color:e1e2df");
			 SPU.setAlignment(Pos.CENTER);
			 
			 ComboBox <String> cbU = new ComboBox<>();
			 Button Backk2 = new Button("Back");
			 Backk2.setOnAction(p7->{
				 Updatemed.close();
			 });
			 cbU.getItems().addAll("Movie","Album","Game");
			 
			 SPU.getChildren().addAll(cbU,Backk2);
			 cbU.setOnAction(s->{
				 
				 if (cbU.getValue().equals("Movie")){
					 
					 Stage MovU = new Stage();
					 
					 GridPane MovUP = new GridPane();
		        	 MovUP.setStyle("-fx-background-color:e1e2df");
					 MovUP.setVgap(10);
					 MovUP.setHgap(10);
					 MovUP.setPadding(new Insets(10));
					 
					 Label MovlUP = new Label("Code:");
		   			 TextField MovtUP = new TextField("");
		   			 
		   			 Label Movl1UP = new Label("Title");
		   			 TextField Movt1UP = new TextField("");
		   			 
		   			 Label Movl2UP = new Label("NumberOfcopies");
		   			 TextField Movt2UP = new TextField("");
		   			 
		   			 Label Movl3UP = new Label("Rating");
		   			 TextField Movt3UP = new TextField("");
		   			 
		   			 Button MovB1UP =new Button("Update");
					 Button MovB2UP=new Button("Back");
					 Button MovB3UP=new Button("Find");
					 
					 MovB1UP.setOnAction(Y->{
						 for (int i =0 ;i<R.getMedia().size();i++) {					 
							 if (R.getMedia().get(i).getCode().equals(MovtUP.getText())) {
								 
								 R.getMedia().get(i).setTitle(Movt1UP.getText());
								 R.getMedia().get(i).setcopiesAvailable(Integer.parseInt(Movt2UP.getText()));
								 ((Movie) R.getMedia().get(i)).setRating(Movt3UP.getText());
						 
							 }
						 }
					 });
					 MovB2UP.setOnAction(U->{
						 MovU.close();
					 });
					 MovB3UP.setOnAction(I->{
						 for (int i=0;i<R.getMedia().size();i++) {
							 if (R.getMedia().get(i).getCode().equals(MovtUP.getText())) {
								 
								 Movt1UP.setText(R.getMedia().get(i).getTitle());
								 Movt2UP.setText(String.valueOf(R.getMedia().get(i).getCopiesAvailable()));
								 Movt3UP.setText(((Movie) R.getMedia().get(i)).getRating());
							 }
						 }
					 });
					 
					 Image imageUP1 = new Image ("https://img.icons8.com/nolan/344/approve-and-update.png");
					 ImageView imageviewUP1 = new ImageView();
					 imageviewUP1.setImage(imageUP1);
					 
					 Image imageUP2 = new Image ("https://img.icons8.com/nolan/344/back.png");
					 ImageView imageviewUP2 = new ImageView();
					 imageviewUP2.setImage(imageUP2);
					 
					 Image imageUP3 = new Image ("https://img.icons8.com/external-kiranshastry-gradient-kiranshastry/344/external-find-hotel-kiranshastry-gradient-kiranshastry.png");
					 ImageView imageviewUP3 = new ImageView();
					 imageviewUP3.setImage(imageUP3);
				 
					 MovB1UP.setGraphic(imageviewUP1);
					 imageviewUP1.setFitHeight(35);	 
					 imageviewUP1.setFitWidth(40);
					 
					 MovB2UP.setGraphic(imageviewUP2);
					 imageviewUP2.setFitHeight(35);	 
					 imageviewUP2.setFitWidth(40);
					 
					 MovB3UP.setGraphic(imageviewUP3);
					 imageviewUP3.setFitHeight(35);	 
					 imageviewUP3.setFitWidth(40);
		   			 
					 MovUP.addRow(1, MovlUP ,MovtUP);
					 MovUP.addRow(3, Movl1UP ,Movt1UP);
					 MovUP.addRow(5, Movl2UP ,Movt2UP);
					 MovUP.addRow(7, Movl3UP ,Movt3UP);
					 MovUP.add(MovB1UP, 3, 10);
					 MovUP.add(MovB2UP, 6, 10);
					 MovUP.add(MovB3UP, 1, 10);
					 
					 Scene movieUpdate = new Scene (MovUP,400,400);
					 MovU.setScene(movieUpdate);
					 MovU.setTitle("Update Movie ");
					 MovU.show();				 				 
				 }
				 
				 else if (cbU.getValue().equals("Album")) {
					 
                     Stage updateAlb = new Stage();
					 
					 GridPane AlbBup = new GridPane();
		        	 AlbBup.setStyle("-fx-background-color:e1e2df");
					 AlbBup.setVgap(10);
					 AlbBup.setHgap(10);
					 AlbBup.setPadding(new Insets(10));
					 
					 Label Alblup = new Label("Code:");
		   			 TextField Albtup = new TextField("");
		   			 
		   			 Label Albl1up = new Label("Title");
		   			 TextField Albt1up = new TextField("");
		   			 
		   			 Label Albl2up = new Label("NumberOfcopies");
		   			 TextField Albt2up = new TextField("");
		   			 
		   			 Label Albl3up = new Label("Artist");
		   			 TextField Albt3up = new TextField("");
		   			 
		   			 Label Albl4up = new Label("song");
		   			 TextField Albt4up = new TextField("");
		   			 
		   			 Button AlbB1up =new Button("Update");
					 Button AlbB2up =new Button("Back");
					 Button AlbB3up =new Button("Find");
					 
					 AlbB1up.setOnAction(z1->{
						 for (int i =0 ;i<R.getMedia().size();i++) {					 
							 if (R.getMedia().get(i).getCode().equals(Albtup.getText())) {
								 
								 R.getMedia().get(i).setTitle(Albt1up.getText());
								 R.getMedia().get(i).setcopiesAvailable(Integer.parseInt(Albt2up.getText()));
								 ((Album) R.getMedia().get(i)).setArtist(Albt3up.getText());
								 ((Album) R.getMedia().get(i)).setSong(Albt4up.getText());
						 
							 }
						 }
					 });
					 
					 AlbB2up.setOnAction(z2->{
						 updateAlb.close();
					 });
					 
					 AlbB3up.setOnAction(z3->{
						 for (int i=0 ; i<R.getMedia().size();i++) {
							 if (R.getMedia().get(i).getCode().equals(Albtup.getText())) {
								 
								 Albt1up.setText(R.getMedia().get(i).getTitle());
								 Albt2up.setText(String.valueOf(R.getMedia().get(i).getCopiesAvailable()));
								 Albt3up.setText(((Album) R.getMedia().get(i)).getArtist());
								 Albt4up.setText(((Album) R.getMedia().get(i)).getSong());

							 }
						 }
					 });
					 
					 Image imageDelete1up = new Image ("https://img.icons8.com/nolan/344/approve-and-update.png");
					 ImageView imageviewDelete1up = new ImageView();
					 imageviewDelete1up.setImage(imageDelete1up);
					 
					 Image imageDelete2up = new Image ("https://img.icons8.com/nolan/344/back.png");
					 ImageView imageviewDelete2up = new ImageView();
					 imageviewDelete2up.setImage(imageDelete2up);
					 
					 Image imageDelete3up = new Image ("https://img.icons8.com/external-kiranshastry-gradient-kiranshastry/344/external-find-hotel-kiranshastry-gradient-kiranshastry.png");
					 ImageView imageviewDelete3up = new ImageView();
					 imageviewDelete3up.setImage(imageDelete3up);
				 
					 AlbB1up.setGraphic(imageviewDelete1up);
					 imageviewDelete1up.setFitHeight(35);	 
					 imageviewDelete1up.setFitWidth(40);
					 
					 AlbB2up.setGraphic(imageviewDelete2up);
					 imageviewDelete2up.setFitHeight(35);	 
					 imageviewDelete2up.setFitWidth(40);
					 
					 AlbB3up.setGraphic(imageviewDelete3up);
					 imageviewDelete3up.setFitHeight(35);	 
					 imageviewDelete3up.setFitWidth(40);
		   			 
					 AlbBup.addRow(1, Alblup ,Albtup);
					 AlbBup.addRow(3, Albl1up ,Albt1up);
					 AlbBup.addRow(5, Albl2up ,Albt2up);
	    			 AlbBup.addRow(7, Albl3up ,Albt3up);
	    			 AlbBup.addRow(9, Albl4up ,Albt4up);
	    			 AlbBup.add(AlbB1up, 3, 11);
	    			 AlbBup.add(AlbB2up, 6, 11);
	    			 AlbBup.add(AlbB3up, 1, 11);
	    			 
					 Scene updateulbum = new Scene (AlbBup,400,400);
					 updateAlb.setScene(updateulbum);
					 updateAlb.setTitle("Update Album");
					 updateAlb.show();
				 }
				 
                 else if (cbU.getValue().equals("Game")) {
					 
                     Stage GamUP = new Stage();
					 
					 GridPane GameBUP = new GridPane();
		        	 GameBUP.setStyle("-fx-background-color:e1e2df");
					 GameBUP.setVgap(10);
					 GameBUP.setHgap(10);
					 GameBUP.setPadding(new Insets(10));
					 
					 Label GamelUP = new Label("Code:");
		   			 TextField GametUP = new TextField("");
		   			 
		   			 Label Gamel1UP = new Label("Title");
		   			 TextField Gamet1UP = new TextField("");
		   			 
		   			 Label Gamel2UP = new Label("NumberOfcopies");
		   			 TextField Gamet2UP = new TextField("");
		   			 
		   			 Label Gamel3UP = new Label("Weight");
		   			 TextField Gamet3UP = new TextField("");
		   			 
		   			 Button GameB1UP=new Button("Update");
					 Button GameB2UP=new Button("Back");
					 Button GameB3UP=new Button("Find");
					 
					 GameB1UP.setOnAction(x1->{
						 
						 for (int i =0 ;i<R.getMedia().size();i++) {					 
							 if (R.getMedia().get(i).getCode().equals(GametUP.getText())) {
								 
								 R.getMedia().get(i).setTitle(Gamet1UP.getText());
								 R.getMedia().get(i).setcopiesAvailable(Integer.parseInt(Gamet2UP.getText()));
								 ((Game) R.getMedia().get(i)).setWeigth(Double.parseDouble(Gamet3UP.getText()));
						 
							 }
						 }
					 });
					 GameB2UP.setOnAction(x2->{
						 GamUP.close();
					 });
					 
					 GameB3UP.setOnAction(x3->{
						 
						 for (int i=0 ; i<R.getMedia().size();i++) {
							 if (R.getMedia().get(i).getCode().equals(GametUP.getText())) {
								 
								 Gamet1UP.setText(R.getMedia().get(i).getTitle());
								 Gamet2UP.setText(String.valueOf(R.getMedia().get(i).getCopiesAvailable()));
								 Gamet3UP.setText(String.valueOf(((Game) R.getMedia().get(i)).getWeigth()));

							 }
						 }
					 });
					 
					 Image GameUP1 = new Image ("https://img.icons8.com/nolan/344/approve-and-update.png");
					 ImageView imageviewGameUP1 = new ImageView();
					 imageviewGameUP1.setImage(GameUP1);
					 
					 Image GameUP2 = new Image ("https://img.icons8.com/nolan/344/back.png");
					 ImageView imageviewGameUP2 = new ImageView();
					 imageviewGameUP2.setImage(GameUP2);
					 
					 Image GameUP3 = new Image ("https://img.icons8.com/external-kiranshastry-gradient-kiranshastry/344/external-find-hotel-kiranshastry-gradient-kiranshastry.png");
					 ImageView imageviewGameUP3 = new ImageView();
					 imageviewGameUP3.setImage(GameUP3);
				 
					 GameB1UP.setGraphic(imageviewGameUP1);
					 imageviewGameUP1.setFitHeight(35);	 
					 imageviewGameUP1.setFitWidth(40);
					 
					 GameB2UP.setGraphic(imageviewGameUP2);
					 imageviewGameUP2.setFitHeight(35);	 
					 imageviewGameUP2.setFitWidth(40);
					 
					 GameB3UP.setGraphic(imageviewGameUP3);
					 imageviewGameUP3.setFitHeight(35);	 
					 imageviewGameUP3.setFitWidth(40);
		   			 
					 GameBUP.addRow(1, GamelUP ,GametUP);
					 GameBUP.addRow(3, Gamel1UP ,Gamet1UP);
					 GameBUP.addRow(5, Gamel2UP ,Gamet2UP);
					 GameBUP.addRow(7, Gamel3UP ,Gamet3UP);
					 GameBUP.add(GameB1UP, 3, 10);
					 GameBUP.add(GameB2UP, 6, 10);
					 GameBUP.add(GameB3UP, 1, 10);
					 
					 Scene updateGame = new Scene (GameBUP,400,400);
					 GamUP.setScene(updateGame);
					 GamUP.setTitle("Update Game");
					 GamUP.show();
				 }
		 });
			 Scene sUpdate = new Scene(SPU,400,400);
			 Updatemed.setScene(sUpdate);
			 Updatemed.setTitle("Update Media Info");
			 Updatemed.show();
 });
		 M4.setOnAction(d->{
			 
			 Stage search =new Stage();
			 
			 GridPane searchPane = new GridPane();
        	 searchPane.setStyle("-fx-background-color:e1e2df");
			 searchPane.setVgap(20);
			 searchPane.setHgap(20);
			 
			 Label labelsearch1 = new Label("Code:");
  			 TextField textsearch1 = new TextField("");
  			 
  			 Label labelsearch2 = new Label("Title");
  			 TextField textsearch2 = new TextField("");
  			 
  			 Label labelsearch3 = new Label("NumberOfCopies");
  			 TextField textsearch3 = new TextField("");
  			 
  			 Label labelsearch4 = new Label("Media Type");
  			 TextField textsearch4 = new TextField("");
  			 
  			 Button buttonSearch1 =new Button("search");
			 Button buttonSearch2 =new Button("Back");
			 
			 buttonSearch1.setOnAction(q1->{
				 for (int i=0;i<R.getMedia().size();i++) {
					 if(R.getMedia().get(i).getCode().equals(textsearch1.getText())) {
						 
						 textsearch2.setText(R.getMedia().get(i).getTitle());
						 textsearch3.setText(String.valueOf(R.getMedia().get(i).getCopiesAvailable()));
						 if (R.getMedia().get(i) instanceof Movie) {
							 textsearch4.setText("Movie");
						 }
							 else if (R.getMedia().get(i) instanceof Album) {
								 textsearch4.setText("Album");
						 }
							 else if (R.getMedia().get(i) instanceof Game) {
								 textsearch4.setText("Game");

						 }				 
					 }
				 }
			 });
			 buttonSearch2.setOnAction(q2->{
				 search.close();
			 });
			 
			 Image imagesearch1 = new Image ("https://img.icons8.com/external-icongeek26-linear-colour-icongeek26/344/external-search-project-work-icongeek26-linear-colour-icongeek26.png");
			 ImageView imageviewsearch1 = new ImageView();
			 imageviewsearch1.setImage(imagesearch1);
			 
			 Image imagesearch2 = new Image ("https://img.icons8.com/nolan/344/back.png");
			 ImageView imageviewsearch2 = new ImageView();
			 imageviewsearch2.setImage(imagesearch2);
		 
			 buttonSearch1.setGraphic(imageviewsearch1);
			 imageviewsearch1.setFitHeight(35);	 
			 imageviewsearch1.setFitWidth(40);
			 
			 buttonSearch2.setGraphic(imageviewsearch2);
			 imageviewsearch2.setFitHeight(35);	 
			 imageviewsearch2.setFitWidth(40);
			 
			 searchPane.addRow(1, labelsearch1 ,textsearch1);
			 searchPane.addRow(3, labelsearch2 ,textsearch2);
			 searchPane.addRow(5, labelsearch3 ,textsearch3);
			 searchPane.addRow(7, labelsearch4 ,textsearch4);
			 searchPane.add(buttonSearch1, 3, 10);
			 searchPane.add(buttonSearch2, 6, 10);
			 
			 Scene Scenesearch = new Scene(searchPane,400,400);
			 search .setScene(Scenesearch);
			 search .setTitle("search Media By Code");
			 search.show();
			 
  			 
		 });
		 M5.setOnAction(f->{
			 
			 Stage PrintMediaInfoo = new  Stage();
			 
			 GridPane Spp = new GridPane();
        	 Spp.setStyle("-fx-background-color:e1e2df");
			 
			 Label pI = new Label("Print Media Info :");
			 TextArea TA = new TextArea("");
			 Button PMI =new Button("Print");
			 Button PMI2 =new Button("Back");
			 
			 PMI.setOnAction(c1->{
				 
				 TA.setText(R.getAllMediaInfo());
			 });
			 
			 PMI2.setOnAction(c2->{
				 PrintMediaInfoo.close();
			 });
			 
			 Spp.addRow(0, pI , TA);
			 Spp.add(PMI, 1, 6);
			 Spp.add(PMI2, 3, 6);
			 
			 Scene printMedia = new Scene(Spp,400,400);
			 PrintMediaInfoo.setScene(printMedia);
			 PrintMediaInfoo.setTitle("Print All Media Info");
			 PrintMediaInfoo.show();
	 
		 });
		 M6.setOnAction(g->{
			 Med.close();
		 });
		 
		 Scene MedS = new Scene(vboxmedia,300,300);
		 Med.setTitle("About Media");
		 Med.setScene(MedS);
		 Med.show();
        });
       
       B3.setOnAction(e->{
    	   
    	   Stage Rent = new Stage();
    	   
    	   VBox RentPane = new VBox(10);
      	   RentPane.setStyle("-fx-background-color:e1e2df");
    	   RentPane.setAlignment(Pos.CENTER);
    	     
    	   Button rentB1 = new Button("Rent form");
    	   Button rentB2 = new Button("Print the requested interested");
    	   Button rentB3 = new Button("Print the rented media");
    	   Button rentB4 = new Button("Return Rented media");
    	   Button rentB5 = new Button("Return to main page");
    	   
    	   rentB1.setStyle("-fx-text-fill:#0000ff;-fx-background-radius:10px");
    	   rentB2.setStyle("-fx-text-fill:#0000ff;-fx-background-radius:10px");
    	   rentB3.setStyle("-fx-text-fill:#0000ff;-fx-background-radius:10px");
    	   rentB4.setStyle("-fx-text-fill:#0000ff;-fx-background-radius:10px");
    	   rentB5.setStyle("-fx-text-fill:#0000ff;-fx-background-radius:10px");
   
    	   rentB1.setOnAction(m1->{
    		   
    		   Stage RentForm = new Stage();
    	 	   
    	 	   GridPane rentPane = new GridPane();
          	   rentPane.setStyle("-fx-background-color:e1e2df");
    	 	   rentPane.setVgap(10);
    	 	   rentPane.setHgap(10);
    	 	   rentPane.setPadding(new Insets(10));
    	 	   
    	 	   Label cutomerId = new Label ("Customer ID:");
    	 	   TextField idValue = new TextField("Cutomer Id Value");
    	 	   
    	 	   Button CustomerNeededInfoB = new Button("CustomerNeededInfo");
    	 	   TextArea CustomerNeededInfo =new TextArea("");   
    	 	   
    	 	  CustomerNeededInfoB.setOnAction(v1->{
    	 		  //Customer cu = new Customer();
    	 		  for (int i=0;i<R.getCustomer().size();i++) {
    	 			  if (R.getCustomer().get(i).getID().equals(idValue.getText())) {
    	 				  
    	 				 CustomerNeededInfo.setText(R.getCustomer().get(i).toString());
    	 			  }
    	 		  }
    	 	  });
    	 	     
    	 	   Label mediacode = new Label ("Media Code:");
    	 	   TextField mediaValue = new TextField("Media code Value");
    	 	   
    	 	   Button  MediaNeededInfoB = new Button("MediaNeededInfo");
    	 	  TextArea MediaNeededInfo =new TextArea("");
    	 	  
    	 	 MediaNeededInfoB.setOnAction(v2->{
   	 		  
   	 		  for (int i=0;i<R.getMedia().size();i++) {
   	 			  if (R.getMedia().get(i).getCode().equals(mediaValue.getText())) {
   	 				  
   	 				MediaNeededInfo.setText(R.getMedia().get(i).toString());
   	 			  }
   	 		  }
   	 	  });
    	 	   
    	 	   Label RentedDate = new Label ("Rented Date:");
    	 	   TextField DateValue = new TextField(new Date().toString());
    	 	   
    	 	   Button R1 = new Button("Add to cart");
    	 	   Button R2 = new Button("process cart");
    	 	   Button R3 = new Button("Back");
    	 	   
    	 	   R1.setOnAction(b1->{
    	 		  for (int i=0;i<R.getCustomer().size();i++) {
   	 			   for(int j=0;j<R.getMedia().size();j++) {
   	 				 if (R.getCustomer().get(i).getID().equals(idValue.getText()) && R.getMedia().get(j).getCode().equals(mediaValue.getText())) {
   	 					 
   	 					R.addToCart(idValue.getText(), mediaValue.getText());
   	 				 }
   	 			  }
    	 	   }
    	 		   
    	 	   });
    	 	   
    	 	   R2.setOnAction(b2->{
				   
    	 					   R.processRequests();
    	 				
    	 	   });
    	 	   
    	 	   R3.setOnAction(b3->{
    	 		  RentForm.close();
    	 	   });
    	 	   
    	 	   rentPane.addRow(0, cutomerId ,idValue);
    	 	   rentPane.add(CustomerNeededInfoB, 0, 2);
    	 	   rentPane.add(CustomerNeededInfo, 1, 2);
    	 	   rentPane.addRow(3, mediacode ,mediaValue);
    	 	   rentPane.add(MediaNeededInfoB, 0, 4);
    	 	   rentPane.add(MediaNeededInfo, 1, 4);
    	 	   rentPane.addRow(6, RentedDate ,DateValue);
    	 	   rentPane.add(R1, 1, 7);
    	 	   rentPane.add(R2, 2, 7);
    	 	   rentPane.add(R3, 3, 7);
    	 	   
    	 	   
    	 	   Scene rents = new Scene(rentPane,400,400);
    	 	  RentForm.setTitle("About Rent");
    	 	  RentForm.setScene(rents);
    	 	  RentForm.show();  
    	   });
    	   
    	   rentB2.setOnAction(n1->{
    		   
    		   Stage PrintCart = new Stage();
    		   
    		   GridPane PrintCartpane = new GridPane();
          	   PrintCartpane.setStyle("-fx-background-color:e1e2df");
    		   
    		   Label Customeridintrested = new Label("Customer Id:");
    		   TextField Customeridintrestedtext = new TextField("");
    		   
    		   TextArea CustomeridintrestedArea = new TextArea("");
    		   
    		   Button PrintCartB1 = new Button("Print Cart");
    		   Button PrintCartB2 = new Button("Back");
    		   
    		   PrintCartB1.setOnAction(n2->{
    			   for (int i=0;i<R.getCustomer().size();i++) {
    				   if (R.getCustomer().get(i).getID().equals(Customeridintrestedtext.getText())) {
    					   
    					   CustomeridintrestedArea.setText(R.getCustomer().get(i).getIntrested().toString());
    				   }
    			   }
    		   });
    		   
    		   PrintCartB2.setOnAction(n3->{
    			   PrintCart.close();
    		   });	   
    		   
    		   PrintCartpane.addRow(1, Customeridintrested,Customeridintrestedtext);
    		   PrintCartpane.add(CustomeridintrestedArea, 1, 2);
    		   PrintCartpane.add(PrintCartB1, 1, 4);
    		   PrintCartpane.add(PrintCartB2, 3, 4);

    		   Scene PrintCartScene = new Scene(PrintCartpane,400,400);
    		   PrintCart.setScene(PrintCartScene);
    		   PrintCart.setTitle("Print the intreasted Cart");
    		   PrintCart.show();
    		      
    	   });
    	   rentB3.setOnAction(m1->{
    		   
               Stage PrintRented = new Stage();
    		   
    		   GridPane PrintRentedpane = new GridPane();
          	   PrintRentedpane.setStyle("-fx-background-color:e1e2df");
    		   
    		   Label CustomeridRented = new Label("Customer Id:");
    		   TextField CustomeridRentedtext = new TextField("");
    		   
    		   TextArea CustomeridRentedArea = new TextArea("");
    		   
    		   Button PrintRentedB1 = new Button("Print Rented");
    		   Button PrintRentedB2 = new Button("Back");
    		   
    		   PrintRentedB1.setOnAction(n2->{
    			   for (int i=0;i<R.getCustomer().size();i++) {
    				   if (R.getCustomer().get(i).getID().equals(CustomeridRentedtext.getText())) {
    					   
    					   CustomeridRentedArea.setText(R.getCustomer().get(i).getRented().toString());
    				   }
    			   }
    		   });
    		   PrintRentedB2.setOnAction(n3->{
    			   PrintRented.close();
    		   });	   
    		   
    		   PrintRentedpane.addRow(1, CustomeridRented,CustomeridRentedtext);
    		   PrintRentedpane.add(CustomeridRentedArea, 1, 2);
    		   PrintRentedpane.add(PrintRentedB1, 1, 4);
    		   PrintRentedpane.add(PrintRentedB2, 3, 4);

    		   Scene PrintCartScene = new Scene(PrintRentedpane,400,400);
    		   PrintRented.setScene(PrintCartScene);
    		   PrintRented.setTitle("Print the Rented Media");
    		   PrintRented.show();
    	   });
    	   
    	   rentB4.setOnAction(a1->{
    		   
    		   Stage Return = new Stage();
    		   
    		   GridPane ReturnPane = new GridPane();
          	   ReturnPane.setStyle("-fx-background-color:e1e2df");
    		   
    		   Label ReturnLabel = new Label ("Customer Id:");
    		   TextField RerurnText = new TextField("");
    		   
    		   Label ReturnLabe2 = new Label ("Media Code:");
    		   TextField RerurnText2 = new TextField("");
    		   
    		   Button ReturnB1 = new Button("Return Media");
    		   Button ReturnB2 = new Button("Back");
    		   
    		   ReturnB1.setOnAction(s1->{
    			   
    			   for (int i=0;i<R.getCustomer().size();i++) {
    	 			   for(int j=0;j<R.getMedia().size();j++) {
    	 				   if (R.getCustomer().get(i).getID().equals(RerurnText.getText()) && R.getMedia().get(j).getCode().equals(RerurnText2.getText())) {
    	 					   
    	 					   R.returnMedia(RerurnText.getText(), RerurnText2.getText());
    	 				   }
    	 			   }
    	 		   }
    		   });
    		   
    		   ReturnB2.setOnAction(s2->{
    			   Return.close();
    		   });
    		   
    		   ReturnPane.addRow(0, ReturnLabel,RerurnText);
    		   ReturnPane.addRow(1, ReturnLabe2,RerurnText2);
    		   ReturnPane.add(ReturnB1, 1, 3);
    		   ReturnPane.add(ReturnB2, 3, 3);
    		   
    		   Scene RuternScene = new Scene (ReturnPane,200,200);
    		   Return.setScene(RuternScene);
    		   Return.setTitle("Return Media");
    		   Return.show();
    		   


    	   });
    	   rentB5.setOnAction(o1->{
    		   Rent.close();
    	   });
    	   
    	   RentPane.getChildren().addAll(rentB1,rentB2,rentB3,rentB4,rentB5);
    	   
    	   Scene RentScene = new Scene(RentPane,400,400);
    	   Rent.setScene(RentScene);
    	   Rent.setTitle("Rent");
    	   Rent.show();
    	  
    	   
		});
       B4.setOnAction(R33->{
   
    	   try {
    	// create a writer customer to fill the file 
   		PrintWriter out = new PrintWriter("customer.txt");
   		
   		for (int i=0 ;i<R.getCustomer().size();i++) {
   			
   			out.println(R.getCustomer().get(i).getID());
   			out.println(R.getCustomer().get(i).getMobileNumber());
   			out.println(R.getCustomer().get(i).getName());
   			out.println(R.getCustomer().get(i).getAddress());
   			out.println(R.getCustomer().get(i).getPlan());
   			out.flush();
   			
   		}
   		out.flush();
   		out.close();
   		
   		// create a writer media to fill the file 
   		PrintWriter mout = new PrintWriter("media.txt");

   		//all data of media
   		for (int i=0;i<R.getMedia().size();i++) {
   			
   			if (R.getMedia().get(i) instanceof Game) {
   				mout.println("G");
   				mout.println(R.getMedia().get(i).getCode());
   				mout.println(R.getMedia().get(i).getTitle());
   				mout.println(R.getMedia().get(i).getCopiesAvailable());
   				mout.println((int)((Game) R.getMedia().get(i)).getWeigth());
   				mout.flush();
   			}
   			
   			else if (R.getMedia().get(i) instanceof Movie) {
   				mout.println("M");
   				mout.println(R.getMedia().get(i).getCode());
   				mout.println(R.getMedia().get(i).getTitle());
   				mout.println(R.getMedia().get(i).getCopiesAvailable());
   				mout.println((((Movie) R.getMedia().get(i)).getRating()));
   				mout.flush();
   			}
   			
              else if (R.getMedia().get(i) instanceof Album) {
           	   mout.println("A");
   				mout.println(R.getMedia().get(i).getCode());
   				mout.println(R.getMedia().get(i).getTitle());
   				mout.println(R.getMedia().get(i).getCopiesAvailable());
   				mout.println((((Album) R.getMedia().get(i)).getArtist()));
   				mout.println((((Album) R.getMedia().get(i)).getSong()));
   				mout.flush();
   			}
   		}
   		out.flush();
   		mout.close();
    	   }
    	   catch(Exception e){
    		   e.getStackTrace();
    	   }
       });
         Scene s = new Scene(GP,1000,1000);
		 //primaryStage.setResizable(false);
		 primaryStage.setScene(s);
		 primaryStage.setTitle("Media System GUI");
		 primaryStage.show();
	}
	
	public static void main(String[] args) throws IOException{
		
		
		// we create two file customer and media and opened both of them
				File fileCustomer =new File("customer.txt");
				File fileMedia = new File("media.txt");
				
				//customer Scanner
				Scanner scanCustomer = new Scanner(fileCustomer);
				// To Read the data from customer file 
				while (scanCustomer.hasNextLine()){
						
					String ID = scanCustomer.nextLine();
					String mobileNumber = scanCustomer.nextLine();
					String name= scanCustomer.nextLine();
					String address= scanCustomer.nextLine();
					String plan = scanCustomer.nextLine();
					
					R.addCustomer( ID,  name,  address, mobileNumber,  plan);		
				}
				//close the file of customer 
				scanCustomer.close();
				
				//create Scanner media
				Scanner scanMedia = new Scanner(fileMedia);
				
				// To Read all the data from media file
				while(scanMedia.hasNextLine()) {
					String x = scanMedia.nextLine();
					 if(x.equalsIgnoreCase("G")) {
						 
						 String Code= scanMedia.nextLine();
						 String tital=scanMedia.nextLine();
						 int CopiesAvalible=scanMedia.nextInt();
						 scanMedia.nextLine();
						 double weight=(double)scanMedia.nextInt();
						// scanMedia.nextLine();
						 R.addGame(Code,tital, CopiesAvalible, weight);
					 }
					 else if(x.equalsIgnoreCase("M")) {
						 String Code= scanMedia.nextLine();
						 String tital=scanMedia.nextLine();
						 int CopiesAvlible=scanMedia.nextInt();
						 scanMedia.nextLine();
						 String rating=scanMedia.nextLine();
						 R.addMovie(Code,tital, CopiesAvlible, rating);
					 }
					 else if(x.equalsIgnoreCase("A")) {
						 String Code= scanMedia.nextLine();
						 String tital=scanMedia.nextLine();
						 int CopiesAvlible=scanMedia.nextInt();
						 scanMedia.nextLine();
						 String artist=scanMedia.nextLine();
						 String songs=scanMedia.nextLine();
						 R.addAlbum(Code,tital, CopiesAvlible, artist, songs);
					 }
						
				}
				//close media file
				scanMedia.close();
		launch(args);
	}
}
