package com.example.dinerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodlist= arrayListOf("Chines","Hamburgers","Pizza","Mc Donalds","Barros pizza")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decidebtn.setOnClickListener {

            /*val random = Random()
            val randomlist = random.nextInt(foodlist.count())
            fudtxtv.text= foodlist[randomlist]*/

            val random=Random()
            val randomlist=random.nextInt(foodlist.count())
            fudtxtv.text=foodlist[randomlist]
        }

        afbtn.setOnClickListener {
            val newfood=afetxt.text.toString()
            foodlist.add(newfood)
            afetxt.text.clear()

        }
    }
}
