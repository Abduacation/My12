package com.example.my12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.my12.ui.MainModel
import com.example.my12.ui.ViewModelFactory

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
//    private lateinit var viewModelFactory: ViewModelFactory
    private var model: MainModel? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState != null){
            model = ViewModelProviders.of(this).get(MainModel::class.java)
        }
        //sfsdjfdsijfdsdskkfjkdsf

        val etText: EditText = findViewById(R.id.et);
        val button = findViewById<Button>(R.id.buttonEnter)



        button.setOnClickListener {
            model = MainModel(etText.text.toString())
            Log.d(TAG, "${etText.text}")
        }

        val text1: String = model!!.liveData.value.toString()
        etText.setText(text1)


        // For Github updates...

    }

    companion object {
        const val TAG = "MainActivity"
    }
}