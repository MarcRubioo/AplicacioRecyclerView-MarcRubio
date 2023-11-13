package com.marcr.aplicaciorecyclerview_marcrubio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.marcr.aplicaciorecyclerview_marcrubio.adapter.PersonaAdapter
import com.marcr.aplicaciorecyclerview_marcrubio.databinding.ActivityMainBinding
import com.marcr.aplicaciorecyclerview_marcrubio.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }
    private fun initRecyclerView() {
        val recyclerView = binding.recyclerPersona
        recyclerView.layoutManager = LinearLayoutManager(this)

        val personasList = intent.getSerializableExtra("personasList") as ArrayList<Persona>?
        if (personasList != null) {
            recyclerView.adapter = PersonaAdapter(personasList)
        }
    }
}