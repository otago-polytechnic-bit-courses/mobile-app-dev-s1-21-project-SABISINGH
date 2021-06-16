package op.mobile.app.dev.singhs2.travelling.ui.quiz

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import op.mobile.app.dev.singhs2.travelling.model.GitHubCountries

@Suppress("UNCHECKED_CAST")
class QuizGameViewModelFactory(
    private val country: GitHubCountries
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(QuizGameViewModel::class.java))
            return QuizGameViewModel(country) as T
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
