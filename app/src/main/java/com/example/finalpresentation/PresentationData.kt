package com.example.finalpresentation

class PresentationData {

    fun loadPresentation(): List<Data> {
        return listOf<Data>(
            Data(R.string.presentation_intro, R.drawable.android_half_trident),
            Data(R.string.presentation_git, R.drawable.git)
        )
    }

}