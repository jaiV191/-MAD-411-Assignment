package com.example.assignment_7

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.assignment_6.Expense
import com.example.assignment_6.ExpenseShow
import com.example.assignment_6.R

class ExpenseAdapter(private val expenseList: MutableList<Expense>,private val context: Context) : RecyclerView.Adapter<ExpenseAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val expenseName: TextView = itemView.findViewById(R.id.Name)
        val expenseAmount: TextView = itemView.findViewById(R.id.ExpenseAmount)
        val button2: Button = itemView.findViewById(R.id.deleteButton)
        val button3: Button = itemView.findViewById(R.id.details)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.expense, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val expense = expenseList[position]
        holder.expenseName.text = expense.name
        holder.expenseAmount.text = expense.amount
        holder.button2.setOnClickListener{
            expenseList.removeAt(position)
            notifyDataSetChanged()
        }
        holder.button3.setOnClickListener{
            val intent = Intent(context,ExpenseShow::class.java).apply {
                putExtra("Expense_Name",expense.name)
                putExtra("Expense_amount",expense.amount)
            }
            context.startActivity(intent)

        }

    }

    override fun getItemCount(): Int {
        return expenseList.size
    }
}
