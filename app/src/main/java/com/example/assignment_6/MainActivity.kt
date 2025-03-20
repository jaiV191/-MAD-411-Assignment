package com.example.assignment_6


import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.assignment_6.R.id.deleteButton
import com.example.assignment_7.ExpenseAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var expenseAdapter: ExpenseAdapter
    private lateinit var etExpenseName: EditText
    private lateinit var etAmount: EditText
    private lateinit var btnAddExpense: Button
    private lateinit var recyclerView: RecyclerView
    private val expenseList = mutableListOf<Expense>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        etExpenseName= findViewById(R.id.ExpenseName)
        etAmount= findViewById(R.id.Amount)
        btnAddExpense= findViewById(R.id.AddExpense)

        recyclerView= findViewById(R.id.recycler)

        recyclerView.layoutManager = LinearLayoutManager(this)
        expenseAdapter = ExpenseAdapter(expenseList)
        recyclerView.adapter = expenseAdapter

        btnAddExpense.setOnClickListener {
            val name = etExpenseName.text.toString().trim()
            val amount = etAmount.text.toString().trim()

            if (name.isNotEmpty() && amount.isNotEmpty()) {
                expenseList.add(Expense(name, amount))
                expenseAdapter.notifyDataSetChanged()

            }
        }


}

    override fun onStart() {
        super.onStart()
        Log.d("ActivityLifecycle", "App started")
    }

    override fun onResume() {
        super.onResume()
        Log.d("ActivityLifecycle", "App resumed")
    }

    override fun onPause() {
        super.onPause()
        Log.d("ActivityLifecycle", "App paused")
    }

    override fun onStop() {
        super.onStop()
        Log.d("ActivityLifecycle", "App Stopped")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ActivityLifecycle", "App destroyed")
    }
}