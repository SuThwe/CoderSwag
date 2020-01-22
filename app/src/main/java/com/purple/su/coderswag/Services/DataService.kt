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
        Product("Graphic Beanie", "$18", "hat01"),
        Product("Hat Black", "$20", "hat02"),
        Product("Hat White", "$20", "hat03"),
        Product("Hat Snapback", "$22", "hat04")
    )

    val hoodies = listOf(
        Product("Hoodie Gray", "$25", "hoodie01"),
        Product("Hoodie Red", "$27", "hoodie02"),
        Product("Hoodie Black", "$25", "hoodie03"),
        Product("Black Hoodie", "$30", "hoodie04")
    )

    val shirts = listOf(
        Product("Shirt Black", "$15", "shirt01"),
        Product("Badge Light Gray", "$18", "shirt02"),
        Product("Logo Shirt Red", "$12", "shirt03"),
        Product("Hustle", "$25", "shirt04"),
        Product("Studios", "$21", "shirt05")
    )
}