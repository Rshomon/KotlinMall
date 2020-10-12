package com.gkoubei.baselibrary.rx

import rx.Subscriber

open class BaseSubcriber<T> : Subscriber<T>() {
    override fun onCompleted() {
    }

    override fun onError(e: Throwable?) {
    }

    override fun onNext(t: T) {
    }
}