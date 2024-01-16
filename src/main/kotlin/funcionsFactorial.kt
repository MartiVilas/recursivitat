package org.example

fun calculFactorial(num:Int) : Int{
    val resultat:Int
    if (num <= 1) resultat = 1
    else resultat = num * calculFactorial(num-1)
    return resultat
}

fun calculFactorialDoble(num:Int) : Int{
    val resultat:Int
    if (num <= 1) resultat = 1
    else resultat = (num * num) * calculFactorialDoble(num-1)
    return resultat
}
fun calculFactorialImpres(num:Int) : Int{
    print("$num x ")
    val resultat:Int
    if (num <= 1) resultat = 1
    else resultat = num * calculFactorialImpres(num-1)
    return resultat
}

fun numerosComposats(num:Int,quant:Int=0):Int{
    return if (num/10<1) quant+1
    else numerosComposats(num/10,quant+1)
}


