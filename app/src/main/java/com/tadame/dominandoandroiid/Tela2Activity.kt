package com.tadame.dominandoandroiid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.tadame.dominandoandroiid.databinding.ActivityTela2Binding
import org.parceler.Parcels

class Tela2Activity : AppCompatActivity() {

    private lateinit var  binding: ActivityTela2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTela2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val nome = intent.getStringExtra("nome")
        val idade = intent.getIntExtra("idade", -1)
        val cliente = Parcels.unwrap<Cliente?>(intent.getParcelableExtra("cliente"))
        val pessoa = intent.getSerializableExtra("pessoa") as Pessoa?

        binding.textMensagem.text = if (cliente != null) {
            getString(R.string.tela2_texto1, cliente.nome, cliente.codigo) //"Nome:${cliente.nome} / Código:${cliente.codigo}"
        } else if (pessoa != null) {
            getString(R.string.tela2_texto2, pessoa.nome, pessoa.idade)
        }else {
            getString(R.string.tela2_texto2, nome, idade)
        }

    }

    override fun onStart() {
        super.onStart()
        Log.i("TA", "Tela2::onStart")
    }
    override fun onResume() {
        super.onResume()
        Log.i("TA", "Tela2::onResume")
    }
    override fun onRestart() {
        super.onRestart()
        Log.i("TA", "Tela2:onRestart()")
    }
    override fun onPause() {
        super.onPause()
        Log.i("TA", "Tela2::onPause")
    }
    override fun onStop() {
        super.onStop()
        Log.i("TA", "Tela2::onStop")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.i("TA", "Tela2::onDestroy")
    }
}