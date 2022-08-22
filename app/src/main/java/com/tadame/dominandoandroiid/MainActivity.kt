package com.tadame.dominandoandroiid

import android.R
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.tadame.dominandoandroiid.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding // variavel privada que armazena nosso layout
    var names = arrayListOf<String>()
    var adapter : ArrayAdapter<String>? = null

    //SALVANDO ESTADO DA ACTIVITY
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState?.putStringArrayList("names_list", names)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) // declara o layout
        setContentView(binding.root) // inicia layout

        //se valor diferente de nulo, é porque activity está sendo recarregada
        if (savedInstanceState != null) {
            names = savedInstanceState.getStringArrayList("names_list")!!
        }

        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, names)
        binding.lstNames.adapter = adapter

    }
    fun btnAddClick(view : View) {
        names.add(binding.edtName.text.toString())
        binding.edtName.text.clear()
        adapter?.notifyDataSetChanged()
    }




}

