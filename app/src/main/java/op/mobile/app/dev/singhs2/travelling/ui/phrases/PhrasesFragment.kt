package op.mobile.app.dev.singhs2.travelling.ui.phrases

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import op.mobile.app.dev.singhs2.travelling.R
import op.mobile.app.dev.singhs2.travelling.WorkInProgress
import op.mobile.app.dev.singhs2.travelling.allCountryActivities.*
import op.mobile.app.dev.singhs2.travelling.databinding.PhrasesFragmentBinding
import op.mobile.app.dev.singhs2.travelling.service.ServiceAdapter

class PhrasesFragment : Fragment(), ServiceAdapter.OnCountryClickListener {
    private lateinit var viewModel: PhrasesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: PhrasesFragmentBinding = DataBindingUtil.inflate(
            inflater, R.layout.phrases_fragment, container, false
        )

        viewModel = ViewModelProvider(this).get(PhrasesViewModel::class.java)
        binding.lifecycleOwner = viewLifecycleOwner
        binding.countryViewModel = viewModel
        binding.rvCountries.adapter = ServiceAdapter(this)
        return binding.root
    }

    override fun onCountryClick(position: Int) {
        if (position == 0) {
            val intent = Intent(context, ArgentinaActivity::class.java)
            startActivity(intent)
        } else if (position == 1) {
            val intent = Intent(context, AustraliaActivity::class.java)
            startActivity(intent)
        } else if (position == 2) {
            val intent = Intent(context, BrazilActivity::class.java)
            startActivity(intent)
        } else if (position == 3) {
            val intent = Intent(context, CanadaActivity::class.java)
            startActivity(intent)
        } else if (position == 4) {
            val intent = Intent(context, ChinaActivity::class.java)
            startActivity(intent)
        } else if (position == 5) {
            val intent = Intent(context, FranceActivity::class.java)
            startActivity(intent)
        } else if (position == 6) {
            val intent = Intent(context, GermanyActivity::class.java)
            startActivity(intent)
        } else if (position == 7) {
            val intent = Intent(context, IndiaActivity::class.java)
            startActivity(intent)
        } else if (position == 8) {
            val intent = Intent(context, MexicoActivity::class.java)
            startActivity(intent)
        } else if (position == 9) {
            val intent = Intent(context, NewZealandActivity::class.java)
            startActivity(intent)
        } else if (position == 10) {
            val intent = Intent(context, NigeriaActivity::class.java)
            startActivity(intent)
        } else if (position == 11) {
            val intent = Intent(context, SouthAfricaActivity::class.java)
            startActivity(intent)
        }
    }
}