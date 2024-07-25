package com.raphix.picsum.ui

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.raphix.picsum.model.PhotoModel

@Composable
fun DataList(dataList: List<PhotoModel>) {
    LazyColumn {
        items(dataList) { data ->
            DataItemComposable(data = data)
        }
    }
}