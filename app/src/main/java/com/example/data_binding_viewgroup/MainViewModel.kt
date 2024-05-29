package com.example.data_binding_viewgroup
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel(){
    var text = "Geeks Data Binding Application"

    fun updateText(){
        text = "text is Updated"
    }
}