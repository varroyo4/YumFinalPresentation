package com.example.finalpresentation

class DetailsProvider {

    fun loadDetails(): List<Lessons> {
        return listOf(
            Lessons(R.string.presentation_intro_details, R.drawable.poseidon_text),
            Lessons(R.string.presentation_self_intro_details, R.drawable.varr),
            Lessons(R.string.presentation_android_details, R.drawable.android_taco),
            Lessons(R.string.presentation_kotlin_details, R.drawable.android_kotlin),
            Lessons(R.string.presentation_xml_details, R.drawable.xml_android),
            Lessons(R.string.presentation_binding_details, R.drawable.view_binding_details),
            Lessons(R.string.presentation_git_details, R.drawable.git_folder),
            Lessons(R.string.presentation_jira_agile_details, R.drawable.jira_tickets),
            Lessons(R.string.presentation_architecture_details, R.drawable.user_mvvm),
            Lessons(R.string.presentation_pos_details, R.drawable.yum_dev)
        )
    }

}