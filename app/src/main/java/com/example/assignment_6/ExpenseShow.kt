package com.example.assignment_6

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ExpenseShow : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_expense_show)


                val nameDetail: TextView = findViewById(R.id.nameDet)
                val amountDetail: TextView = findViewById(R.id.amount_details)

                val expenseName = intent.getStringExtra("Expense_Name")
                val expenseAmount = intent.getStringExtra("Expense_amount")

                nameDetail.text = "Expense: $expenseName"
                amountDetail.text = "Amount: $$expenseAmount"
            }
        }






