import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import dev.icerock.moko.mvvm.compose.getViewModel
import dev.icerock.moko.mvvm.compose.viewModelFactory
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalResourceApi::class)
@Composable
fun App() {
    MaterialTheme {
        val viewModel :AtlasViewModel = getViewModel(key = Unit, factory = viewModelFactory{AtlasViewModel()})
        val state = viewModel.uiState.collectAsState()

        LaunchedEffect(viewModel){
            viewModel.fetchCounties()
        }


        if(state.value.contries == null)
            {
            CircularProgressIndicator()
        }else{
LazyColumn(modifier = Modifier.fillMaxSize()){
    items(state.value.contries.orEmpty()){
        Text("Name: ${it.name.common}")
    }
}
        }

    }
}

@Composable
fun ContiresListPage(countries: List<Country>) {

    LazyColumn(){
        items(countries){country ->
            Text(country.name.common)
        }
    }

}