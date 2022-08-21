package com.tadame.dominandoandroiid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.tadame.dominandoandroiid.databinding.ActivitySalvando1Binding
import org.parceler.Parcels

class salvando1 : AppCompatActivity() {

    private lateinit var binding:ActivitySalvando1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySalvando1Binding.inflate((layoutInflater))
        setContentView(binding.root)

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