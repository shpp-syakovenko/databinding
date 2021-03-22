package com.example.bindingviewmodal.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.bindingviewmodal.R
import com.example.bindingviewmodal.data.entity.Employee
import com.example.bindingviewmodal.databinding.ItemEmployeeBinding

class EmployeesAdapter: RecyclerView.Adapter<EmployeeViewHolder>() {

    var items: List<Employee> = arrayListOf()
    set(value) {
        field = value
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmployeeViewHolder {
        val inflater: LayoutInflater = LayoutInflater.from(parent.context)
        val binding:ItemEmployeeBinding = DataBindingUtil.inflate(inflater, R.layout.item_employee, parent, false)
        return EmployeeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: EmployeeViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }
}