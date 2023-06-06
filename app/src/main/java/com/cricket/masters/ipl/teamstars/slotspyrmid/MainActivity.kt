package com.cricket.masters.ipl.teamstars.slotspyrmid

import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar
import java.util.Timer
import java.util.TimerTask

class MainActivity : AppCompatActivity() {
    private lateinit var load_bar: ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        load_bar = findViewById(R.id.load_bar)

        val animator = ObjectAnimator.ofInt(load_bar, "progress", load_bar.progress, 100)
        animator.duration = 2000
        animator.start()

        val timer = Timer()
        val delay = 2000
        timer.schedule(object : TimerTask() {
            override fun run() {
                startActivity(Intent(this@MainActivity, GameActivity::class.java))
            }
        }, delay.toLong())
    }
}
