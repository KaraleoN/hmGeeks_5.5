package com.geeks.hmgeeks_55

import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var sharedPreferences: SharedPreferences  // Внедрение SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val isOnboardingCompleted = sharedPreferences.getBoolean("isCompleted", false)

        if (isOnboardingCompleted) {
            setContentView(R.layout.activity_main)
        } else {
            supportFragmentManager.beginTransaction()
                .replace(android.R.id.content, OnBoardFragment())
                .commit()
        }
    }
}