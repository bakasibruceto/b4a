package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_1 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,71);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 71;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(64);
 BA.debugLineNum = 73;BA.debugLine="InitializeState";
Debug.ShouldStop(256);
_initializestate();
 BA.debugLineNum = 74;BA.debugLine="DrawState";
Debug.ShouldStop(512);
_drawstate();
 BA.debugLineNum = 75;BA.debugLine="SoundEfx";
Debug.ShouldStop(1024);
_soundefx();
 BA.debugLineNum = 76;BA.debugLine="If(HPval <= 100 And HPval >=1)Then";
Debug.ShouldStop(2048);
if ((RemoteObject.solveBoolean("k",main._hpval,BA.numberCast(double.class, 100)) && RemoteObject.solveBoolean("g",main._hpval,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 78;BA.debugLine="DrawMonster";
Debug.ShouldStop(8192);
_drawmonster();
 BA.debugLineNum = 79;BA.debugLine="DrawHealth";
Debug.ShouldStop(16384);
_drawhealth();
 BA.debugLineNum = 80;BA.debugLine="DrawEquation";
Debug.ShouldStop(32768);
_drawequation();
 };
 BA.debugLineNum = 84;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,90);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 90;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 92;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,86);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 86;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button0_click() throws Exception{
try {
		Debug.PushSubsStack("Button0_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,289);
if (RapidSub.canDelegate("button0_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","button0_click");}
 BA.debugLineNum = 289;BA.debugLine="Private Sub Button0_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 290;BA.debugLine="answer.Text = tempStr&\"0\"";
Debug.ShouldStop(2);
main.mostCurrent._answer.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._tempstr,RemoteObject.createImmutable("0"))));
 BA.debugLineNum = 291;BA.debugLine="tempStr = answer.Text";
Debug.ShouldStop(4);
main.mostCurrent._tempstr = main.mostCurrent._answer.runMethod(true,"getText");
 BA.debugLineNum = 293;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button1_click() throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,295);
if (RapidSub.canDelegate("button1_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","button1_click");}
 BA.debugLineNum = 295;BA.debugLine="Private Sub Button1_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 296;BA.debugLine="answer.Text = tempStr&\"1\"";
Debug.ShouldStop(128);
main.mostCurrent._answer.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._tempstr,RemoteObject.createImmutable("1"))));
 BA.debugLineNum = 297;BA.debugLine="tempStr = answer.Text";
Debug.ShouldStop(256);
main.mostCurrent._tempstr = main.mostCurrent._answer.runMethod(true,"getText");
 BA.debugLineNum = 298;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button2_click() throws Exception{
try {
		Debug.PushSubsStack("Button2_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,300);
if (RapidSub.canDelegate("button2_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","button2_click");}
 BA.debugLineNum = 300;BA.debugLine="Private Sub Button2_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 301;BA.debugLine="answer.Text = tempStr&\"2\"";
Debug.ShouldStop(4096);
main.mostCurrent._answer.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._tempstr,RemoteObject.createImmutable("2"))));
 BA.debugLineNum = 302;BA.debugLine="tempStr = answer.Text";
Debug.ShouldStop(8192);
main.mostCurrent._tempstr = main.mostCurrent._answer.runMethod(true,"getText");
 BA.debugLineNum = 303;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button3_click() throws Exception{
try {
		Debug.PushSubsStack("Button3_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,305);
if (RapidSub.canDelegate("button3_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","button3_click");}
 BA.debugLineNum = 305;BA.debugLine="Private Sub Button3_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 306;BA.debugLine="answer.Text = tempStr&\"3\"";
Debug.ShouldStop(131072);
main.mostCurrent._answer.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._tempstr,RemoteObject.createImmutable("3"))));
 BA.debugLineNum = 307;BA.debugLine="tempStr = answer.Text";
Debug.ShouldStop(262144);
main.mostCurrent._tempstr = main.mostCurrent._answer.runMethod(true,"getText");
 BA.debugLineNum = 308;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button4_click() throws Exception{
try {
		Debug.PushSubsStack("Button4_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,310);
if (RapidSub.canDelegate("button4_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","button4_click");}
 BA.debugLineNum = 310;BA.debugLine="Private Sub Button4_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 311;BA.debugLine="answer.Text = tempStr&\"4\"";
Debug.ShouldStop(4194304);
main.mostCurrent._answer.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._tempstr,RemoteObject.createImmutable("4"))));
 BA.debugLineNum = 312;BA.debugLine="tempStr = answer.Text";
Debug.ShouldStop(8388608);
main.mostCurrent._tempstr = main.mostCurrent._answer.runMethod(true,"getText");
 BA.debugLineNum = 313;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button5_click() throws Exception{
try {
		Debug.PushSubsStack("Button5_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,315);
if (RapidSub.canDelegate("button5_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","button5_click");}
 BA.debugLineNum = 315;BA.debugLine="Private Sub Button5_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 316;BA.debugLine="answer.Text = tempStr&\"5\"";
Debug.ShouldStop(134217728);
main.mostCurrent._answer.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._tempstr,RemoteObject.createImmutable("5"))));
 BA.debugLineNum = 317;BA.debugLine="tempStr = answer.Text";
Debug.ShouldStop(268435456);
main.mostCurrent._tempstr = main.mostCurrent._answer.runMethod(true,"getText");
 BA.debugLineNum = 318;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button6_click() throws Exception{
try {
		Debug.PushSubsStack("Button6_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,320);
if (RapidSub.canDelegate("button6_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","button6_click");}
 BA.debugLineNum = 320;BA.debugLine="Private Sub Button6_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 321;BA.debugLine="answer.Text = tempStr&\"6\"";
Debug.ShouldStop(1);
main.mostCurrent._answer.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._tempstr,RemoteObject.createImmutable("6"))));
 BA.debugLineNum = 322;BA.debugLine="tempStr = answer.Text";
