package com.tadame.dominandoandroiid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tadame.dominandoandroiid.databinding.ActivityMainBinding
import android.content.Intent
import android.widget.Toast



class MainActivity : AppCompatActivity() {

    private  lateinit var binding: ActivityMainBinding         //variavel privada que armazena nosso layout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)     //declara o layout
        setContentView(binding.root)                            //inicia layout
        setContentView(R.layout.activity_main)

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

    }
}
