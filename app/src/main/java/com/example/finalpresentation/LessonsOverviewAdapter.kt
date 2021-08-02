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
    private val lessonsArr: List<Lessons>
) : RecyclerView.Adapter<LessonsOverviewAdapter.LessonViewHolder>() {

    lateinit var binding: ItemLessonBinding

    class LessonViewHolder(private val binding: ItemLessonBinding) : RecyclerView.ViewHolder(binding.root) {
        val textView: TextView = binding.lessonTitle
        val imageView: ImageView = binding.lessonImage
        val button: Button = binding.lessonButton
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LessonViewHolder {
//        val layout = LayoutInflater
//            .from(parent.context)
//            .inflate(R.layout.item_lesson, parent, false)
        binding = ItemLessonBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return LessonViewHolder(binding)
    }

    override fun onBindViewHolder(holder: LessonViewHolder, position: Int) {
        val currentLesson = lessonsArr[position]
        holder.textView.text = context.resources.getString(currentLesson.stringResourceId)
        holder.imageView.setImageResource(currentLesson.imageResourceId)
        holder.button.setOnClickListener {
            val action =
                LessonsOverviewFragmentDirections.actionScrollableFragmentToDetailsFragment(
                    lessonImage = currentLesson.imageResourceId,
                    lessonText = currentLesson.stringResourceId
                )
            holder.itemView.findNavController().navigate(action)
        }
    }

    override fun getItemCount() = lessonsArr.size
}