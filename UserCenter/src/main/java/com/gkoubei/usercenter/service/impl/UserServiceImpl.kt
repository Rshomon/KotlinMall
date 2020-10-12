package com.gkoubei.usercenter.service.impl

import rx.Observable
import com.gkoubei.usercenter.service.UserService

class UserServiceImpl : UserService {
    override fun register(mobile: String, verifyCode: String, pwd: String): Observable<Boolean> {
        return Observable.just(true)
    }
}