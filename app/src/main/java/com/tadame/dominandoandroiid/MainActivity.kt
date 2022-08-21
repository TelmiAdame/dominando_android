package com.tadame.dominandoandroiid

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.tadame.dominandoandroiid.databinding.ActivityMainBinding
import org.parceler.Parcels

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding // variavel privada que armazena nosso layout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater) // declara o layout
        setContentView(binding.root) // inicia layout

    }
}
