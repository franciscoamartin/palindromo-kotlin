package marketingexe.com.br.palindromo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import marketingexe.com.br.palndromo.R

fun String.ehPalindromo(): String{
    return if( this.toLowerCase().reversed() == this.toLowerCase() )
        "${this.toLowerCase()} é um palíndromo"
    else
    "${this.toLowerCase()} NÃO é um palíndromo"
}

class MainActivityK :  AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_verificar.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

        tv_resposta.text = et_palindromo.text.toString().ehPalindromo()

    }
}