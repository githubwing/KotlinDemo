package com.wingsofts.kotlindemo.ui.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.wingsofts.kotlindemo.R
import kotlinx.android.synthetic.main.item_main.*
import kotlinx.android.synthetic.main.item_main.view.*

/**
 * Created by wing on 11/1/16.
 */

class MainAdapter : RecyclerView.Adapter<MainAdapter.ViewHolder>() {
  var mListener: ((pos: Int) -> Unit)? = null

  fun setOnItemClickListener(listener: ((pos: Int) -> Unit)){
    mListener = listener
  }
  override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
    with(holder?.itemView!!) {
      tv_content.text = "第 $position 条数据"
      setOnClickListener { mListener?.invoke(position) }
    }
  }

  override fun getItemCount(): Int {
    return 5
  }

  override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
    return ViewHolder(View.inflate(parent?.context, R.layout.item_main, null))
  }

  class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
  }
}

