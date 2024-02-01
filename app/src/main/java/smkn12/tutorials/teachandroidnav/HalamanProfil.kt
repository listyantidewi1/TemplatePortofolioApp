package smkn12.tutorials.teachandroidnav

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import smkn12.tutorials.teachandroidnav.databinding.FragmentHalamanProfilBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//private const val ARG_PARAM1 = "param1"
//private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HalamanProfil.newInstance] factory method to
 * create an instance of this fragment.
 */
class HalamanProfil : Fragment() {
    val args : HalamanProfilArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        // membuat object binding
        val binding : FragmentHalamanProfilBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_halaman_profil, container, false)

        val name = args.yourName
        binding.tvYourName.text = "Hello, $name"

        //memberi action pada tombol btnBack, supaya kembali ke halaman dashboard saat di klik
        binding.btnBack.setOnClickListener{
            it.findNavController().navigate(R.id.action_halamanProfil_to_dashboard2)
        }
        return binding.root
    }
}