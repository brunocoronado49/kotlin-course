package com.brauny.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        varAndConst()
        dataType()
        sentenceIf()
        sentenceWhen()
    }

    // Sentence when
    private fun sentenceWhen() {
        val age: Int = 24

        when(age) {
            20 -> {
                println("The age is not the same")
            }
            32 -> {
                println("The age is to big")
            }
            24 -> {
                println("this is the correct age")
            }
            else -> {
                println("This age not exists")
            }
        }
    }

    // Learning about variables and constants
    private fun varAndConst() {
        // Variables: For make variables do with 'var'
        var myVar: String = "Hello Francisco"
        println(myVar)

        myVar = "Hello Buce"
        println(myVar)

        var mySecondVar: String = "Hello my friend"
        println(mySecondVar)

        mySecondVar = myVar
        println(mySecondVar)

        // Constants: For make constants do with 'val'
        val age: Int = 20
        println(age)

        val myNum: Int = 5
        val myDoubleNum: Double = 5.99
        val myLetter: Char = 'D'
        val myBoolean: Boolean = true
        val myText: String = "Hello"

        println(myNum)
        println(myDoubleNum)
        println(myLetter)
        println(myBoolean)
        println(myText)
    }

    // Learning about data types
    private fun dataType() {
        // String
        val str: String = "Hello i'm a String"
        println(str)

        val str2: String = "i'm a dev"
        println(str2)

        val str3 = "$str $str2"
        println(str3)

        // Number
        val int: Int = 20
        println(int)

        val double: Double = 20.20
        println(double)

        // Logics
        val bool: Boolean = false
        println(bool)

        val myBoolVarTrue: Boolean = true
        val myBoolVarFalse: Boolean = false
        println(myBoolVarFalse == myBoolVarTrue) // false
    }

    // Sentences if - Condition
    private fun sentenceIf() {
        // Condition with number
        val myNumber: Int = 10
        if (myNumber <= 10) {
            println("$myNumber is lees or equals to 10")
        } else {
            println("$myNumber is not valid")
        }

        // Condition with logic
        val gamer: Boolean = true
        val dev: Boolean = false

        if (gamer == dev) {
            println("The guy is not a dev")
        } else {
            println("The guy is a dev")
        }

        if (gamer || dev) {
            println("The guy is gamer or dev")
        } else {
            println("Hello there")
        }

        if (gamer && dev) {
            println("The guy is not equals")
        } else {
            println(null)
        }

        if (10 > 39 && 20 > 10) {
            println("This condition is false")
        } else {
          println("This condition is true")
        }

        if (10 > 39 || 20 > 10) {
            println("This condition is true")
        } else {
            println("This condition is false")
        }
    }
}