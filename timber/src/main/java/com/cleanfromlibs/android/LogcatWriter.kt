package com.cleanfromlibs.android

import timber.log.Timber

object LogcatWriter {

    fun init() = Timber.plant(Timber.DebugTree())

    inline fun e(msg: String) = Timber.e(msg)

    inline fun e(throwable: Throwable) = Timber.e(throwable)

    inline fun e(msg: String, throwable: Throwable) = Timber.e(throwable, msg)

    inline fun d(msg: String) = Timber.d(msg)

    inline fun d(throwable: Throwable) = Timber.d(throwable)

    inline fun d(msg: String, throwable: Throwable) = Timber.d(throwable, msg)

    inline fun i(msg: String) = Timber.i(msg)

    inline fun i(throwable: Throwable) = Timber.i(throwable)

    inline fun i(msg: String, throwable: Throwable) = Timber.i(throwable, msg)

    inline fun w(msg: String) = Timber.w(msg)

    inline fun w(throwable: Throwable) = Timber.w(throwable)

    inline fun w(msg: String, throwable: Throwable) = Timber.w(throwable, msg)

    inline fun wtf(msg: String) = Timber.wtf(msg)

    inline fun wtf(throwable: Throwable) = Timber.wtf(throwable)

    inline fun wtf(msg: String, throwable: Throwable) = Timber.wtf(throwable, msg)

    inline fun v(msg: String) = Timber.v(msg)

    inline fun v(throwable: Throwable) = Timber.v(throwable)

    inline fun v(msg: String, throwable: Throwable) = Timber.v(throwable, msg)
}