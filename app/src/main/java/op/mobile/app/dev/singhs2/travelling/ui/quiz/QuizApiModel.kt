package op.mobile.app.dev.singhs2.travelling.ui.quiz

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import op.mobile.app.dev.singhs2.travelling.model.CountryQuiz
import op.mobile.app.dev.singhs2.travelling.service.ServiceInstance
import op.mobile.app.dev.singhs2.travelling.service.ServiceStatus

class QuizApiModel: ViewModel() {
    // TODO: Implement the ViewModel
    private val _status = MutableLiveData<ServiceStatus>()
    val status: LiveData<ServiceStatus> get() = _status

    private val _response = MutableLiveData<List<CountryQuiz>>()
    val response: LiveData<List<CountryQuiz>> get() = _response

    init {
        viewModelScope.launch {
            _status.value = ServiceStatus.LOADING
            try {
                _response.value = ServiceInstance.retrofitService.getQuizResponse()
                _status.value = ServiceStatus.COMPLETE
            } catch (e: Exception) {
                _response.value = ArrayList()
                _status.value = ServiceStatus.ERROR
            }
        }
    }
}