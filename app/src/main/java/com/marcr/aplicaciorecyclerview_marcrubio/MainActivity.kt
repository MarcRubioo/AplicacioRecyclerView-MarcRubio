package com.marcr.aplicaciorecyclerview_marcrubio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.marcr.aplicaciorecyclerview_marcrubio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val personasList = ArrayList<Persona>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = Intent(this, ResultActivity::class.java)

        binding.button.setOnClickListener{
            val nom = binding.editTextText.text.toString()
            val edat = binding.editTextText2.text.toString()

            if(nom.isNotEmpty() && edat.isNotEmpty()) {
                val formatedNom = nom.substring(0, 1).toUpperCase() + nom.substring(1).toLowerCase()
                val persona = Persona(formatedNom, edat)
                personasList.add(persona)
                Toast.makeText(this, "Afegit a la llista: $nom, $edat", Toast.LENGTH_SHORT).show()
                binding.editTextText.text.clear()
                binding.editTextText2.text.clear()
            } else {
                Toast.makeText(this, "Emplena els camps", Toast.LENGTH_SHORT).show()
            }
        }

        binding.button2.setOnClickListener{
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("personasList", personasList)
            startActivity(intent)
            Toast.makeText(this, "Llista enviada!", Toast.LENGTH_SHORT).show()
        }
    }
}

