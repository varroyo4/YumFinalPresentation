package com.example.finalpresentation

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView

class PresentationAdapter(
    private val context: Context,
    private val lessonsArr: List<LessonsData>
) : RecyclerView.Adapter<PresentationAdapter.ScrollableViewHolder>() {

    /**
     * Provides a reference for the views needed to display items in your list.
     */
    class ScrollableViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.scrollable_title)
        val imageView: ImageView = view.findViewById(R.id.scrollable_image)
        val button: Button = view.findViewById(R.id.scrollable_button)
    }

    /**
     * Creates new views with R.layout.scrollable_list as its template
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ScrollableViewHolder {
        val layout = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.scrollable_list, parent, false)

        // Setup custom accessibility delegate to set the text read
        return ScrollableViewHolder(layout)
    }

    /**
     * Replaces the content of an existing view with new data
     */
    override fun onBindViewHolder(holder: ScrollableViewHolder, position: Int) {
        val currentLesson = lessonsArr[position]
        holder.textView.text = context.resources.getString(currentLesson.stringResourceId)
        holder.imageView.setImageResource(currentLesson.imageResourceId)
        // Assigns a [OnClickListener] to the button contained in the [ViewHolder]
        holder.button.setOnClickListener {
            // Create an action from WordList to DetailList
            // using the required arguments
            val action = PresentationFragmentDirections.actionScrollableFragmentToDetailsFragment(lessonImage = currentLesson.imageResourceId, lessonText = currentLesson.stringResourceId)
            // Navigate using that action
            holder.view.findNavController().navigate(action)
        }
    }

    override fun getItemCount(): Int {
        return lessonsArr.size
    }
}