package op.mobile.app.dev.singhs2.travelling.ui.maps

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import op.mobile.app.dev.singhs2.travelling.R
import op.mobile.app.dev.singhs2.travelling.ui.phrases.PhrasesViewModel
import op.mobile.app.dev.singhs2.travelling.ui.quiz.QuizFragment
import op.mobile.app.dev.singhs2.travelling.ui.quiz.QuizViewModel

class MapsFragment : Fragment() {
    private lateinit var viewModel: MapsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater!!.inflate(R.layout.maps_fragment, container, false)
        return inflater.inflate(R.layout.maps_fragment, container, false)
    }

    companion object {
        fun newInstance(): MapsFragment {
            return MapsFragment()
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MapsViewModel::class.java)
        // TODO: Use the ViewModel
    }
}