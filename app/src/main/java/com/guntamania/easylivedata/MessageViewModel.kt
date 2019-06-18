package com.guntamania.easylivedata

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MessageViewModel : ViewModel() {
    val message = MutableLiveData<String>()
    val inputText = MutableLiveData<String>()

    init {
        message.value = "Hello"
    }

    public fun onClickSendButton(view: View) {
        message.value = inputText.value
        android.util.Log.d("ymd", "yey" + inputText.value)
        inputText.value = ""
    }
}
