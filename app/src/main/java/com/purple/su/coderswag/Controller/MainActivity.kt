package com.purple.su.coderswag.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.purple.su.coderswag.Adapters.CategoryRecycleAdapter
import com.purple.su.coderswag.R
import com.purple.su.coderswag.Services.DataService
import com.purple.su.coderswag.Utilities.EXTRA_CATEGORY_TYPE
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, DataService.categories) { category ->
            val intent = Intent(this, ProductActivity::class.java)
            intent.putExtra(EXTRA_CATEGORY_TYPE, category.title)
            startActivity(intent)
        }
        productListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        productListView.layoutManager = layoutManager
        productListView.setHasFixedSize(true)
    }
}
