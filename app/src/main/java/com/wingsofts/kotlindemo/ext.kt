package com.wingsofts.kotlindemo

import android.content.Context
import android.widget.Toast

/**
 * Created by wing on 2016/10/13.
 */
fun Context.toast(msg:String){
    Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()
}