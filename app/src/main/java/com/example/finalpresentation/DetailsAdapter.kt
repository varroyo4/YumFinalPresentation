package com.example.finalpresentation

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.finalpresentation.databinding.ItemQuestionsAnswersBinding

class DetailsAdapter(
    private val context: Context,
    private val lessonQuestionAnswers : List<LessonDetailQuestion>
) : RecyclerView.Adapter<DetailsAdapter.DetailViewHolder>() {

    private lateinit var binding: ItemQuestionsAnswersBinding

    class DetailViewHolder(private val binding: ItemQuestionsAnswersBinding) : RecyclerView.ViewHolder(binding.root) {
        val question: TextView = binding.detailQuestion
        val answer: TextView = binding.detailAnswer
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailViewHolder {
        binding = ItemQuestionsAnswersBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DetailViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DetailViewHolder, position: Int) {
        val currentQuestionAnswer = lessonQuestionAnswers[position]
        holder.question.text = context.resources.getString(currentQuestionAnswer.question)
        holder.answer.text = context.resources.getString(currentQuestionAnswer.answer)
    }

    override fun getItemCount() = lessonQuestionAnswers.size

}