package com.purple.su.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.purple.su.coderswag.R
import com.purple.su.coderswag.Utilities.EXTRA_CATEGORY_TYPE

class ProductActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY_TYPE)
    }
}
