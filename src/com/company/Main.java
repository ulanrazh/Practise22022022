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

        Programmer programmer = new Programmer("Ulan",33,"male");
        Programmer programmer1 = new Programmer("Bulan",25,"male");
        Sportsman sportsman = new Sportsman("Siymyk",21,"Karate");
        Sportsman sportsman1 = new Sportsman("Bekten",33,"Judo");
        Driver driver = new Driver("Ulan",33,"male");
        Driver driver1 = new Driver("Ulan",33,"male");
        Seaman seaman = new Seaman("Ulan",33,"male");
        Seaman seaman1 = new Seaman("Ulan",33,"male");

        Swimmable[] people = {programmer,programmer1,sportsman,sportsman1,seaman,seaman1};
        Pool pool = new Pool();
        pool.setPeople(people);
        System.out.println(pool);


    }
}
