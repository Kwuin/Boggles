package com.example.boggle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.GridLayout
import kotlin.random.Random


class MainActivity : AppCompatActivity() , GridInteractionListener {
    private val clickedPositions = mutableListOf<Pair<Int, Int>>()
    private val clickedLetters = mutableListOf<String>()
    //private lateinit var gridLayout: GridLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //newGrid()

    }

    override fun onStartNewGame() {
        TODO("Not yet implemented")
    }


    private fun startNewGame() {
        clickedLetters.clear()
        clickedPositions.clear()
    }


}