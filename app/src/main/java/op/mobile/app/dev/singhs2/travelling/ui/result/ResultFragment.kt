package op.mobile.app.dev.singhs2.travelling.ui.result

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.result_fragment.*
import op.mobile.app.dev.singhs2.travelling.R
import op.mobile.app.dev.singhs2.travelling.ui.home.HomeFragmentDirections

class ResultFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View =  inflater.inflate(R.layout.result_fragment, container, false)

        val tvScore: TextView = view.findViewById(R.id.tv_score)
        val btnFinish: Button = view.findViewById(R.id.btn_finish)

        val viewModelFactory = ResultsViewModelFactory(ResultFragmentArgs.fromBundle(requireArguments()).score)
        val viewModel = ViewModelProvider(this, viewModelFactory).get(ResultViewModel::class.java)

        tvScore.text = activity?.getString(R.string.score, viewModel.score.toString())

        btnFinish.setOnClickListener {
            findNavController().navigate(ResultFragmentDirections.actionResultFragmentToHomeFragment())
        }

        return view
    }
}

