fun main() {
    val likes = 16

    val word = when {

        likes % 100 in 11..14 -> "людям"

        likes % 10 == 1 -> "человеку"

        else -> "людям"
    }
    println("Понравилось $likes $word")
}