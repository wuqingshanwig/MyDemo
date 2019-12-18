package practices;
/**
 *  @author: wig
 *  @Date: 2019/12/18 17:12
 *  @ClassName Demo
 *  @Description:
 */
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;


public class Demo {
    @Test
   public void test1() throws IOException {
        FileOutputStream fos = new FileOutputStream("String.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        String  str= "如同天上将魔主,真乃人间太岁神";
        dos.writeUTF(str);
        dos.close();
        fos.close();
    }


    @Test
    public void test2() throws IOException {
        FileInputStream fis = new FileInputStream("String.txt");
        DataInputStream dis = new DataInputStream(fis);
        String s = dis.readUTF();
        System.out.println(s);
        dis.close();

        fis.close();
    }
    @Test
    public void test3() throws IOException {
        FileOutputStream fos = new FileOutputStream("Student.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(new Student("老方",278));
        oos.close();
        fos.close();
    }
    @Test
    public void test4() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Student.txt"));
        Student  s = (Student) ois.readObject();
        System.out.println(s);
        ois.close();

    }
    @Test
    public void test5() throws IOException, ClassNotFoundException {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("老方",89));
        list.add(new Student("王子玉",12));
        list.add(new Student("刘靖",12));
        list.add(new Student("李欢欢",45));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("list.txt"));
        oos.writeObject(list);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("list.txt"));
        ArrayList<Student> list1 = (ArrayList<Student>) ois.readObject();
        System.out.println(list1);
        ois.close();


    }
}

