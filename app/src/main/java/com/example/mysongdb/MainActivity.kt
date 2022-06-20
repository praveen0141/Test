package com.example.mysongdb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.text.input.KeyboardType.Companion.Text
import com.example.mysongdb.databinding.ActivityMainBinding
import com.example.mysongdb.presentation.HomePage
import com.example.mysongdb.presentation.ui.theme.MySongDbTheme

class MainActivity : AppCompatActivity() {
  private var binding:ActivityMainBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)


        findViewById<ComposeView>(R.id.my_composable).setContent {
            MySongDbTheme { HomePage()
            }
        }
    }
    }
