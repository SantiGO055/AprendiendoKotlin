package com.santigo.aprendiendokotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.santigo.aprendiendokotlin.databinding.ActivityShowNameBinding

private lateinit var binding: ActivityShowNameBinding

class ShowNameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityShowNameBinding.inflate(layoutInflater)
        val view = binding.root

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_name)
        getAndShowName()
        binding.btnBack.setOnClickListener { onBackPressed() }
    }
    fun getAndShowName(){
        val bundle = intent.extras
        val name = bundle?.get("name") //bundle es un objeto dentro del intent que almacena el valor que puse en el activity main
        println(name)
        binding.textViewWelcome.text = "Welcome $name"
    }

}