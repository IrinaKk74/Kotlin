//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val amount = 10000.0


    val rawCommission = amount * 0.0075


    val commission = if (rawCommission < 35.0) 35.0 else rawCommission

    println("Сумма перевода: $amount руб.")
    println("Комиссия: $commission руб.")
}