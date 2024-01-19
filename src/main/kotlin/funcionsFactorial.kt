package org.example


/**
 * Aquesta funció multiplica el número que toca a partir del número donat, si dones el num '4' llavors multiplicarà
 * '4' per '3' i aixi restant un fins que ja no hi hagin números per multiplicar.
 * @author Martí Vilàs
 * @param  calculFactorial
 */
fun calculFactorial(num:Int) : Int{
    val resultat:Int
    if (num <= 1) resultat = 1
    else resultat = num * calculFactorial(num-1)
    return resultat
}

/**
 *Aquesta funció fa el mateix que la funcio anterior 'calcuFactorial' però a la hora de multiplicar, multiplicarà primer
 * número que toqui per si mateix i després pel número seguent. És a dir, si posem '4' fara '4*4' despres farà
 * '16'*(3*3) i aixi fins que sigui '1*1'.
 * @author Martí Vilàs
 */
fun calculFactorialDoble(num:Int) : Int{
    val resultat:Int
    if (num <= 1) resultat = 1
    else resultat = (num * num) * calculFactorialDoble(num-1)
    return resultat
}

/***
 *
 */
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
fun invertirNum(num:Int){
    if (num<10) print(num)
    else {
        print(num%10)
        invertirNum(num/10)
    }
}
fun fibonacci(num:Int):Int{
    return if (num==0) 0
        else if (num==1) 1
    else fibonacci(num-1)+ fibonacci(num-2)
}

/**
 * Funció que llegeix l'últim número i compara amb el número anterior, si el número anterior es inferior llavors compara
 * amb l'anterior fins a compararlos tots. En cas que els números siguin creixents, és a dir que tots els números siguin
 * superiors als números anteriors retorna 'true', en cas contrari retorna 'false'.
 * @author Martí Vilàs, Hugo Alonso.
 * @since 17/01/2024
 */
fun llegirNumCreixent(num:Int) : Boolean{
    val MOD=num%10

    if (MOD<(num/10)%10){
        return false
    }else if (MOD>(num/10)%10){
        if (!llegirNumCreixent(num/10)) return false
        else if (llegirNumCreixent(num/10)) return true
    }
    return true
}


fun reduccioDeDigits(num:Int): Int{
    var suma=0
    var ultimDigit=num
    do {
        suma+=(ultimDigit%10)
        ultimDigit/10
    }while ((ultimDigit/10)!=0)
   suma+=ultimDigit
    return suma


}

