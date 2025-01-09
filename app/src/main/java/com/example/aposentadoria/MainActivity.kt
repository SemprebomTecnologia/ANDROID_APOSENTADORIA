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
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.fragment.app.DialogFragment


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        //informa ao android qual tela sera exibida
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

        //informo ao sistema o que deve ser feito quando clicar no botao calcular
        btn_ok.setOnClickListener(){
            StartGameDialogFragment()
           /* if (spn_sexo != null && spn_sexo.selectedItem != null) {
                val sexo = spn_sexo.selectedItem
                StartGameDialogFragment()
            }else{
                //Msgdlg("Por favor informe o sexo !")
                StartGameDialogFragment()
            }
            */

        }

    }

class StartGameDialogFragment : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity ?.let {
            // Use the Builder class for convenient dialog construction.
            val builder = AlertDialog.Builder(it)
            builder.setMessage("Start game")
                .setPositiveButton("Start") { dialog, id ->
                    // START THE GAME!
                }
                .setNegativeButton("Cancel") { dialog, id ->
                    // User cancelled the dialog.
                }
            // Create the AlertDialog object and return it.
            builder.create()
        } ?: throw IllegalStateException("Activity cannot be null")
    }
}

}



/*

if(spinnerNome != null && spinnerNome.getSelectedItem() !=null ) {
   valor = (String) spinnerNome.getSelectedItem();
} else  {
    //Spinner vazio
}

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