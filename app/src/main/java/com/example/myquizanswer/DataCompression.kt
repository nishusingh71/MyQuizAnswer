package com.example.myquizanswer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class DataCompression : AppCompatActivity() {
    var quiz_dc_names = arrayOf("quiz-1", "quiz-2", "quiz-3", "quiz-4", "Data Compression pdf")
    var quiz_dc_links = arrayOf(
        "https://thecodingshef.com/all-unit-mcqs-of-data-compression/",
        "https://letsfindcourse.com/technical-questions/dsa-mcq/data-compression-mcq-questions-and-answers",
        "https://rtsall.com/2021/06/data-compression-multiple-choice-based-questions.html",
        "https://www.dheerajhitech.in/all-unit-mcqs-of-data-compression-aktu-exam-2021-2/",
        "https://drive.google.com/file/d/1qxqueuhhLOk5P95LnxGGECcUBHTdUYx3/view?usp=sharing"
    )


    lateinit var list_dc_mcq: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_compression)
        list_dc_mcq = findViewById(R.id.list3)
        val seAdapter = SeAdapter(this, quiz_dc_names, quiz_dc_links)
        list_dc_mcq.adapter = seAdapter
    }
}