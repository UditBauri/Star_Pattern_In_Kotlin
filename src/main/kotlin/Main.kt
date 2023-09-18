
fun main() {
    // Star_Pattern_In_Kotlin..................

    println("Enter an Integer value to print star pattern")
    val userInput = readln().toInt()
    for(item in 1..userInput){
        for(data in item downTo 1){
            print("*")
        }
        println("")
    }
}