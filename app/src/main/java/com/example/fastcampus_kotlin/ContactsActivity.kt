package com.example.fastcampus_kotlin

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ContactsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacts)

        val contacts = ArrayList<Contact>()
        contacts.add(Contact("가", "010-1111-1111", R.drawable.bitcoin))
        contacts.add(Contact("나", "010-2222-2222", R.drawable.gradient))
        contacts.add(Contact("염동글", "010-1234-5678", R.drawable.bitcoin))
        contacts.add(Contact("라", "010-4444-4444", R.drawable.gradient))
        contacts.add(Contact("마", "010-5555-5555", R.drawable.bitcoin))

        val container = findViewById<LinearLayout>(R.id.contacts_container)

        val inflater = LayoutInflater.from(this@ContactsActivity)
        for (contact in contacts) {
            val contactTile = inflater.inflate(R.layout.contacts_tile, null)

            contactTile.findViewById<TextView>(R.id.contacts_name).setText(contact.name)
            contactTile.findViewById<TextView>(R.id.contacts_num).setText(contact.num)
            if (contact.imgId != null) contactTile.findViewById<ImageView>(R.id.contacts_img).setImageResource(contact.imgId)

            container.addView(contactTile)

            contactTile.setOnClickListener{
                val intent = Intent(this@ContactsActivity, ContactInfoActivity::class.java)
                intent.apply {
                    this.putExtra("name", contact.name)
                    this.putExtra("num", contact.num)
                    this.putExtra("imgId", contact.imgId)
                }
                startActivity(intent)
            }
        }
    }
}


class Contact(val name: String, val num: String, val imgId: Int?) {}