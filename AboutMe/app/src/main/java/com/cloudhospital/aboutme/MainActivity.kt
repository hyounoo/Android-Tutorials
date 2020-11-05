package com.cloudhospital.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.cloudhospital.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val myName: MyName = MyName("hyunoo Sung")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

//        findViewById<Button>(R.id.done_button).setOnClickListener {
//            addNickname(it)
//        }

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.myName = myName

        binding.doneButton.setOnClickListener {
            addNickname(it)
        }
    }

    private fun addNickname(view: View) {
//        val editText = findViewById<EditText>(R.id.nickname_edit)
//        val nicknameTextView = findViewById<TextView>(R.id.nickname_text)

        binding.apply {
            nicknameText.text = binding.nicknameEdit.text
            nicknameEdit.visibility = View.GONE
            doneButton.visibility = View.GONE
            nicknameText.visibility = View.VISIBLE
            invalidateAll()
        }


        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}


//package com.cloudhospital.aboutme
//
//import android.content.Context
//import android.os.Bundle
//import android.view.View
//import android.view.inputmethod.InputMethodManager
//import androidx.appcompat.app.AppCompatActivity
//import androidx.databinding.DataBindingUtil
//import com.cloudhospital.aboutme.databinding.ActivityMainBinding
//
//class MainActivity : AppCompatActivity() {
//
//    private lateinit var binding: ActivityMainBinding
//
//    private val myName: MyName = MyName("Hyunoo Sung")
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
////        setContentView(R.layout.activity_main)
//
////        findViewById<Button>(R.id.done_button).setOnClickListener {
////            addNickname(it)
////        }
//
//        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
//        binding.myName = myName
//
//        binding.doneButton.setOnClickListener {
//            addNickname(it)
//        }
//    }
//
//    private fun addNickname(view: View) {
////        val editText = findViewById<EditText>(R.id.nickname_edit)
////        val nicknameTextView = findViewById<TextView>(R.id.nickname_text)
//
//        binding.apply {
////            binding.nicknameText.text = binding.nicknameEdit.text
//            myName?.nickname = nicknameEdit.text.toString()
//            binding.nicknameEdit.visibility = View.GONE
//            view.visibility = View.GONE
//            binding.nicknameText.visibility = View.VISIBLE
//            invalidateAll()
//        }
//
//        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
//        imm.hideSoftInputFromWindow(view.windowToken, 0)
//    }
//}