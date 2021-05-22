package org.wit.kidsapp

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.SyncStateContract
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_question.*

class QuestionActivity : AppCompatActivity(), View.OnClickListener {
    private var mCurrentPosition:Int = 1
    private var mQuestionList: ArrayList<Question>? = null
    private var mSelectedChoicePosition : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)


        mQuestionList = Constants.getQuestions()

        val currentPosition = 1
        val question: Question? = questionList[currentPosition] -1
        progressBar.progress = currentPosition
        tv_progress.text = "$currentPosition" + "/" + progressBar.max
        tv_question.text = question!!.question
        iv_image.setImageResource(question.image)
        tv_choice_one.text = question.choiceOne
        tv_choice_two.text = question.choiceTwo
        tv_choice_three.text = question.choiceThree
        tv_choice_four.text = question.choiceFour



    }
    private fun defaultOptionView(){
        val choice = ArrayList<TextView>()
        choice.add(index:0, tv_choice_one)
       choice.add(1, tv_choice_two)
        choice.add(3, tv_choice_three)
        choice.add(4, tv_choice_four)

        for (choice in choices){
            choice.setTextColor(Color.ParseColor(colorString:"#78089")
            choice.typeface = Typeface.DEFAULT
            choice.backgrounp = ContextCompat.getDrawable(
                context:this,
            R.drawable.default_choice_border_bg
            )
        }
    }

    override fun onClick(v: View?) {
       when(v?.id){
           R.id.tv_choice_one  ->{
               selectedOptionView(v, selectedOptionNum: 1)
           }
       }
    }
    private fun selectedOptionView(tv: TextView,
                                   selectedOption: Int){
        defaultOptionView()
        mSelectedChoicePosition = selectedOptionNum()

        tv.setTextColor(Color.ParseColor(colorString:"#363A43")
        tv.setTypeface(tv.typeface, typeface_BOLD)
        tv.backgrounp = ContextCompat.getDrawable(
            context: this,
        R.drawable.selected_choice_border_bg
        )

    }
}