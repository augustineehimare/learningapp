package org.wit.kidsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.SyncStateContract

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val username = intent.getStringExtra(Constants.USER_NAME)
        tv_name.text = username
        val totalQuestion = intent.getStringExtra(Constants.TOTAL_QUESTIONS, default)
        val correctAnswer = intent.getStringExtra(Constants.CORRECT_ANSWER, default)
        tv_score.text = "your score is "

    }
}