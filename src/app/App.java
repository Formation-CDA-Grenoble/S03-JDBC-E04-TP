package app;

import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
        Order myOrder = Order.find(1);
        myOrder.inspect();
        
        for (Product product: myOrder.getProducts()) {
            product.inspect();
        }
    }
}