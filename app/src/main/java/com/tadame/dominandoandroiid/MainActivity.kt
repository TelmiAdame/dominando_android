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

        binding.buttonToast.setOnClickListener {
            val texto = binding.editTexto.text.toString()
            Toast.makeText(this, texto, Toast.LENGTH_SHORT).show()
        }

        binding.buttonTela2.setOnClickListener {
            val intent = Intent(this, Tela2Activity::class.java)
            intent.putExtra("nome", "Glauber")
            intent.putExtra("idade", 35)
            startActivity(intent)
        }

        binding.buttonParcel.setOnClickListener {
            val cliente = Cliente(1, "Glauber")
            val intent = Intent(this, Tela2Activity::class.java)
            intent.putExtra("cliente", Parcels.wrap(cliente))
            startActivity(intent)
        }

        binding.buttonSerializable.setOnClickListener {
            val intent = Intent(this, Tela2Activity::class.java)
            intent.putExtra("pessoa", Pessoa("Nelson", 35))
            startActivity(intent)
        }

    }
    override fun onStart() {
        super.onStart()
        Log.i("NGVL", "Tela1::onStart")
    }
    override fun onResume() {
        super.onResume()
        Log.i("NGVL", "Tela1::onResume")
    }
    override fun onRestart() {
        super.onRestart()
        Log.i("TA", "Tela1:onRestart()")
    }
    override fun onPause() {
        super.onPause()
        Log.i("TA", "Tela1::onPause")
    }
    override fun onStop() {
        super.onStop()
        Log.i("TA", "Tela1::onStop")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.i("TA", "Tela1::onDestroy")
    }
}
