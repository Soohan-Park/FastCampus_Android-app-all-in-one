package com.example.fastcampus_kotlin

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class ListViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        val carList = ArrayList<CarForList>()
        for (i in 1..10) {
            carList.add(CarForList("" + i + "번째 자동차", "" + i + "순위 엔진"))
        }

        val layoutInflater = LayoutInflater.from(this@ListViewActivity)
        val adapter = ListViewAdapter(carList, layoutInflater)

        val listView = findViewById<ListView>(R.id.listView)
        listView.adapter = adapter
        listView.setOnItemClickListener { parent, view, position, id ->
            val carName = (adapter.getItem(position) as CarForList).name
            val carEngine = (adapter.getItem(position) as CarForList).engine

            // 토스트 메시지 사용 방법
            Toast.makeText(this@ListViewActivity, carName + " " + carEngine, Toast.LENGTH_SHORT).show()
        }
    }
}

class ListViewAdapter(
    val carForList: ArrayList<CarForList>,
    val layoutInflater: LayoutInflater
): BaseAdapter() {
    override fun getCount(): Int {
        // 그리고자 하는 아이템 리스트의 전체 갯수
        return carForList.size
    }

    override fun getItem(position: Int): Any {
        // 그리고자 하는 아이템 리스트의 하나(포지션에 해당하는)
        return carForList.get(position)
    }

    override fun getItemId(position: Int): Long {
        // 해당 포지션에 위치해 있는 아이템뷰의 아이디 설정
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View
        val holder: ViewHolder

        if (convertView == null) {
            view = layoutInflater.inflate(R.layout.item_view, null)
            holder = ViewHolder()

            holder.carName = view.findViewById(R.id.car_name)
            holder.carEngine = view.findViewById(R.id.car_engine)

            view.tag = holder
        } else {
            holder = convertView.tag as ViewHolder
            view = convertView
        }
        holder.carName?.setText(carForList.get(position).name)
        holder.carEngine?.setText(carForList.get(position).engine)

        return view

//        // 뷰를 그리는 부분
//        val view = layoutInflater.inflate(R.layout.item_view, null)
//        var carNameTextView = view.findViewById<TextView>(R.id.car_name)
//        var carEngineTextView = view.findViewById<TextView>(R.id.car_engine)
//
//        carNameTextView.setText(carForList.get(position).name)
//        carEngineTextView.setText(carForList.get(position).engine)
//
//        return view
    }
}


class ViewHolder {
    var carName: TextView? = null
    var carEngine: TextView? = null
}