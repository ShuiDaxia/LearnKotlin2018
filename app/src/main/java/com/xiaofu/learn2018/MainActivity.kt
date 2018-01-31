package com.xiaofu.learn2018

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.xiaofu.learn2018.kotlin.BaseSyntax

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 实例化对象
        val obj = BaseSyntax()
        // .形式访问，var的变量可以直接修改
        println(obj.age)
        println(obj.name)
        println(obj.player)
        println(obj.playerAge)
        println("---------------------")
        obj.name = "修改过的水大侠"
        // 注意这里的小坑 obj.name看着是一个简单的东西，如果没有用{}他等于是读取了前面的obj对象，打印出地址
        println("修改后的名字：${obj.name}")

        // 自行尝试访问基础语法的别的方法，另外自行学习官方文档别的语法比如 常用的for循环 if语句以及switch
    }
}
