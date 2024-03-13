
package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_main)


        var resultado = findViewById<TextView>(R.id.resultado)

        val text = "Impossivel de realizar calculos com números nulos!"
        val duration = Toast.LENGTH_SHORT

        val toast = Toast.makeText(this, text, duration) // in Activity


        findViewById<Button>(R.id.subtracao)
            .setOnClickListener {

                var number01 = findViewById<TextView>(R.id.valor1).text.toString().toDoubleOrNull()

                var number02 = findViewById<TextView>(R.id.valor2).text.toString().toDoubleOrNull()



                if (number01 != null && number02 != null) {


                    var resultado = findViewById<TextView>(R.id.resultado)


                    var calculo: Double = number01 - number02


                    resultado.text = calculo.toString()

                } else {

                    toast.show()
                }

            }



        findViewById<Button>(R.id.multiplicacao)
            .setOnClickListener {

                var number01 = findViewById<TextView>(R.id.valor1).text.toString().toDouble()

                var number02 = findViewById<TextView>(R.id.valor2).text.toString().toDouble()


                if (number01 != null && number02 != null) {

                    var calculo: Double = number01!! * number02!!


                    resultado.text = calculo.toString()
                } else {
                    toast.show()
                }


            }


            findViewById<Button>(R.id.divisao)
                .setOnClickListener {

                    var number01 = findViewById<TextView>(R.id.valor1).text.toString().toDoubleOrNull()

                    var number02 = findViewById<TextView>(R.id.valor2).text.toString().toDoubleOrNull()


                    if (number01 != null && number02 != null) {

                    var calculo: Double = number01!! / number02!!

                    print(calculo)

                    resultado.text = calculo.toString()
                } else {
                    toast.show()
                }

            }


        findViewById<Button>(R.id.clean)
            .setOnClickListener {


            var number01 = findViewById<TextView>(R.id.valor1).text.toString().toDoubleOrNull()

            var number02 = findViewById<TextView>(R.id.valor2).text.toString().toDoubleOrNull()

            number01=null

            number02=null

            resultado.text = ""

            }



        findViewById<Button>(R.id.soma)
            .setOnClickListener {

            var number01 = findViewById<TextView>(R.id.valor1).text.toString().toDoubleOrNull()

            var number02 = findViewById<TextView>(R.id.valor2).text.toString().toDoubleOrNull()

            if (number01 != null && number02 != null) {

                val calculo: Double = number01!! + number02!!

                resultado.text = calculo.toString()
            } else {
                toast.show()
            }
        }

    }
}