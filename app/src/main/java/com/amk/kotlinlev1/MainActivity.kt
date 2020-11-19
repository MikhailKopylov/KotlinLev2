package com.amk.kotlinlev1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val modelView = ViewModelProvider(this).get(MainModelView::class.java)
        modelView.observeLiveDate().observe(this) { data: String ->
            textView.text = data
        }

        button.setOnClickListener {
            modelView.buttonClicked()
        }
    }
}