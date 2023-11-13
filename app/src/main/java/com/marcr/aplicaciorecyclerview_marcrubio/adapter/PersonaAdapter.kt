package com.marcr.aplicaciorecyclerview_marcrubio.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.marcr.aplicaciorecyclerview_marcrubio.Persona
import com.marcr.aplicaciorecyclerview_marcrubio.R

class PersonaAdapter (private val personaList:List<Persona>) : RecyclerView.Adapter<PersonaViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonaViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return PersonaViewHolder(layoutInflater.inflate(R.layout.item_persona, parent, false))
    }

    override fun getItemCount(): Int = personaList.size

    override fun onBindViewHolder(holder: PersonaViewHolder, position: Int) {
        val item = personaList[position]
        holder.render(item)
    }
}



