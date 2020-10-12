package com.gkoubei.baselibrary.ui.activity

import com.gkoubei.baselibrary.presenter.BasePresenter
import com.gkoubei.baselibrary.presenter.view.BaseView

open class BaseMVPActivity<T : BasePresenter<*>> : BaseActivity(), BaseView {
    override fun showLoading() {
    }

    override fun hideLoading() {
    }

    override fun noError() {
    }

    lateinit var mPresenter: T
}