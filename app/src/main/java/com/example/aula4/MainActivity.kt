package com.example.aula4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.aula4.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val TAG = MainActivity::class.java.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
   val operacoes : MutableList<OperationUI> = mutableListOf()
    override fun onStart() {
        super.onStart()
        binding.button1.setOnClickListener {
            Log.i(TAG, "Click no botão 1")
            if(binding.textVisor.text.toString() == "0") {
                binding.textVisor.text = "1"
            } else {
                binding.textVisor.append("1")
            }
        }
        binding.button2.setOnClickListener {
            Log.i(TAG, "Click no botão 2")
            if(binding.textVisor.text.toString() == "0") {
                binding.textVisor.text = "2"
            } else {
                binding.textVisor.append("2")
            }
        }
        binding.button3.setOnClickListener {
            Log.i(TAG, "Click no botão 3")
            if(binding.textVisor.text.toString() == "0") {
                binding.textVisor.text = "3"
            } else {
                binding.textVisor.append("3")
            }
        }
        binding.button4.setOnClickListener {
            Log.i(TAG, "Click no botão 4")
            if(binding.textVisor.text.toString() == "0") {
                binding.textVisor.text = "4"
            } else {
                binding.textVisor.append("4")
            }
        }
        binding.button5.setOnClickListener {
            Log.i(TAG, "Click no botão 5")
            if(binding.textVisor.text.toString() == "0") {
                binding.textVisor.text = "5"
            } else {
                binding.textVisor.append("5")
            }
        }
        binding.button6.setOnClickListener {
            Log.i(TAG, "Click no botão 6")
            if(binding.textVisor.text.toString() == "0") {
                binding.textVisor.text = "6"
            } else {
                binding.textVisor.append("6")
            }
        }
        binding.button7.setOnClickListener {
            Log.i(TAG, "Click no botão 7")
            if(binding.textVisor.text.toString() == "0") {
                binding.textVisor.text = "7"
            } else {
                binding.textVisor.append("7")
            }
        }
        binding.button8.setOnClickListener {
            Log.i(TAG, "Click no botão 8")
            if(binding.textVisor.text.toString() == "0") {
                binding.textVisor.text = "8"
            } else {
                binding.textVisor.append("8")
            }
        }
        binding.button9.setOnClickListener {
            Log.i(TAG, "Click no botão 9")
            if(binding.textVisor.text.toString() == "0") {
                binding.textVisor.text = "9"
            } else {
                binding.textVisor.append("9")
            }
        }
        binding.buttonSum.setOnClickListener{
            Log.i(TAG, "Click no botão +")
            binding.textVisor.append("+")
        }
        binding.buttonSubtration.setOnClickListener{
            Log.i(TAG, "Click no botão -")
            binding.textVisor.append("-")
        }
        binding.buttonMul.setOnClickListener{
            Log.i(TAG, "Click no botão *")
            binding.textVisor.append("*")
        }
        binding.buttonDivision.setOnClickListener{
            Log.i(TAG, "Click no botão /")
            binding.textVisor.append("/")
        }
        binding.buttonDot.setOnClickListener{
            Log.i(TAG, "Click no botão .")
            binding.textVisor.append(".")
        }
        binding.buttonClear.setOnClickListener{
            Log.i(TAG, "Click no botão clear")
            binding.textVisor.text = "0"
        }
        binding.buttonLast.setOnClickListener{
            Log.i(TAG, "Click no botão last")
            if (operacoes.isNotEmpty()) {
                binding.textVisor.text = operacoes.last().getResult()
            }
        }
        binding.buttonDelete1.setOnClickListener{
            val expressao = binding.textVisor.text.toString().length - 1
            if ( expressao > 0) {
                binding.textVisor.text =  binding.textVisor.text.substring(0,expressao)
            } else {
                binding.textVisor.text = "0"
            }
        }
        binding.buttonEquals.setOnClickListener{
            Log.i(TAG, "Click no botão =")
            val expression = ExpressionBuilder(
                binding.textVisor.text.toString()
            ).build()
            val resultado = expression.evaluate().toString()
            binding.textVisor.text = resultado
            operacoes.add(OperationUI(expression.toString(),resultado,System.currentTimeMillis()))
            Log.i(TAG, "O resultado da expressão é ${binding.textVisor.text}")
        }
    }
}