package com.example.finalpresentation

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.finalpresentation.databinding.ItemQuestionsAnswersBinding

class DetailsAdapter(
    private val context: Context
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
        holder.question.text = context.resources.getString(R.string.title)
        holder.answer.text = context.resources.getString(R.string.title)
    }

    override fun getItemCount() = 0

}