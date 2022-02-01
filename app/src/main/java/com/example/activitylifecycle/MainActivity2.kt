package com.example.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.activitylifecycle.databinding.ActivityMain2Binding
import com.example.activitylifecycle.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    val TAG="Main Activity 2"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d(TAG, "onCreate: ")

    }

        override fun onStart() {
            super.onStart()
            Log.d(TAG, "onStart: ")

        }

        override fun onResume() {
            super.onResume()
            Log.d(TAG, "onResume: ")
        }

        override fun onPause() {
            super.onPause()
            Log.d(TAG, "onPause: ")
        }

        override fun onStop() {
            super.onStop()
            Log.d(TAG, "onStop: ")
        }

        override fun onRestart() {
            super.onRestart()
            Log.d(TAG, "onRestart: ")
        }

        override fun onDestroy() {
            super.onDestroy()
            Log.d(TAG, "onDestroy: ")
        }
    }

