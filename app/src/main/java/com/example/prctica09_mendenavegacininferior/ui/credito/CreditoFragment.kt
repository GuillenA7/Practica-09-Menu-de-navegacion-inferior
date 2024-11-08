package com.example.prctica09_mendenavegacininferior.ui.credito

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CalendarView
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.prctica09_mendenavegacininferior.R

class CreditoFragment : Fragment() {

    private var selectedDate: String = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_credito, container, false)

        val editTextName = view.findViewById<EditText>(R.id.editText_name)
        val calendarView = view.findViewById<CalendarView>(R.id.calendarView)
        val buttonSubmit = view.findViewById<Button>(R.id.button_submit)

        calendarView.setOnDateChangeListener { _, year: Int, month: Int, dayOfMonth: Int ->
            selectedDate = "$dayOfMonth/${month + 1}/$year"
        }

        buttonSubmit.setOnClickListener {
            val name = editTextName.text.toString()
            if (name.isNotEmpty() && selectedDate.isNotEmpty()) {
                Toast.makeText(context, "Cita agendada para $name el $selectedDate", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(context, "Ingrese su nombre y seleccione una fecha", Toast.LENGTH_SHORT).show()
            }
        }

        return view
    }
}