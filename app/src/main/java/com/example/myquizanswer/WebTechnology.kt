package com.example.myquizanswer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class WebTechnology : AppCompatActivity() {
    var quiz_web_names = arrayOf("quiz-1", "quiz-2", "quiz-3", "quiz-4", "Web Technology pdf")
    var quiz_web_links = arrayOf(
        "https://www.careerride.com/mcq/web-technologies-programming-language-mcq-questions-52.aspx",
        "https://engineeringinterviewquestions.com/web-technologies-multiple-choice-questions-and-answers/",
        "https://www.eguardian.co.in/web-technologies-mcq/",
        "https://compsciedu.com/mcq-questions/Web-Technologies/XML",
        "https://drive.google.com/file/d/1CU8rLf8hXLOOeVM6-zK2seJUhb8ljOYk/view?usp=sharing"
    )


    lateinit var list_web_mcq: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_technology)
        list_web_mcq = findViewById(R.id.list5)
        val seAdapter = SeAdapter(this, quiz_web_names, quiz_web_links)
        list_web_mcq.adapter = seAdapter
    }
}