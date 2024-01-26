package smkn12.tutorials.teachandroidnav

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import smkn12.tutorials.teachandroidnav.databinding.FragmentHalamanDiklatBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HalamanDiklat.newInstance] factory method to
 * create an instance of this fragment.
 */
class HalamanDiklat : Fragment() {
    // TODO: Rename and change types of parameters

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding : FragmentHalamanDiklatBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_halaman_diklat, container, false)

        binding.btnBackDiklatToDashboard.setOnClickListener {
            it.findNavController().navigate(R.id.action_halamanDiklat_to_dashboard)
        }

        return binding.root
    }

}