package com.example.fastcampus_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import io.realm.Realm
import io.realm.RealmConfiguration

class RealmActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_realm)

        // Realm 초기화
        Realm.init(this@RealmActivity)
        val config: RealmConfiguration = RealmConfiguration.Builder()
            .deleteRealmIfMigrationNeeded()
            .build()
        Realm.setDefaultConfiguration(config)

        // Realm 인스턴스 가져오기
        val realm = Realm.getDefaultInstance()

        val saveBtn = findViewById<Button>(R.id.realm_save)
        val loadBtn = findViewById<Button>(R.id.realm_load)
        val deleteBtn = findViewById<Button>(R.id.realm_delete)

        saveBtn.setOnClickListener {
            realm.executeTransaction {
                with(it.createObject(School::class.java)) {
                    this.name = "어떤 대학교"
                    this.location = "서울"
                }
            }
        }
        loadBtn.setOnClickListener {
            realm.executeTransaction {
                val data = it.where(School::class.java).findFirst()
                Log.d("data", "Data: " + data)
            }
        }
        deleteBtn.setOnClickListener {
            realm.executeTransaction {
                it.where(School::class.java).findFirst()?.deleteFromRealm()
            }
        }
    }
}