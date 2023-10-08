package com.example.tugasandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class TambahKontak : AppCompatActivity(), View.OnClickListener {

    private lateinit var edtNama:EditText
    private lateinit var edtNtelepon:EditText
    private lateinit var edtEmail:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tambah_kontak)

        edtNama = findViewById(R.id.edt_nama)
        edtNtelepon = findViewById(R.id.edt_ntelepon)
        edtEmail = findViewById(R.id.edt_eamil)

        val btnSimpan:Button = findViewById(R.id.btn_simpan)
        btnSimpan.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id){
            R.id.btn_simpan -> {
                val intent = Intent(this@TambahKontak, MainActivity::class.java)
                intent.putExtra("User", User(edtNama.text.toString(), edtNtelepon.text.toString(), edtEmail.text.toString()))
                startActivity(intent)
            }
        }
    }
}
