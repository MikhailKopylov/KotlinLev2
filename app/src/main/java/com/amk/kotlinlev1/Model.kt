package com.amk.kotlinlev1

fun interface Listener{
    fun handle(data:String)
}
class Model(val listener: Listener) {

    private var counter = 0

    fun getData():String{
        return counter++.toString()
    }

    fun result(){
        listener.handle(getData())
    }
}