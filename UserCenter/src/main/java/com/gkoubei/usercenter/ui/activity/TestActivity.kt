package com.gkoubei.usercenter.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gkoubei.usercenter.R
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_test)
        // 使用anko构建视图
        verticalLayout {
            padding = 30
            editText {
                hint = "用户名"
                textSize = 24F
            }
            editText {
                hint = "密码"
                textSize = 24F
            }
            button {
                text = "按钮"
                onClick {
                    toast("${intent.getIntExtra("id", -1)}")
                }
            }
        }

    }
}