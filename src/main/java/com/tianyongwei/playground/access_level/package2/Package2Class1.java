package com.tianyongwei.playground.access_level.package2;

import com.tianyongwei.playground.access_level.package1.PublicClass1;

public class Package2Class1 {

    public static void main(String[] args) {
        new PublicClass1();
        new Package2Class1();
//        new Package1ProtectedClass1();
    }
}
