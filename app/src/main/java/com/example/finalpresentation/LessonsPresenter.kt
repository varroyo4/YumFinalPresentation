package com.example.finalpresentation

class LessonsPresenter {

    fun loadLessons(): List<LessonsData> {
        return listOf<LessonsData>(
            LessonsData(R.string.presentation_intro, R.drawable.android_half_trident),
            LessonsData(R.string.presentation_git, R.drawable.git)
        )
    }

}