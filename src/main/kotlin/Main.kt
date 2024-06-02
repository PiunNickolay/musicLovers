package ru.netology

fun main() {
    val payment = 10_001
    val isRegularCustomer = true
    var priceWithDiscount: Int = if((payment>=1001)&&(payment<10_001)) payment - 100
    else if(payment>=10_001) payment-(payment*5/100)
    else payment
    var priceWithRegular: Int = if(isRegularCustomer === true) priceWithDiscount-(priceWithDiscount*1/100)
    else priceWithDiscount
    println("Итоговая сумма покупки, включая скидки: $priceWithRegular")
}
