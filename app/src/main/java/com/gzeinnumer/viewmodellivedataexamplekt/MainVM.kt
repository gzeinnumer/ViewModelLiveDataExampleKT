package com.gzeinnumer.viewmodellivedataexamplekt

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class MainVM: ViewModel(){

    val currentName: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
}