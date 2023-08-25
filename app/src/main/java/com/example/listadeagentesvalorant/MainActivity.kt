package com.example.listadeagentesvalorant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listadeagentesvalorant.Adapter.AdapterDuelistas
import com.example.listadeagentesvalorant.model.Agente

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView_agentesDuelistas : RecyclerView
    lateinit var recyclerView_agentesSentinelas : RecyclerView
    lateinit var recyclerView_agentesControladores : RecyclerView
    lateinit var recyclerView_agentesIniciadores : RecyclerView
    lateinit var duelistasValorant : MutableList<Agente>
    lateinit var sentinelasValorant : MutableList<Agente>
    lateinit var controladoresValorant : MutableList<Agente>
    lateinit var iniciadoresValorant : MutableList<Agente>
    lateinit var jett : Agente
    lateinit var raze : Agente
    lateinit var neon : Agente
    lateinit var yoru : Agente
    lateinit var reyna : Agente
    lateinit var killjoy : Agente
    lateinit var cypher : Agente
    lateinit var deadlock : Agente
    lateinit var sage : Agente
    lateinit var chamber : Agente
    lateinit var brim : Agente
    lateinit var astra : Agente
    lateinit var omen : Agente
    lateinit var viper : Agente
    lateinit var skye : Agente
    lateinit var kayo : Agente
    lateinit var breach : Agente
    lateinit var gekko : Agente
    lateinit var sova : Agente
    lateinit var fade : Agente
    lateinit var harbor : Agente


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pegaids()
        setLayout()
        criaListas()
        configuraAdapter()
        criaDuelistas()
        criaControladores()
        criaIniciadores()
        criaSentinelas()
        adicionaNaLista()

    }

    fun pegaids(){
        recyclerView_agentesDuelistas = findViewById(R.id.agentes_duelistas)
        recyclerView_agentesSentinelas = findViewById(R.id.agentes_sentinelas)
        recyclerView_agentesControladores = findViewById(R.id.agentes_controladores)
        recyclerView_agentesIniciadores = findViewById(R.id.agentes_iniciadores)
    }

    fun setLayout() {
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
    }

    fun criaListas(){
        duelistasValorant = mutableListOf()
        sentinelasValorant = mutableListOf()
        controladoresValorant = mutableListOf()
        iniciadoresValorant = mutableListOf()
    }

    fun configuraAdapter(){
        val adapterDuel = AdapterDuelistas(this, duelistasValorant)
        val adapterSenti = AdapterDuelistas(this, sentinelasValorant)
        val adapterControl = AdapterDuelistas(this, controladoresValorant)
        val adapterInits = AdapterDuelistas(this, iniciadoresValorant)

        recyclerView_agentesDuelistas.adapter = adapterDuel
        recyclerView_agentesSentinelas.adapter = adapterSenti
        recyclerView_agentesControladores.adapter = adapterControl
        recyclerView_agentesIniciadores.adapter = adapterInits
    }

    fun criaDuelistas(){
        jett = Agente(
            R.drawable.jett,
            "Jett"
        )

        reyna = Agente(
            R.drawable.reyna,
            "Reyna"
        )

        yoru = Agente(
            R.drawable.yoru,
            "Yoru"
        )

        raze = Agente(
            R.drawable.raze,
            "Raze"
        )

        neon = Agente(
            R.drawable.neon,
            "Neon"
        )
    }

    fun criaSentinelas(){
        killjoy = Agente(
            R.drawable.killjoy,
            "Killjoy"
        )

        cypher = Agente(
            R.drawable.cypher,
            "Cypher"
        )

        deadlock = Agente(
            R.drawable.deadlock,
            "Deadlock"
        )

        chamber = Agente(
            R.drawable.chamber,
            "Chamber"
        )

        sage = Agente(
            R.drawable.sage,
            "Sage"
        )
    }

    fun criaControladores(){
        brim = Agente(
            R.drawable.brim,
            "Brimstone"
        )

        viper = Agente(
            R.drawable.viper,
            "Viper"
        )

        omen = Agente(
            R.drawable.omen,
            "Omen"
        )

        astra = Agente(
            R.drawable.astra,
            "Astra"
        )

        harbor = Agente(
            R.drawable.harbor,
            "Harbor"
        )
    }

    fun criaIniciadores(){
        skye = Agente(
            R.drawable.skye,
            "Skye"
        )

        breach = Agente(
            R.drawable.breach,
            "Breach"
        )

        fade = Agente(
            R.drawable.fade,
            "Fade"
        )

        kayo = Agente(
            R.drawable.kayo,
            "Kayo"
        )

        sova = Agente(
            R.drawable.sova,
            "Sova"
        )

        gekko = Agente(
            R.drawable.gekko,
            "Gekko"
        )
    }

    fun adicionaNaLista(){
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