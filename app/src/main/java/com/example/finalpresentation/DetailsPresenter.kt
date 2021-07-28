package com.example.finalpresentation

class DetailsPresenter {

    fun loadDetails(): List<LessonsData> {
        return listOf<LessonsData>(
            LessonsData(R.string.presentation_intro_details, R.drawable.poseidon_text),
            LessonsData(R.string.presentation_git_details, R.drawable.git_folder)
        )
    }

}