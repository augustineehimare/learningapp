package org.wit.kidsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.decorView.systemUiVisibility = view.SYSTEM_UI_FLAG_FULLSCREEN

        //i need to place a bottom here
        btn_begin.setOnClickListener {
            if (et_name.text.toString().isEmpty()) {
                Toast.makeText(this,
                text:"name is required", Toast.LENGTH_SHORT ).show()

            }else{
                val intent = Intent( packageContext: this, QuestionActivity::class.java)
                beginActivity(intent)
                finish()

        }
        }
    }
}