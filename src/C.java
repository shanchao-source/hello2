import java.util.Objects;

public class C {
    private  String name;
    private  int age;
    private  int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        C c = (C) o;
        return age == c.age &&
                id == c.id &&
                Objects.equals(name, c.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age, id);
    }

    /*public static void  main(String[] args){
        System.out.println("CCCCCCCCC,李四");
        System.out.println("CCCCCCCCC,3333");
    }*/

}
