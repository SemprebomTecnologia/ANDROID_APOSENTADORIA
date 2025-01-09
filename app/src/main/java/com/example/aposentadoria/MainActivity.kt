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
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        //obtendo a instancia do editText --> nome
        val edt_nome = findViewById<EditText>(R.id.editTextText)
        //obtendo a instância do Spinner --> sexo
        val spn_sexo = findViewById<Spinner>(R.id.spinner)
        spn_sexo.adapter = ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,listOf("MASCULINO","FEMININO"))

        //obtendo a instancia do botao
        val btn_ok  = findViewById<Button>(R.id.button2)
        //obtendo a instancia do da textViwiew para o Resultado
        val txt_res = findViewById<TextView>(R.id.textView5)
    }
}


/*
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    APOSENTADORIATheme {
        Greeting("Android")
    }
}

 */