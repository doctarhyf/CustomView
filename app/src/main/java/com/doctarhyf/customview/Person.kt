package com.doctarhyf.customview

class Person internal constructor(var age: Int, var name: String?){




    fun presentation() : String {
        return "My name is ${name} and I'm ${age} years old!"
    }

}
