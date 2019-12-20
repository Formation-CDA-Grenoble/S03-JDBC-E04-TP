package app;

import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
        ResultSet products = DBManager.sendQuery(
            "SELECT * FROM `product` " +
            "JOIN `orders_in_products` ON `product`.`id` = `orders_in_products`.`product_id`" +
            "JOIN `_order` ON `_order`.`id` = `orders_in_products`.`order_id` " +
            "WHERE `_order`.`user_id` = 2"
        );

        while (products.next()) {
            System.out.println(
                "Product #" + products.getString(1) +
                ": " + products.getString(3)
            );
        }
    }
}