package com.example.lessonprogram;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class lesson_one extends Activity{
	WebView webViews;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lesson_one);
		webViews = (WebView) findViewById(R.id.webView1);
		if(webViews==null){
			Log.e("taga", "null~~~~~~~~~~~~~~~~~~~~~~");
			return;
		}
		webViews.loadUrl("file:///android_asset/lesson_one/lesson_one.html");
//		webViews.loadUrl("http://baidu.com");
//		webViews.setWebViewClient(new WebViewClient(){
//            @Override
//            public boolean shouldOverrideUrlLoading(WebView view, String url) {
//                view.loadUrl(url);
//                return true;
//            }
//        });
	}
}
