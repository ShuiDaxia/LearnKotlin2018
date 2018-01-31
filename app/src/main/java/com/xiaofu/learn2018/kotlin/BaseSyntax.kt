package com.xiaofu.learn2018.kotlin

/**
 * Author:          小夫
 * Date:            2018/1/31 9:19
 * Description:     描述该类功能
 *
 * 大人者，言不必信，行不必果，惟义所在
 */
class BaseSyntax {
    /**
     * 基础地址
     * http://kotlinlang.org/docs/reference/basic-syntax.html
     */

    // 带返回参数的两种写法,如果不声明返回值类型 及:Int,默认等于 :Unit对应java的void
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    fun plus(a: Int, b: Int) = a + b

    // 无返回值函数
    fun sayHello(s: String) {
        // 类似C语言的输出语句写法，末尾带ln会自动添加换行
        print(s)
        println()
        println(s)
    }

    /**
     * 变量声明
     * 1.val 只读，类似java的final变量 var可允许被改变
     * 2.可以指定类型：后添加类型，或者由系统自动推断类型，相对java轻松许多
     */
    var name: String = "水大侠"
    var age: Int = 18

    val player = "水之涘"
    val playerAge = 18

    // 第一种是kotlin写法，简单明了，方便快捷，第二种是java的拼接方法，建议熟练掌握第一种
    fun stringFormat(name: String, age: Int) {
        println("my name is $name,and my age is $age,my brother age is ${age + 10}")
        println("my name is " + name + ",and my age is" + age + ",my brother age is " + (age + 10))
    }



}