Debug.ShouldStop(2);
main.mostCurrent._tempstr = main.mostCurrent._answer.runMethod(true,"getText");
 BA.debugLineNum = 323;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button7_click() throws Exception{
try {
		Debug.PushSubsStack("Button7_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,325);
if (RapidSub.canDelegate("button7_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","button7_click");}
 BA.debugLineNum = 325;BA.debugLine="Private Sub Button7_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 326;BA.debugLine="answer.Text = tempStr&\"7\"";
Debug.ShouldStop(32);
main.mostCurrent._answer.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._tempstr,RemoteObject.createImmutable("7"))));
 BA.debugLineNum = 327;BA.debugLine="tempStr = answer.Text";
Debug.ShouldStop(64);
main.mostCurrent._tempstr = main.mostCurrent._answer.runMethod(true,"getText");
 BA.debugLineNum = 328;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button8_click() throws Exception{
try {
		Debug.PushSubsStack("Button8_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,330);
if (RapidSub.canDelegate("button8_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","button8_click");}
 BA.debugLineNum = 330;BA.debugLine="Private Sub Button8_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 331;BA.debugLine="answer.Text = tempStr&\"8\"";
Debug.ShouldStop(1024);
main.mostCurrent._answer.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._tempstr,RemoteObject.createImmutable("8"))));
 BA.debugLineNum = 332;BA.debugLine="tempStr = answer.Text";
Debug.ShouldStop(2048);
main.mostCurrent._tempstr = main.mostCurrent._answer.runMethod(true,"getText");
 BA.debugLineNum = 333;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button9_click() throws Exception{
try {
		Debug.PushSubsStack("Button9_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,335);
if (RapidSub.canDelegate("button9_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","button9_click");}
 BA.debugLineNum = 335;BA.debugLine="Private Sub Button9_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 336;BA.debugLine="answer.Text = tempStr&\"9\"";
Debug.ShouldStop(32768);
main.mostCurrent._answer.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._tempstr,RemoteObject.createImmutable("9"))));
 BA.debugLineNum = 337;BA.debugLine="tempStr = answer.Text";
Debug.ShouldStop(65536);
main.mostCurrent._tempstr = main.mostCurrent._answer.runMethod(true,"getText");
 BA.debugLineNum = 338;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonclear_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonClear_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,283);
if (RapidSub.canDelegate("buttonclear_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","buttonclear_click");}
 BA.debugLineNum = 283;BA.debugLine="Private Sub ButtonClear_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 284;BA.debugLine="answer.Text=\"\"";
Debug.ShouldStop(134217728);
main.mostCurrent._answer.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 285;BA.debugLine="tempStr=\"\"";
Debug.ShouldStop(268435456);
main.mostCurrent._tempstr = BA.ObjectToString("");
 BA.debugLineNum = 287;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonenter_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonEnter_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,259);
if (RapidSub.canDelegate("buttonenter_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","buttonenter_click");}
 BA.debugLineNum = 259;BA.debugLine="Private Sub ButtonEnter_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 260;BA.debugLine="tempStr=\"\"";
Debug.ShouldStop(8);
main.mostCurrent._tempstr = BA.ObjectToString("");
 BA.debugLineNum = 261;BA.debugLine="damage = str";
Debug.ShouldStop(16);
main._damage = BA.numberCast(int.class, main.mostCurrent._str);
 BA.debugLineNum = 262;BA.debugLine="If answer.Text = str Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",main.mostCurrent._answer.runMethod(true,"getText"),main.mostCurrent._str)) { 
 BA.debugLineNum = 263;BA.debugLine="strAn.Text = \"Correct\"";
Debug.ShouldStop(64);
main.mostCurrent._stran.runMethod(true,"setText",BA.ObjectToCharSequence("Correct"));
 BA.debugLineNum = 265;BA.debugLine="mobVal= mobVal-damage";
Debug.ShouldStop(256);
main._mobval = RemoteObject.solve(new RemoteObject[] {main._mobval,main._damage}, "-",1, 1);
 }else {
 BA.debugLineNum = 268;BA.debugLine="strAn.Text = \"InCorrect\"";
Debug.ShouldStop(2048);
main.mostCurrent._stran.runMethod(true,"setText",BA.ObjectToCharSequence("InCorrect"));
 BA.debugLineNum = 269;BA.debugLine="HPval = HPval-damage";
Debug.ShouldStop(4096);
main._hpval = RemoteObject.solve(new RemoteObject[] {main._hpval,main._damage}, "-",1, 1);
 BA.debugLineNum = 270;BA.debugLine="MediaPlayer.Play";
Debug.ShouldStop(8192);
main._mediaplayer.runVoidMethod ("Play");
 };
 BA.debugLineNum = 274;BA.debugLine="GameState.Visible=False";
Debug.ShouldStop(131072);
main.mostCurrent._gamestate.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 275;BA.debugLine="ReDraw";
Debug.ShouldStop(262144);
_redraw();
 BA.debugLineNum = 276;BA.debugLine="Activity_Create(True)";
Debug.ShouldStop(524288);
_activity_create(main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 277;BA.debugLine="check = True";
Debug.ShouldStop(1048576);
main._check = main.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 278;BA.debugLine="If HPval <= 100 And HPval >= 0 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("k",main._hpval,BA.numberCast(double.class, 100)) && RemoteObject.solveBoolean("g",main._hpval,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 279;BA.debugLine="GameState.Visible=True";
Debug.ShouldStop(4194304);
main.mostCurrent._gamestate.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 };
 BA.debugLineNum = 281;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawequation() throws Exception{
try {
		Debug.PushSubsStack("DrawEquation (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,165);
if (RapidSub.canDelegate("drawequation")) { return b4a.example.main.remoteMe.runUserSub(false, "main","drawequation");}
RemoteObject _rand1 = RemoteObject.createImmutable(0);
RemoteObject _rand2 = RemoteObject.createImmutable(0);
 BA.debugLineNum = 165;BA.debugLine="Sub DrawEquation";
Debug.ShouldStop(16);
 BA.debugLineNum = 166;BA.debugLine="Dim rand1 As Int = Rnd(0,10)";
Debug.ShouldStop(32);
_rand1 = main.mostCurrent.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 10)));Debug.locals.put("rand1", _rand1);Debug.locals.put("rand1", _rand1);
 BA.debugLineNum = 167;BA.debugLine="Dim rand2 As Int = Rnd(0,10)";
