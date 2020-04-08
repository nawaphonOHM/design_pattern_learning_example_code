package creational.prototye.prototypes.implementations;

import java.util.Date;

import creational.prototye.prototypes.CloneType;

public class Color implements CloneType {
    final private String name;
    final private int red;
    final private int green;
    final private int blue;
    final private boolean isParent;
    final private Date createTime;

    public Color(String name, int red, int green, int blue){
        this.name = name;
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.isParent = true;
        this.createTime = new Date();
    }

    public boolean isParent(){
        return this.isParent;
    }

    public String getName(){
        return this.name;
    }

    public int getRedValue(){
        return this.red;
    }

    public int getGreenValue(){
        return this.green;
    }

    public int getBlueValue(){
        return this.blue;
    }

    public long getCreateDate(){
        return this.createTime.getTime();
    }

    private Color(String name, int red, int green, int blue, boolean isParent){
        this.name = name;
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.isParent = isParent;
        this.createTime = new Date();
    }

    @Override
    public Color clone(){
        return new Color(this.name, this.red, this.green, this.blue, false);
    }
}