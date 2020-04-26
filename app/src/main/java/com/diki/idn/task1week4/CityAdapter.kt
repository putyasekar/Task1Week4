package com.diki.idn.task1week4

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class CityAdapter internal constructor(private val context: Context) : BaseAdapter() {
    internal var cities = arrayListOf<Model>()

    override fun getView(p0: Int, p1: View?, p2: ViewGroup): View {
        var view = p1
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.activity_item_row, p2, false)
        }
        val viewHolder = ViewHolder(view as View)
        val city = getItem(p0) as Model
        viewHolder.bind(city)
        return view
    }

    override fun getItem(p0: Int): Any {
        return cities[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getCount(): Int = cities.size

    private inner class ViewHolder internal constructor(view: View) {
        private val tvTitle: TextView = view.findViewById(R.id.tv_title)
        private val tvDesc: TextView = view.findViewById(R.id.tv_desc)

        internal fun bind(model: Model) {
            tvTitle.setText(model.title)
            tvDesc.text = model.desc

        }
    }
}

