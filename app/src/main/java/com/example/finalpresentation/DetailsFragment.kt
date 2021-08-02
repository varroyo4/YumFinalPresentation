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
import kotlin.properties.Delegates

class DetailsFragment : Fragment() {

    private lateinit var binding: DetailsRecyclerviewBinding

    private val lessonsArr = LessonsProvider().loadLessons()
    private val detailsArr = DetailsProvider().loadDetails()

    private var lessonImageId by Delegates.notNull<Int>()
    private var lessonTextId by Delegates.notNull<Int>()

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            lessonImageId = it.get("lessonImage") as Int
            lessonTextId = it.get("lessonText") as Int
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = DetailsRecyclerviewBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val textView: TextView = binding.detailsTitle
        val imageView: ImageView = binding.detailsImage
        for ((index, iterator) in lessonsArr.withIndex()) {
            if (lessonImageId == iterator.imageResourceId) {
                textView.text =
//                    context?.resources?.getString(detailsArr[index].stringResourceId) ?: return
                    context?.resources?.getString(R.string.title) ?: return
                imageView.setImageResource(detailsArr[index].imageResourceId)
            }
        }
        recyclerView = binding.detailsRecycler
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = context?.let { DetailsAdapter(it) }
//        textView.text = context?.resources?.getString(lessonTextId)
//        imageView.setImageResource(lessonImageId)
    }
}