package op.mobile.app.dev.singhs2.travelling.ui.quiz

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import op.mobile.app.dev.singhs2.travelling.R
import op.mobile.app.dev.singhs2.travelling.databinding.FragmentQuizGameBinding

class QuizGameFragment: Fragment() {
    private lateinit var viewModel: QuizGameViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        super.onCreateView(inflater, container, savedInstanceState)
        val binding: FragmentQuizGameBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_quiz_game,
            container,
            false
        )

        val viewModelFactory =
            QuizGameViewModelFactory(
                QuizGameFragmentArgs.fromBundle(requireArguments()).country
            )

        viewModel = ViewModelProvider(
            this,
            viewModelFactory
        ).get(QuizGameViewModel::class.java)

        viewModel.setQuestion()

        binding.apply {
            lifecycleOwner = viewLifecycleOwner
            quizGameViewModel = viewModel

            btnSubmit.setOnClickListener {
                val checkedRadioBtnId = binding.radioBtnGroupAnswers.checkedRadioButtonId
                val correctAnswer = viewModel.quiz.value?.answers?.get(0)

                if (checkedRadioBtnId != -1) {
                    var answerIdx = 0

                    when (checkedRadioBtnId) {
                        R.id.radio_btn_answer_two -> answerIdx = 1
                        R.id.radio_btn_answer_three -> answerIdx = 2
                        R.id.radio_btn_answer_four -> answerIdx = 3
                    }

                    if (viewModel.answers.value?.get(answerIdx)
                        == correctAnswer
                    ) {
                        viewModel.addScore()
                        Toast.makeText(
                            activity,
                            "The answer was correct",
                            Toast.LENGTH_SHORT
                        ).show()
                    } else {
                        Toast.makeText(
                            activity,
                            "The answer was incorrect. The correct answer was $correctAnswer",
                            Toast.LENGTH_SHORT
                        ).show()
                    }

                    viewModel.addQuestionIdx()

                    if (viewModel.questionIdx.value!! < viewModel.country.quiz.size) {
                        viewModel.setQuestion()
                        binding.radioBtnGroupAnswers.clearCheck()
                        binding.invalidateAll()
                    } else {
                        // Finish the game and go to the
                        // results page. Use the lab code for this
                        val action = QuizGameFragmentDirections.actionQuizGameFragmentToResultFragment()
                        action.score = viewModel.score
                        findNavController().navigate(action)
                    }
                } else {
                    Toast.makeText(
                        activity,
                        "Please select an answer.",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
            return root
        }
    }
}