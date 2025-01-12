package com.example.aposentadoria



import android.os.Build
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi



class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        //informa ao android qual tela sera exibida
        setContentView(R.layout.activity_main)

        //obtendo o nome da instancia do editText --> nome
        val edt_nome = findViewById<EditText>(R.id.editTextText)

        //obtendoo sexo da instância do Spinner --> sexo
        val spn_sexo = findViewById<Spinner>(R.id.spinner)
            //populando o spinner com o generos sexuais
            spn_sexo.adapter = ArrayAdapter<String>(
                this,
                android.R.layout.simple_spinner_dropdown_item,
                listOf(" ","MASCULINO", "FEMININO")
            )

        //obtendo a idade  e a instancia
        val Edt_age     =  findViewById<EditText>(R.id.editTextText3)
        //obtendo a instancia DO RESULTADO da textViwiew para o Resultado
        var txt_res = findViewById<TextView>(R.id.textViewResult)

        //obtendo a instancia do botao CALCULAR
        val btn_ok = findViewById<Button>(R.id.button2)
        //informo ao sistema o que deve ser feito quando clicar no botao calcular
        btn_ok.setOnClickListener() {
            //variáveis para guardar os  dados digitados e resultados

            var Nome : String = edt_nome.text.toString()
            var Age : Int     =  Edt_age.text.toString().toInt()   //Integer.valueOf(Edt_age.text.toString())
            var calc :Int     =  0
            var resultado : Int = 0
            //executa o calcula da aposentadoria
            if (spn_sexo.selectedItem == "MASCULINO" ) {
                //efetuar cálculo para homem
                calc = (65 - Age )
                resultado = calc.toString().toInt()
            }
            if(spn_sexo.selectedItem == "FEMININO"){
                //efetuar cálculo para mulher
                calc  = ( 60 - Age )
                resultado = calc.toString().toInt()
            }

            //txt_res.text = resultado.toInt().toString()
            //Atualizando a tela de acordo com o resultado do cálculo
            txt_res.text = "Ola, $Nome faltam apenas $resultado anos" +
                    " para chega o dia de sua aposentadoria !!! "


        }
    }
}



