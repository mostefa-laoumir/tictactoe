package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
    protected fun clk(view:View){
        val buSelected = view as Button
        var cellID =0
        when(buSelected.id){
            R.id.a1 -> cellID=1
            R.id.a2 -> cellID=2
            R.id.a3 -> cellID=3
            R.id.b1 -> cellID=4
            R.id.b2 -> cellID=5
            R.id.b3 -> cellID=6
            R.id.c1 -> cellID=7
            R.id.c2 -> cellID=8
            R.id.c3 -> cellID=9

        }
        Toast.makeText(this,"ID:"+cellID,Toast.LENGTH_LONG).show()
    }
}
