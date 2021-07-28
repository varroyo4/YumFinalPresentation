package com.example.finalpresentation

class LessonsPresenter {

    fun loadLessons(): List<LessonsData> {
        return listOf<LessonsData>(
            LessonsData(R.string.presentation_intro, R.drawable.android_half_trident),
            LessonsData(R.string.presentation_Android, R.drawable.android_present),
            LessonsData(R.string.presentation_Kotlin, R.drawable.kotlin),
            LessonsData(R.string.presentation_XML, R.drawable.xml_presentation),
            LessonsData(R.string.presentation_binding, R.drawable.view_binding),
            LessonsData(R.string.presentation_git, R.drawable.git),
            LessonsData(R.string.presentation_jira_agile, R.drawable.jira),
            LessonsData(R.string.presentation_architecture, R.drawable.mvmpattern),
            LessonsData(R.string.presentation_pos, R.drawable.yum_dev)
        )
    }

}