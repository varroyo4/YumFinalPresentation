package com.example.finalpresentation

class DetailsProvider {

    fun loadIntroQuestions(): List<LessonDetailQuestion> {
        return listOf(
            LessonDetailQuestion(R.string.intro_title, R.string.intro_answer)
        )
    }

    fun loadSelfIntroQuestions(): List<LessonDetailQuestion> {
        return listOf(
            LessonDetailQuestion(R.string.self_intro_title, R.string.self_intro_answer)
        )
    }

    fun loadAndroidQuestions(): List<LessonDetailQuestion> {
        return listOf(
            LessonDetailQuestion(R.string.android_q_one, R.string.android_a_one),
            LessonDetailQuestion(R.string.android_q_two, R.string.android_a_two),
            LessonDetailQuestion(R.string.android_q_three, R.string.android_a_three)
        )
    }

    fun loadKotlinQuestions(): List<LessonDetailQuestion> {
        return listOf(
            LessonDetailQuestion(R.string.kotlin_q_one, R.string.kotlin_a_one),
            LessonDetailQuestion(R.string.kotlin_q_two, R.string.kotlin_a_two),
            LessonDetailQuestion(R.string.kotlin_q_three, R.string.kotlin_a_three)
        )
    }

    fun loadXMLQuestions(): List<LessonDetailQuestion> {
        return listOf(
            LessonDetailQuestion(R.string.xml_q_one, R.string.xml_a_one),
            LessonDetailQuestion(R.string.xml_q_two, R.string.xml_a_two),
            LessonDetailQuestion(R.string.xml_q_three, R.string.xml_a_three)
        )
    }

    fun loadBindingQuestions(): List<LessonDetailQuestion> {
        return listOf(
            LessonDetailQuestion(R.string.binding_q_one, R.string.binding_a_one),
            LessonDetailQuestion(R.string.binding_q_two, R.string.binding_a_two),
            LessonDetailQuestion(R.string.binding_q_three, R.string.binding_a_three)
        )
    }

    fun loadGitQuestions(): List<LessonDetailQuestion> {
        return listOf(
            LessonDetailQuestion(R.string.git_q_one, R.string.git_a_one),
            LessonDetailQuestion(R.string.git_q_two, R.string.git_a_two),
            LessonDetailQuestion(R.string.git_q_three, R.string.git_a_three),
            LessonDetailQuestion(R.string.git_q_four, R.string.git_a_four)
        )
    }

    fun loadJiraQuestions(): List<LessonDetailQuestion> {
        return listOf(
            LessonDetailQuestion(R.string.jira_q_one, R.string.jira_a_one),
            LessonDetailQuestion(R.string.jira_q_two, R.string.jira_a_two)
        )
    }

    fun loadMVVMQuestions(): List<LessonDetailQuestion> {
        return listOf(
            LessonDetailQuestion(R.string.mvvm_q_one, R.string.mvvm_a_one),
            LessonDetailQuestion(R.string.mvvm_q_two, R.string.mvvm_a_two)
        )
    }

    fun loadPOSQuestions(): List<LessonDetailQuestion> {
        return listOf(
            LessonDetailQuestion(R.string.pos_q_one, R.string.pos_a_one),
            LessonDetailQuestion(R.string.pos_q_two, R.string.pos_a_two),
            LessonDetailQuestion(R.string.pos_q_three, R.string.pos_a_three)
        )
    }
}