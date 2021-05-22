import androidx.core.view.OneShotPreDrawListener

data class Question (
    val id: Int,
    val question: String,
    val image: int,
    val choiceOne: String,
    val choiceTwo: String,
    val choiceThree: String,
    val choiceFour: String,
    val rightAnswer: Int
)


