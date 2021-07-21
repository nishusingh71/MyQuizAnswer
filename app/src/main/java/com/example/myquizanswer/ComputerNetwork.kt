package com.example.myquizanswer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class ComputerNetwork : AppCompatActivity() {
    var quiz_names_cn = arrayOf("Computer Network Pdf","quiz-1", "quiz-2", "quiz-3", "quiz-4", "quiz-5")
    var quiz_cn_links = arrayOf(
        "https://drive.google.com/file/d/1gq5lSuFQwOkoX0ZUT-sH6Zp2W9C_N_ty/view?usp=sharing",
        "https://www.javatpoint.com/computer-network-mcq#",
        "http://www.treeknox.com/computer/languages/computer-networks/",
        "https://meritnotes.com/computer-quiz/computer-networks-quiz/1-450/",
        "https://examradar.com/computer-networking-basics-mcqs/",
        "https://www.sanfoundry.com/computer-network-questions-answers/"
    )
    lateinit var list_cn:ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_computer_network)
        list_cn=findViewById(R.id.list4)
        val cnAdapter = SeAdapter(this, quiz_names_cn, quiz_cn_links)
        list_cn.adapter = cnAdapter
    }
}