package com.example.testapp

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager

import com.example.testapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var bindingMain:ActivityMainBinding
    lateinit var userList:ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMain = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingMain.root)

        userList = ArrayList()

        userList.add(User("Person1","11"))
        userList.add(User("Person2","11"))
        userList.add(User("Person3","11"))
        userList.add(User("Person4","11"))
        userList.add(User("Person5","11"))
        userList.add(User("Person6","11"))
        userList.add(User("Person7","11"))

        bindingMain.recyclerView.adapter = UserAdapter(userList)
        bindingMain.recyclerView.layoutManager = LinearLayoutManager(this)
        bindingMain.recyclerView.setHasFixedSize(true)

    }

}