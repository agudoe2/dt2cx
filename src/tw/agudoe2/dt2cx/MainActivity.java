package tw.agudoe2.dt2cx;

import java.util.Calendar;

import android.app.Activity;
//import android.content.Intent;
import android.os.Bundle;
//import android.view.View.OnClickListener;
//import android.view.View;
//import android.widget.Button;
import android.text.ClipboardManager;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//    	setContentView(R.layout.activity_main);
	Calendar src=Calendar.getInstance();
//	String [] wds = new String[] {"","(��)","(�@)","(�G)","(�T)","(�|)","(��)","(��)"};
//	src.setFirstDayOfWeek(Calendar.SATURDAY);
//	int wd = src.get(Calendar.DAY_OF_WEEK);
//
	int y = src.get(Calendar.YEAR)-2000;
	int m = src.get(Calendar.MONTH)+1;
	int d = src.get(Calendar.DAY_OF_MONTH);
	int H = src.get(Calendar.HOUR_OF_DAY);
	int M = src.get(Calendar.MINUTE);

//	String dt=m10+"/"+d10+" "/*+wds[wd]+" "*/+H10+":"+M10;
	String dt=tw(y)+"/"+tw(m)+"/"+tw(d)+" "+tw(H)+":"+tw(M);

	ClipboardManager myClipBoard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
	myClipBoard.setText(dt);
//	Toast.makeText(this, dt, Toast.LENGTH_SHORT).show();

//	Toast.makeText(dt2cx.this, dt, Toast.LENGTH_LONG).show();
	finish();
}

String tw(int src) {
	return src>9 ? ""+src : "0"+src;
}
}
