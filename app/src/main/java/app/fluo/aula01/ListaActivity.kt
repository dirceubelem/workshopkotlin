package app.fluo.aula01

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_lista.*

class ListaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)

        var cidades = ArrayList<String>()
        cidades.add("Belo Horizonte")
        cidades.add("Betim")
        cidades.add("Contagem")
        cidades.add("Mariana")
        cidades.add("Ouro Preto")

        lista.adapter = CidadeAdapter(this, cidades)

    }
}
