package org.example;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        Meth meth = new Meth();
        System.out.println(meth.longestCommonPrefix(strs));
    }
}