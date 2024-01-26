package smkn12.tutorials.teachandroidnav

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import smkn12.tutorials.teachandroidnav.databinding.FragmentHalamanPortofolioBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HalamanPortofolio.newInstance] factory method to
 * create an instance of this fragment.
 */
class HalamanPortofolio : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding : FragmentHalamanPortofolioBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_halaman_portofolio, container, false)

        binding.btnBackPortoToDashboard.setOnClickListener {
            it.findNavController().navigate(R.id.action_halamanPortofolio_to_dashboard)
        }

        return binding.root
    }

}