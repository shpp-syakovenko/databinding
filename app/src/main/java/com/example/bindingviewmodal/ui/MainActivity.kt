package com.example.bindingviewmodal.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.bindingviewmodal.R
import com.example.bindingviewmodal.adapters.EmployeesAdapter
import com.example.bindingviewmodal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val viewModel:MainViewModal by lazy{ ViewModelProvider(this).get(MainViewModal::class.java)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val adapterEmployee = EmployeesAdapter()

        viewModel.employees.observe(this, {
            adapterEmployee.items = it
        })

        binding.lifecycleOwner = this
        binding.viewmodel = viewModel
        binding.rvListEmployees.adapter = adapterEmployee
        binding.rvListEmployees.isNestedScrollingEnabled = false
        binding.scroll.smoothScrollTo(0,0)
    }
}