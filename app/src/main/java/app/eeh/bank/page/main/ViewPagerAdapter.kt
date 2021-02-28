package app.eeh.bank.page.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import app.eeh.bank.R


/**
 *
 * @author EraJieZhang
 * @data 2021-2-28
 */

class ViewPagerAdapter :
    RecyclerView.Adapter<ViewPagerAdapter.ViewPagerViewHolder?>() {
    private val colors: MutableList<Int> = ArrayList()
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewPagerViewHolder {
        return ViewPagerViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_page, parent, false)
        )
    }

    override fun onBindViewHolder(
        holder: ViewPagerViewHolder,
        position: Int
    ) {
        holder.mTvTitle.text = "item $position"
        holder.mContainer.setBackgroundResource(colors[position])
    }

    override fun getItemCount(): Int {
        return colors.size
    }

    inner class ViewPagerViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        var mTvTitle: TextView = itemView.findViewById(R.id.tvTitle)
        var mContainer: RelativeLayout = itemView.findViewById(R.id.container)

    }

    init {
        colors.add(R.color.black)
        colors.add(R.color.label_link_color)
        colors.add(R.color.label_danger_color)
        colors.add(R.color.label_warning_color)
    }
}