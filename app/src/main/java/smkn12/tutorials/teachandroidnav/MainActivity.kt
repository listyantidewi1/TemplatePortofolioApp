package smkn12.tutorials.teachandroidnav

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import smkn12.tutorials.teachandroidnav.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //mengatur content view
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val navCtrl = this.findNavController(R.id.navhost_fragment)
        NavigationUI.setupActionBarWithNavController(this, navCtrl)
    }
    override fun onSupportNavigateUp(): Boolean {
        val navCtrl = this.findNavController(R.id.navhost_fragment)
        return navCtrl.navigateUp()
    }
}