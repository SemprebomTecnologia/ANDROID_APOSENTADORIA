package com.example.aposentadoria

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.aposentadoria.ui.theme.APOSENTADORIATheme

import android.app.Activity
import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.content.DialogInterface
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.DialogFragment


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
        val  age =  findViewById<EditText>(R.id.editTextText3)
        //obtendo a instancia DO RESULTADO da textViwiew para o Resultado
        val txt_res = findViewById<TextView>(R.id.textView5)

        //informo ao sistema o que deve ser feito quando clicar no botao calcular
        btn_ok.setOnClickListener() {
            //if (spn_sexo != null && spn_sexo.selectedItem != null) {
            if (spn_sexo.selectedItem != null) {
                //capturando o sexo selecionado
                val sexo = spn_sexo.selectedItem as String
                //capturando a idade digitada
                val idade = age.toString() as Int
                //variável para guardar o resultado do cálculo
                var resultado = 0
                //verificando o sexo da pessoa
                if(sexo == "MASCULINO"){
                    resultado = 65 - idade
                }else{
                    resultado = 60 - idade
                }
                //Atualizando a tela de acordo com o resultado do cálculo
                txt_res.text = "Faltam $resultado anos para você se aposentar."

            }
        }
    }
}



