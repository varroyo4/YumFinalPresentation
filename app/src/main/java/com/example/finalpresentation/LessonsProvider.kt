package com.example.finalpresentation

class LessonsProvider {

    fun loadLessons(): List<Lessons> {
        return listOf(
            Lessons(R.string.presentation_intro, R.drawable.android_half_trident),
            Lessons(R.string.presentation_self_intro, R.drawable.silhouette),
            Lessons(R.string.presentation_android, R.drawable.android_present),
            Lessons(R.string.presentation_kotlin, R.drawable.kotlin),
            Lessons(R.string.presentation_xml, R.drawable.xml_presentation),
            Lessons(R.string.presentation_binding, R.drawable.view_binding),
            Lessons(R.string.presentation_git, R.drawable.git),
            Lessons(R.string.presentation_jira_agile, R.drawable.jira),
            Lessons(R.string.presentation_architecture, R.drawable.mvmpattern),
            Lessons(R.string.presentation_pos, R.drawable.yum_dev_white)
        )
    }

}