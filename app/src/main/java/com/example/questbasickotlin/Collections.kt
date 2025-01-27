package com.example.questbasickotlin
//List adalah kumpulan data yang disusun secara berurutan
//List bersifat ordered, yang artinya data yang dimasukkan akan memiliki posisi sesuai urutan
//List bersifat mutable dan read only, yang artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
//List Read-Only menggunakan listOf
//List Mutable menggunakan mutablelistOf

fun ContohList(){
    println("=== List ===")
    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)

    val shape: MutableList<String> = mutableListOf("Circle", "Square", "Triangle")
    println(shape)

    shape.add("Circle")
    println(shape)

    shape.remove("Triangle")
    println(shape)

    shape[0] = "Oval"
    println(shape)

    val shapesLocked: List<String> = shape
    println(shapesLocked)
}

//Set adalah kumpulan data yang tidak memiliki posisi atau urutan tertentu dan hanya akan menyimpan data unik
//Set bersifat unordered, yang artinya data yang dimasukkan tidak memiliki posisi tertentu
//Set bersifat mutable dan read only, yang artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
//Set Read-Only menggunakan setOf
//Set Mutable menggunakan mutableSetOf

fun ContohSet(){
    println()
    println("=== Set ===")

    val readOnlyAbjad = setOf("A", "B", "C")
    println(readOnlyAbjad)

    val shape: MutableSet<String> = mutableSetOf("Circle", "Square", "Triangle")
    println(shape)

    shape.add("Rectangle")
    println(shape)

    shape.remove("Circle")
    println(shape)

    val shapesLocked: Set<String> = shape
    println(shapesLocked)
}

//Map adalah kumpulan data yang disusun dalam pasangan key-value
//Map bersifat unordered, yang artinya data yang dimasukkan tidak memiliki posisis tertentu
//Map bersifat mutable dan read only, yang artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
//Map Read-Only menggunakan mapOf
//Map Mutable menggunakan mutableMapOf

fun ContohMap(){
    println()
    println("=== Map ===")

    val readOnlyShape: Map<String, Int> = mapOf("Circle" to 1, "Square" to 2, "Triangel" to 3)
    println(readOnlyShape)

    val shape: MutableMap<String, Int> = mutableMapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(shape)

    shape["Rectangle"] = 4
    println(shape)

    shape.remove("Circle")
    println(shape)

    shape["Square"] = 5
    println(shape)

    val shapesLocked: Map<String, Int> = shape
    println(shapesLocked)
}

fun main(){
    ContohList()
    ContohSet()
    ContohMap()
}
