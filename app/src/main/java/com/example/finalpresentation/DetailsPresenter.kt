package com.example.finalpresentation

class DetailsPresenter {

    fun loadDetails(): List<LessonsData> {
        return listOf<LessonsData>(
            LessonsData(R.string.presentation_intro, R.drawable.poseidon_text),
            LessonsData(R.string.presentation_Android, R.drawable.android_taco),
            LessonsData(R.string.presentation_Kotlin, R.drawable.android_kotlin),
            LessonsData(R.string.presentation_XML, R.drawable.xml_android),
            LessonsData(R.string.presentation_binding, R.drawable.view_binding_details),
            LessonsData(R.string.presentation_git, R.drawable.git_folder),
            LessonsData(R.string.presentation_jira_agile, R.drawable.jira_tickets),
            LessonsData(R.string.presentation_architecture, R.drawable.user_mvvm),
            LessonsData(R.string.presentation_pos, R.drawable.yum_dev)
        )
    }

}