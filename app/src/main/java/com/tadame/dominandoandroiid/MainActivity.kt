package com.tadame.dominandoandroiid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tadame.dominandoandroiid.databinding.ActivityMainBinding
import android.widget.Toast



class MainActivity : AppCompatActivity() {

    private  lateinit var binding: ActivityMainBinding         //variavel privada que armazena nosso layout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)     //declara o layout
        setContentView(binding.root)                            //inicializa
        setContentView(R.layout.activity_main)

        binding.buttonToast.setOnClickListener {
            val texto = binding.editTexto.text
            Toast.makeText(this, texto, Toast.LENGTH_SHORT).show()
        }

    }
}
