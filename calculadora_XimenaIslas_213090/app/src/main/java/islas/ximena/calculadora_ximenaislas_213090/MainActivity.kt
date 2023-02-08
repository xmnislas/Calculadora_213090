package islas.ximena.calculadora_ximenaislas_213090

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var num1:Int = 0
    var num2: Int = 0
    var operacion: Char = ' '
    var resultado: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnBorrar: Button = findViewById(R.id.btnBorrar)
        val txt1: TextView = findViewById(R.id.tvOperacion)
        val btnResult: Button = findViewById(R.id.btnResult)
        val txt2: TextView = findViewById(R.id.tVResultado)

        btnResult.setOnClickListener(){
            num2 = txt2.text.toString().toInt()
            when(operacion){
                's' -> resultado = num1 + num2
                'r' -> resultado = (num1 - num2)
                'm' -> resultado = (num1 * num2)
                'd' -> resultado = (num1 / num2)
            }
            txt2.setText("")
            txt2.setHint("0")
            txt1.setText(resultado.toString())
        }

        btnBorrar.setOnClickListener(){
            txt1.setText("")
            txt2.setText("")
            num1 = 0
            num2 = 0
            resultado = 0
            operacion = ' '
        }
    }

    fun clickOperacion(view: View){
        val txtOperacion: TextView = findViewById(R.id.tvOperacion)
        val txtResultado: TextView = findViewById(R.id.tVResultado)
        when(view.id){
            R.id.btnSum -> {
                txtOperacion.setText(txtResultado.text.toString() + "+")
                operacion = 's'
            }
            R.id.btnRes -> {
                txtOperacion.setText(txtResultado.text.toString() + "-")
                operacion = 'r'
            }
            R.id.btnDiv -> {
                txtOperacion.setText(txtResultado.text.toString() + "/")
                operacion = 'd'
            }
            R.id.btnMul -> {
                txtOperacion.setText(txtResultado.text.toString() + "*")
                operacion = 'm'
            }
        }
        num1 = txtResultado.text.toString().toInt()
        txtResultado.setText("")
        txtResultado.setHint("0")
    }

    fun onClickListener(view: View){
        val txtResultado: TextView = findViewById(R.id.tVResultado)
        val n: String = txtResultado.text.toString();
        when(view.id){
            R.id.btn0 -> txtResultado.setText(n + "0")
            R.id.btn1 -> txtResultado.setText(n + "1")
            R.id.btn2 -> txtResultado.setText(n + "2")
            R.id.btn3 -> txtResultado.setText(n + "3")
            R.id.btn4 -> txtResultado.setText(n + "4")
            R.id.btn5 -> txtResultado.setText(n + "5")
            R.id.btn6 -> txtResultado.setText(n + "6")
            R.id.btn7 -> txtResultado.setText(n + "7")
            R.id.btn8 -> txtResultado.setText(n + "8")
            R.id.btn9 -> txtResultado.setText(n + "9")
        }
    }
}