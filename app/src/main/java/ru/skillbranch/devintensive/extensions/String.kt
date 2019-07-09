
package ru.skillbranch.devintensive.extensions

fun String.truncate(value: Int = 16): String{
    if (this.length>=value){
        if(this[value-1]==' ') this.substring(0,value-1)
        else this.substring(0,value)
        this.padEnd(3,'.')
    }
    return this
}