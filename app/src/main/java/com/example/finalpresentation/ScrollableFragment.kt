package com.example.finalpresentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.finalpresentation.databinding.FragmentScrollableBinding

/**
 * A simple [Fragment] subclass.
 * Use the [ScrollableFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ScrollableFragment : Fragment(R.layout.fragment_scrollable) {

    private lateinit var binding : FragmentScrollableBinding

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Retrieve and inflate the layout for this fragment
        binding = FragmentScrollableBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView = binding.scrollableRecycler

        val myDataset = PresentationData().loadPresentation()
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = context?.let { ScrollableAdapter(it, myDataset) }

    }

}