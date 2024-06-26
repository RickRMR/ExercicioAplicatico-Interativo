package com.richard.exerciciomodulo8

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.core.widget.addTextChangedListener
import com.richard.exerciciomodulo8.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var textNome: TextView? = null
    var editText: EditText? = null
    var back: LinearLayoutCompat? = null
    var numeroDeClicks = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textNome = findViewById(R.id.nome)
        textNome?.text

        editText = findViewById(R.id.inputText)
        back = findViewById(R.id.back)

        editText?.addTextChangedListener {
            textNome?.text = it?.toString()
        }

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener{
            trocaDeFundo()
            numeroDeClicks ++
        }

    }
    fun trocaDeFundo(){
        if (numeroDeClicks % 1 == 0){
            back?.background = getDrawable(R.drawable.primeirofundo)
            textNome?.text ="1"
        }
        if (numeroDeClicks % 2 == 0){
            back?.background = getDrawable(R.drawable.segundofundo)
            textNome?.text = "2"
        }
        if (numeroDeClicks % 3 == 0){
            back?.background = getDrawable(R.drawable.terceirofundo)
            textNome?.text = "3" }
    }
}