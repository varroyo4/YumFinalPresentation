package com.example.finalpresentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.finalpresentation.databinding.FragmentDetailsBinding
import kotlin.properties.Delegates

/**
 * A simple [Fragment] subclass.
 * Use the [details.newInstance] factory method to
 * create an instance of this fragment.
 */
class DetailsFragment : Fragment() {

    private lateinit var binding : FragmentDetailsBinding

    private val lessonsArr = LessonsPresenter().loadLessons()
    private val detailsArr = DetailsPresenter().loadDetails()


    private var lessonImageId by Delegates.notNull<Int>()
    private var lessonTextId by Delegates.notNull<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Retrieve the LETTER from the Fragment arguments
        arguments?.let {
            lessonImageId = it.get("lessonImage") as Int
            lessonTextId = it.get("lessonText") as Int
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = FragmentDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val textView: TextView = view.findViewById(R.id.details_title)
        val imageView: ImageView = view.findViewById(R.id.details_image)

        for((index, iterator) in lessonsArr.withIndex()) {
            if(lessonImageId == iterator.imageResourceId){
                textView.text = context?.resources?.getString(detailsArr[index].stringResourceId) ?: return
                imageView.setImageResource(detailsArr[index].imageResourceId)
            }
        }

    }

}