package com.gkoubei.usercenter.ui.activity

import android.os.Bundle
import com.gkoubei.baselibrary.ui.activity.BaseMVPActivity
import com.gkoubei.usercenter.R
import com.gkoubei.usercenter.presenter.RegisterPresenter
import com.gkoubei.usercenter.presenter.view.RegisterView
import kotlinx.android.synthetic.main.activity_register.*
import org.jetbrains.anko.toast

class RegisterActivity : BaseMVPActivity<RegisterPresenter>(), RegisterView {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        mPresenter = RegisterPresenter()
        mPresenter.mView = this
        mRegisterBtn.setOnClickListener {
            mPresenter.register("", "","")
        }
    }

    override fun onRegisterResult(result: Boolean) {
        toast("注册成功！")
    }
}