Debug.ShouldStop(64);
_rand2 = main.mostCurrent.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 10)));Debug.locals.put("rand2", _rand2);Debug.locals.put("rand2", _rand2);
 BA.debugLineNum = 168;BA.debugLine="num1.Text=rand1";
Debug.ShouldStop(128);
main.mostCurrent._num1.runMethod(true,"setText",BA.ObjectToCharSequence(_rand1));
 BA.debugLineNum = 169;BA.debugLine="num2.Text=rand2";
Debug.ShouldStop(256);
main.mostCurrent._num2.runMethod(true,"setText",BA.ObjectToCharSequence(_rand2));
 BA.debugLineNum = 170;BA.debugLine="ShuffleArray(operator)";
Debug.ShouldStop(512);
_shufflearray(main.mostCurrent._operator);
 BA.debugLineNum = 171;BA.debugLine="operation.text = operator(0)";
Debug.ShouldStop(1024);
main.mostCurrent._operation.runMethod(true,"setText",BA.ObjectToCharSequence(main.mostCurrent._operator.getArrayElement(true,BA.numberCast(int.class, 0))));
 BA.debugLineNum = 172;BA.debugLine="Select operator(0)";
Debug.ShouldStop(2048);
switch (BA.switchObjectToInt(main.mostCurrent._operator.getArrayElement(true,BA.numberCast(int.class, 0)),BA.ObjectToString("+"),BA.ObjectToString("-"),BA.ObjectToString("*"),BA.ObjectToString("/"))) {
case 0: {
 BA.debugLineNum = 174;BA.debugLine="str =rand1+rand2";
Debug.ShouldStop(8192);
main.mostCurrent._str = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_rand1,_rand2}, "+",1, 1));
 break; }
case 1: {
 BA.debugLineNum = 176;BA.debugLine="str =rand1-rand2";
Debug.ShouldStop(32768);
main.mostCurrent._str = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_rand1,_rand2}, "-",1, 1));
 break; }
case 2: {
 BA.debugLineNum = 178;BA.debugLine="str =rand1*rand2";
Debug.ShouldStop(131072);
main.mostCurrent._str = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_rand1,_rand2}, "*",0, 1));
 break; }
case 3: {
 BA.debugLineNum = 180;BA.debugLine="str =rand1/rand2";
Debug.ShouldStop(524288);
main.mostCurrent._str = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_rand1,_rand2}, "/",0, 0));
 break; }
}
;
 BA.debugLineNum = 182;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawhealth() throws Exception{
try {
		Debug.PushSubsStack("DrawHealth (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,140);
if (RapidSub.canDelegate("drawhealth")) { return b4a.example.main.remoteMe.runUserSub(false, "main","drawhealth");}
 BA.debugLineNum = 140;BA.debugLine="Sub DrawHealth";
Debug.ShouldStop(2048);
 BA.debugLineNum = 141;BA.debugLine="HP.Text=HPval";
Debug.ShouldStop(4096);
main.mostCurrent._hp.runMethod(true,"setText",BA.ObjectToCharSequence(main._hpval));
 BA.debugLineNum = 142;BA.debugLine="mobHP.Text=mobVal";
Debug.ShouldStop(8192);
main.mostCurrent._mobhp.runMethod(true,"setText",BA.ObjectToCharSequence(main._mobval));
 BA.debugLineNum = 144;BA.debugLine="mob.Color = Colors.ARGB(0, 0, 0, 0)";
Debug.ShouldStop(32768);
main.mostCurrent._mob.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 145;BA.debugLine="cvsGraph.Initialize(mob)";
Debug.ShouldStop(65536);
main.mostCurrent._cvsgraph.runVoidMethod ("Initialize",(Object)((main.mostCurrent._mob.getObject())));
 BA.debugLineNum = 146;BA.debugLine="rect1.Initialize(10dip, 10dip, 250dip, 35dip)";
Debug.ShouldStop(131072);
main.mostCurrent._rect1.runVoidMethod ("Initialize",(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 250)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 35)))));
 BA.debugLineNum = 147;BA.debugLine="cvsGraph.DrawRect(rect1, xui.Color_Black, False,";
Debug.ShouldStop(262144);
main.mostCurrent._cvsgraph.runVoidMethod ("DrawRect",(Object)((main.mostCurrent._rect1.getObject())),(Object)(main._xui.getField(true,"Color_Black")),(Object)(main.mostCurrent.__c.getField(true,"False")),(Object)(BA.numberCast(float.class, main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))))));
 BA.debugLineNum = 149;BA.debugLine="mob2.Color=Colors.ARGB(0, 0, 0, 0)";
Debug.ShouldStop(1048576);
main.mostCurrent._mob2.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 150;BA.debugLine="cvsGraph2.Initialize(mob2)";
Debug.ShouldStop(2097152);
main.mostCurrent._cvsgraph2.runVoidMethod ("Initialize",(Object)((main.mostCurrent._mob2.getObject())));
 BA.debugLineNum = 151;BA.debugLine="rect2.Initialize(10dip, 10dip, IntToDIP(mobVal-33";
