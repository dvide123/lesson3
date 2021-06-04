import java.util.Objects;
import java.util.Random;
import java.util.UUID;

public class Student {
    private final static String SCHOOL = "RKG";
    private String name;
    private String uid;
    private Integer age;
    private static String nameAge = "name";

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
        this.uid = UUID.randomUUID().toString();
    }

    public String getName() {
        return name;
    }

    public String getUid() {
        return uid;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", uid='" + uid + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(age, student.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, uid, age);
    }
}
