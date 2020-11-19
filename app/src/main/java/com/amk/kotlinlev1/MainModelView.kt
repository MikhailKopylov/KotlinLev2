package com.amk.kotlinlev1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainModelView:ViewModel() {

    private val liveData = MutableLiveData("-1")

    private val model = Model{
        liveData.value = it
    }

    fun observeLiveDate():LiveData<String> = liveData

    fun buttonClicked(){
        model.result()
    }
}