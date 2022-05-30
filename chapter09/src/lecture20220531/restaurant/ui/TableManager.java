package lecture20220531.restaurant.ui;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.stage.Stage;
import lecture20220531.restaurant.model.Article;
import lecture20220531.restaurant.model.Table;

public class TableManager extends Application {

    private List<Table> tables;
    private List<Article> articles;
    
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

    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Table Manager");
        primaryStage.show();
    }

}
