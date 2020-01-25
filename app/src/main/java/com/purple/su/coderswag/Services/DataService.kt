package com.purple.su.coderswag.Services

import com.purple.su.coderswag.Model.Category
import com.purple.su.coderswag.Model.Product

/**
 * Created by Su Thwe on 2020-01-20.
 */
object DataService {

    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Graphic Beanie", "$18", "hat1"),
        Product("Hat Black", "$20", "hat2"),
        Product("Hat White", "$20", "hat3"),
        Product("Hat Snapback", "$22", "hat4"),
        Product("Graphic Beanie", "$18", "hat1"),
        Product("Hat Black", "$20", "hat2"),
        Product("Hat White", "$20", "hat3"),
        Product("Hat Snapback", "$22", "hat4"),
        Product("Graphic Beanie", "$18", "hat1"),
        Product("Hat Black", "$20", "hat2"),
        Product("Hat White", "$20", "hat3"),
        Product("Hat Snapback", "$22", "hat4")
    )

    val hoodies = listOf(
        Product("Hoodie Gray", "$25", "hoodie1"),
        Product("Hoodie Red", "$27", "hoodie2"),
        Product("Hoodie Black", "$25", "hoodie3"),
        Product("Black Hoodie", "$30", "hoodie4"),
        Product("Hoodie Gray", "$25", "hoodie1"),
        Product("Hoodie Red", "$27", "hoodie2"),
        Product("Hoodie Black", "$25", "hoodie3"),
        Product("Black Hoodie", "$30", "hoodie4"),
        Product("Hoodie Gray", "$25", "hoodie1"),
        Product("Hoodie Red", "$27", "hoodie2"),
        Product("Hoodie Black", "$25", "hoodie3"),
        Product("Black Hoodie", "$30", "hoodie4")
    )

    val shirts = listOf(
        Product("Shirt Black", "$15", "shirt1"),
        Product("Badge Light Gray", "$18", "shirt2"),
        Product("Logo Shirt Red", "$12", "shirt3"),
        Product("Hustle", "$25", "shirt4"),
        Product("Studios", "$21", "shirt5"),
        Product("Shirt Black", "$15", "shirt1"),
        Product("Badge Light Gray", "$18", "shirt2"),
        Product("Logo Shirt Red", "$12", "shirt3"),
        Product("Hustle", "$25", "shirt4"),
        Product("Studios", "$21", "shirt5"),
        Product("Shirt Black", "$15", "shirt1"),
        Product("Badge Light Gray", "$18", "shirt2"),
        Product("Logo Shirt Red", "$12", "shirt3"),
        Product("Hustle", "$25", "shirt4"),
        Product("Studios", "$21", "shirt5")
    )

    val digitalGoods = listOf<Product>()

    fun getProducts(category: String) : List<Product> {
        return when(category) {
            "HATS" -> hats
            "HOODIES" -> hoodies
            "SHIRTS" -> shirts
            else -> digitalGoods
        }
    }
}