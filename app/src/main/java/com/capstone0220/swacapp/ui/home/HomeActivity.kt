package com.capstone0220.swacapp.ui.home

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.capstone0220.swacapp.databinding.ActivityHomeBinding
import com.capstone0220.swacapp.ui.form.FormActivity
import com.capstone0220.swacapp.ui.information.InformationActivity
import kotlinx.android.synthetic.main.navigation_botom.*

class HomeActivity : AppCompatActivity(){

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        btn_information.setOnClickListener {
            val intent = Intent(this, InformationActivity::class.java)
            startActivity(intent)
        }
        btn_lapor.setOnClickListener {
            val intent = Intent(this, FormActivity::class.java)
            startActivity(intent)
        }
    }
}