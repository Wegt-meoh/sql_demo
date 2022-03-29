package com.example.sql_demo.demo;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyTest {
    public static void main(String[] args) {
        List<BigInteger> res=new ArrayList<>();
        res.add(BigInteger.probablePrime(1024, new Random()));
        res.add(BigInteger.probablePrime(1024, new Random()));
        System.out.println(res.get(0));
        System.out.println(res.get(1));
    }
}
