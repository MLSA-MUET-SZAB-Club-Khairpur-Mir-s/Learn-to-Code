import java.util.*

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)

    print("Enter a number: ")
    val num = reader.nextInt()

    if (num == 0)
        println("$num is neither even nor odd.")
    else if (num % 2 == 0)
        println("$num is even.")
    else
        println("$num is odd.")
}