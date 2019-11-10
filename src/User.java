import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public User() {

    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public User getUser(String name) {
        return new User("hello");
    }

    public static void main(String[] args) {
        System.out.println(new User("abc"));
        m1();
    }

    private static void m1() {
        System.out.println("car");
    }
    public  void valid(User u){
        if (u != null) {
            System.out.println("有效");
        }
    }

    public void listallUser(){
        List<User> users = new ArrayList<>();
        for (User user : users) {
            System.out.println(user);
        }
    }











}
