package com.example.giuaki

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.giuaki.databinding.ActivityKetquaBinding

class ketqua : AppCompatActivity() {

    private lateinit var binding: ActivityKetquaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKetquaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        intent = getIntent()
        val name = intent.getStringExtra("ten")
        val sdt  = intent.getStringExtra("sdt")


        binding.ten.setText(name)
        binding.sdt.setText(sdt)
        binding.button.setOnClickListener {
            val intent = Intent(this@ketqua, MainActivity::class.java)



            startActivity(intent)


        }


    }
}