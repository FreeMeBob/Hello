package com.company;

import java.util.ArrayList;

public class Person {

    public void nameList(){

        ArrayList<String> namelist = new ArrayList<String>();
        namelist.add("bob");
        namelist.add("voldemort");
        namelist.add("kongyilin");
        namelist.add("shabi");
        for (String s:namelist) {
            System.out.println(s);
        }
    }
}
