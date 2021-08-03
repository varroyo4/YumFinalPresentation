package com.example.finalpresentation

class LessonsProvider {
    fun loadLessons(): List<Lesson> {
        return listOf(
            Lesson(R.string.presentation_intro, R.drawable.android_half_trident, R.drawable.varr, DetailsProvider().loadGitQuestions()),
            Lesson(R.string.presentation_self_intro, R.drawable.silhouette,R.drawable.varr, DetailsProvider().loadGitQuestions()),
            Lesson(R.string.presentation_android, R.drawable.android_present,R.drawable.varr, DetailsProvider().loadGitQuestions()),
            Lesson(R.string.presentation_kotlin, R.drawable.kotlin,R.drawable.varr, DetailsProvider().loadGitQuestions()),
            Lesson(R.string.presentation_xml, R.drawable.xml_presentation,R.drawable.varr, DetailsProvider().loadGitQuestions()),
            Lesson(R.string.presentation_binding, R.drawable.view_binding,R.drawable.varr, DetailsProvider().loadGitQuestions()),
            Lesson(R.string.presentation_git, R.drawable.git, R.drawable.varr, DetailsProvider().loadGitQuestions()),
            Lesson(R.string.presentation_jira_agile, R.drawable.jira,R.drawable.varr, DetailsProvider().loadGitQuestions()),
            Lesson(R.string.presentation_architecture, R.drawable.mvmpattern,R.drawable.varr, DetailsProvider().loadGitQuestions()),
            Lesson(R.string.presentation_pos, R.drawable.yum_dev_white, R.drawable.varr, DetailsProvider().loadGitQuestions())
        )
    }

}