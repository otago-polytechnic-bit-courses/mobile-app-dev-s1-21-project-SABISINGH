package op.mobile.app.dev.singhs2.travelling.ui.result

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

@Suppress("UNCHECKED_CAST")
class ResultsViewModelFactory(private val score: Int) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ResultViewModel::class.java))
            return ResultViewModel(score) as T
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}