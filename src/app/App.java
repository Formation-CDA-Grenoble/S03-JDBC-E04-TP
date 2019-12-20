package app;

import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {

        Product myProduct = Product.find(1);
        myProduct.inspect();

        
        // Order myOrder = Order.find(2);
        // myOrder.inspect();
        // myOrder.getUser().inspect();
    }
}