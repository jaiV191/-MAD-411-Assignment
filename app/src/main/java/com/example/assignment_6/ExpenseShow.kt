package com.example.assignment_6


import android.os.Bundle

import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity


class ExpenseShow : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_expense_show)

        val expenseNameDetail: TextView = findViewById(R.id.expense_name_detail)
        val expenseAmountDetail: TextView = findViewById(R.id.expense_amount_detail)

        val expenseName = intent.getStringExtra("Expense_Name")
        val expenseAmount = intent.getStringExtra("Expense_Amount")

        expenseNameDetail.text = expenseName
        expenseAmountDetail.text = expenseAmount
    }
}





