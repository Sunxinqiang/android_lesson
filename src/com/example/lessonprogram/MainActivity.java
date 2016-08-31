package com.example.lessonprogram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class MainActivity extends ActionBarActivity {
	private String[] name = { "1.SimpleAdapter and TextView", "张三", "hello", "诗情画意", "张三", "hello", "诗情画意", "张三", "hello", "诗情画意" , "诗情画意", "张三", "hello", "诗情画意"};  
	  
    private String[] desc = { "魔域玩家", "百家执行", "高级的富一代", "hahaha" , "百家执行", "高级的富一代", "hahaha", "百家执行", "高级的富一代", "hahaha", "hahaha", "百家执行", "高级的富一代", "hahaha"};  
  
    
    private ListView lt1;  

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		 List<Map<String, Object>> listems = new ArrayList<Map<String, Object>>();  
	        for (int i = 0; i < name.length; i++) {  
	            Map<String, Object> listem = new HashMap<String, Object>();  
	            listem.put("name", name[i]);  
	            listem.put("desc", desc[i]);  
	            listems.add(listem);  
	        }  
	          
	        /*SimpleAdapter的参数说明 
	         * 第一个参数 表示访问整个android应用程序接口，基本上所有的组件都需要 
	         * 第二个参数表示生成一个Map(String ,Object)列表选项 
	         * 第三个参数表示界面布局的id  表示该文件作为列表项的组件 
	         * 第四个参数表示该Map对象的哪些key对应value来生成列表项 
	         * 第五个参数表示来填充的组件 Map对象key对应的资源一依次填充组件 顺序有对应关系 
	         * 注意的是map对象可以key可以找不到 但组件的必须要有资源填充  因为 找不到key也会返回null 其实就相当于给了一个null资源 
	         * 下面的程序中如果 new String[] { "name", "head", "desc","name" } new int[] {R.id.name,R.id.head,R.id.desc,R.id.head} 
	         * 这个head的组件会被name资源覆盖 
	         * */  
	        SimpleAdapter simplead = new SimpleAdapter(this, listems,  
	                R.layout.main_list_item, new String[] { "name", "desc"},  
	                new int[] {R.id.textView1,R.id.textView2});  
	          
	        lt1=(ListView)findViewById(R.id.listView1);  
	        lt1.setAdapter(simplead); 
	        lt1.setOnItemClickListener(new OnItemClickListener(){

				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1,
						int arg2, long arg3) {
					// TODO Auto-generated method stub
					if(arg2==0){
						Intent intent = new Intent(MainActivity.this,lesson_one.class);
						startActivity(intent);
					}
				}});
	}
}
