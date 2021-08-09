package com.example.finalpresentation

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import java.io.Serializable

data class Lesson(@StringRes val lessonTitle: Int,
                  @DrawableRes val lessonImage: Int,
                  @DrawableRes val detailImage: Int,
                  val lessonQuestions : List<LessonDetailQuestion>) : Serializable