package app;

import java.sql.*;

class Product {
    public int id;
    public String serialNumber;
    public String name;
    public String description;
    public int price;
    public int stock;
    public int weight;
    public String picture;
    public int brandId;

    static public Product find(int id) throws SQLException {
        ResultSet resultSet = DBManager.sendQuery(
            "SELECT * FROM `product` WHERE `id` = " + id
        );

        resultSet.last();
        if (resultSet.getRow() == 0) {
            throw new RuntimeException("Id " + id + " doesn't exist in table `product`");
        }

        resultSet.first();

        return new Product(
            resultSet.getInt(1),
            resultSet.getString(2),
            resultSet.getString(3),
            resultSet.getString(4),
            resultSet.getInt(5),
            resultSet.getInt(6),
            resultSet.getInt(7),
            resultSet.getString(8),
            resultSet.getInt(9)
        );
    }


    Product (int id, String serialNumber, String name, String description, int price, int stock, int weight, String picture, int brandId) {
        this.id = id;
        this.serialNumber = serialNumber;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.weight = weight;
        this.picture = picture;
        this.brandId = brandId;
    }

    public void inspect() {
        System.out.println("Product Object");
        System.out.println("id: " + id);
        System.out.println("serialNumber: " + serialNumber);
        System.out.println("name: " +name);
        System.out.println("description: " + description);
        System.out.println("price: " + price);
        System.out.println("stock: " + stock);
        System.out.println("weight: " + weight);
        System.out.println("picture: " + picture);
        System.out.println("brandId: " + brandId);
    }
}