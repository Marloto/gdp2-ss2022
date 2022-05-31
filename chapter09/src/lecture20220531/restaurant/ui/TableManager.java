package lecture20220531.restaurant.ui;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import lecture20220531.restaurant.model.Article;
import lecture20220531.restaurant.model.Reservation;
import lecture20220531.restaurant.model.Table;

public class TableManager extends Application {

    private List<Table> tables;
    private List<Article> articles;
    
    private Table current;
	private ListView<Reservation> reservations;
	private ListView<String> bill;
	private Button addReservation;
	private TextField dateField;
	private TextField nameField;
	private Button addArticle;
	private ChoiceBox<Article> article;
	private Label tableName;
    
    public void init() {
        this.tables = new ArrayList<>();
        for(int i = 1; i < 10; i ++) {            
            this.tables.add(new Table(i));
        }
        
        this.articles = new ArrayList<>();
        this.articles.add(new Article("Pizza Diavolo", 12.99));
        this.articles.add(new Article("Pizza Margherita", 9.99));
        this.articles.add(new Article("Spagetthi Carbonara", 8.99));
        this.articles.add(new Article("Lasagne Bolognese", 9.99));
        this.articles.add(new Article("Rotwein Chianti 0,75l", 14.99));
        this.articles.add(new Article("Gemischter Salat", 4.99));
    }
    
    public void refreshUi() {
    	if(current == null) {
    		// bestimmte Elemente ausblende / disabled
    		reservations.setDisable(true);
    		bill.setDisable(true);
    		addReservation.setDisable(true);
    		dateField.setDisable(true);
    		nameField.setDisable(true);
    		addArticle.setDisable(true);
    		article.setDisable(true);
    		
    		tableName.setText("---");
    		reservations.getItems().clear();
    		bill.getItems().clear();
    	} else {
    		reservations.setDisable(false);
    		bill.setDisable(false);
    		addReservation.setDisable(false);
    		dateField.setDisable(false);
    		nameField.setDisable(false);
    		addArticle.setDisable(false);
    		article.setDisable(false);
    		
    		tableName.setText(current.toString());
    		
    		List<Reservation> list = new ArrayList<>();
    		for(Reservation res : current.reservations()) {
    			list.add(res);
    		}
    		reservations.setItems(FXCollections.observableList(list));
    		
    		List<String> billList = new ArrayList<>();
    		for(Article a : current.articlesOnBill()) {
    			int articleCount = current.getArticleCount(a);
    			String billEntry = articleCount + "x " + a.toString();
    			billList.add(billEntry);
    		}
    		bill.setItems(FXCollections.observableList(billList));
    	}
    }

    public void start(Stage primaryStage) throws Exception {
    	HBox main = new HBox();
    	FlowPane tables = new FlowPane();
    	VBox datas = new VBox();
    	FlowPane addReservationForm = new FlowPane();
    	FlowPane addArticleForm = new FlowPane();
    	
    	tableName = new Label();
    	reservations = new ListView<>();
    	bill = new ListView<>();
    	
    	addReservation = new Button("Add");
    	dateField = new TextField();
    	nameField = new TextField();
    	addReservation.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				if(current != null) {					
					Reservation res = new Reservation(dateField.getText(), nameField.getText());
					current.addReservation(res);
				}
				refreshUi();
			}
		});
    	
    	addArticle = new Button("Add");
    	article = new ChoiceBox<>();
    	
    	article.setItems(FXCollections.observableArrayList(this.articles));
    	// article.getSelectionModel().getSelectedItem(); // liefert das ausgewählte element
    	// es gibt current : Table
    	// Table.addToBill(Article)
    	addArticle.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				if(current != null) {					
					Article item = article.getSelectionModel().getSelectedItem();
					current.addToBill(item);
				}
				refreshUi();
			}
		});
    	
    	for(Table t : this.tables) {
    		Button button = new Button(t.toString());
    		tables.getChildren().add(button);
    		button.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					if(current == t) { // hier bietet sich ref. vergleich an
						current = null;
					} else {						
						current = t;
					}
					refreshUi();
				}
			});
    	}

    	
    	// Wie alle Elemente in den Layouts platzieren?
    	addReservationForm.getChildren().addAll(dateField, nameField, addReservation);
    	addArticleForm.getChildren().addAll(article, addArticle);
    	datas.getChildren().addAll(tableName, reservations, addReservationForm, bill, addArticleForm);
    	main.getChildren().addAll(tables, datas);
    	
    	refreshUi();
    	
    	Scene scene = new Scene(main);
    	primaryStage.setScene(scene);
        primaryStage.setTitle("Table Manager");
        primaryStage.show();
    }

}