Debug.ShouldStop(4194304);
main.mostCurrent._rect2.runVoidMethod ("Initialize",(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(_inttodip(RemoteObject.solve(new RemoteObject[] {main._mobval,RemoteObject.createImmutable(33)}, "-",1, 1))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 35)))));
 BA.debugLineNum = 152;BA.debugLine="cvsGraph2.DrawRect(rect2, xui.Color_Red , True, 2";
Debug.ShouldStop(8388608);
main.mostCurrent._cvsgraph2.runVoidMethod ("DrawRect",(Object)((main.mostCurrent._rect2.getObject())),(Object)(main._xui.getField(true,"Color_Red")),(Object)(main.mostCurrent.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))))));
 BA.debugLineNum = 154;BA.debugLine="ply1.Color = Colors.ARGB(0, 0, 0, 0)";
Debug.ShouldStop(33554432);
main.mostCurrent._ply1.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 155;BA.debugLine="cvsGraph3.Initialize(ply1)";
Debug.ShouldStop(67108864);
main.mostCurrent._cvsgraph3.runVoidMethod ("Initialize",(Object)((main.mostCurrent._ply1.getObject())));
 BA.debugLineNum = 156;BA.debugLine="rect3.Initialize(10dip, 10dip, 250dip, 35dip)";
Debug.ShouldStop(134217728);
main.mostCurrent._rect3.runVoidMethod ("Initialize",(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 250)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 35)))));
 BA.debugLineNum = 157;BA.debugLine="cvsGraph3.DrawRect(rect3, xui.Color_Black, False,";
Debug.ShouldStop(268435456);
main.mostCurrent._cvsgraph3.runVoidMethod ("DrawRect",(Object)((main.mostCurrent._rect3.getObject())),(Object)(main._xui.getField(true,"Color_Black")),(Object)(main.mostCurrent.__c.getField(true,"False")),(Object)(BA.numberCast(float.class, main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))))));
 BA.debugLineNum = 159;BA.debugLine="ply2.Color=Colors.ARGB(0, 0, 0, 0)";
Debug.ShouldStop(1073741824);
main.mostCurrent._ply2.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 160;BA.debugLine="cvsGraph4.Initialize(ply2)";
Debug.ShouldStop(-2147483648);
main.mostCurrent._cvsgraph4.runVoidMethod ("Initialize",(Object)((main.mostCurrent._ply2.getObject())));
 BA.debugLineNum = 161;BA.debugLine="rect4.Initialize(10dip, 10dip, IntToDIP(HPval*4.6";
Debug.ShouldStop(1);
main.mostCurrent._rect4.runVoidMethod ("Initialize",(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(_inttodip(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {main._hpval,RemoteObject.createImmutable(4.67)}, "*",0, 0)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 35)))));
 BA.debugLineNum = 162;BA.debugLine="cvsGraph4.DrawRect(rect4, xui.Color_Red , True, 2";
Debug.ShouldStop(2);
main.mostCurrent._cvsgraph4.runVoidMethod ("DrawRect",(Object)((main.mostCurrent._rect4.getObject())),(Object)(main._xui.getField(true,"Color_Red")),(Object)(main.mostCurrent.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))))));
 BA.debugLineNum = 163;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawmonster() throws Exception{
try {
		Debug.PushSubsStack("DrawMonster (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,131);
if (RapidSub.canDelegate("drawmonster")) { return b4a.example.main.remoteMe.runUserSub(false, "main","drawmonster");}
 BA.debugLineNum = 131;BA.debugLine="Sub DrawMonster";
Debug.ShouldStop(4);
 BA.debugLineNum = 132;BA.debugLine="If mobVal <= 0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("k",main._mobval,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 133;BA.debugLine="MonsterType = 1";
Debug.ShouldStop(16);
main._monstertype = BA.numberCast(int.class, 1);
 BA.debugLineNum = 134;BA.debugLine="mobVal = 200";
Debug.ShouldStop(32);
main._mobval = BA.numberCast(int.class, 200);
 };
 BA.debugLineNum = 136;BA.debugLine="FileName = Monster(MonsterType)";
Debug.ShouldStop(128);
main._filename = main._monster.getArrayElement(true,main._monstertype);
 BA.debugLineNum = 137;BA.debugLine="ImageView1.Bitmap = LoadBitmap(File.DirAssets, Fi";
Debug.ShouldStop(256);
main.mostCurrent._imageview1.runMethod(false,"setBitmap",(main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(main._filename)).getObject()));
 BA.debugLineNum = 138;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawstate() throws Exception{
try {
		Debug.PushSubsStack("DrawState (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,118);
if (RapidSub.canDelegate("drawstate")) { return b4a.example.main.remoteMe.runUserSub(false, "main","drawstate");}
 BA.debugLineNum = 118;BA.debugLine="Sub DrawState";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 119;BA.debugLine="If check == False Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",main._check,main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 120;BA.debugLine="Load.Visible = True";
Debug.ShouldStop(8388608);
main.mostCurrent._load.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 121;BA.debugLine="Load.Visible = False";
Debug.ShouldStop(16777216);
main.mostCurrent._load.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 122;BA.debugLine="TitleState.Visible = True";
Debug.ShouldStop(33554432);
main.mostCurrent._titlestate.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 };
 BA.debugLineNum = 125;BA.debugLine="If HPval <=0 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("k",main._hpval,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 126;BA.debugLine="GameState.Visible = False";
Debug.ShouldStop(536870912);
main.mostCurrent._gamestate.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 127;BA.debugLine="GameOverState.Visible = True";
Debug.ShouldStop(1073741824);
main.mostCurrent._gameoverstate.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 };
 BA.debugLineNum = 129;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 25;BA.debugLine="Private num1, num2, operation As Label";
main.mostCurrent._num1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
main.mostCurrent._num2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
main.mostCurrent._operation = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private HP, mobHP As Label";
main.mostCurrent._hp = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
main.mostCurrent._mobhp = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private answer As Label";
main.mostCurrent._answer = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private countdown As Label";
main.mostCurrent._countdown = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private ImageView1 As ImageView";
main.mostCurrent._imageview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private strAn As Label";
main.mostCurrent._stran = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private str As String";
main.mostCurrent._str = RemoteObject.createImmutable("");
 //BA.debugLineNum = 36;BA.debugLine="Private damage As Int = 0";
main._damage = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 37;BA.debugLine="Private HPval As Int = 100";
main._hpval = BA.numberCast(int.class, 100);
 //BA.debugLineNum = 38;BA.debugLine="Private mobVal As Int = 100";
main._mobval = BA.numberCast(int.class, 100);
 //BA.debugLineNum = 39;BA.debugLine="Private timer1 As Timer";
main.mostCurrent._timer1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 40;BA.debugLine="Private targetTime As Long";
main._targettime = RemoteObject.createImmutable(0L);
 //BA.debugLineNum = 41;BA.debugLine="Private tempStr As String =\"\"";
main.mostCurrent._tempstr = BA.ObjectToString("");
 //BA.debugLineNum = 42;BA.debugLine="Private check As Boolean = False";
main._check = main.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 43;BA.debugLine="Private operator() As String = Array As String(\"+";
main.mostCurrent._operator = RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("+"),RemoteObject.createImmutable("*")});
 //BA.debugLineNum = 46;BA.debugLine="Private Load, GameState, PauseState, TitleState,";
