package app.fluo.aula01

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class CidadeAdapter(var context: Context, var lista: List<String>) : BaseAdapter(){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        // objeto responsavel por carregar na memória o arquivo xml
        var inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        // carregando xml na memória
        var view = inflater.inflate(R.layout.item_cidade, null)

        // vinculando objeto nome
        var nome = view.findViewById<TextView>(R.id.nome)
        // setando valor
        nome.text = lista[position]

        // retornando a view carregada
        return view
    }

    override fun getItem(position: Int): Any {
        return ""
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return lista.size
    }
}