package com.example.akavall;

import static spark.Spark.*;

public class MyClass {

    private static boolean isEven(String s) {
        int myInt = Integer.parseInt(s);
        if (myInt % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        port(8000);
        get("/hello", (req, res) -> "Hello From Java");

        get("/isprime", (req, res) -> req.queryParams("num") + " is prime: " +

                Utils.isPrime(Long.parseLong(req.queryParams("num"))));
    }
}