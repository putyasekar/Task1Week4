package com.diki.idn.task1week4

import android.accounts.AuthenticatorDescription
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var cityAdapter: CityAdapter
    private var models = arrayListOf<Model>()
    private lateinit var title: Array<String>
    private lateinit var description: Array<String>
    private val objectList = arrayOf(
        "Jakarta",
        "Batam",
        "Surabaya",
        "Malang",
        "Yogyakarta",
        "Lampung",
        "Bogor",
        "Pekanbaru",
        "Medan",
        "Palembang",
        "Bandung",
        "Indramayu",
        "Tanjung Pinang",
        "Padang",
        "Semarang"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val listAdapter = ArrayAdapter<String>(
//            this,
//            android.R.layout.simple_expandable_list_item_1,
//            android.R.id.text1,
//            objectList
//        )
        cityAdapter = CityAdapter(this)
        lv_bottomsheet.adapter = cityAdapter
        attachData()
        loadData()
    }

    private fun loadData() {
        for (p0 in title.indices) {
            val model = Model(
                title[p0],
                description[p0]
            )
            models.add(model)
        }
        cityAdapter.cities =models
    }

    private fun attachData() {
        title = resources.getStringArray(R.array.capital_city)
        description = resources.getStringArray(R.array.description)
    }
}
