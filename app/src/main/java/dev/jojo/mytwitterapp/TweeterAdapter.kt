package dev.jojo.mytwitterapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TweeterAdapter (var tweetlist: List<Tweeter>):
    RecyclerView.Adapter<TweetViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.twitt_list_item, parent, false)
        return TweetViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TweetViewHolder, position: Int) {
        var currentTweet = tweetlist.get(position)
        holder.tvName.text = currentTweet.name
        holder.tvText.text = currentTweet.texts
        holder.tvComments.text = currentTweet.comment1
        holder.tvRetweet.text = currentTweet.retweet1
        holder.tvLike.text = currentTweet.like1
        holder.tvShare.text = currentTweet.share1

    }

    override fun getItemCount(): Int {
       return  tweetlist.size
    }
}

class  TweetViewHolder(itemView: View):
    RecyclerView.ViewHolder(itemView){

    var tvName: TextView = itemView.findViewById<TextView>(R.id.tvName)
    var tvText: TextView = itemView.findViewById<TextView>(R.id.tvText)
    var tvComments: TextView = itemView.findViewById<TextView>(R.id.tvComments)
    var tvRetweet: TextView = itemView.findViewById<TextView>(R.id.tvRetweet)
    var tvLike: TextView = itemView.findViewById<TextView>(R.id.tvLike)
    var tvShare: TextView = itemView.findViewById<TextView>(R.id.tvShare)
    var ivPerson1: ImageView = itemView.findViewById<ImageView>(R.id.ivPerson1)
    var ivComment: ImageView = itemView.findViewById<ImageView>(R.id.ivComment)
    var ivRetweet: ImageView = itemView.findViewById<ImageView>(R.id.ivRetweet)
    var ivLike: ImageView = itemView.findViewById<ImageView>(R.id.ivLike)
    var ivShare: ImageView = itemView.findViewById<ImageView>(R.id.ivShare)

}

