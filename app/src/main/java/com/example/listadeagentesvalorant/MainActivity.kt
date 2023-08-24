package com.example.listadeagentesvalorant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listadeagentesvalorant.Adapter.AdapterDuelistas
import com.example.listadeagentesvalorant.model.Agente

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView_agentesDuelistas = findViewById<RecyclerView>(R.id.agentes_duelistas)
        val recyclerView_agentesSentinelas = findViewById<RecyclerView>(R.id.agentes_sentinelas)
        val recyclerView_agentesControladores = findViewById<RecyclerView>(R.id.agentes_controladores)
        var recyclerView_agentesIniciadores = findViewById<RecyclerView>(R.id.agentes_iniciadores)

        //define a direção da lista
        recyclerView_agentesControladores.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        recyclerView_agentesDuelistas.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView_agentesSentinelas.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView_agentesIniciadores.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false)


        //melhora o desempenho da lista
        recyclerView_agentesDuelistas.setHasFixedSize(true)
        recyclerView_agentesSentinelas.setHasFixedSize(true)
        recyclerView_agentesControladores.setHasFixedSize(true)
        recyclerView_agentesIniciadores.setHasFixedSize(true)

        val duelistasValorant : MutableList<Agente> = mutableListOf()
        val sentinelasValorant : MutableList<Agente> = mutableListOf()
        val controladoresValorant : MutableList<Agente> = mutableListOf()
        val iniciadoresValorant : MutableList<Agente> = mutableListOf()

        val adapterDuel = AdapterDuelistas(this, duelistasValorant)
        val adapterSenti = AdapterDuelistas(this, sentinelasValorant)
        val adapterControl = AdapterDuelistas(this, controladoresValorant)
        val adapterInits = AdapterDuelistas(this, iniciadoresValorant)

        recyclerView_agentesDuelistas.adapter = adapterDuel
        recyclerView_agentesSentinelas.adapter = adapterSenti
        recyclerView_agentesControladores.adapter = adapterControl
        recyclerView_agentesIniciadores.adapter = adapterInits

        val jett = Agente(
            R.drawable.jett,
            "Jett"
        )

        val reyna = Agente(
            R.drawable.reyna,
            "Reyna"
        )

        val yoru = Agente(
            R.drawable.yoru,
            "Yoru"
        )

        val raze = Agente(
            R.drawable.raze,
            "Raze"
        )

        val neon = Agente(
            R.drawable.neon,
            "Neon"
        )

        val killjoy = Agente(
            R.drawable.killjoy,
            "Killjoy"
        )

        val cypher = Agente(
            R.drawable.cypher,
            "Cypher"
        )

        val deadlock = Agente(
            R.drawable.deadlock,
            "Deadlock"
        )

        val chamber = Agente(
            R.drawable.chamber,
            "Chamber"
        )

        val sage = Agente(
            R.drawable.sage,
            "Sage"
        )

        val brim = Agente(
            R.drawable.brim,
            "Brimstone"
        )

        val viper = Agente(
            R.drawable.viper,
            "Viper"
        )

        val omen = Agente(
            R.drawable.omen,
            "Omen"
        )

        val astra = Agente(
            R.drawable.astra,
            "Astra"
        )

        val harbor = Agente(
            R.drawable.harbor,
            "Harbor"
        )

        val skye = Agente(
            R.drawable.skye,
            "Skye"
        )

        val breach = Agente(
            R.drawable.breach,
            "Breach"
        )

        val fade = Agente(
            R.drawable.fade,
            "Fade"
        )

        val kayo = Agente(
            R.drawable.kayo,
            "Kayo"
        )

        val sova = Agente(
            R.drawable.sova,
            "Sova"
        )

        val gekko = Agente(
            R.drawable.gekko,
            "Gekko"
        )


        duelistasValorant.add(jett)
        duelistasValorant.add(reyna)
        duelistasValorant.add(yoru)
        duelistasValorant.add(raze)
        duelistasValorant.add(neon)
        sentinelasValorant.add(killjoy)
        sentinelasValorant.add(cypher)
        sentinelasValorant.add(chamber)
        sentinelasValorant.add(deadlock)
        sentinelasValorant.add(sage)
        controladoresValorant.add(brim)
        controladoresValorant.add(viper)
        controladoresValorant.add(astra)
        controladoresValorant.add(omen)
        controladoresValorant.add(harbor)
        iniciadoresValorant.add(sova)
        iniciadoresValorant.add(skye)
        iniciadoresValorant.add(kayo)
        iniciadoresValorant.add(breach)
        iniciadoresValorant.add(gekko)
        iniciadoresValorant.add(fade)
    }
}