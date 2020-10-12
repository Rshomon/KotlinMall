package com.gkoubei.baselibrary.presenter

import com.gkoubei.baselibrary.presenter.view.BaseView

open class BasePresenter<T : BaseView> {
    lateinit var mView: T
}