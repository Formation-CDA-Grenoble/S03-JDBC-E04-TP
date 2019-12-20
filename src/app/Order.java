package app;

import java.sql.Date;

class Order {
    public int id;
    public String reference;
    public Date date;
    public int status;

    Order(int id, String reference, Date date, int status) {
        this.id = id;
        this.reference = reference;
        this.date = date;
        this.status = status;
    }
}