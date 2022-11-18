package com.wakeup.presentation.adapter

import android.graphics.Bitmap
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

object BindingAdapters {

    @JvmStatic
    @BindingAdapter("submitList")
    fun bindSubmitList(view: RecyclerView, itemList: List<Any>?) {
        view.adapter?.let {
            (view.adapter as ListAdapter<Any, *>).submitList(itemList)
        }
    }

    @JvmStatic
    @BindingAdapter("imageBitmap")
    fun bindImageBitmap(view: ImageView, bitmap: Bitmap?) {
        view.setImageBitmap(bitmap)
    }
}