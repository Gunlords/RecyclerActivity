package edu.temple.simplerecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Step 3: Complete adapter implementation
class NumberDisplayAdapter(private val numbers: List<String>) :
    RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>() {

    // Step 3a: ViewHolder for holding the TextView
    class NumberViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)

    // Step 3b: Inflate the item layout and return the ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        val textView = LayoutInflater.from(parent.context)
            .inflate(android.R.layout.simple_list_item_1, parent, false) as TextView
        return NumberViewHolder(textView)
    }

    // Step 3b: Bind data to the TextView
    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.textView.text = numbers[position]
        holder.textView.textSize = 20f
    }

    // Step 3b: Return the size of the dataset
    override fun getItemCount(): Int = numbers.size
}
