package com.android.databindingcheckbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.Bindable

class MainActivity : AppCompatActivity() {
    private var text: String = "チェックなし"
    private var isChecked: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onChangeTextClick(isChecked: Boolean) {

        text = if (isChecked) {
            "チェックあり"
        } else {
            "チェックなし"
        }
    }

    fun setChecked(isChecked: Boolean) {

    }

    fun isChecked(): Boolean {
        return isChecked
    }

    fun setText(text: String) {
        this.text = text
    }

    fun getText(): String {
        return text
    }
}
