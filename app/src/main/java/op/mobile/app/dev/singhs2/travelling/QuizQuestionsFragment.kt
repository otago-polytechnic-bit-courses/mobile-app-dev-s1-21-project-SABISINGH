package op.mobile.app.dev.singhs2.travelling


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_quiz_questions.*
import op.mobile.app.dev.singhs2.travelling.model.CountryQuiz
import op.mobile.app.dev.singhs2.travelling.ui.quiz.QuizApiModel

class QuizQuestionsFragment : AppCompatActivity() {

    private lateinit var viewModel: QuizApiModel
    private lateinit var quizList: List<CountryQuiz>
    private var answer: String = ""
    private var currentPosition: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        viewModel = ViewModelProvider(this).get(QuizApiModel::class.java)

        val x = intent.getStringExtra("data")
        Log.d("Hello", x.toString())

        viewModel.response.observe(this, {
            quizList = it
            Log.d("Questions", it.toString())
//            showQuestion(quizList)

        })

    }

    private fun showQuestion(quizList: List<CountryQuiz>) {


        when (currentPosition) {

            0 -> {

                tv_question.text = quizList[0].q1.question
                tv_option_one.text = quizList[0].q1.option.option1
                tv_option_two.text = quizList[0].q1.option.option2
                tv_option_three.text = quizList[0].q1.option.option3
                tv_option_four.text = quizList[0].q1.option.option4
                answer = quizList[0].q1.answer


            }
            1 -> {

                tv_question.text = quizList[0].q2.question
                tv_option_one.text = quizList[0].q2.option.option1
                tv_option_two.text = quizList[0].q2.option.option2
                tv_option_three.text = quizList[0].q2.option.option3
                tv_option_four.text = quizList[0].q2.option.option4
                answer = quizList[0].q2.answer

            }
            2 -> {

                tv_question.text = quizList[0].q3.question
                tv_option_one.text = quizList[0].q3.option.option1
                tv_option_two.text = quizList[0].q3.option.option2
                tv_option_three.text = quizList[0].q3.option.option3
                tv_option_four.text = quizList[0].q3.option.option4
                answer = quizList[0].q3.answer

            }
            3 -> {

                tv_question.text = quizList[0].q4.question
                tv_option_one.text = quizList[0].q4.option.option1
                tv_option_two.text = quizList[0].q4.option.option2
                tv_option_three.text = quizList[0].q4.option.option3
                tv_option_four.text = quizList[0].q4.option.option4
                answer = quizList[0].q4.answer

            }
            4 -> {

                tv_question.text = quizList[0].q5.question
                tv_option_one.text = quizList[0].q5.option.option1
                tv_option_two.text = quizList[0].q5.option.option2
                tv_option_three.text = quizList[0].q5.option.option3
                tv_option_four.text = quizList[0].q5.option.option4
                answer = quizList[0].q5.answer

            }
            5 -> {

                tv_question.text = quizList[0].q6.question
                tv_option_one.text = quizList[0].q6.option.option1
                tv_option_two.text = quizList[0].q6.option.option2
                tv_option_three.text = quizList[0].q6.option.option3
                tv_option_four.text = quizList[0].q6.option.option4
                answer = quizList[0].q6.answer

            }
            6 -> {

                tv_question.text = quizList[0].q7.question
                tv_option_one.text = quizList[0].q7.option.option1
                tv_option_two.text = quizList[0].q7.option.option2
                tv_option_three.text = quizList[0].q7.option.option3
                tv_option_four.text = quizList[0].q7.option.option4
                answer = quizList[0].q7.answer

            }
            7 -> {

                tv_question.text = quizList[0].q8.question
                tv_option_one.text = quizList[0].q8.option.option1
                tv_option_two.text = quizList[0].q8.option.option2
                tv_option_three.text = quizList[0].q8.option.option3
                tv_option_four.text = quizList[0].q8.option.option4
                answer = quizList[0].q8.answer


            }
            8 -> {

                tv_question.text = quizList[0].q9.question
                tv_option_one.text = quizList[0].q9.option.option1
                tv_option_two.text = quizList[0].q9.option.option2
                tv_option_three.text = quizList[0].q9.option.option3
                tv_option_four.text = quizList[0].q9.option.option4
                answer = quizList[0].q9.answer


            }
            9 -> {

                tv_question.text = quizList[0].q10.question
                tv_option_one.text = quizList[0].q10.option.option1
                tv_option_two.text = quizList[0].q10.option.option2
                tv_option_three.text = quizList[0].q10.option.option3
                tv_option_four.text = quizList[0].q10.option.option4
                answer = quizList[0].q10.answer


            }
            10 -> {

                tv_question.text = quizList[0].q11.question
                tv_option_one.text = quizList[0].q11.option.option1
                tv_option_two.text = quizList[0].q11.option.option2
                tv_option_three.text = quizList[0].q11.option.option3
                tv_option_four.text = quizList[0].q11.option.option4
                answer = quizList[0].q11.answer

            }
            11 -> {

                tv_question.text = quizList[0].q12.question
                tv_option_one.text = quizList[0].q12.option.option1
                tv_option_two.text = quizList[0].q12.option.option2
                tv_option_three.text = quizList[0].q12.option.option3
                tv_option_four.text = quizList[0].q12.option.option4
                answer = quizList[0].q12.answer


            }

        }

    }
}