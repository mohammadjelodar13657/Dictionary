package com.example.dictionary.model

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(tableName = "words_table")
data class Words(

    @ColumnInfo
    val persianWord: String,

    @ColumnInfo
    val englishWord: String

)