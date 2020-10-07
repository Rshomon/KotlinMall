package com.gkoubei.usercenter.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.gkoubei.usercenter.R
import kotlinx.android.synthetic.main.activity_register.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        mRegisterBtn.setOnClickListener {
//            Toast.makeText(this, "注册", Toast.LENGTH_SHORT).show()
            Log.d("test", "onCreate: Click register")
            toast("注册")
            startActivity<TestActivity>("id" to 10)
        }
    }
}