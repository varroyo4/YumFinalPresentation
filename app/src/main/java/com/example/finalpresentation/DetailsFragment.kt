package com.example.finalpresentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.finalpresentation.databinding.DetailsRecyclerviewBinding

class DetailsFragment : Fragment() {

    private lateinit var binding: DetailsRecyclerviewBinding

    private lateinit var lesson : Lesson

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            lesson = it.get("lesson") as Lesson
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = DetailsRecyclerviewBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val textView: TextView = binding.detailsTitle
        val imageView: ImageView = binding.detailsImage

        recyclerView = binding.detailsRecycler
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = context?.let { DetailsAdapter(it, lesson.lessonQuestions) }
        textView.text = context?.resources?.getString(lesson.lessonTitle)
        imageView.setImageResource(lesson.detailImage)
    }
}