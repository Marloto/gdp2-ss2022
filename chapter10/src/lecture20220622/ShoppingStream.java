package lecture20220622;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

enum Article {
    TSHIRT1, TSHIRT2, SOCKS, WALLET;
}

class Order {
    private int quantity;
    private double price;
    private String currency;
    private Article article;

    public Order(Article article, int quantity, double price, String currency) {
        this.article = article;
        this.quantity = quantity;
        this.price = price;
        this.currency = currency;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }

    public Article getArticle() {
        return article;
    }
    
    @Override
    public String toString() {
        return this.quantity + "x " + this.article.name() + " costs " + (this.price * this.quantity) + " (each " + this.price + ") " + this.currency;
    }
}

public class ShoppingStream {
    public static void main(String[] args) {
        List<String> orders = Arrays.asList(
                "TSHIRT1;3;10.00;EUR",
                "TSHIRT2;4;15,00;EUR",
                "SOCKS;1;7.00;EUR",
                "WALLET;4;5.0;EUR",
                "WALLET2;7;6.5;EUR",
                "SOCKS;x;6.00;EUR"
        );
        
        // Map String to Article-Enum
        Map<String, Article> articleMap = mapArticles();
        
        // Parse orders in list
        List<Order> result = parseOrders(articleMap, orders);
        
        // Print each order
        result.stream().forEach(System.out::println);
        
    }

    public static Map<String, Article> mapArticles() {
        
        return Stream.of(Article.values())
            .collect(Collectors.toMap(el -> el.name(), el -> el));
        
    }

    public static List<Order> parseOrders(Map<String, Article> articleMap, List<String> orders) {
        return orders.stream()
            .map(el -> el.split(";"))
            .filter(el -> el.length == 4)
            .filter(el -> articleMap.containsKey(el[0]))
            .filter(el -> isInteger(el[1]))
            .filter(el -> isDouble(el[2]))
            .map(el -> new Order(
                    articleMap.get(el[0]),
                    Integer.parseInt(el[1]),
                    Double.parseDouble(el[2]),
                    el[3]))
            .collect(Collectors.toList());
        
    }

    public static List<Order> parseOrders2(Map<String, Article> articleMap, List<String> orders) {
        // ... ohne Lambdas?
        return null;
        
    }
    
    public static boolean isInteger(String s) {
        try { 
            Integer.parseInt(s); 
        } catch(NumberFormatException e) { 
            return false; 
        }
        return true;
    }
    
    public static boolean isDouble(String s) {
        try { 
            Double.parseDouble(s); 
        } catch(NumberFormatException e) { 
            return false; 
        }
        return true;
    }
}