package com.example.myquizanswer

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    lateinit var software_eng: CardView
    lateinit var computer_network: CardView
    lateinit var softwareProjectManagement: CardView
    lateinit var webTechnology: CardView
    lateinit var dataCompression: CardView
    lateinit var tradition: CardView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        software_eng = findViewById(R.id.software_engineering)
        computer_network = findViewById(R.id.cn)
        softwareProjectManagement = findViewById(R.id.spm)
        webTechnology = findViewById(R.id.web)
        dataCompression = findViewById(R.id.dc)
        tradition = findViewById(R.id.tradition)

        software_eng.setOnClickListener {
            val softwareEngineeringIntent = Intent(this, SoftwareEngineering::class.java)
            startActivity(softwareEngineeringIntent)
        }
        computer_network.setOnClickListener {
            val CnIntent = Intent(this, ComputerNetwork::class.java)
            startActivity(CnIntent)
        }

        softwareProjectManagement.setOnClickListener {
            val spmIntent = Intent(this, SoftwareProjectManagement::class.java)
            startActivity(spmIntent)
        }
        webTechnology.setOnClickListener {
            val webIntent = Intent(this, WebTechnology::class.java)
            startActivity(webIntent)
        }
        dataCompression.setOnClickListener {
            val dcIntent = Intent(this, DataCompression::class.java)
            startActivity(dcIntent)
        }
        tradition.setOnClickListener {
            val traditionIntent = Intent(this, Tradition::class.java)
            startActivity(traditionIntent)
        }
    }
}