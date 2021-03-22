package com.example.bindingviewmodal.data.repository

import com.example.bindingviewmodal.data.entity.Employee

class RepositoryEmployees {
    companion object{
        fun getListEmployees(): List<Employee> {
            return arrayListOf(
                    Employee("Sergey","https://i.pinimg.com/originals/9f/2d/51/9f2d512ad1cb2311f80530458a5a1065.png"),
                    Employee("Roma","https://cdn4.iconfinder.com/data/icons/avatars-xmas-giveaway/128/batman_hero_avatar_comics-512.png"),
                    Employee("Dima","https://i.pinimg.com/originals/a8/c0/f6/a8c0f64ebafef01284414397aa8ad026.png"),
                    Employee("Igor","https://forum.bubble.io/uploads/default/original/3X/2/0/20d5d1a39bd75c04a76f5644ce692980ecb8e687.png"),
                    Employee("Evgeniy","https://cdn3.iconfinder.com/data/icons/avatars-15/64/_Ninja-2-512.png"),
                    Employee("Vlad","https://cdn.statically.io/img/cdn2.iconfinder.com/data/icons/people-flat-design/64/Laugh-Funny-Joke-Happiness-Fun-Expression-Avatar-512.png")
            )
        }
    }
}