package com.example.myquizanswer

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class SoftwareProjectManagement : AppCompatActivity() {
    var quiz_spm_names =
        arrayOf("quiz-1", "quiz-2", "quiz-3", "quiz-4", "quiz-5", "quiz-6", "quiz-7","quiz-8")
    var quiz_spm_links = arrayOf(
        "https://www.computersciencejunction.in/2016/10/29/objective-questions-and-ansnagement-html/wers-in-software-project-ma",
        "https://tutorialsinhand.com/aptitudes/software-engineering-mcq/software-project-management-mcq/software-project-management-mcq-set-1.aspx",
        "https://examradar.com/software-engineering-project-management-concepts-mcqs-type-questions-answers/",
        "https://t4tutorials.com/software-project-management-mcqs/",
        "https://www.sanfoundry.com/software-engg-mcqs-project-management/",
        "https://www.dheerajhitech.in/software-project-management-multiple-choice-questions-with-answers/",
        "https://www.deepcrazyworld.com/software-project-management-mcq/",
        "https://www.eguardian.co.in/software-project-management-mcq-pdf/"
    )


    lateinit var list_spm_mcq: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_software_project_management)
        list_spm_mcq = findViewById(R.id.list2)
        val seAdapter = SeAdapter(this, quiz_spm_names, quiz_spm_links)
        list_spm_mcq.adapter = seAdapter
    }
}