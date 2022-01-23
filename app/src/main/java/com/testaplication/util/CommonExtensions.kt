package com.testaplication.util

import com.google.gson.Gson

fun Any.toGson() = Gson().toJson(this)

fun <T> String.fromGson(classOfT: Class<T>) = Gson().fromJson(this, classOfT)