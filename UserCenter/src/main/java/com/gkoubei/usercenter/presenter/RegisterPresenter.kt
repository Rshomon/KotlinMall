package com.gkoubei.usercenter.presenter

import com.gkoubei.baselibrary.ext.execute
import com.gkoubei.baselibrary.presenter.BasePresenter
import com.gkoubei.baselibrary.presenter.view.BaseView
import com.gkoubei.baselibrary.rx.BaseSubcriber
import com.gkoubei.usercenter.presenter.view.RegisterView
import com.gkoubei.usercenter.service.impl.UserServiceImpl
import rx.Subscriber
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers
import java.util.concurrent.Flow

class RegisterPresenter : BasePresenter<RegisterView>() {

    fun register(mobile: String, verifyCode: String, pwd: String) {
        /*
            业务逻辑
         */
        val userService = UserServiceImpl()
        userService.register(mobile, verifyCode, pwd)
            .execute(object : BaseSubcriber<Boolean>() {
                override fun onNext(t: Boolean) {
                    mView.onRegisterResult(t)
                }
            })

    }
}