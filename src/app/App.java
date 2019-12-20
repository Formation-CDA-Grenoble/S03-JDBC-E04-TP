package app;

import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
        ResultSet products = DBManager.sendQuery(
            "SELECT * FROM `product` WHERE `brand_id` = 1"
        );

        while (products.next()) {
            System.out.println(
                "Product #" + products.getString(1) +
                ": " + products.getString(2)
            );
        }
    }
}