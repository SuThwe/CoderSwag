package com.purple.su.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.purple.su.coderswag.Model.Category
import com.purple.su.coderswag.R

/**
 * Created by Su Thwe on 2020-01-26.
 */
class CategoryRecycleAdapter(
        val context: Context,
        val categories: List<Category>,
        val itemClick: (Category) -> Unit // means return nothing
    ): RecyclerView.Adapter<CategoryRecycleAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.category_list_item, parent, false)
        return Holder(view, itemClick)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder?.bindCategory(categories[position])
    }

    inner class Holder(itemView: View, itemClick: (Category) -> Unit): RecyclerView.ViewHolder(itemView) {
        val categoryImage = itemView?.findViewById<ImageView>(R.id.categoryImage)
        val categoryTitle = itemView?.findViewById<TextView>(R.id.categoryTitle)

        fun bindCategory(category: Category) {
            val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
            categoryImage.setImageResource(resourceId)
            categoryTitle.text = category.title

            itemView.setOnClickListener{ itemClick(category) }
        }
    }
}