package com.example.my12.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

@Suppress("UNREACHABLE_CODE")
class ViewModelFactory(val text: String) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(String::class.java)) {
            return MainModel(text) as T
        }
        return throw IllegalArgumentException("Unknown Viewmodel Exception")

    }

}