package com.example.bindingviewmodal.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.bindingviewmodal.data.entity.Employee
import com.example.bindingviewmodal.data.entity.Employees


class MainViewModal : ViewModel() {

    private val _name = MutableLiveData("Sergey")
    private val _lastName = MutableLiveData("Yakovenko")
    private val _like = MutableLiveData(0)
    private val _listEmployees = MutableLiveData(Employees(Employees.getListEmployees()))

    val name: LiveData<String> = _name
    val lastName: LiveData<String> = _lastName
    val like: LiveData<Int> = _like
    val employees: LiveData<Employees> = _listEmployees

    fun onLike() {
        _like.value = (_like.value ?: 0) + 1
    }
}