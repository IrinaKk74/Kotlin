fun main() {
    val amount = 15000.0
    val isRegularCustomer = true

    val priceAfterBaseDiscount = when {
        amount <= 1000 -> amount
        amount <= 10000 -> amount - 100
        else -> amount * 0.95
    }

    val finalPrice = if (isRegularCustomer) {
        priceAfterBaseDiscount * 0.99
    } else {
        priceAfterBaseDiscount
    }

    println("Сумма покупки: $amount руб.")
    println("Постоянный покупатель: $isRegularCustomer")
    println("Итоговая цена: $finalPrice руб.")
}