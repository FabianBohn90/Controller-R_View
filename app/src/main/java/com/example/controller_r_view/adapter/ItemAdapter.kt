package com.example.controller_r_view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.controller_r_view.R
import com.example.controller_r_view.data.model.Controller
import com.example.controller_r_view.databinding.ListItemBinding

class ItemAdapter(
    private val context: Context,
    private val dataset: List<Controller>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    // der ViewHolder kann über die DatabBinding Variable auf alle Layoutelemente zugreifen
    class ItemViewHolder(val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root)

    // hier werden neue ViewHolder erstellt
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {

        val binding = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        // und in einem ViewHolder zurückgegeben
        return ItemViewHolder(binding)
    }

    // hier findet der Recyclingprozess statt
    // die vom ViewHolder bereitgestellten Parameter werden verändert
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        // der aktuelle Fan wird von der Liste geladen
        val item = dataset[position]

        holder.binding.contrImg.setImageResource(item.picResources)
        holder.binding.titelTxt.text = item.title
        holder.binding.priceTxt.text = "€${item.price}"

        if (item.sale) {
            holder.binding.saleTxt.visibility = View.VISIBLE
            holder.binding.priceTxt.textSize = 24F
        } else {
            holder.binding.saleTxt.visibility = View.GONE
            holder.binding.priceTxt.textSize = 20F
        }
    }

    // damit der LayoutManager weiß wie lang die Liste ist
    override fun getItemCount(): Int {
        return dataset.size
    }
}
