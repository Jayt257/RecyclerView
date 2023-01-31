package com.jaytaravia.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

lateinit var songList: RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val songsObjects = mutableListOf<Song>()

        songsObjects.add(Song("Hello","Just the description"))
        songsObjects.add(Song("ABCD","John Lennon"))
        songsObjects.add(Song("Dance","description 3"))
        songsObjects.add(Song("Chill","the description 4"))
        songsObjects.add(Song("Coders Life","description 5"))
        songsObjects.add(Song("Hii","description 6"))
        songsObjects.add(Song("Yes","description 7"))
        songsObjects.add(Song("No","description 8"))


        songList.adapter = MyAdapter(songsObjects)
        songList.layoutManager = LinearLayoutManager(this)


    }
}