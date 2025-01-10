package com.example.aposentadoria

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView



class MainActivity : ComponentActivity() {
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
        //obtendo a instancia do botao CALCULAR
        val btn_ok = findViewById<Button>(R.id.button2)

        //obtendo a idade  e a instancia
        var age =  findViewById<EditText>(R.id.editTextText3)

        //obtendo a instancia DO RESULTADO da textViwiew para o Resultado
        var txt_res = findViewById<TextView>(R.id.textViewResult)

        //informo ao sistema o que deve ser feito quando clicar no botao calcular
        btn_ok.setOnClickListener() {
            //variável para guardar o resultado do cálculo
            var resultado: Int = 0



            if (spn_sexo.selectedItem == "MASCULINO" ){
                //efetuar cálculo para homem
                resultado = 65 - age.toString().toInt()
            }

            if(spn_sexo.selectedItem == "FEMININO"){
                //efetuar cálculo para mulher
                resultado = 60 - age.toString().toInt()
            }

            //txt_res.text = resultado.toInt().toString()

            //Atualizando a tela de acordo com o resultado do cálculo
            txt_res.text = "Faltam $resultado dias para sua aposentadoria chegar os dias "


        }
    }
}



