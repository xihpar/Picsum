package com.raphix.picsum.ui.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.raphix.picsum.model.PhotoModel
import com.raphix.picsum.network.DataRepository

class PicturesViewModel : ViewModel() {
    private val repository = DataRepository()

    fun getData(): LiveData<List<PhotoModel>> {
        return repository.getData()
    }

}
