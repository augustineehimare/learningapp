package org.wit.kidsapp

import Question

object Constants {
    fun getQuestion(): ArrayList<Question>{
        val questionList = ArrayList<Question>()
        val que1 = Question(
            1,
            "what is the name of this fruit?",
                    R.drawable.ic__flag_of_orange,
            choiceOne: "Orange",
            choiceTwo: "Apple",
            choiceThree: "Mango",
            choiceFour: "Banana",
            correctAnswer:1
        )
        questionList.add(que1)
        return questionList

    }
}