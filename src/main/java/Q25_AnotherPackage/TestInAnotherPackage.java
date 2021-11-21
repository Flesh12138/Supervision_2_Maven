package Q25_AnotherPackage;

import Q25.Test;

public class TestInAnotherPackage extends Test {
    @Override
    public void test() {
//        System.out.println(value);  // value can NOT be accessed outside the package even in subclass
    }
}
