package op.mobile.app.dev.singhs2.travelling.ui.phrases

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import op.mobile.app.dev.singhs2.travelling.model.GitHubCountries
import op.mobile.app.dev.singhs2.travelling.service.ServiceInstance.retrofitService
import op.mobile.app.dev.singhs2.travelling.service.ServiceStatus

class PhrasesViewModel : ViewModel() {
    private val _status = MutableLiveData<ServiceStatus>()
    val status: LiveData<ServiceStatus> get() = _status

    private val _response = MutableLiveData<List<GitHubCountries>>()
    val response: LiveData<List<GitHubCountries>> get() = _response

    init {
        viewModelScope.launch {
            _status.value = ServiceStatus.LOADING
            try {
                _response.value = retrofitService.getResponse()
                _status.value = ServiceStatus.COMPLETE
            } catch (e: Exception) {
                _response.value = ArrayList()
                _status.value = ServiceStatus.ERROR
            }
        }
    }
}