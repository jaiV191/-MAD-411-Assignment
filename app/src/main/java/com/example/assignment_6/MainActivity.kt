package com.example.assignment_6

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler

class MainActivity : AppCompatActivity() {
@SuppressLint("MissingInflatedId")
override fun onCreate(savedInstanceState:Bundle?){
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val expenseName=findViewById<EditText>(R.id.ExpenseName)
    val amount=findViewById<EditText>(R.id.Amount)
    val addButton = findViewById<Button>(R.id.AddExpense)
    val list= findViewById<RecyclerView>(R.id.recycler)

    val expenses = MutableList()

    addButton.setOnClickListener{
        val name= expenseName.text.toString()
        val price=amount.text.toString()
       if (name.isNotEmpty() && price.isNotEmpty()){

       }
    }
}

    }
