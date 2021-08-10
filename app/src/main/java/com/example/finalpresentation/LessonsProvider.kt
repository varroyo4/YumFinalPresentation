package com.example.finalpresentation

class LessonsProvider {
    fun loadLessons(): List<Lesson> {
        return listOf(
            Lesson(R.string.presentation_intro, R.drawable.android_half_trident, R.drawable.poseidon_text, DetailsProvider().loadIntroQuestions()),
            Lesson(R.string.presentation_self_intro, R.drawable.silhouette,R.drawable.varr, DetailsProvider().loadSelfIntroQuestions()),
            Lesson(R.string.presentation_git, R.drawable.git, R.drawable.git_folder, DetailsProvider().loadGitQuestions()),
            Lesson(R.string.presentation_jira_agile, R.drawable.jira,R.drawable.jira_tickets, DetailsProvider().loadJiraQuestions()),
            Lesson(R.string.presentation_android, R.drawable.android_present,R.drawable.android_taco, DetailsProvider().loadAndroidQuestions()),
            Lesson(R.string.presentation_kotlin, R.drawable.kotlin,R.drawable.android_kotlin, DetailsProvider().loadKotlinQuestions()),
            Lesson(R.string.presentation_xml, R.drawable.xml_presentation,R.drawable.xml_android, DetailsProvider().loadXMLQuestions()),
            Lesson(R.string.presentation_architecture, R.drawable.mvmpattern,R.drawable.user_mvvm, DetailsProvider().loadMVVMQuestions()),
            Lesson(R.string.presentation_binding, R.drawable.view_binding,R.drawable.view_binding_details, DetailsProvider().loadBindingQuestions()),
            Lesson(R.string.presentation_pos, R.drawable.yum_dev_white, R.drawable.img_9963, DetailsProvider().loadPOSQuestions())
        )
    }

}