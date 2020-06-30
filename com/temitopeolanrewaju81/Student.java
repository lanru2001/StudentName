package com.temitopeolanrewaju81;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Student {

    public static void main(String[] args) {
	// write your code here

        List<String> studentName= new ArrayList<>();
        studentName.add("Prithviatani");
        studentName.add("Azeez");
        studentName.add("Deep");
        studentName.add("Junyu Liu");
        studentName.add("Sahil Slngh Sandhu");
        studentName.add("Lawrence");
        studentName.add("Shahriar Kabir");
        studentName.add("Trivediakshay");
        studentName.add("Mohammed");
        studentName.add("Tao");
        studentName.add("PQ");

        int randomIndex= (int) (Math.random()*studentName.size());
        JOptionPane.showMessageDialog(null,studentName.get(randomIndex));
    }
}
