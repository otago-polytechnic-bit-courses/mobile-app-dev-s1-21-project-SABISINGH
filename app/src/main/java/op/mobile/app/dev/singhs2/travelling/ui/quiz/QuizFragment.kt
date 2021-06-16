package op.mobile.app.dev.singhs2.travelling.ui.quiz

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import op.mobile.app.dev.singhs2.travelling.QuizActivity
import op.mobile.app.dev.singhs2.travelling.R
import op.mobile.app.dev.singhs2.travelling.databinding.QuizFragmentBinding
import op.mobile.app.dev.singhs2.travelling.service.ServiceAdapter

class QuizFragment : Fragment(), ServiceAdapter.OnCountryClickListener {
    private lateinit var viewModel: QuizViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: QuizFragmentBinding = DataBindingUtil.inflate(
            inflater, R.layout.quiz_fragment, container, false
        )

        viewModel = ViewModelProvider(this).get(QuizViewModel::class.java)
        binding.lifecycleOwner = viewLifecycleOwner
        binding.githubCountriesViewModel = viewModel
        binding.rvCountries.adapter = ServiceAdapter(this)
        return binding.root
    }

    override fun onCountryClick(position: Int) {
        val intent = Intent(context, QuizActivity::class.java)
        intent.putExtra("data", viewModel.response.toString())
        Log.d("Grayson", viewModel.response.toString())
        startActivity(intent)
    }
}