main.mostCurrent._load = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
main.mostCurrent._gamestate = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
main.mostCurrent._pausestate = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
main.mostCurrent._titlestate = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
main.mostCurrent._gameoverstate = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 47;BA.debugLine="Private Button1 As Button";
main.mostCurrent._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 50;BA.debugLine="Private mob, mob2, ply1, ply2 As Panel";
main.mostCurrent._mob = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
main.mostCurrent._mob2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
main.mostCurrent._ply1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
main.mostCurrent._ply2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 51;BA.debugLine="Private cvsGraph, cvsGraph2, cvsGraph3, cvsGraph4";
main.mostCurrent._cvsgraph = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");
main.mostCurrent._cvsgraph2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");
main.mostCurrent._cvsgraph3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");
main.mostCurrent._cvsgraph4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");
 //BA.debugLineNum = 52;BA.debugLine="Private rect1, rect2, rect3, rect4 As Rect";
main.mostCurrent._rect1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper");
main.mostCurrent._rect2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper");
main.mostCurrent._rect3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper");
main.mostCurrent._rect4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper");
 //BA.debugLineNum = 55;BA.debugLine="Private Button0 As Button";
main.mostCurrent._button0 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 56;BA.debugLine="Private Button1 As Button";
main.mostCurrent._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 57;BA.debugLine="Private Button2 As Button";
main.mostCurrent._button2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 58;BA.debugLine="Private Button3 As Button";
main.mostCurrent._button3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 59;BA.debugLine="Private Button4 As Button";
main.mostCurrent._button4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 60;BA.debugLine="Private Button5 As Button";
main.mostCurrent._button5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 61;BA.debugLine="Private Button6 As Button";
main.mostCurrent._button6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 62;BA.debugLine="Private Button7 As Button";
main.mostCurrent._button7 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 63;BA.debugLine="Private Button8 As Button";
main.mostCurrent._button8 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 64;BA.debugLine="Private Button9 As Button";
main.mostCurrent._button9 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 65;BA.debugLine="Private ButtonEnter As Button";
main.mostCurrent._buttonenter = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 66;BA.debugLine="Private ButtonClear As Button";
main.mostCurrent._buttonclear = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initializestate() throws Exception{
try {
		Debug.PushSubsStack("InitializeState (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,99);
if (RapidSub.canDelegate("initializestate")) { return b4a.example.main.remoteMe.runUserSub(false, "main","initializestate");}
 BA.debugLineNum = 99;BA.debugLine="Sub InitializeState";
Debug.ShouldStop(4);
 BA.debugLineNum = 101;BA.debugLine="Load.Initialize(\"\") : Load.Visible = False";
Debug.ShouldStop(16);
main.mostCurrent._load.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 101;BA.debugLine="Load.Initialize(\"\") : Load.Visible = False";
Debug.ShouldStop(16);
main.mostCurrent._load.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 102;BA.debugLine="GameState.Initialize(\"\") : GameState.Visible = Fa";
Debug.ShouldStop(32);
main.mostCurrent._gamestate.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 102;BA.debugLine="GameState.Initialize(\"\") : GameState.Visible = Fa";
Debug.ShouldStop(32);
main.mostCurrent._gamestate.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 103;BA.debugLine="GameOverState.Initialize(\"\") : GameOverState.Visi";
Debug.ShouldStop(64);
main.mostCurrent._gameoverstate.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 103;BA.debugLine="GameOverState.Initialize(\"\") : GameOverState.Visi";
Debug.ShouldStop(64);
main.mostCurrent._gameoverstate.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 104;BA.debugLine="PauseState.Initialize(\"\"): PauseState.Visible = F";
Debug.ShouldStop(128);
main.mostCurrent._pausestate.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 104;BA.debugLine="PauseState.Initialize(\"\"): PauseState.Visible = F";
Debug.ShouldStop(128);
main.mostCurrent._pausestate.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 105;BA.debugLine="TitleState.Initialize(\"\"): TitleState.Visible = F";
Debug.ShouldStop(256);
main.mostCurrent._titlestate.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 105;BA.debugLine="TitleState.Initialize(\"\"): TitleState.Visible = F";
Debug.ShouldStop(256);
main.mostCurrent._titlestate.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 107;BA.debugLine="Load.LoadLayout(\"Load\") 'Regular layouts created";
Debug.ShouldStop(1024);
main.mostCurrent._load.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Load")),main.mostCurrent.activityBA);
 BA.debugLineNum = 108;BA.debugLine="GameState.LoadLayout(\"GameState\")";
Debug.ShouldStop(2048);
main.mostCurrent._gamestate.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("GameState")),main.mostCurrent.activityBA);
 BA.debugLineNum = 109;BA.debugLine="TitleState.LoadLayout(\"TitleState\")";
Debug.ShouldStop(4096);
main.mostCurrent._titlestate.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("TitleState")),main.mostCurrent.activityBA);
 BA.debugLineNum = 110;BA.debugLine="GameOverState.LoadLayout(\"GameOverState\")";
