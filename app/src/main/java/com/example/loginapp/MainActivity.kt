
package com.example.loginapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val username = findViewById<EditText>(R.id.etUsername)
        val password = findViewById<EditText>(R.id.etPassword)
        val loginButton = findViewById<Button>(R.id.btnLogin)

        loginButton.setOnClickListener {

            val enteredUsername = username.text.toString().trim()
            val enteredPassword = password.text.toString()

            if (enteredUsername == "matin" &&
                enteredPassword == "1385"
            ) {
                Toast.makeText(
                    this,
                    "خوش آمدی matin!",
                    Toast.LENGTH_SHORT
                ).show()

            } else {
                Toast.makeText(
                    this,
                    "نام کاربری یا رمز عبور اشتباه است",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}
