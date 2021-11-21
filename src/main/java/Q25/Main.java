package Q25;

public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        test.test();
        System.out.println(test.value); // value can be accessed within the same package

        SubTest subTest = new SubTest();
        subTest.test(); // value can be accessed by the sub-class
    }
}
