package app.fluo.aula01

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        entrar.setOnClickListener {

            if(email.text.toString().equals("email@email.com") &&
                senha.text.toString().equals("senha123")){

                Toast.makeText(this, "Sucesso!!!", Toast.LENGTH_LONG).show()

            }else{
                Toast.makeText(this, "Ops!!!", Toast.LENGTH_LONG).show()
            }

        }


    }
}
