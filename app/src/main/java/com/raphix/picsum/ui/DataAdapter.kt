package com.raphix.picsum.ui
//
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.ImageView
//import android.widget.TextView
//import androidx.recyclerview.widget.RecyclerView
//import com.raphix.picsum.R
//import com.raphix.picsum.model.PhotoModel
//import com.squareup.picasso.Picasso
//
//class DataAdapter(private val dataList: List<PhotoModel>) : RecyclerView.Adapter<DataAdapter.DataViewHolder>() {
//
//    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        val imageView: ImageView = itemView.findViewById(R.id.imageView)
//        val authorTextView: TextView = itemView.findViewById(R.id.authorTextView)
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
//        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_data, parent, false)
//        return DataViewHolder(view)
//    }
//
//    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
//        val dataItem = dataList[position]
//
//        holder.authorTextView.text = dataItem.author
//
//        Picasso.get()
//            .load(dataItem.download_url)
//            .into(holder.imageView)
//    }
//
//    override fun getItemCount(): Int {
//        return dataList.size
//    }
//}