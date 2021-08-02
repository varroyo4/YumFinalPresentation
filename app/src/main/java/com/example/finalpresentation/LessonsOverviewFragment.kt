package com.example.finalpresentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.finalpresentation.databinding.LessonsRecyclerviewBinding

class LessonsOverviewFragment : Fragment(R.layout.lessons_recyclerview) {

    private lateinit var binding : LessonsRecyclerviewBinding

    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = LessonsRecyclerviewBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView = binding.scrollableRecycler
        val lessons = LessonsProvider().loadLessons()
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = context?.let { LessonsOverviewAdapter(it, lessons) }
    }
}