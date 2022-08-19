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

        val nome = intent.getStringExtra("nome")
        val idade = intent.getIntExtra("idade", -1)
        val cliente = intent.getParcelableExtra<Cliente>("cliente")
        val pessoa = intent.getSerializableExtra("pessoa") as Pessoa?

        binding.textMensagem.text = if (cliente != null) {
            getString(R.string.tela2_texto1, cliente.nome, cliente.codigo) //"Nome:${cliente.nome} / Código:${cliente.codigo}"
        } else if (pessoa != null) {
            getString(R.string.tela2_texto2, pessoa.nome, pessoa.idade)
        }else {
            getString(R.string.tela2_texto2, nome, idade)
        }

    }
}