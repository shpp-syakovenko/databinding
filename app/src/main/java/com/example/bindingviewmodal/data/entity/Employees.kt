package com.example.bindingviewmodal.data.entity

class Employees(val listEmployees: List<Employee>) {
    companion object{
        fun getListEmployees(): List<Employee> {
            val result: List<Employee> = arrayListOf(
                Employee("Sergey"),
                Employee("Roma"),
                Employee("Dima"),
                Employee("Igor"),
                Employee("Evgeniy"),
                Employee("Vlad")
            )
            return result
        }
    }
}