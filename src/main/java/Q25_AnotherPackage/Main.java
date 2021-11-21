package Q25_AnotherPackage;

import Q25.SubTest;
import Q25.Test;

public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        test.test();
//        System.out.println(test.value); // value can NOT be accessed outside the package

        TestInAnotherPackage t = new TestInAnotherPackage();
        t.test();

        SubTest subTest = new SubTest();
        subTest.test();
    }
}
