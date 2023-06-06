package com.cricket.masters.ipl.teamstars.slotspyrmid

import android.content.Intent
import android.os.Bundle
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.TranslateAnimation
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_victory.*

class VictoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_victory)

        bt_ok.setOnClickListener {
            startActivity(Intent(this, GameActivity::class.java))
        }

        startCoinAnimation()
    }

    private fun startCoinAnimation() {
        val container = findViewById<ViewGroup>(R.id.coin_container)

        val coinImageView = ImageView(this)
        coinImageView.setImageResource(R.drawable.coin)
        val layoutParams = RelativeLayout.LayoutParams(
            RelativeLayout.LayoutParams.MATCH_PARENT,
            RelativeLayout.LayoutParams.MATCH_PARENT
        )
        layoutParams.addRule(RelativeLayout.CENTER_HORIZONTAL, RelativeLayout.TRUE)
        coinImageView.layoutParams = layoutParams


        val screenHeight = resources.displayMetrics.widthPixels

        val anim = TranslateAnimation(
            -screenHeight.toFloat(), screenHeight.toFloat(), 0f, 0f
        )
        anim.duration = 2000

        anim.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation?) {}
            override fun onAnimationEnd(animation: Animation?) {
                container.removeView(coinImageView)
            }
            override fun onAnimationRepeat(animation: Animation?) {}
        })

        coin_layout.startAnimation(anim)
    }
}
