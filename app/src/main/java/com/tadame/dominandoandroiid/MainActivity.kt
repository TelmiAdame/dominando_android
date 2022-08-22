package com.tadame.dominandoandroiid

import android.R
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.tadame.dominandoandroiid.databinding.ActivityMainBinding
import org.parceler.Parcels

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding // variavel privada que armazena nosso layout
    var names = arrayListOf<String>()
    var adapter : ArrayAdapter<String>? = null

    //SALVANDO ESTADO DA ACTIVITY
    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putStringArrayList("names_list", names)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //se valor diferente de nulo, é porque activity está sendo recarregada
        if (savedInstanceState != null) {
            names = savedInstanceState.getStringArrayList("names_list")
        }

        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, names)
        binding.lstNames.adapter = adapter

        binding = ActivityMainBinding.inflate(layoutInflater) // declara o layout
        setContentView(binding.root) // inicia layout

        adapter = ArrayAdapter(this, R.layout.simple_list_item_1, names)
        binding.lstNames.adapter = adapter
    }
    fun btnAddClick(view : View) {
        names.add(binding.edtName.text.toString())
        binding.edtName.text.clear()
        adapter?.notifyDataSetChanged()
    }




}

