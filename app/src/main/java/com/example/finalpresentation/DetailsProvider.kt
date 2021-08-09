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
            LessonDetailQuestion(R.string.intro_title, R.string.intro_answer),
            LessonDetailQuestion(R.string.self_intro_title, R.string.self_intro_answer),
            LessonDetailQuestion(R.string.android_q_one, R.string.android_a_one)
        )
    }

    fun loadXMLQuestions(): List<LessonDetailQuestion> {
        return listOf(
            LessonDetailQuestion(R.string.intro_title, R.string.intro_answer),
            LessonDetailQuestion(R.string.self_intro_title, R.string.self_intro_answer),
            LessonDetailQuestion(R.string.android_q_one, R.string.android_a_one)
        )
    }

    fun loadBindingQuestions(): List<LessonDetailQuestion> {
        return listOf(
            LessonDetailQuestion(R.string.intro_title, R.string.intro_answer),
            LessonDetailQuestion(R.string.self_intro_title, R.string.self_intro_answer),
            LessonDetailQuestion(R.string.android_q_one, R.string.android_a_one)
        )
    }

    fun loadGitQuestions(): List<LessonDetailQuestion> {
        return listOf(
            LessonDetailQuestion(R.string.intro_title, R.string.intro_answer),
            LessonDetailQuestion(R.string.self_intro_title, R.string.self_intro_answer),
            LessonDetailQuestion(R.string.android_q_one, R.string.android_a_one)

        )
    }

    fun loadJiraQuestions(): List<LessonDetailQuestion> {
        return listOf(
            LessonDetailQuestion(R.string.intro_title, R.string.intro_answer),
            LessonDetailQuestion(R.string.self_intro_title, R.string.self_intro_answer),
            LessonDetailQuestion(R.string.android_q_one, R.string.android_a_one)
        )
    }

    fun loadMVVMQuestions(): List<LessonDetailQuestion> {
        return listOf(
            LessonDetailQuestion(R.string.intro_title, R.string.intro_answer),
            LessonDetailQuestion(R.string.self_intro_title, R.string.self_intro_answer),
            LessonDetailQuestion(R.string.android_q_one, R.string.android_a_one)
        )
    }

    fun loadPOSQuestions(): List<LessonDetailQuestion> {
        return listOf(
            LessonDetailQuestion(R.string.intro_title, R.string.intro_answer),
            LessonDetailQuestion(R.string.self_intro_title, R.string.self_intro_answer),
            LessonDetailQuestion(R.string.android_q_one, R.string.android_a_one)
        )
    }
}