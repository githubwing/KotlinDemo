package com.wingsofts.kotlindemo.ui.activity

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.wingsofts.kotlindemo.R
import com.wingsofts.kotlindemo.User
import com.wingsofts.kotlindemo.toast

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        toast(intent.getSerializableExtra(USER).toString())
    }

    companion object{
        val USER = "USER"
        fun startActivity(context: Context,user: User){
            val intent = Intent(context,SecondActivity::class.java)
            intent.putExtra(USER,user)
            context.startActivity(intent)
        }
    }
}
