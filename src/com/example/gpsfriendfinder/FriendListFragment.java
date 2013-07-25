package com.example.gpsfriendfinder;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.*;

public class FriendListFragment extends Fragment
{
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		return inflater.inflate(R.layout.activity_friend_list, container, false);			
	}

}
