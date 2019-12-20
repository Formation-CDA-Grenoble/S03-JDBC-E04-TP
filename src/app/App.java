package app;

import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
        ResultSet productsInOrder = DBManager.sendQuery(
            "SELECT COUNT(`orders_in_products`.`id`) FROM `orders_in_products` " +
            "JOIN `_order` ON `orders_in_products`.`order_id` = `_order`.`id` " +
            "WHERE `_order`.`user_id` = 1"
        );

        while (productsInOrder.next()) {
            System.out.println(productsInOrder.getInt(1));
        }
    }
}