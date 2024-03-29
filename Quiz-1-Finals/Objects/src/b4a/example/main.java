package b4a.example;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class main extends Activity implements B4AActivity{
	public static main mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = true;
    public static WeakReference<Activity> previousOne;
    public static boolean dontPause;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new BA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.main");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (main).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(this, processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.main");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.main", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (main) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (main) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        if (!dontPause)
            BA.LogInfo("** Activity (main) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (main) Pause event (activity is not paused). **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        if (!dontPause) {
            processBA.setActivityPaused(true);
            mostCurrent = null;
        }

        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            main mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (main) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }

public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public static String _priceforpizza = "";
public static String _pricefordrinks = "";
public anywheresoftware.b4a.objects.EditTextWrapper _txtdiscountedprice = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtpricedrinks = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtpricepizza = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txttotal = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txttotaldiscount = null;
public b4a.example.starter _starter = null;
public b4a.example.pizza _pizza = null;
public b4a.example.drinks _drinks = null;

public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
vis = vis | (pizza.mostCurrent != null);
vis = vis | (drinks.mostCurrent != null);
return vis;}
public static String  _activity_create(boolean _firsttime) throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
 //BA.debugLineNum = 33;BA.debugLine="Activity.LoadLayout(\"Layout\")";
mostCurrent._activity.LoadLayout("Layout",mostCurrent.activityBA);
 //BA.debugLineNum = 34;BA.debugLine="txtpricedrinks.Enabled=False";
mostCurrent._txtpricedrinks.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 35;BA.debugLine="txtpricepizza.Enabled=False";
mostCurrent._txtpricepizza.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 36;BA.debugLine="txtdiscountedprice.Enabled=False";
mostCurrent._txtdiscountedprice.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 37;BA.debugLine="txttotal.Enabled=False";
mostCurrent._txttotal.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 38;BA.debugLine="txttotaldiscount.Enabled=False";
mostCurrent._txttotaldiscount.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 39;BA.debugLine="priceforpizza = 0";
_priceforpizza = BA.NumberToString(0);
 //BA.debugLineNum = 40;BA.debugLine="pricefordrinks = 0";
_pricefordrinks = BA.NumberToString(0);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 45;BA.debugLine="txtpricepizza.Text = priceforpizza";
mostCurrent._txtpricepizza.setText(BA.ObjectToCharSequence(_priceforpizza));
 //BA.debugLineNum = 46;BA.debugLine="txtpricedrinks.Text = pricefordrinks";
mostCurrent._txtpricedrinks.setText(BA.ObjectToCharSequence(_pricefordrinks));
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return "";
}
public static String  _btndrinks_click() throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Private Sub btnDrinks_Click";
 //BA.debugLineNum = 89;BA.debugLine="StartActivity(Drinks)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._drinks.getObject()));
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return "";
}
public static String  _btnexit_click() throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Private Sub btnexit_Click";
 //BA.debugLineNum = 94;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return "";
}
public static String  _btnpizza_click() throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Private Sub btnPizza_Click";
 //BA.debugLineNum = 84;BA.debugLine="StartActivity(Pizza)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._pizza.getObject()));
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return "";
}
public static String  _btntotal_click() throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Private Sub btntotal_Click";
 //BA.debugLineNum = 79;BA.debugLine="txttotal.Text=txtpricepizza.Text + txtpricedrinks";
mostCurrent._txttotal.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtpricepizza.getText()))+(double)(Double.parseDouble(mostCurrent._txtpricedrinks.getText()))));
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return "";
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 25;BA.debugLine="Private txtdiscountedprice As EditText";
mostCurrent._txtdiscountedprice = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Private txtpricedrinks As EditText";
mostCurrent._txtpricedrinks = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Private txtpricepizza As EditText";
mostCurrent._txtpricepizza = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Private txttotal As EditText";
mostCurrent._txttotal = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Private txttotaldiscount As EditText";
mostCurrent._txttotaldiscount = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return "";
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main._process_globals();
starter._process_globals();
pizza._process_globals();
drinks._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 18;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 19;BA.debugLine="Dim priceforpizza As String";
_priceforpizza = "";
 //BA.debugLineNum = 20;BA.debugLine="Dim pricefordrinks As String";
_pricefordrinks = "";
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return "";
}
public static String  _rdo0_checkedchange(boolean _checked) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Private Sub rdo0_CheckedChange(Checked As Boolean)";
 //BA.debugLineNum = 73;BA.debugLine="txttotaldiscount.Text = txttotal.Text * 0";
mostCurrent._txttotaldiscount.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txttotal.getText()))*0));
 //BA.debugLineNum = 74;BA.debugLine="txtdiscountedprice.Text = txttotal.Text - txttota";
mostCurrent._txtdiscountedprice.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txttotal.getText()))-(double)(Double.parseDouble(mostCurrent._txttotaldiscount.getText()))));
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return "";
}
public static String  _rdo05_checkedchange(boolean _checked) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Private Sub rdo05_CheckedChange(Checked As Boolean";
 //BA.debugLineNum = 67;BA.debugLine="txttotaldiscount.Text = txttotal.Text * 0.05";
mostCurrent._txttotaldiscount.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txttotal.getText()))*0.05));
 //BA.debugLineNum = 68;BA.debugLine="txtdiscountedprice.Text = txttotal.Text - txttota";
mostCurrent._txtdiscountedprice.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txttotal.getText()))-(double)(Double.parseDouble(mostCurrent._txttotaldiscount.getText()))));
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return "";
}
public static String  _rdo10_checkedchange(boolean _checked) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Private Sub rdo10_CheckedChange(Checked As Boolean";
 //BA.debugLineNum = 61;BA.debugLine="txttotaldiscount.Text = txttotal.Text *0.1";
mostCurrent._txttotaldiscount.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txttotal.getText()))*0.1));
 //BA.debugLineNum = 62;BA.debugLine="txtdiscountedprice.Text = txttotal.Text - txttota";
mostCurrent._txtdiscountedprice.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txttotal.getText()))-(double)(Double.parseDouble(mostCurrent._txttotaldiscount.getText()))));
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return "";
}
public static String  _rdo20_checkedchange(boolean _checked) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Private Sub rdo20_CheckedChange(Checked As Boolean";
 //BA.debugLineNum = 55;BA.debugLine="txttotaldiscount.Text = txttotal.Text * 0.2";
mostCurrent._txttotaldiscount.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txttotal.getText()))*0.2));
 //BA.debugLineNum = 56;BA.debugLine="txtdiscountedprice.Text = txttotal.Text - txttota";
mostCurrent._txtdiscountedprice.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txttotal.getText()))-(double)(Double.parseDouble(mostCurrent._txttotaldiscount.getText()))));
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return "";
}
}
