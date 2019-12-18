package practices;

import java.io.Serializable;

/**
 * User: WQS
 * Date: 2019/12/18
 * Time: 16:59
 * Description:
 */
public class Student implements Serializable {
    private String name;
    private int age ;

    public Student() {
        super();
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
