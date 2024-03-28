package com.example.latihan8

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UserAdapter(private var userList: List<User>) : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int): UserViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_user, parent, false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int)
    {
        val user = userList[position]
        holder.usernameTextView.text = user.username
        holder.emailTextView.text = user.email
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    fun setData(users: List<User>) {
        userList = users
        notifyDataSetChanged()
    }

    inner class UserViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        val usernameTextView: TextView =
            itemView.findViewById(R.id.usernameTextView)
        val emailTextView: TextView =
            itemView.findViewById(R.id.emailTextView)
    }
}