package com.marcr.aplicaciorecyclerview_marcrubio.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.marcr.aplicaciorecyclerview_marcrubio.Persona
import com.marcr.aplicaciorecyclerview_marcrubio.databinding.ItemPersonaBinding


class PersonaViewHolder(view: View): RecyclerView.ViewHolder(view) {

    val binding = ItemPersonaBinding.bind(view)

    fun render(personaModel: Persona){
        binding.nom.text = personaModel.nombre
        binding.edat.text = personaModel.edad.toString()

    }
}




