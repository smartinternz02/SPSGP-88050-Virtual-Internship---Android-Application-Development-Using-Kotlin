package com.faizan.grocery

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.core.app.ActivityCompat

class MainActivity3 : AppCompatActivity() {
    private lateinit var phone: EditText
    private lateinit var send: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        phone= findViewById(R.id.phone)
        send= findViewById(R.id.sendsms)
        checkpermissions()
        send.setOnClickListener {
            val phonenumber = phone.text.toString()
            if(phonenumber.isNotEmpty()){
                val smsIntent = Intent(Intent.ACTION_VIEW)
                smsIntent.data= Uri.parse("sms:$phonenumber")
                startActivity(smsIntent)
            }
        }
    }
    private fun checkpermissions(){
        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS)!= PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this,arrayOf(Manifest.permission.SEND_SMS),101)
        }
    }
}