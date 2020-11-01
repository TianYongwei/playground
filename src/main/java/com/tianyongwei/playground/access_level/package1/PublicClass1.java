package com.tianyongwei.playground.access_level.package1;

public class PublicClass1 {

    protected class Package1ProtectedClass1 {

    }

    private class Package1PrivateClass1 {

    }

    void testMethod() {
        new Package1PrivateClass1();
        new Package1ProtectedClass1();
        return;
    }
}
