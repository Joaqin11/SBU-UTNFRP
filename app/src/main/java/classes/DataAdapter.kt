package classes

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

class DataAdapter : RecyclerView.Adapter<ViewHolder>() {

    private val listNews = mutableListOf<Noticias>()

    override fun onCreateViewHolder(parent: ViewGroup, pos: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = listNews.size

    override fun onBindViewHolder(holder: ViewHolder, pos: Int) {
        holder.bind(listNews[pos])

    }

    fun set(list: MutableList<Noticias>) {
        this.listNews.clear()
        this.listNews.addAll(list)
        notifyDataSetChanged()
    }
}