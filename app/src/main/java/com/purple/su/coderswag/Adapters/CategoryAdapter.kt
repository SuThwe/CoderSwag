package com.purple.su.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.purple.su.coderswag.Model.Category
import com.purple.su.coderswag.R

/**
 * Created by Su Thwe on 2020-01-22.
 */
class CategoryAdapter(val context: Context, val categories: List<Category>): BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
        val categoryImage = view.findViewById<ImageView>(R.id.categoryImage)
        val categoryTitle = view.findViewById<TextView>(R.id.categoryTitle)

        val category = categories[position]
        val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        categoryImage.setImageResource(resourceId)
        categoryTitle.text = category.title

        return view
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }
}