package com.example.myquizanswer


import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class SoftwareEngineering : AppCompatActivity() {
    var quiz_names = arrayOf(
        "software Engineering pdf",
        "quiz-1",
        "quiz-2",
        "quiz-3",
        "quiz-4",
        "ethics-1"
    )
    var quiz_links = arrayOf(
        "https://drive.google.com/file/d/1xhEleNi_P8Tky021dCAUDWhutxc2qEY1/view?usp=sharing",
        "https://www.javatpoint.com/software-engineering-mcq#",
        "https://letsfindcourse.com/software-engineering/software-engineering-mcq",
        "https://engineeringinterviewquestions.com/software-engineering-multiple-choice-questions-and-answers/",
        "https://www.careerride.com/mcq-daily/software-engineering-8-77.aspx",
        "https://www.sanfoundry.com/software-engg-mcqs-software-engineering-ethics-1/",
    )


    lateinit var list_se_mcq: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_software_engineering)

        list_se_mcq = findViewById(R.id.list1)
        val seAdapter = SeAdapter(this, quiz_names, quiz_links)
        list_se_mcq.adapter = seAdapter

    }
}


