package com.epicodus.anonrec.ui.messages;

import android.support.v7.app.AppCompatActivity;

public class MessageListActivity extends AppCompatActivity {
//    private DatabaseReference mMessageReference;
//    private FirebaseRecyclerAdapter mFirebaseAdapter;
//    private String mSelectCategory;
//    private SharedPreferences mSharedPreferences;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_message_list);
//        ButterKnife.bind(this);
//
//        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
//        mSelectCategory = mSharedPreferences.getString(MessageConstants.FIREBASE_QUERY_CATEGORY, null);
//
//        mMessageReference = FirebaseDatabase.getInstance().getReference(MessageConstants.FIREBASE_CHILD_MESSAGES).child(mSelectCategory);
//        setUpFirebaseAdapter();
//    }
//
//    private void setUpFirebaseAdapter() {
//        mFirebaseAdapter = new FirebaseRecyclerAdapter<Message, MessageViewHolder>
//                (Message.class, R.layout.message_list_item, MessageViewHolder.class, mMessageReference) {
//            @Override
//            protected void populateViewHolder(MessageViewHolder viewHolder, Message model, int position) {
//                viewHolder.bindMessage(model);
//
//            }
//        };
//
//        mRecyclerView.setHasFixedSize(true);
//        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
//        mRecyclerView.setAdapter(mFirebaseAdapter);
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        mFirebaseAdapter.cleanup();
//    }
}
