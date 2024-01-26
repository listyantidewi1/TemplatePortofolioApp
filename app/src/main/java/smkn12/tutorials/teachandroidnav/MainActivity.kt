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

//        menambah listener pada btnHello utk mendeteksi apakah btn sudah di klik
//        binding.btnHello.setOnClickListener{
//            //instruksi yg dieksekusi pada saat button btnHello diklik
//            //ambil data / baca data dari inputA dan inputB
//            var nilaiA = binding.inputA.text.toString().toInt()
//            var nilaiB = binding.inputB.text.toString().toInt()
//            var hasil = jumlah(nilaiA, nilaiB) //memanggil fungsi jumlah
//            binding.tvHello.setText(hasil.toString())
//        }
    }

//    private fun jumlah(a: Int, b: Int): Int{
//        return a + b
//    }
}