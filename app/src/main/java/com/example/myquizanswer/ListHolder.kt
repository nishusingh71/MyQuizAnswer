package com.example.myquizanswer

import android.view.View
import android.widget.TextView

class ListHolder internal constructor(v: View) {
     var mcq_units: TextView

    init {
        mcq_units = v.findViewById(R.id.name)
    }
}
