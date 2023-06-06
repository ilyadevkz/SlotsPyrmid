package com.cricket.masters.ipl.teamstars.slotspyrmid

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_slots.*
import kotlin.random.Random

class SlotsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slots)
        val images = listOf(
            R.drawable.slot1, R.drawable.slot2, R.drawable.slot3, R.drawable.slot4,
            R.drawable.slot5, R.drawable.slot6, R.drawable.slot7, R.drawable.slot8,
            R.drawable.slot9, R.drawable.slot10, R.drawable.slot2, R.drawable.slot3,
            R.drawable.slot4, R.drawable.slot5, R.drawable.slot6, R.drawable.slot7,
            R.drawable.slot8, R.drawable.slot9, R.drawable.slot10, R.drawable.slot2,
            R.drawable.slot3, R.drawable.slot4, R.drawable.slot5, R.drawable.slot6,
            R.drawable.slot7, R.drawable.slot8, R.drawable.slot9, R.drawable.slot10,
            R.drawable.slot2, R.drawable.slot3, R.drawable.slot4, R.drawable.slot5,
            R.drawable.slot6, R.drawable.slot7, R.drawable.slot8, R.drawable.slot9,
            R.drawable.slot10, R.drawable.slot2, R.drawable.slot3, R.drawable.slot4,
            R.drawable.slot5, R.drawable.slot6, R.drawable.slot7, R.drawable.slot8,
            R.drawable.slot9, R.drawable.slot10, R.drawable.slot2, R.drawable.slot3,
            R.drawable.slot4, R.drawable.slot5, R.drawable.slot6, R.drawable.slot7,
            R.drawable.slot8, R.drawable.slot9, R.drawable.slot10, R.drawable.slot2,
            R.drawable.slot3, R.drawable.slot4, R.drawable.slot5, R.drawable.slot6,
            R.drawable.slot7, R.drawable.slot8, R.drawable.slot9, R.drawable.slot10,
            R.drawable.slot2, R.drawable.slot3, R.drawable.slot4, R.drawable.slot5,
            R.drawable.slot6, R.drawable.slot7, R.drawable.slot8, R.drawable.slot9,
            R.drawable.slot10, R.drawable.slot2, R.drawable.slot3, R.drawable.slot4,
            R.drawable.slot5, R.drawable.slot6, R.drawable.slot7, R.drawable.slot8,
            R.drawable.slot9, R.drawable.slot10, R.drawable.slot2, R.drawable.slot3,
            R.drawable.slot4, R.drawable.slot5, R.drawable.slot6, R.drawable.slot7,
            R.drawable.slot8, R.drawable.slot9, R.drawable.slot10, R.drawable.slot2,
            R.drawable.slot3, R.drawable.slot4, R.drawable.slot5, R.drawable.slot6,
            R.drawable.slot7, R.drawable.slot8, R.drawable.slot9, R.drawable.slot10,
            R.drawable.slot2, R.drawable.slot3, R.drawable.slot4, R.drawable.slot5,
            R.drawable.slot6, R.drawable.slot7, R.drawable.slot8, R.drawable.slot9,
            R.drawable.slot10, R.drawable.slot2, R.drawable.slot3, R.drawable.slot4,
            R.drawable.slot5, R.drawable.slot6, R.drawable.slot7, R.drawable.slot8,
            R.drawable.slot9, R.drawable.slot10, R.drawable.slot2, R.drawable.slot3,
            R.drawable.slot4, R.drawable.slot5, R.drawable.slot6, R.drawable.slot7,
            R.drawable.slot8, R.drawable.slot9, R.drawable.slot10, R.drawable.slot2,
            R.drawable.slot3, R.drawable.slot4, R.drawable.slot5, R.drawable.slot6,
            R.drawable.slot7, R.drawable.slot8, R.drawable.slot9, R.drawable.slot10,
            R.drawable.slot2, R.drawable.slot3, R.drawable.slot4, R.drawable.slot5,
            R.drawable.slot6, R.drawable.slot7, R.drawable.slot8, R.drawable.slot9,
            R.drawable.slot10, R.drawable.slot2, R.drawable.slot3, R.drawable.slot4,
            R.drawable.slot5, R.drawable.slot6, R.drawable.slot7, R.drawable.slot8,
            R.drawable.slot9, R.drawable.slot10, R.drawable.slot2, R.drawable.slot3,
            R.drawable.slot4, R.drawable.slot5, R.drawable.slot6, R.drawable.slot7,
            R.drawable.slot8, R.drawable.slot9, R.drawable.slot10, R.drawable.slot2,
            R.drawable.slot3, R.drawable.slot4, R.drawable.slot5, R.drawable.slot6,
            R.drawable.slot7, R.drawable.slot8, R.drawable.slot9, R.drawable.slot10,
            R.drawable.slot2, R.drawable.slot3, R.drawable.slot4, R.drawable.slot5,
            R.drawable.slot6, R.drawable.slot7, R.drawable.slot8, R.drawable.slot9,
            R.drawable.slot10, R.drawable.slot2, R.drawable.slot3, R.drawable.slot4,
            R.drawable.slot5, R.drawable.slot6, R.drawable.slot7, R.drawable.slot8,
            R.drawable.slot9, R.drawable.slot10, R.drawable.slot2, R.drawable.slot3,
            R.drawable.slot4, R.drawable.slot5, R.drawable.slot6, R.drawable.slot7,
            R.drawable.slot8, R.drawable.slot9, R.drawable.slot10, R.drawable.slot2,
            R.drawable.slot3, R.drawable.slot4, R.drawable.slot5, R.drawable.slot6,
            R.drawable.slot7, R.drawable.slot8, R.drawable.slot9, R.drawable.slot10,
            R.drawable.slot2, R.drawable.slot3, R.drawable.slot4, R.drawable.slot5,
            R.drawable.slot6, R.drawable.slot7, R.drawable.slot8, R.drawable.slot9,
            R.drawable.slot10, R.drawable.slot2, R.drawable.slot3, R.drawable.slot4,
            R.drawable.slot5, R.drawable.slot6, R.drawable.slot7, R.drawable.slot8,
            R.drawable.slot9, R.drawable.slot10, R.drawable.slot2, R.drawable.slot3,
            R.drawable.slot4, R.drawable.slot5, R.drawable.slot6, R.drawable.slot7,
            R.drawable.slot8, R.drawable.slot9, R.drawable.slot10, R.drawable.slot2,
            R.drawable.slot3, R.drawable.slot4, R.drawable.slot5, R.drawable.slot6,
            R.drawable.slot7, R.drawable.slot8, R.drawable.slot9, R.drawable.slot10
        )
        val layoutManager = GridLayoutManager(this,3, LinearLayoutManager.VERTICAL, false)
        rec_slot.layoutManager = layoutManager
        rec_slot.adapter = ImageAdapter(images)
        var count=0
        bt_start.setOnClickListener {
            if (count==15){
                startActivity(Intent(this,VictoryActivity::class.java))
            }else{
                count++
                val random = Random
                val position = random.nextInt(images.size)
                rec_slot.smoothScrollToPosition(position)
            }
        }
    }

    class ImageAdapter(private val images: List<Int>) : RecyclerView.Adapter<ImageAdapter.ViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_image, parent, false)
            return ViewHolder(view)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.bind(images[position])
        }

        override fun getItemCount(): Int {
            return images.size
        }

        class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

            private val imageView = itemView.findViewById<ImageView>(R.id.slot_img)

            fun bind(image: Int) {
                imageView.setImageResource(image)
            }
        }
    }
}
