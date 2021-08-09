package com.example.finalpresentation

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.finalpresentation.databinding.ItemLessonBinding

class LessonsOverviewAdapter(
    private val context: Context,
    private val lessonsArr: List<Lesson>
) : RecyclerView.Adapter<LessonsOverviewAdapter.LessonViewHolder>() {

    private lateinit var binding: ItemLessonBinding
    // each lesson, 
    class LessonViewHolder(private val binding: ItemLessonBinding) : RecyclerView.ViewHolder(binding.root) {
        val textView: TextView = binding.lessonTitle
        val imageView: ImageView = binding.lessonImage
        val button: Button = binding.lessonButton
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LessonViewHolder {
        binding = ItemLessonBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return LessonViewHolder(binding)
    }

    override fun onBindViewHolder(holder: LessonViewHolder, position: Int) {
        val currentLesson = lessonsArr[position]
        holder.textView.text = context.resources.getString(currentLesson.lessonTitle)
        holder.imageView.setImageResource(currentLesson.lessonImage)
        holder.button.setOnClickListener {
            val action =
                LessonsOverviewFragmentDirections.actionScrollableFragmentToDetailsFragment(
                    lesson = currentLesson
                )
            holder.itemView.findNavController().navigate(action)
        }
    }

    override fun getItemCount() = lessonsArr.size
}