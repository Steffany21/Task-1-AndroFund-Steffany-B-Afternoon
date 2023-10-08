package com.example.tugasandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.tugasandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var tv: TextView
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv = findViewById(R.id.textView2)

        val nama = intent.getParcelableExtra<User>("User")?.nama
        val ntelepon = intent.getParcelableExtra<User>("User")?.ntelepon
        val email = intent.getParcelableExtra<User>("User")?.email
        tv.text = " Username:  $nama, Nomor telepon: $ntelepon, Email: $email "

        val btnImplicit: Button = findViewById(R.id.btn_implicit)
        btnImplicit.setOnClickListener(this)

        // Fragment
//        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//        binding.btnFragment1.setOnClickListener { replaceFragment(Fragment1()) }
//        binding.btnFragment2.setOnClickListener { replaceFragment(Fragment2()) }
    }

    override fun onClick(v: View) {
        when (v.id){
            R.id.btn_implicit -> {
                val message = "Share"
                val intent = Intent()
                intent.action = Intent.ACTION_SEND
                intent.putExtra(Intent.EXTRA_TEXT, message)
                intent.type = "text.plain"
                startActivity(intent)
            }
        }
    }

    private fun replaceFragment(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainerView3, fragment)
        fragmentTransaction.commit()
    }

}