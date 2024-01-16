package org.example

fun calculFactorial(num:Int) : Int{
    val resultat:Int
    if (num <= 1) resultat = 1
    else resultat = num * calculFactorial(num-1)
    return resultat
}