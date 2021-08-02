package com.example.finalpresentation

class DetailsPresenter {

    fun loadDetails(): List<Lessons> {
        return listOf(
            Lessons(R.string.presentation_intro_details, R.drawable.poseidon_text),
            Lessons(R.string.presentation_android_details, R.drawable.android_taco),
            Lessons(R.string.presentation_kotlin, R.drawable.android_kotlin),
            Lessons(R.string.presentation_xml, R.drawable.xml_android),
            Lessons(R.string.presentation_binding, R.drawable.view_binding_details),
            Lessons(R.string.presentation_git_details, R.drawable.git_folder),
            Lessons(R.string.presentation_jira_agile, R.drawable.jira_tickets),
            Lessons(R.string.presentation_architecture, R.drawable.user_mvvm),
            Lessons(R.string.presentation_pos, R.drawable.yum_dev)
        )
    }

}