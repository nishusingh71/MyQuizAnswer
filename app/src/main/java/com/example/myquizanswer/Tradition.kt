package com.example.myquizanswer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class Tradition : AppCompatActivity() {
    var quiz_tr_names = arrayOf("quiz-1", "quiz-2", "quiz-3", "quiz-4", "quiz-5")
    var quiz_tr_links = arrayOf(
        "https://www.gktoday.in/quizbase/indian-culture-general-studies-mcqs",
        "https://drive.google.com/file/d/1vXFS0HH7H6k36VPCMM0A-GKGmsFx-dDI/view?usp=sharing",
        "https://engineeringinterviewquestions.com/software-engineering-multiple-choice-questions-and-answers/",
        "https://www.careerride.com/mcq-daily/software-engineering-8-77.aspx",
        "https://www.sanfoundry.com/software-engg-mcqs-software-engineering-ethics-1/"
    )


    lateinit var list_tr_mcq: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tradition)
        list_tr_mcq = findViewById(R.id.list6)
        val seAdapter = SeAdapter(this, quiz_tr_names, quiz_tr_links)
        list_tr_mcq.adapter = seAdapter
    }
}