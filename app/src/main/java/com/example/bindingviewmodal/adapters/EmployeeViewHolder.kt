package com.example.bindingviewmodal.adapters

import androidx.recyclerview.widget.RecyclerView
import com.example.bindingviewmodal.data.entity.Employee
import com.example.bindingviewmodal.databinding.ItemEmployeeBinding

class EmployeeViewHolder(val binding: ItemEmployeeBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(employee:Employee){
        binding.employee = employee
        binding.executePendingBindings()
    }
}