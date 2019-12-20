package app;

class User {
    public int id;
    public String email;
    public String password;
    public String username;

    User(int id, String email, String password, String username) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.username = username;
    }

    public void inspect() {
        System.out.println("User Object");
        System.out.println("id: " + id);
        System.out.println("email: " + email);
        System.out.println("password: " + password);
        System.out.println("username: " + username);
    }
}