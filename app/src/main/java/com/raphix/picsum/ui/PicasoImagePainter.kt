package com.raphix.picsum.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.platform.LocalContext
import com.squareup.picasso.Picasso
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

@Composable
fun rememberImagePainterComposable(url: String): ImageBitmap? {
    val context = LocalContext.current
    var image: ImageBitmap? = null

    kotlinx.coroutines.runBlocking {
        withContext(Dispatchers.IO) {
            try {
                val bitmap = Picasso.get().load(url).get()
                image = bitmap.asImageBitmap()
            } catch (e: Exception) {
                // Handle error
            }
        }
    }
    return image
}