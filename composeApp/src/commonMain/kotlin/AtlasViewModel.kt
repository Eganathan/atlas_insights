import dev.icerock.moko.mvvm.viewmodel.ViewModel
import io.ktor.client.HttpClient
import io.ktor.client.call.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.serialization.kotlinx.json.json
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlinx.serialization.json.Json
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.contextual

class AtlasViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(UiState())
    val uiState = _uiState.asStateFlow()
    private val httpClient = HttpClient {
        install(ContentNegotiation) { json() }
    }
    private suspend fun getCountries(): List<Country> = httpClient.get(Configs.API_URL).body()

    fun fetchCounties() {
        viewModelScope.launch {
            val countires = getCountries()
            _uiState.update {
                it.copy(contries = countires)
            }
        }
    }

    init {
        fetchCounties()
    }


    override fun onCleared() {
        httpClient.close()
        super.onCleared()
    }
}