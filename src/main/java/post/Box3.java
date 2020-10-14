package post;

import java.util.Scanner;

public class Box3{
    float length;
    float width;
    int height;

    public Box3(float length, float width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    Box b3 = new Box(23,14,13);


    public boolean validate(){
        if(length>b3.length || width>b3.width || height>b3.height) return false;
        else return true;
    }
}
