package post;

import java.util.Scanner;

public class Box5{
    float length;
    float width;
    int height;

    public Box5(float length, float width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    Box b5 = new Box(39.5f,27.5f,23);

    public boolean validate(){
        if(length>b5.length || width>b5.width || height>b5.height) return false;
        else return true;
    }
}
