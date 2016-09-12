package mastermind

import java.util.*

fun playMastermind(
        secret: String = generateSecret(),
        player: Player = RealPlayer()
) {
    TODO()
}

fun generateSecret(
        differentLetters: Boolean = true
): String = TODO()


interface Player {
    fun guess(): String
    fun receiveEvaluation(complete: Boolean, positions: Int, letters: Int)
}

class RealPlayer : Player {
    private val scanner = Scanner(System.`in`)

    override fun guess(): String {
        print("Your guess: ")
        return scanner.next()
    }

    override fun receiveEvaluation(complete: Boolean, positions: Int, letters: Int) {
        if (complete) {
            println("You are correct!")
        } else {
            println("Positions: $positions; letters: $letters.")
        }
    }
}