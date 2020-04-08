package creational.prototye;

import creational.prototye.prototypes.implementations.Color;

public class Client {
    public static void main(String[] args){
        Color white = null;

        System.out.println("let build white color.");
        white = new Color("white", 255, 255, 255);
        System.out.println("build successed in time => " + white.getCreateDate());
        System.out.println("this white is parent object? -> "+ white.isParent());

        System.out.println("let clone white color.");
        white = white.clone();
        System.out.println("build successed in time => " + white.getCreateDate());
        System.out.println("this white is parent object? -> "+ white.isParent());
    }
}