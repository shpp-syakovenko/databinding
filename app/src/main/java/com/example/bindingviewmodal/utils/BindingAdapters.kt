package com.example.bindingviewmodal.utils

import android.view.View
import android.widget.ProgressBar
import androidx.databinding.BindingAdapter
import androidx.databinding.BindingConversion
import com.example.bindingviewmodal.data.entity.Employee
import java.lang.StringBuilder

@BindingAdapter("app:hideIfZero")
fun hideIfZero(view: View, number: Int){
    view.visibility = if(number == 0) View.GONE else View.VISIBLE
}

@BindingAdapter(value = ["app:progressScaled", "android:max"], requireAll = true)
fun setProgress(progressBar: ProgressBar, likes: Int, max: Int) {
    val n = (likes * max / 5).coerceAtMost(max)
    progressBar.progress = (likes * max / 10).coerceAtMost(max)
}

@BindingConversion
fun convertListEmployees(list:List<Employee>):String{
    var result = StringBuilder()
    for (v in list){
        result.append("${v.name}, ")
    }
    return result.toString()
}