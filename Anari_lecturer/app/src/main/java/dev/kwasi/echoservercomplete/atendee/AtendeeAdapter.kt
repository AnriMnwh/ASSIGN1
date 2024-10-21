package dev.kwasi.echoservercomplete.atendee

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dev.kwasi.echoservercomplete.R

class AtendeeAdapter(private val context: Context, private val studentIds: List<String>) : RecyclerView.Adapter<AtendeeAdapter.AtendeeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AtendeeViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.activity_communication, parent, false)
        return AtendeeViewHolder(view)
    }

    override fun onBindViewHolder(holder: AtendeeViewHolder, position: Int) {
        holder.bind(studentIds[position])
    }

    override fun getItemCount(): Int {
        return studentIds.size
    }

    class AtendeeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val studentIdTextView: TextView = itemView.findViewById(R.id.studentIdTextView)

        fun bind(studentId: String) {
            studentIdTextView.text = studentId
        }
    }
}