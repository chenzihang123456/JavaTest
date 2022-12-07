public class TestStudent {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.age = 23;
        stu.name="张三";
        System.out.println(stu.age);
        stu.study();
    }
}
