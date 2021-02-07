package com.example.minicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toast1 = Toast.makeText(applicationContext, "Please input Num1 and Num2!", Toast.LENGTH_LONG)
        val toast2 = Toast.makeText(applicationContext, "Do not Num 2 is Zero or Null!", Toast.LENGTH_LONG)
        var text1 = 0
        var text2 = 0
        var cal = 0

        plus.setOnClickListener() {
            if (this.num1.text.toString() == "" && this.num2.text.toString() == "") {
                toast1.show()
            }else if(this.num2.text.toString() == ""){
                toast2.show()
            }else{
                mark.setText("+")
                text1=this.num1.text.toString().toInt()
                text2=this.num2.text.toString().toInt()
                cal = text1+text2
                result.setText(cal.toString())
            }
        }
        minus.setOnClickListener(){
            if(this.num1.text.toString() == "" && this.num2.text.toString() == ""){
                toast1.show()
            }else
                if(this.num2.text.toString() == ""){
                    toast2.show()
                }else{
                    mark.setText("-")
                    text1=this.num1.text.toString().toInt()
                    text2=this.num2.text.toString().toInt()
                    cal = text1-text2
                    result.setText(cal.toString())
                }
        }
        mu.setOnClickListener(){
            if(this.num1.text.toString() == "" && this.num2.text.toString() == ""){
                toast1.show()
            }else
                if(this.num2.text.toString() == ""){
                    toast2.show()
                }else{
                    mark.setText("*")
                    text1=this.num1.text.toString().toInt()
                    text2=this.num2.text.toString().toInt()
                    cal = text1*text2
                    result.setText(cal.toString())
                }
        }
        divi.setOnClickListener(){
            if(this.num1.text.toString() == "" && this.num2.text.toString() == ""){
                toast1.show()
            }else
                if(this.num2.text.toString() == ""){
                    toast2.show()
                }else{
                    mark.setText("/")
                    var text3:Double=num1.text.toString().toDouble()
                    var text4:Double=num2.text.toString().toDouble()
                    var sum:Double = text3/text4
                    result.setText("$sum")
                }
        }
        mod.setOnClickListener(){
            if(this.num1.text.toString() == "" && this.num2.text.toString() == ""){
                toast1.show()
            }else
                if(this.num2.text.toString() == ""){
                    toast2.show()
                }else{
                    mark.setText("%")
                    text1=this.num1.text.toString().toInt()
                    text2=this.num2.text.toString().toInt()
                    cal = text1%text2
                    result.setText(cal.toString())
                }
        }
        clear.setOnClickListener(){
           num1.setText(null)
            num2.setText(null)
            mark.setText(null)
            result.setText(null)
        }
    }
}
