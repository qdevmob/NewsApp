package com.example.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.newsapp.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null
    private val nBinding get() =  binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_splash)
       CoroutineScope(Dispatchers.Main).launch {
           delay(5000)
           binding = ActivityMainBinding.inflate(layoutInflater)
           setContentView(binding?.root)
//           bottom_nav_menu.setupWithNavController(
//               navController = nav_host_fragment.findNavController()

       }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null

    }

}