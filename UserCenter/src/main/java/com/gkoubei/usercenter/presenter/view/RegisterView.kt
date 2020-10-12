package com.gkoubei.usercenter.presenter.view

import com.gkoubei.baselibrary.presenter.view.BaseView

interface RegisterView : BaseView {
    fun onRegisterResult(result: Boolean)
}