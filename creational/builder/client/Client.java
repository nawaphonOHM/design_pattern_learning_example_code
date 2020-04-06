package creational.builder.client;

import creational.builder.director.CivilEngineer;
import creational.builder.home_build.implementations.NormalSize;

public class Client {
    public static void main(String[] args){
        final CivilEngineer engineer = new CivilEngineer();
        final NormalSize myHome = (NormalSize) engineer.getResult();

        System.out.println(myHome.getHome());
    }
}