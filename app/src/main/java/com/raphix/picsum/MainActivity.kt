package com.raphix.picsum

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.tooling.preview.Preview
import com.raphix.picsum.model.PhotoModel
import com.raphix.picsum.ui.DataList
import com.raphix.picsum.ui.theme.PicsumTheme
import com.raphix.picsum.ui.viewmodels.PicturesViewModel

class MainActivity : ComponentActivity() {

    private val dataViewModel: PicturesViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PicsumTheme {
                Surface {
                    val dataList = dataViewModel.getData().observeAsState(initial = emptyList())
                    DataList(dataList = dataList.value)
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    PicsumTheme {
        Surface {
            DataList(dataList = listOf(
                PhotoModel(
                    "0",
                    "Alejandro Escamilla",
                    5616,
                    3744,
                    "https://unsplash.com/photos/du_OrQAA4r0",
                    "https://picsum.photos/id/22/4434/3729")
            ))
        }
    }
}