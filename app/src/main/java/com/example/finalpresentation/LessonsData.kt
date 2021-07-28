package com.example.finalpresentation

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class LessonsData (
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)