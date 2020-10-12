package com.gkoubei.baselibrary.ext

import com.gkoubei.baselibrary.rx.BaseSubcriber
import rx.Observable
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

/*
扩展方法
 */
fun <T> Observable<T>.execute(subscriber: BaseSubcriber<T>) {
    this.observeOn(AndroidSchedulers.mainThread())
        .subscribeOn(Schedulers.io())
        .subscribe(subscriber)
}