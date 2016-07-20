package com.coolweather.app.util;

public interface HttpCallbackListener {
	void onFinnsh(String response);
	void onError(Exception e);
}
