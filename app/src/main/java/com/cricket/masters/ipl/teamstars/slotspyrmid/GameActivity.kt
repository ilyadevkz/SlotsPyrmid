package com.cricket.masters.ipl.teamstars.slotspyrmid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_game.*


class GameActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)


        bt_play.setOnClickListener {
            startActivity(Intent(this, SlotsActivity::class.java))
        }
    }
}

