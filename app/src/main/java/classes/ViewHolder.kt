package classes

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView

class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private  val  titulo: TextView = itemView.row_tv_title
    

    fun bind(noticias: Noticias) {

    }
}