package com.tadame.dominandoandroiid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tadame.dominandoandroiid.databinding.ActivityTela2Binding

class Tela2Activity : AppCompatActivity() {

    private lateinit var  binding: ActivityTela2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTela2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        setContentView(R.layout.activity_tela2)

        val nome = intent.getStringExtra("nome")
        val idade = intent.getIntExtra("idade", -1)
        binding.textMensagem.text = "Nome: $nome / Idade: $idade"
    }
}