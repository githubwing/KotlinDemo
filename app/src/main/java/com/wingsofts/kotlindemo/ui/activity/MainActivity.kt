package com.wingsofts.kotlindemo.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.wingsofts.kotlindemo.R
import com.wingsofts.kotlindemo.toast
import com.wingsofts.kotlindemo.ui.adapter.MainAdapter
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    val adapter = MainAdapter()
    recyclerView.adapter = adapter
    recyclerView.layoutManager = LinearLayoutManager(this)
    adapter.setOnItemClickListener { pos->toast("$pos") }
  }
}
