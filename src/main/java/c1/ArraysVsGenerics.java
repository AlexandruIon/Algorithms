package main.java.c1;

import java.util.ArrayList;
import java.util.List;

public class ArraysVsGenerics {


    public static void main(String[] args) {

        Object[] objs = new String[10];
        objs[0] = 1;
        objs[1] = "String";
        objs[2] = new Integer(2);

        for (Object obj : objs) {
            System.out.println(obj);
        }


        List<Object> o3 = new ArrayList<>();

    }

}
