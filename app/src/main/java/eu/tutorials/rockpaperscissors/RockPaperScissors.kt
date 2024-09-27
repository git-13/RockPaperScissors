package eu.tutorials.rockpaperscissors

fun main(){
    var ComputerChoise = ""
    var UserChoise = ""
    println("Choose: Rock, Paper or Scissors")
    UserChoise = readln()

    val RandomNumber= (1..3).random()
    when (RandomNumber) {
        1 -> {
            ComputerChoise = "Rock"
        }
        2 -> {
            ComputerChoise = "Paper"
        }
        3 -> {
            ComputerChoise = "Scissors"
        }
    }
    println("Computer Choise is $ComputerChoise")

    val winner = when {
        UserChoise == ComputerChoise -> "Tie"
        UserChoise == "Rock" && ComputerChoise == "Scissors" -> "Player"
        UserChoise == "Paper" && ComputerChoise == "Rock" -> "Player"
        UserChoise == "Scissors" && ComputerChoise == "Paper" -> "Player"
        else -> "Computer"
    }
    if(winner == "Tie"){
        println("It's a tie")
    }else if (winner == "Player"){
        println("Player wins!")
    }else{
        println("Computer wins!")
    }
}