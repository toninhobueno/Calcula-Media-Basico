package github.toninhobueno.calcularmediabasico

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalculate = calcular

        val result = resultados

        btnCalculate.setOnClickListener {

            val note1 = Integer.parseInt(nota1.text.toString())
            val note2 = Integer.parseInt(nota2.text.toString())
            val foul = Integer.parseInt(faltas.text.toString())

            val media = (note1 + note2) / 2

            if (media in 6..10 && foul <= 10) {
                result.setText("Aluno Aprovado" + "\n" + "Nota final: " + media + "\n" + "Faltas: " + foul)
                result.setTextColor(Color.GREEN)
            } else {
                result.setText("Aluno Reprovado" + "\n" + "Nota final: " + media + "\n" + "Faltas: " + foul)
                result.setTextColor(Color.RED)
            }


        }
    }
}