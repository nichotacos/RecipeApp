package com.example.myrecipeapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.lang.invoke.TypeDescriptor

@Parcelize
data class Category(val idCategory : String,
    val strCategory: String,
    val strCategoryThumb: String,
    val strCategoryDescription: String
) : Parcelable

data class CategoiesResponse(val categories: List<Category>)