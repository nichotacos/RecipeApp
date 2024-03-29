package com.example.myrecipeapp

import java.lang.invoke.TypeDescriptor

data class Category(val idCategory : String,
    val strCategory: String,
    val strCategoryThumb: String,
    val strCategoryDescription: String
)

data class CategoiesResponse(val categories: List<Category>)