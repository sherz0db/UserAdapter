package com.example.testapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class UserAdapter(private val userList:ArrayList<User>) : RecyclerView.Adapter<UserAdapter.UserViewHolder>(){

    class UserViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){
        val userPic = itemView.findViewById<CircleImageView>(R.id.userPic)
        val userName = itemView.findViewById<TextView>(R.id.userName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.user_layout,parent,false)
        return UserViewHolder(itemView)
    }

    override fun getItemCount() = userList.size

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val currentUser = userList[position]
        holder.userName.text = currentUser.name

     if (position%2==0 && currentUser.name.endsWith("5")){
         holder.itemView.setBackgroundColor(ContextCompat.getColor(holder.itemView.context,R.color.blue))
     }
    }

}