data class Player(val name: String, val age: Int,val height:Int)
fun main() {
    fun greeting(){println("Welcome back…")}
    val lambdaGreeting = { println("Welcome back…") }
    fun userGreeting(username:String){println("Welcome back $username")}
    val lambdaUserGreeting = { username:String -> println("Welcome back $username") }
    fun addOpr(number1:Float,number2:Float){
        var sum = number1 + number2
        println("$number1 + $number2 = $sum")
    }
    val lambdAddOpr = { number1:Float,number2:Float ->
        var sum = number1 + number2
        println("$number1 + $number2 = $sum")
    }
    fun grades(grade:Int):String{
        when{
            grade>=60 -> return "Pass"
            else -> return "Fail"
        }
    }
    val lambdGrades = { grade:Int ->
        when{
            grade>=60 ->  "Pass"
            else ->  "Fail"
        }
    }
   fun printName(first: String, last: String):String {
       return "My name is $first $last"
    }
    val lambdPrintName = { first: String, last: String ->
        "My name is $first $last"
    }
    greeting()
    lambdaGreeting()
    userGreeting("Linah")
    lambdaUserGreeting("Linah")
    addOpr(10f,12f)
    lambdAddOpr(10f,12f)
    println(grades(69))
    println(lambdGrades(69))
    println(printName("Linah","Alkhurayyif"))
    println(lambdPrintName("Linah","Alkhurayyif"))

    val player = listOf(
        Player("Linah", 24,165),
        Player("Sara", 12,150),
        Player("Jane", 12,160),
        Player("Lisa", 25,170),
        Player("Fred", 30,180),
        Player("Olivia", 23,181),
        Player("Emma", 22,155),
        Player("Mia", 20,166),
        Player("Noah", 30,188),
        Player("Mary", 33,160),
        Player("Jessica", 19,165),
        Player("David", 32,190),
        Player("Richard", 28,198),
        Player("Ashley", 27,178),
        Player("Paul", 26,189),
        Player("Eric", 25,187),
        Player("Angela", 38,183),
        Player("Helen", 32,179),
        Player("Aaron", 31,191),
        Player("Jack", 22,186)
    )
    val lambdaSort = {player: List<Player> -> player.sortedBy { it.height }}
    val lambdaPrint ={lambdaSort: List<Player> ->  for(player in lambdaSort){
        println("Name: ${player.name},Age: ${player.age} Height: ${player.height}")

    } }

    lambdaPrint(lambdaSort(player))
}



