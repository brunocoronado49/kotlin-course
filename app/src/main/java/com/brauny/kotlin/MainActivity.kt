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
        arrays()
        maps()
        loops()
        nullSafety()
        stringFun() // Hello World
        intFunction() // 24
        addFun(23, 52) // 75
    }

    // Functions
    private fun stringFun() : String {
        return "Hello World"
    }

    private fun intFunction() : Int {
        return 24
    }

    private fun addFun(numberA: Int, numberB: Int) : Int {
        return numberA + numberB
    }

    // Nullsafety
    private fun nullSafety() {
        var myStrig: String? = "Francisco"
        myStrig = null
        println(myStrig)

        var myIntSafety: Int? = 0
        myIntSafety = null
        println(myIntSafety)

        println(myStrig?.length)

        myStrig?.let {
            // println(myStrig)
        } ?: run {
            println(this)
        }
    }

    // Loops for - while
    private fun loops() {
        // For
        val myArray: List<String> = listOf("bruno", "francisco", "maria", "jonas")
        val myMap: MutableMap<String, Int> = mutableMapOf("brauny" to 1, "bruce" to 2, "franco" to 3)

        for (myString: String in myArray) {
            println(myString) // Each data of myArray
        }

        for (myElement in myMap) {
            println("${myElement.key} - ${myElement.value}") // brauny - 1 ...
        }

        for (num in 0..10) {
            println(num)
        }

        // While
        var age: Int = 0

        while (age < 30) {
            age++
            println(age)
        }
    }

    // Maps in Kotlin
    private fun maps() {
        var myMap: Map<String, Int> = mapOf()
        var myMutableMap: Map<String, Int> = mapOf()
        println(myMap) // {}
        println(myMutableMap) // {}

        // Map not mutable
        myMap = mapOf("Bruce" to 24, "Francisco" to 50)
        println(myMap)

        // Map mutable
        myMutableMap = mutableMapOf()
        myMutableMap["Ana"] = 10
        myMutableMap.put("Maria", 14)
        println(myMutableMap)

    }

    // Arrays in Kotlin
    private fun arrays() {
        // The arrays in kotlin only accept one type of data in array
        val name: String = "Bruce"
        val rol: String = "front dev"
        val age: String = "24"
        val company: String = "Google"

        // array
        val myArray = arrayListOf<String>(name, rol, age, company)
        println(myArray)

        // Add one element
        val myAnotherArray = arrayListOf<Number>()
        myAnotherArray.add(20)
        myAnotherArray.add(33)
        myAnotherArray.add(56)
        myAnotherArray.add(12)
        myAnotherArray.add(12)
        println(myAnotherArray)

        // Add more elements
        myAnotherArray.addAll(listOf(99, 76, 54))
        println(myAnotherArray)

        // Access to one element
        val myName: String = myArray[0]
        println(myName)

        // Rename one element
        myArray[3] = "The big company"
        println(myArray[3])

        // touring the array
        myArray.forEach {
            println(it)
        }
        myAnotherArray.map {
            print(it)
        }

        // Take one elemnent
        myArray.first() // Take the first element
        myArray.last() // Take the last element

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