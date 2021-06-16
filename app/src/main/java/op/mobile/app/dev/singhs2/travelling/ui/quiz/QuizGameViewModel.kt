package op.mobile.app.dev.singhs2.travelling.ui.quiz

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import op.mobile.app.dev.singhs2.travelling.model.GitHubCountries
import op.mobile.app.dev.singhs2.travelling.model.Quiz

class QuizGameViewModel(_country: GitHubCountries) : ViewModel() {
    var country: GitHubCountries = _country

    private val _questionIdx = MutableLiveData<Int>()
    val questionIdx: LiveData<Int> get() = _questionIdx

    private val _score = MutableLiveData<Int>()
    val score: LiveData<Int> get() = _score

    private val _quiz = MutableLiveData<Quiz>()
    val quiz: LiveData<Quiz> get() = _quiz

    private val _answers = MutableLiveData<MutableList<String>>()
    val answers: LiveData<MutableList<String>> get() = _answers

    private val _img = MutableLiveData<MutableList<String>>()
    val img: LiveData<MutableList<String>> get() = _img

    init {
        _questionIdx.value = 0
        _score.value = 0
    }

    fun addQuestionIdx() {
        _questionIdx.value = _questionIdx.value?.plus(1)
        _img.value = _img.value?.plus(1) as MutableList<String>?
    }

//    fun addImg() {
//        _img.value = _img.value?.plus(1) as MutableList<String>?
//    }

    fun addScore() {
        _score.value = _score.value?.plus(1)
    }

    fun setQuestion() {
//        _quiz.value = quiz.value?.img?.toMutableList()
        _quiz.value = country.quiz[_questionIdx.value!!]
        _answers.value = quiz.value?.answers?.toMutableList()
        _answers.value?.shuffle()
    }
}