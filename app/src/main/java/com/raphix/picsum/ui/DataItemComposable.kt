package com.raphix.picsum.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.raphix.picsum.model.PhotoModel

@Composable
fun DataItemComposable(data: PhotoModel) {
    Column(modifier = Modifier.padding(8.dp)) {
        val painter = rememberImagePainterComposable(data.download_url)
        painter?.let { BitmapPainter(it) }?.let {
            Image(
                painter = it,
                contentDescription = null,
                modifier = Modifier
                    .height(200.dp)
                    .fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
        }
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = data.author, modifier = Modifier.padding(vertical = 4.dp))
}