Debug.ShouldStop(8192);
main.mostCurrent._gameoverstate.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("GameOverState")),main.mostCurrent.activityBA);
 BA.debugLineNum = 111;BA.debugLine="Activity.AddView(Load,0,0,100%x,100%y)";
Debug.ShouldStop(16384);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._load.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 112;BA.debugLine="Activity.AddView(GameState,0,0,100%x,100%y)";
Debug.ShouldStop(32768);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._gamestate.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 113;BA.debugLine="Activity.AddView(TitleState,0,0,100%x,100%y)";
Debug.ShouldStop(65536);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._titlestate.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 114;BA.debugLine="Activity.AddView(GameOverState,0,0,100%x,100%y)";
Debug.ShouldStop(131072);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._gameoverstate.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _inttodip(RemoteObject _integer) throws Exception{
try {
		Debug.PushSubsStack("IntToDIP (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,197);
if (RapidSub.canDelegate("inttodip")) { return b4a.example.main.remoteMe.runUserSub(false, "main","inttodip", _integer);}
RemoteObject _dip = RemoteObject.createImmutable(0);
Debug.locals.put("Integer", _integer);
 BA.debugLineNum = 197;BA.debugLine="Sub IntToDIP(Integer As Int) As Int";
Debug.ShouldStop(16);
 BA.debugLineNum = 198;BA.debugLine="Dim DIP As Int";
Debug.ShouldStop(32);
_dip = RemoteObject.createImmutable(0);Debug.locals.put("DIP", _dip);
 BA.debugLineNum = 199;BA.debugLine="DIP = Integer *1dip";
Debug.ShouldStop(64);
_dip = RemoteObject.solve(new RemoteObject[] {_integer,main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "*",0, 1);Debug.locals.put("DIP", _dip);
 BA.debugLineNum = 200;BA.debugLine="Return DIP";
Debug.ShouldStop(128);
if (true) return _dip;
 BA.debugLineNum = 201;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
xuiviewsutils_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
b4xdrawer.myClass = BA.getDeviceClass ("b4a.example.b4xdrawer");
animatedcounter.myClass = BA.getDeviceClass ("b4a.example.animatedcounter");
anotherprogressbar.myClass = BA.getDeviceClass ("b4a.example.anotherprogressbar");
b4xbreadcrumb.myClass = BA.getDeviceClass ("b4a.example.b4xbreadcrumb");
b4xcolortemplate.myClass = BA.getDeviceClass ("b4a.example.b4xcolortemplate");
b4xcombobox.myClass = BA.getDeviceClass ("b4a.example.b4xcombobox");
b4xdatetemplate.myClass = BA.getDeviceClass ("b4a.example.b4xdatetemplate");
b4xdialog.myClass = BA.getDeviceClass ("b4a.example.b4xdialog");
b4xfloattextfield.myClass = BA.getDeviceClass ("b4a.example.b4xfloattextfield");
b4ximageview.myClass = BA.getDeviceClass ("b4a.example.b4ximageview");
b4xinputtemplate.myClass = BA.getDeviceClass ("b4a.example.b4xinputtemplate");
b4xlisttemplate.myClass = BA.getDeviceClass ("b4a.example.b4xlisttemplate");
b4xloadingindicator.myClass = BA.getDeviceClass ("b4a.example.b4xloadingindicator");
b4xlongtexttemplate.myClass = BA.getDeviceClass ("b4a.example.b4xlongtexttemplate");
b4xplusminus.myClass = BA.getDeviceClass ("b4a.example.b4xplusminus");
b4xradiobutton.myClass = BA.getDeviceClass ("b4a.example.b4xradiobutton");
b4xsearchtemplate.myClass = BA.getDeviceClass ("b4a.example.b4xsearchtemplate");
b4xseekbar.myClass = BA.getDeviceClass ("b4a.example.b4xseekbar");
b4xsignaturetemplate.myClass = BA.getDeviceClass ("b4a.example.b4xsignaturetemplate");
b4xswitch.myClass = BA.getDeviceClass ("b4a.example.b4xswitch");
b4xtimedtemplate.myClass = BA.getDeviceClass ("b4a.example.b4xtimedtemplate");
madewithlove.myClass = BA.getDeviceClass ("b4a.example.madewithlove");
b4xformatter.myClass = BA.getDeviceClass ("b4a.example.b4xformatter");
roundslider.myClass = BA.getDeviceClass ("b4a.example.roundslider");
scrollinglabel.myClass = BA.getDeviceClass ("b4a.example.scrollinglabel");
swiftbutton.myClass = BA.getDeviceClass ("b4a.example.swiftbutton");
xuiviewsutils.myClass = BA.getDeviceClass ("b4a.example.xuiviewsutils");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private xui As XUI";
main._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 17;BA.debugLine="Private MonsterType As Int = 0";
main._monstertype = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 18;BA.debugLine="Private Monster() As String = Array As String(\"re";
main._monster = RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("redslime.png"),RemoteObject.createImmutable("skeleton.png")});
 //BA.debugLineNum = 19;BA.debugLine="Private FileName As String = Monster(MonsterType)";
main._filename = main._monster.getArrayElement(true,main._monstertype);
 //BA.debugLineNum = 20;BA.debugLine="Private MediaPlayer As MediaPlayer";
main._mediaplayer = RemoteObject.createNew ("anywheresoftware.b4a.objects.MediaPlayerWrapper");
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _redraw() throws Exception{
try {
		Debug.PushSubsStack("ReDraw (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,203);
if (RapidSub.canDelegate("redraw")) { return b4a.example.main.remoteMe.runUserSub(false, "main","redraw");}
RemoteObject _i = RemoteObject.createImmutable(0);
 BA.debugLineNum = 203;BA.debugLine="Sub ReDraw";
Debug.ShouldStop(1024);
 BA.debugLineNum = 204;BA.debugLine="Dim i As Int";
Debug.ShouldStop(2048);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 205;BA.debugLine="For i = Activity.NumberOfViews - 1 To 0 Step -1";
Debug.ShouldStop(4096);
{
final int step2 = -1;
final int limit2 = 0;
_i = RemoteObject.solve(new RemoteObject[] {main.mostCurrent._activity.runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1) ;
for (;(step2 > 0 && _i.<Integer>get().intValue() <= limit2) || (step2 < 0 && _i.<Integer>get().intValue() >= limit2) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 206;BA.debugLine="Activity.RemoveViewAt(i)";
Debug.ShouldStop(8192);
main.mostCurrent._activity.runVoidMethod ("RemoveViewAt",(Object)(_i));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 208;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _retry_click() throws Exception{
try {
		Debug.PushSubsStack("Retry_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,245);
if (RapidSub.canDelegate("retry_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","retry_click");}
 BA.debugLineNum = 245;BA.debugLine="Private Sub Retry_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 247;BA.debugLine="HPval = 100";
Debug.ShouldStop(4194304);
main._hpval = BA.numberCast(int.class, 100);
 BA.debugLineNum = 248;BA.debugLine="mobVal = 100";
Debug.ShouldStop(8388608);
main._mobval = BA.numberCast(int.class, 100);
 BA.debugLineNum = 249;BA.debugLine="MonsterType = 0";
Debug.ShouldStop(16777216);
main._monstertype = BA.numberCast(int.class, 0);
 BA.debugLineNum = 250;BA.debugLine="FileName = Monster(MonsterType)";
Debug.ShouldStop(33554432);
main._filename = main._monster.getArrayElement(true,main._monstertype);
 BA.debugLineNum = 251;BA.debugLine="GameOverState.Visible = False";
Debug.ShouldStop(67108864);
main.mostCurrent._gameoverstate.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 252;BA.debugLine="ReDraw";
Debug.ShouldStop(134217728);
_redraw();
 BA.debugLineNum = 253;BA.debugLine="Activity_Create(True)";
Debug.ShouldStop(268435456);
_activity_create(main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 254;BA.debugLine="GameState.Visible = True";
Debug.ShouldStop(536870912);
main.mostCurrent._gamestate.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 255;BA.debugLine="time(True)";
Debug.ShouldStop(1073741824);
_time(main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 257;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _shufflearray(RemoteObject _stringarray) throws Exception{
try {
		Debug.PushSubsStack("ShuffleArray (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,184);
if (RapidSub.canDelegate("shufflearray")) { return b4a.example.main.remoteMe.runUserSub(false, "main","shufflearray", _stringarray);}
RemoteObject _arrayval = RemoteObject.createImmutable("");
RemoteObject _random = RemoteObject.createImmutable(0);
int _i = 0;
Debug.locals.put("StringArray", _stringarray);
 BA.debugLineNum = 184;BA.debugLine="Sub ShuffleArray(StringArray() As String)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 185;BA.debugLine="Dim ArrayVal As String";
Debug.ShouldStop(16777216);
_arrayval = RemoteObject.createImmutable("");Debug.locals.put("ArrayVal", _arrayval);
 BA.debugLineNum = 186;BA.debugLine="Dim Random As Int";
Debug.ShouldStop(33554432);
_random = RemoteObject.createImmutable(0);Debug.locals.put("Random", _random);
 BA.debugLineNum = 188;BA.debugLine="For i = 0 To StringArray.Length - 1";
Debug.ShouldStop(134217728);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_stringarray.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 189;BA.debugLine="Random = Rnd(i, StringArray.Length)";
Debug.ShouldStop(268435456);
_random = main.mostCurrent.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, _i)),(Object)(_stringarray.getField(true,"length")));Debug.locals.put("Random", _random);
 BA.debugLineNum = 190;BA.debugLine="ArrayVal = StringArray(i)";
Debug.ShouldStop(536870912);
_arrayval = _stringarray.getArrayElement(true,BA.numberCast(int.class, _i));Debug.locals.put("ArrayVal", _arrayval);
 BA.debugLineNum = 191;BA.debugLine="StringArray(i) = StringArray(Random)";
Debug.ShouldStop(1073741824);
_stringarray.setArrayElement (_stringarray.getArrayElement(true,_random),BA.numberCast(int.class, _i));
 BA.debugLineNum = 192;BA.debugLine="StringArray(Random) = ArrayVal";
Debug.ShouldStop(-2147483648);
_stringarray.setArrayElement (_arrayval,_random);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 195;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _soundefx() throws Exception{
try {
		Debug.PushSubsStack("SoundEfx (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,94);
if (RapidSub.canDelegate("soundefx")) { return b4a.example.main.remoteMe.runUserSub(false, "main","soundefx");}
 BA.debugLineNum = 94;BA.debugLine="Sub SoundEfx";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 95;BA.debugLine="MediaPlayer.Initialize()";
Debug.ShouldStop(1073741824);
main._mediaplayer.runVoidMethod ("Initialize");
 BA.debugLineNum = 96;BA.debugLine="MediaPlayer.Load(File.DirAssets,\"roblox.mp3\")";
Debug.ShouldStop(-2147483648);
main._mediaplayer.runVoidMethod ("Load",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("roblox.mp3")));
 BA.debugLineNum = 97;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _start_click() throws Exception{
try {
		Debug.PushSubsStack("Start_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,238);
if (RapidSub.canDelegate("start_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","start_click");}
 BA.debugLineNum = 238;BA.debugLine="Private Sub Start_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 239;BA.debugLine="check = True";
Debug.ShouldStop(16384);
main._check = main.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 240;BA.debugLine="TitleState.Visible = False";
Debug.ShouldStop(32768);
main.mostCurrent._titlestate.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 241;BA.debugLine="GameState.Visible = True";
Debug.ShouldStop(65536);
main.mostCurrent._gamestate.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 242;BA.debugLine="time(True)";
Debug.ShouldStop(131072);
_time(main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 243;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _starttimer(RemoteObject _minutes) throws Exception{
try {
		Debug.PushSubsStack("StartTimer (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,217);
if (RapidSub.canDelegate("starttimer")) { return b4a.example.main.remoteMe.runUserSub(false, "main","starttimer", _minutes);}
Debug.locals.put("Minutes", _minutes);
 BA.debugLineNum = 217;BA.debugLine="Sub StartTimer (Minutes As Int) 'insert Hours As I";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 219;BA.debugLine="targetTime = DateTime.Now + Minutes * DateTime.Ti";
Debug.ShouldStop(67108864);
main._targettime = RemoteObject.solve(new RemoteObject[] {main.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"),_minutes,main.mostCurrent.__c.getField(false,"DateTime").getField(true,"TicksPerMinute")}, "+*",1, 2);
 BA.debugLineNum = 220;BA.debugLine="timer1.Enabled = True";
Debug.ShouldStop(134217728);
main.mostCurrent._timer1.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 221;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _time(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("time (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,210);
if (RapidSub.canDelegate("time")) { return b4a.example.main.remoteMe.runUserSub(false, "main","time", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 210;BA.debugLine="Sub time (FirstTime As Boolean)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 211;BA.debugLine="If True Then";
Debug.ShouldStop(262144);
if (main.mostCurrent.__c.getField(true,"True").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 212;BA.debugLine="timer1.Initialize(\"timer1\", 100)";
Debug.ShouldStop(524288);
main.mostCurrent._timer1.runVoidMethod ("Initialize",main.processBA,(Object)(BA.ObjectToString("timer1")),(Object)(BA.numberCast(long.class, 100)));
 };
 BA.debugLineNum = 214;BA.debugLine="StartTimer(2)";
Debug.ShouldStop(2097152);
_starttimer(BA.numberCast(int.class, 2));
 BA.debugLineNum = 215;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _timer1_tick() throws Exception{
try {
		Debug.PushSubsStack("Timer1_Tick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,223);
if (RapidSub.canDelegate("timer1_tick")) { return b4a.example.main.remoteMe.runUserSub(false, "main","timer1_tick");}
RemoteObject _t = RemoteObject.createImmutable(0L);
RemoteObject _minutes = RemoteObject.createImmutable(0);
RemoteObject _seconds = RemoteObject.createImmutable(0);
 BA.debugLineNum = 223;BA.debugLine="Sub Timer1_Tick";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 224;BA.debugLine="Dim t As Long = Max(0, targetTime - DateTime.Now)";
Debug.ShouldStop(-2147483648);
_t = BA.numberCast(long.class, main.mostCurrent.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {main._targettime,main.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")}, "-",1, 2)))));Debug.locals.put("t", _t);Debug.locals.put("t", _t);
 BA.debugLineNum = 226;BA.debugLine="Dim  minutes, seconds As Int";
Debug.ShouldStop(2);
_minutes = RemoteObject.createImmutable(0);Debug.locals.put("minutes", _minutes);
_seconds = RemoteObject.createImmutable(0);Debug.locals.put("seconds", _seconds);
 BA.debugLineNum = 228;BA.debugLine="minutes = (t Mod DateTime.TicksPerHour) / DateTim";
Debug.ShouldStop(8);
_minutes = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_t,main.mostCurrent.__c.getField(false,"DateTime").getField(true,"TicksPerHour")}, "%",0, 2)),main.mostCurrent.__c.getField(false,"DateTime").getField(true,"TicksPerMinute")}, "/",0, 0));Debug.locals.put("minutes", _minutes);
 BA.debugLineNum = 229;BA.debugLine="seconds = (t Mod DateTime.TicksPerMinute) / DateT";
Debug.ShouldStop(16);
_seconds = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_t,main.mostCurrent.__c.getField(false,"DateTime").getField(true,"TicksPerMinute")}, "%",0, 2)),main.mostCurrent.__c.getField(false,"DateTime").getField(true,"TicksPerSecond")}, "/",0, 0));Debug.locals.put("seconds", _seconds);
 BA.debugLineNum = 231;BA.debugLine="Log($\"$2.0{minutes}:$2.0{seconds}\"$)";
Debug.ShouldStop(64);
main.mostCurrent.__c.runVoidMethod ("LogImpl","8786440",(RemoteObject.concat(RemoteObject.createImmutable(""),main.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("2.0")),(Object)((_minutes))),RemoteObject.createImmutable(":"),main.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("2.0")),(Object)((_seconds))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 232;BA.debugLine="If t = 0 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_t,BA.numberCast(long.class, 0))) { 
 BA.debugLineNum = 233;BA.debugLine="timer1.Enabled = False";
Debug.ShouldStop(256);
main.mostCurrent._timer1.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 235;BA.debugLine="countdown.Text=($\"$2.0{minutes}:$2.0{seconds}\"$)";
Debug.ShouldStop(1024);
main.mostCurrent._countdown.runMethod(true,"setText",BA.ObjectToCharSequence(((RemoteObject.concat(RemoteObject.createImmutable(""),main.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("2.0")),(Object)((_minutes))),RemoteObject.createImmutable(":"),main.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("2.0")),(Object)((_seconds))),RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 236;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}