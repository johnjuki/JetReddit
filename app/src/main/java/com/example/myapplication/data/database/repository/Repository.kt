package com.example.myapplication.data.database.repository

import androidx.lifecycle.LiveData
import com.example.myapplication.domain.model.PostModel

interface Repository {

    fun getAllPosts(): LiveData<List<PostModel>>

    fun getAllOwnedPosts(): LiveData<List<PostModel>>

    fun insert(post: PostModel)

    fun deleteAll()
}