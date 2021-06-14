package op.mobile.app.dev.singhs2.travelling.service

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import op.mobile.app.dev.singhs2.travelling.databinding.RecyclerViewItemBinding
import op.mobile.app.dev.singhs2.travelling.model.GitHubCountries

class ServiceAdapter(private val listener: OnCountryClickListener) :
    ListAdapter<GitHubCountries, ServiceAdapter.ServiceViewHolder>(DiffCallback) {

    companion object DiffCallback : DiffUtil.ItemCallback<GitHubCountries>() {
        override fun areItemsTheSame(
            oldItem: GitHubCountries,
            newItem: GitHubCountries
        ): Boolean {
            return oldItem.id === newItem.id
        }

        override fun areContentsTheSame(
            oldItem: GitHubCountries,
            newItem: GitHubCountries
        ): Boolean {
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ServiceViewHolder {
        return ServiceViewHolder(
            RecyclerViewItemBinding.inflate(
                LayoutInflater.from(
                    parent.context
                )
            )
        )
    }

    override fun onBindViewHolder(
        holder: ServiceViewHolder,
        position: Int
    ) {
        val githubJob = getItem(position)
        holder.bind(githubJob)
    }

    inner class ServiceViewHolder(private var binding: RecyclerViewItemBinding) :
        RecyclerView.ViewHolder(binding.root), View.OnClickListener {
        fun bind(githubCountries: GitHubCountries) {
            binding.githubCountries = githubCountries
            binding.executePendingBindings()
        }

        init {
            binding.root.setOnClickListener(this)
        }

        override fun onClick(p0: View?) {
            val position = adapterPosition
            if (position != RecyclerView.NO_POSITION) {
                listener.onCountryClick(position)
            }
        }
    }

    interface OnCountryClickListener {
        fun onCountryClick(position: Int)
    }
}