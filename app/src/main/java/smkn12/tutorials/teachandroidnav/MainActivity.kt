package smkn12.tutorials.teachandroidnav

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import smkn12.tutorials.teachandroidnav.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding //membuat objek binding utk mengakses data dari layout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //mengatur content view
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

    }
}