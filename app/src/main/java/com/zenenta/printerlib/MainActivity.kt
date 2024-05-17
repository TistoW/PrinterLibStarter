package com.zenenta.printerlib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.zenenta.printer.showPrinter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("TAG", "onCreate: ")
        showPrinter("Hello from PrinterLib")
    }
}