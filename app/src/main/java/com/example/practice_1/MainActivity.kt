package com.example.practice_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var nomorApp = 0
    lateinit var tampilNomor: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tampilNomor = findViewById<TextView>(R.id.nomor)
    }

    fun fTambah1(view: android.view.View) {
        nomorApp +=1
        tampilNomor.setText(nomorApp.toString())
    }

    fun fTambah2(view: android.view.View) {
        nomorApp +=2
        tampilNomor.setText(nomorApp.toString())
    }
    fun fTambah5(view: android.view.View) {
        nomorApp +=5
        tampilNomor.setText(nomorApp.toString())
    }
    fun fKurang1(view: android.view.View) {
        if (nomorApp >=1){
            nomorApp -=1
            tampilNomor.setText(nomorApp.toString())
        } else{
            Toast.makeText(applicationContext, "Jumlah nomor tidak bisa dikurangi",
            Toast.LENGTH_SHORT).show()
        }
    }
    fun fKurang2(view: android.view.View) {
        if (nomorApp >=2){
            nomorApp -=2
            tampilNomor.setText(nomorApp.toString())
        }else{
            Toast.makeText(applicationContext, "Jumlah nomor tidak bisa dikurangi",
                Toast.LENGTH_SHORT).show()
        }
    }
    fun fKurang5(view: android.view.View) {
        if (nomorApp >=5){
            nomorApp -=5
            tampilNomor.setText(nomorApp.toString())
        } else{
            Toast.makeText(applicationContext, "Jumlah nomor tidak bisa dikurangi",
                Toast.LENGTH_SHORT).show()
        }
    }
    fun fReset(view: android.view.View) {
        nomorApp = 0
        tampilNomor.setText(nomorApp.toString())
        Toast.makeText(applicationContext, "Nomor telah direset.",
            Toast.LENGTH_SHORT).show()
    }
}