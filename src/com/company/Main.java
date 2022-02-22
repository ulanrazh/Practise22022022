package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        String string = "this is string";
//        StringBuilder stringBuilder = new StringBuilder("His name is");
//        stringBuilder.append(" Ulan");
//        System.out.println(stringBuilder);
//
//        StringBuffer stringBuffer = new StringBuffer("His name is");
//        stringBuffer.append(" Ulan");
//        System.out.println(stringBuffer);

        Programmer programmer = new Programmer();
        Programmer programmer1 = new Programmer();
        Sportsman sportsman = new Sportsman();
        Sportsman sportsman1 = new Sportsman();
        Driver driver = new Driver();
        Driver driver1 = new Driver();
        Seaman seaman = new Seaman();
        Seaman seaman1 = new Seaman();

        Person[] people = {programmer,programmer1,sportsman,sportsman1,driver,driver1,seaman,seaman1};
        Pool pool = new Pool();
        pool.setPeople(people);
        System.out.println(pool);

        
    }
}
