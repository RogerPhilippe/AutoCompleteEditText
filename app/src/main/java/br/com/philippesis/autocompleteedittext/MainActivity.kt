package br.com.philippesis.autocompleteedittext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val products = arrayListOf("Chá", "Açucar", "Azeite", "Leite")

        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, products)
        autoCompleteEdit.setAdapter(arrayAdapter)

    }
}
