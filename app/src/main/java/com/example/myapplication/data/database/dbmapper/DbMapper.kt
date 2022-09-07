package com.example.myapplication.data.database.dbmapper

import com.example.myapplication.data.database.model.PostDbModel
import com.example.myapplication.domain.model.PostModel

interface DbMapper {

    fun mapPost(dbPostDbModel: PostDbModel): PostModel

    fun mapDbPost(postModel: PostModel): PostDbModel
}