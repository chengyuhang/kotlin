package com.yuhang.Basics

class Hello {
    /**
     * 方法
     */
    fun main() {
        println("Hello World")
    }

    /**
     * 加法1
     * 方法 返回Int
     */
    fun sum(a: Int, b: Int): Int {
        return a + b;
    }

    /**
     * 加法2
     * 方法 返回Int
     */
    fun sum_1(a: Int, b: Int) = a + b

    /**
     * 方法 返回无意义类型1
     */
    fun printSum1(a: Int, b: Int): Unit {
        println("sum of $a and $b is ${a + b}")
    }

    /**
     * 方法 返回无意义类型2
     */
    fun printSum2(a: Int, b: Int) {
        println("sum of $a and $b is ${a + b}")
    }


}