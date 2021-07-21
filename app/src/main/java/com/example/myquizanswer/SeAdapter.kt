package com.example.myquizanswer

import android.content.Context
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.browser.customtabs.CustomTabsIntent

class SeAdapter( context: Context,var mcq_unit: Array<String>, var mcq_url: Array<String>) :
    ArrayAdapter<String?>(context, R.layout.list_item, R.id.name, mcq_unit) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var singleItem = convertView
        var holder: ListHolder? = null
        if (singleItem == null) {
            val layoutInflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            singleItem = layoutInflater.inflate(R.layout.list_item, parent, false)
            holder = ListHolder(singleItem)
            singleItem.tag = holder
        } else {
            holder = singleItem.tag as ListHolder
        }
        holder.mcq_units.text = mcq_unit[position]
        singleItem!!.setOnClickListener {
//            val openLinks = Intent(Intent.ACTION_VIEW, Uri.parse(mcq_url[position]))
//            context.startActivity(openLinks)
            val builder=CustomTabsIntent.Builder()
            val customTabsIntent=builder.build()
            customTabsIntent.launchUrl(context,Uri.parse(mcq_url[position]))
        }
        return singleItem
    }
}
