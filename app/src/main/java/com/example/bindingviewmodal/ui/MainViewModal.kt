package com.example.bindingviewmodal.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.bindingviewmodal.data.entity.Employee
import com.example.bindingviewmodal.data.entity.Employees
import com.example.bindingviewmodal.data.repository.RepositoryEmployees


class MainViewModal : ViewModel() {

    private val _name = MutableLiveData("Sergey")
    private val _lastName = MutableLiveData("Yakovenko")
    private val _imageUrl = MutableLiveData("https://i.pinimg.com/originals/9f/2d/51/9f2d512ad1cb2311f80530458a5a1065.png")
    private val _like = MutableLiveData(0)
    private val _listEmployees = MutableLiveData(Employees(RepositoryEmployees.getListEmployees()).listEmployees)

    val name: LiveData<String> = _name
    val lastName: LiveData<String> = _lastName
    val imageUrl: LiveData<String> = _imageUrl
    val like: LiveData<Int> = _like
    val employees: LiveData<List<Employee>> = _listEmployees

    fun onLike() {
        _like.value = (_like.value ?: 0) + 1
    }
}