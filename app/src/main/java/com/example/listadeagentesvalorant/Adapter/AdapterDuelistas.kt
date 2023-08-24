package com.example.listadeagentesvalorant.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.listadeagentesvalorant.R
import com.example.listadeagentesvalorant.model.Agente

class AdapterDuelistas(private val context: Context, private val agentes: MutableList<Agente>) : RecyclerView.Adapter<AdapterDuelistas.DuelistasViewHolder>() {

    //Cria o item
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DuelistasViewHolder {
        val itemLista = LayoutInflater.from(context).inflate(R.layout.agentes_duelistas, parent, false)
        val holder = DuelistasViewHolder(itemLista)
        return holder
    }


    //exibe o item
    override fun onBindViewHolder(holder: DuelistasViewHolder, position: Int) {
        holder.foto.setImageResource(agentes[position].foto)
        holder.nome.text = agentes[position].nome
    }

    override fun getItemCount() = agentes.size

    inner class DuelistasViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val foto: ImageView = itemView.findViewById(R.id.IV_agenteDuelista)
        val nome: TextView = itemView.findViewById(R.id.TV_agenteDuelista)
    }
}