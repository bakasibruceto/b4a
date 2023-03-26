package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class anotherprogressbar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.anotherprogressbar");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.anotherprogressbar.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4a.example.bcpath._bcbrush _busybrush = null;
public int _backgroundcolor = 0;
public int _busyindex = 0;
public b4a.example.bitmapcreator _bc = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _miv = null;
public b4a.example.bcpath._bcbrush _transparentbrush = null;
public boolean _vertical = false;
public float _currentvalue = 0f;
public int _emptycolor = 0;
public b4a.example.bcpath._bcbrush _emptybrush = null;
public int _mvalue = 0;
public Object _tag = null;
public float _valuechangepersecond = 0f;
public int _cornerradius = 0;
public int _brushoffsetdelta = 0;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public String  _base_resize(b4a.example.anotherprogressbar __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherprogressbar";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
RDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=4128769;
 //BA.debugLineNum = 4128769;BA.debugLine="For Each v As B4XView In mBase.GetAllViewsRecursi";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetAllViewsRecursive();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group1.Get(index1)));
RDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="v.SetLayoutAnimated(0, 0, 0, Width, Height)";
_v.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
 }
};
RDebugUtils.currentLine=4128772;
 //BA.debugLineNum = 4128772;BA.debugLine="bc.Initialize(mBase.Width / xui.Scale, mBase.Heig";
__ref._bc /*b4a.example.bitmapcreator*/ ._initialize(ba,(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getScale()),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getScale()));
RDebugUtils.currentLine=4128773;
 //BA.debugLineNum = 4128773;BA.debugLine="Vertical = mBase.Height > mBase.Width";
__ref._vertical /*boolean*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()>__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth();
RDebugUtils.currentLine=4128774;
 //BA.debugLineNum = 4128774;BA.debugLine="UpdateGraphics";
__ref._updategraphics /*String*/ (null);
RDebugUtils.currentLine=4128776;
 //BA.debugLineNum = 4128776;BA.debugLine="End Sub";
return "";
}
public String  _updategraphics(b4a.example.anotherprogressbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherprogressbar";
if (Debug.shouldDelegate(ba, "updategraphics", true))
	 {return ((String) Debug.delegate(ba, "updategraphics", null));}
int _width = 0;
b4a.example.bitmapcreator _template = null;
b4a.example.bitmapcreator._argbcolor _bcolor = null;
RDebugUtils.currentLine=4390912;
 //BA.debugLineNum = 4390912;BA.debugLine="Public Sub UpdateGraphics";
RDebugUtils.currentLine=4390913;
 //BA.debugLineNum = 4390913;BA.debugLine="EmptyBrush = bc.CreateBrushFromColor(EmptyColor)";
__ref._emptybrush /*b4a.example.bcpath._bcbrush*/  = __ref._bc /*b4a.example.bitmapcreator*/ ._createbrushfromcolor(__ref._emptycolor /*int*/ );
RDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="TransparentBrush = bc.CreateBrushFromColor(xui.Co";
__ref._transparentbrush /*b4a.example.bcpath._bcbrush*/  = __ref._bc /*b4a.example.bitmapcreator*/ ._createbrushfromcolor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=4390915;
 //BA.debugLineNum = 4390915;BA.debugLine="Dim Width As Int = 40";
_width = (int) (40);
RDebugUtils.currentLine=4390916;
 //BA.debugLineNum = 4390916;BA.debugLine="Dim Template As BitmapCreator";
_template = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=4390917;
 //BA.debugLineNum = 4390917;BA.debugLine="Dim bcolor As ARGBColor";
_bcolor = new b4a.example.bitmapcreator._argbcolor();
RDebugUtils.currentLine=4390918;
 //BA.debugLineNum = 4390918;BA.debugLine="bc.ColorToARGB(BackgroundColor, bcolor)";
__ref._bc /*b4a.example.bitmapcreator*/ ._colortoargb(__ref._backgroundcolor /*int*/ ,_bcolor);
RDebugUtils.currentLine=4390919;
 //BA.debugLineNum = 4390919;BA.debugLine="bcolor.r = Min(255, bcolor.r * 1.5)";
_bcolor.r = (int) (__c.Min(255,_bcolor.r*1.5));
RDebugUtils.currentLine=4390920;
 //BA.debugLineNum = 4390920;BA.debugLine="bcolor.g = Min(255, bcolor.g * 1.5)";
_bcolor.g = (int) (__c.Min(255,_bcolor.g*1.5));
RDebugUtils.currentLine=4390921;
 //BA.debugLineNum = 4390921;BA.debugLine="bcolor.b = Min(255, bcolor.b * 1.5)";
_bcolor.b = (int) (__c.Min(255,_bcolor.b*1.5));
RDebugUtils.currentLine=4390922;
 //BA.debugLineNum = 4390922;BA.debugLine="If Vertical Then";
if (__ref._vertical /*boolean*/ ) { 
RDebugUtils.currentLine=4390923;
 //BA.debugLineNum = 4390923;BA.debugLine="Template.Initialize(mBase.Width / xui.Scale, mBa";
_template._initialize(ba,(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getScale()),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getScale()+_width));
 }else {
RDebugUtils.currentLine=4390925;
 //BA.debugLineNum = 4390925;BA.debugLine="Template.Initialize(mBase.Height / xui.Scale + W";
_template._initialize(ba,(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getScale()+_width),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getScale()));
 };
RDebugUtils.currentLine=4390928;
 //BA.debugLineNum = 4390928;BA.debugLine="Template.DrawRect(Template.TargetRect, Background";
_template._drawrect(_template._targetrect,__ref._backgroundcolor /*int*/ ,__c.True,(int) (0));
RDebugUtils.currentLine=4390929;
 //BA.debugLineNum = 4390929;BA.debugLine="If Vertical Then";
if (__ref._vertical /*boolean*/ ) { 
RDebugUtils.currentLine=4390930;
 //BA.debugLineNum = 4390930;BA.debugLine="Template.DrawLine(-Width / 2, Width / 2, Templat";
_template._drawline((float) (-_width/(double)2),(float) (_width/(double)2),(float) (_template._mwidth+_width/(double)2),(float) (_template._mheight-_width/(double)2),__ref._bc /*b4a.example.bitmapcreator*/ ._argbtocolor(_bcolor),_width);
 }else {
RDebugUtils.currentLine=4390932;
 //BA.debugLineNum = 4390932;BA.debugLine="Template.DrawLine(Width / 2, -Width / 2, Templat";
_template._drawline((float) (_width/(double)2),(float) (-_width/(double)2),(float) (_template._mwidth-_width/(double)2),(float) (_template._mheight+_width/(double)2),__ref._bc /*b4a.example.bitmapcreator*/ ._argbtocolor(_bcolor),_width);
 };
RDebugUtils.currentLine=4390934;
 //BA.debugLineNum = 4390934;BA.debugLine="BusyBrush = bc.CreateBrushFromBitmapCreator(Templ";
__ref._busybrush /*b4a.example.bcpath._bcbrush*/  = __ref._bc /*b4a.example.bitmapcreator*/ ._createbrushfrombitmapcreator(_template);
RDebugUtils.currentLine=4390935;
 //BA.debugLineNum = 4390935;BA.debugLine="If mValue = 100 Then";
if (__ref._mvalue /*int*/ ==100) { 
RDebugUtils.currentLine=4390936;
 //BA.debugLineNum = 4390936;BA.debugLine="bc.DrawRectRounded(bc.TargetRect, BackgroundColo";
__ref._bc /*b4a.example.bitmapcreator*/ ._drawrectrounded(__ref._bc /*b4a.example.bitmapcreator*/ ._targetrect,__ref._backgroundcolor /*int*/ ,__c.True,(int) (0),(int) (15));
 }else {
RDebugUtils.currentLine=4390938;
 //BA.debugLineNum = 4390938;BA.debugLine="bc.DrawRectRounded2(bc.TargetRect, EmptyBrush, T";
__ref._bc /*b4a.example.bitmapcreator*/ ._drawrectrounded2(__ref._bc /*b4a.example.bitmapcreator*/ ._targetrect,__ref._emptybrush /*b4a.example.bcpath._bcbrush*/ ,__c.True,(int) (0),(int) (15));
 };
RDebugUtils.currentLine=4390940;
 //BA.debugLineNum = 4390940;BA.debugLine="bc.SetBitmapToImageView(bc.Bitmap, mIV)";
__ref._bc /*b4a.example.bitmapcreator*/ ._setbitmaptoimageview(__ref._bc /*b4a.example.bitmapcreator*/ ._getbitmap(),__ref._miv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=4390941;
 //BA.debugLineNum = 4390941;BA.debugLine="setVisible(mBase.Visible)";
__ref._setvisible /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getVisible());
RDebugUtils.currentLine=4390942;
 //BA.debugLineNum = 4390942;BA.debugLine="End Sub";
return "";
}
public void  _busyloop(b4a.example.anotherprogressbar __ref) throws Exception{
RDebugUtils.currentModule="anotherprogressbar";
if (Debug.shouldDelegate(ba, "busyloop", true))
	 {Debug.delegate(ba, "busyloop", null); return;}
ResumableSub_BusyLoop rsub = new ResumableSub_BusyLoop(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_BusyLoop extends BA.ResumableSub {
public ResumableSub_BusyLoop(b4a.example.anotherprogressbar parent,b4a.example.anotherprogressbar __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.anotherprogressbar __ref;
b4a.example.anotherprogressbar parent;
int _myindex = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
long _lasttime = 0L;
anywheresoftware.b4a.objects.collections.List _tasks = null;
float _delta = 0f;
float _change = 0f;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="anotherprogressbar";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=4194305;
 //BA.debugLineNum = 4194305;BA.debugLine="Dim MyIndex As Int = BusyIndex";
_myindex = __ref._busyindex /*int*/ ;
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=4194307;
 //BA.debugLineNum = 4194307;BA.debugLine="r.Initialize(0, 0, bc.mWidth, bc.mHeight)";
_r.Initialize((float) (0),(float) (0),(float) (__ref._bc /*b4a.example.bitmapcreator*/ ._mwidth),(float) (__ref._bc /*b4a.example.bitmapcreator*/ ._mheight));
RDebugUtils.currentLine=4194308;
 //BA.debugLineNum = 4194308;BA.debugLine="Dim LastTime As Long = DateTime.Now";
_lasttime = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=4194309;
 //BA.debugLineNum = 4194309;BA.debugLine="Do While MyIndex = BusyIndex";
if (true) break;

case 1:
//do while
this.state = 37;
while (_myindex==__ref._busyindex /*int*/ ) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=4194310;
 //BA.debugLineNum = 4194310;BA.debugLine="If Vertical Then";
if (true) break;

case 4:
//if
this.state = 9;
if (__ref._vertical /*boolean*/ ) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=4194311;
 //BA.debugLineNum = 4194311;BA.debugLine="BusyBrush.SrcOffsetY = BusyBrush.SrcOffsetY + B";
__ref._busybrush /*b4a.example.bcpath._bcbrush*/ .SrcOffsetY = (int) (__ref._busybrush /*b4a.example.bcpath._bcbrush*/ .SrcOffsetY+__ref._brushoffsetdelta /*int*/ );
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=4194313;
 //BA.debugLineNum = 4194313;BA.debugLine="BusyBrush.SrcOffsetX = BusyBrush.SrcOffsetX + B";
__ref._busybrush /*b4a.example.bcpath._bcbrush*/ .SrcOffsetX = (int) (__ref._busybrush /*b4a.example.bcpath._bcbrush*/ .SrcOffsetX+__ref._brushoffsetdelta /*int*/ );
 if (true) break;

case 9:
//C
this.state = 10;
;
RDebugUtils.currentLine=4194315;
 //BA.debugLineNum = 4194315;BA.debugLine="Dim tasks As List";
_tasks = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4194316;
 //BA.debugLineNum = 4194316;BA.debugLine="tasks.Initialize";
_tasks.Initialize();
RDebugUtils.currentLine=4194317;
 //BA.debugLineNum = 4194317;BA.debugLine="tasks.Add(bc.AsyncDrawRect(bc.TargetRect, Transp";
_tasks.Add((Object)(__ref._bc /*b4a.example.bitmapcreator*/ ._asyncdrawrect(__ref._bc /*b4a.example.bitmapcreator*/ ._targetrect,__ref._transparentbrush /*b4a.example.bcpath._bcbrush*/ ,parent.__c.True,(int) (0))));
RDebugUtils.currentLine=4194318;
 //BA.debugLineNum = 4194318;BA.debugLine="Dim delta As Float = mValue - CurrentValue";
_delta = (float) (__ref._mvalue /*int*/ -__ref._currentvalue /*float*/ );
RDebugUtils.currentLine=4194319;
 //BA.debugLineNum = 4194319;BA.debugLine="If Abs(delta) <= 1 Then";
if (true) break;

case 10:
//if
this.state = 21;
if (parent.__c.Abs(_delta)<=1) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 21;
RDebugUtils.currentLine=4194320;
 //BA.debugLineNum = 4194320;BA.debugLine="CurrentValue = mValue";
__ref._currentvalue /*float*/  = (float) (__ref._mvalue /*int*/ );
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=4194322;
 //BA.debugLineNum = 4194322;BA.debugLine="Dim change As Float = (DateTime.Now - LastTime)";
_change = (float) ((parent.__c.DateTime.getNow()-_lasttime)/(double)1000*__ref._valuechangepersecond /*float*/ );
RDebugUtils.currentLine=4194323;
 //BA.debugLineNum = 4194323;BA.debugLine="If delta > 0 Then";
if (true) break;

case 15:
//if
this.state = 20;
if (_delta>0) { 
this.state = 17;
}else {
this.state = 19;
}if (true) break;

case 17:
//C
this.state = 20;
RDebugUtils.currentLine=4194324;
 //BA.debugLineNum = 4194324;BA.debugLine="CurrentValue = CurrentValue + Min(change, mVal";
__ref._currentvalue /*float*/  = (float) (__ref._currentvalue /*float*/ +parent.__c.Min(_change,__ref._mvalue /*int*/ -__ref._currentvalue /*float*/ ));
 if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=4194326;
 //BA.debugLineNum = 4194326;BA.debugLine="CurrentValue = CurrentValue - Min(change, Curr";
__ref._currentvalue /*float*/  = (float) (__ref._currentvalue /*float*/ -parent.__c.Min(_change,__ref._currentvalue /*float*/ -__ref._mvalue /*int*/ ));
 if (true) break;

case 20:
//C
this.state = 21;
;
 if (true) break;

case 21:
//C
this.state = 22;
;
RDebugUtils.currentLine=4194329;
 //BA.debugLineNum = 4194329;BA.debugLine="LastTime = DateTime.Now";
_lasttime = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=4194330;
 //BA.debugLineNum = 4194330;BA.debugLine="If CurrentValue < 100 Then";
if (true) break;

case 22:
//if
this.state = 25;
if (__ref._currentvalue /*float*/ <100) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=4194331;
 //BA.debugLineNum = 4194331;BA.debugLine="tasks.Add(bc.AsyncDrawRectRounded(bc.TargetRect";
_tasks.Add((Object)(__ref._bc /*b4a.example.bitmapcreator*/ ._asyncdrawrectrounded(__ref._bc /*b4a.example.bitmapcreator*/ ._targetrect,__ref._emptybrush /*b4a.example.bcpath._bcbrush*/ ,parent.__c.True,(int) (0),__ref._cornerradius /*int*/ )));
 if (true) break;
;
RDebugUtils.currentLine=4194333;
 //BA.debugLineNum = 4194333;BA.debugLine="If Vertical Then";

case 25:
//if
this.state = 30;
if (__ref._vertical /*boolean*/ ) { 
this.state = 27;
}else {
this.state = 29;
}if (true) break;

case 27:
//C
this.state = 30;
RDebugUtils.currentLine=4194334;
 //BA.debugLineNum = 4194334;BA.debugLine="r.Bottom = Round(CurrentValue / 100 * bc.mHeigh";
_r.setBottom((float) (parent.__c.Round(__ref._currentvalue /*float*/ /(double)100*__ref._bc /*b4a.example.bitmapcreator*/ ._mheight)));
 if (true) break;

case 29:
//C
this.state = 30;
RDebugUtils.currentLine=4194336;
 //BA.debugLineNum = 4194336;BA.debugLine="r.Right = Round(CurrentValue / 100 * bc.mWidth)";
_r.setRight((float) (parent.__c.Round(__ref._currentvalue /*float*/ /(double)100*__ref._bc /*b4a.example.bitmapcreator*/ ._mwidth)));
 if (true) break;

case 30:
//C
this.state = 31;
;
RDebugUtils.currentLine=4194339;
 //BA.debugLineNum = 4194339;BA.debugLine="tasks.Add(bc.AsyncDrawRectRounded(r, BusyBrush,";
_tasks.Add((Object)(__ref._bc /*b4a.example.bitmapcreator*/ ._asyncdrawrectrounded(_r,__ref._busybrush /*b4a.example.bcpath._bcbrush*/ ,parent.__c.True,(int) (0),__ref._cornerradius /*int*/ )));
RDebugUtils.currentLine=4194340;
 //BA.debugLineNum = 4194340;BA.debugLine="bc.DrawBitmapCreatorsAsync(Me, \"BC\", tasks)";
__ref._bc /*b4a.example.bitmapcreator*/ ._drawbitmapcreatorsasync(parent,"BC",_tasks);
RDebugUtils.currentLine=4194341;
 //BA.debugLineNum = 4194341;BA.debugLine="Wait For BC_BitmapReady (bmp As B4XBitmap)";
parent.__c.WaitFor("bc_bitmapready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "anotherprogressbar", "busyloop"), null);
this.state = 38;
return;
case 38:
//C
this.state = 31;
_bmp = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) result[1];
;
RDebugUtils.currentLine=4194342;
 //BA.debugLineNum = 4194342;BA.debugLine="If xui.IsB4J Then bmp = bc.Bitmap";
if (true) break;

case 31:
//if
this.state = 36;
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
this.state = 33;
;}if (true) break;

case 33:
//C
this.state = 36;
_bmp = __ref._bc /*b4a.example.bitmapcreator*/ ._getbitmap();
if (true) break;

case 36:
//C
this.state = 1;
;
RDebugUtils.currentLine=4194343;
 //BA.debugLineNum = 4194343;BA.debugLine="bc.SetBitmapToImageView(bmp, mIV)";
__ref._bc /*b4a.example.bitmapcreator*/ ._setbitmaptoimageview(_bmp,__ref._miv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=4194344;
 //BA.debugLineNum = 4194344;BA.debugLine="Sleep(30)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "anotherprogressbar", "busyloop"),(int) (30));
this.state = 39;
return;
case 39:
//C
this.state = 1;
;
 if (true) break;

case 37:
//C
this.state = -1;
;
RDebugUtils.currentLine=4194346;
 //BA.debugLineNum = 4194346;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4a.example.anotherprogressbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherprogressbar";
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=3932161;
 //BA.debugLineNum = 3932161;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=3932163;
 //BA.debugLineNum = 3932163;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=3932164;
 //BA.debugLineNum = 3932164;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=3932165;
 //BA.debugLineNum = 3932165;BA.debugLine="Private BusyBrush As BCBrush";
_busybrush = new b4a.example.bcpath._bcbrush();
RDebugUtils.currentLine=3932166;
 //BA.debugLineNum = 3932166;BA.debugLine="Private BackgroundColor As Int";
_backgroundcolor = 0;
RDebugUtils.currentLine=3932167;
 //BA.debugLineNum = 3932167;BA.debugLine="Private BusyIndex As Int";
_busyindex = 0;
RDebugUtils.currentLine=3932168;
 //BA.debugLineNum = 3932168;BA.debugLine="Private bc As BitmapCreator";
_bc = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=3932169;
 //BA.debugLineNum = 3932169;BA.debugLine="Private mIV As B4XView";
_miv = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=3932170;
 //BA.debugLineNum = 3932170;BA.debugLine="Private TransparentBrush As BCBrush";
_transparentbrush = new b4a.example.bcpath._bcbrush();
RDebugUtils.currentLine=3932171;
 //BA.debugLineNum = 3932171;BA.debugLine="Private Vertical As Boolean";
_vertical = false;
RDebugUtils.currentLine=3932172;
 //BA.debugLineNum = 3932172;BA.debugLine="Private CurrentValue As Float";
_currentvalue = 0f;
RDebugUtils.currentLine=3932173;
 //BA.debugLineNum = 3932173;BA.debugLine="Public EmptyColor As Int = xui.Color_White";
_emptycolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=3932174;
 //BA.debugLineNum = 3932174;BA.debugLine="Private EmptyBrush As BCBrush";
_emptybrush = new b4a.example.bcpath._bcbrush();
RDebugUtils.currentLine=3932175;
 //BA.debugLineNum = 3932175;BA.debugLine="Private mValue As Int";
_mvalue = 0;
RDebugUtils.currentLine=3932176;
 //BA.debugLineNum = 3932176;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=3932177;
 //BA.debugLineNum = 3932177;BA.debugLine="Public ValueChangePerSecond As Float = 60";
_valuechangepersecond = (float) (60);
RDebugUtils.currentLine=3932178;
 //BA.debugLineNum = 3932178;BA.debugLine="Public CornerRadius As Int";
_cornerradius = 0;
RDebugUtils.currentLine=3932179;
 //BA.debugLineNum = 3932179;BA.debugLine="Public BrushOffsetDelta As Int = 3";
_brushoffsetdelta = (int) (3);
RDebugUtils.currentLine=3932180;
 //BA.debugLineNum = 3932180;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example.anotherprogressbar __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherprogressbar";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Public Sub DesignerCreateView (Base As Object, lbl";
RDebugUtils.currentLine=4063233;
 //BA.debugLineNum = 4063233;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=4063235;
 //BA.debugLineNum = 4063235;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=4063236;
 //BA.debugLineNum = 4063236;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
RDebugUtils.currentLine=4063237;
 //BA.debugLineNum = 4063237;BA.debugLine="mIV = iv";
__ref._miv /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
RDebugUtils.currentLine=4063238;
 //BA.debugLineNum = 4063238;BA.debugLine="mIV.Color = xui.Color_Transparent";
__ref._miv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=4063239;
 //BA.debugLineNum = 4063239;BA.debugLine="setValue(Props.GetDefault(\"Value\", 100))";
__ref._setvalue /*String*/ (null,(int)(BA.ObjectToNumber(_props.GetDefault((Object)("Value"),(Object)(100)))));
RDebugUtils.currentLine=4063240;
 //BA.debugLineNum = 4063240;BA.debugLine="CurrentValue = mValue";
__ref._currentvalue /*float*/  = (float) (__ref._mvalue /*int*/ );
RDebugUtils.currentLine=4063241;
 //BA.debugLineNum = 4063241;BA.debugLine="mBase.AddView(mIV, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._miv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=4063242;
 //BA.debugLineNum = 4063242;BA.debugLine="mBase.AddView(lbl, 0, 0, mBase.Width, mBase.Heigh";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_lbl.getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=4063243;
 //BA.debugLineNum = 4063243;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=4063244;
 //BA.debugLineNum = 4063244;BA.debugLine="BackgroundColor = xui.PaintOrColorToColor(Props.G";
__ref._backgroundcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("ProgressColor")));
RDebugUtils.currentLine=4063245;
 //BA.debugLineNum = 4063245;BA.debugLine="CornerRadius = Props.GetDefault(\"CornerRadius\", 1";
__ref._cornerradius /*int*/  = (int)(BA.ObjectToNumber(_props.GetDefault((Object)("CornerRadius"),(Object)(15))));
RDebugUtils.currentLine=4063246;
 //BA.debugLineNum = 4063246;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=4063247;
 //BA.debugLineNum = 4063247;BA.debugLine="End Sub";
return "";
}
public String  _setvalue(b4a.example.anotherprogressbar __ref,int _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherprogressbar";
if (Debug.shouldDelegate(ba, "setvalue", true))
	 {return ((String) Debug.delegate(ba, "setvalue", new Object[] {_v}));}
RDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Public Sub setValue (v As Int)";
RDebugUtils.currentLine=4653057;
 //BA.debugLineNum = 4653057;BA.debugLine="mValue = Max(0, Min(100, v))";
__ref._mvalue /*int*/  = (int) (__c.Max(0,__c.Min(100,_v)));
RDebugUtils.currentLine=4653058;
 //BA.debugLineNum = 4653058;BA.debugLine="End Sub";
return "";
}
public int  _getprogresscolor(b4a.example.anotherprogressbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherprogressbar";
if (Debug.shouldDelegate(ba, "getprogresscolor", true))
	 {return ((Integer) Debug.delegate(ba, "getprogresscolor", null));}
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Public Sub getProgressColor As Int";
RDebugUtils.currentLine=4259841;
 //BA.debugLineNum = 4259841;BA.debugLine="Return BackgroundColor";
if (true) return __ref._backgroundcolor /*int*/ ;
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="End Sub";
return 0;
}
public int  _getvalue(b4a.example.anotherprogressbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherprogressbar";
if (Debug.shouldDelegate(ba, "getvalue", true))
	 {return ((Integer) Debug.delegate(ba, "getvalue", null));}
RDebugUtils.currentLine=4587520;
 //BA.debugLineNum = 4587520;BA.debugLine="Public Sub getValue As Int";
RDebugUtils.currentLine=4587521;
 //BA.debugLineNum = 4587521;BA.debugLine="Return mValue";
if (true) return __ref._mvalue /*int*/ ;
RDebugUtils.currentLine=4587522;
 //BA.debugLineNum = 4587522;BA.debugLine="End Sub";
return 0;
}
public boolean  _getvisible(b4a.example.anotherprogressbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherprogressbar";
if (Debug.shouldDelegate(ba, "getvisible", true))
	 {return ((Boolean) Debug.delegate(ba, "getvisible", null));}
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Public Sub getVisible As Boolean";
RDebugUtils.currentLine=4521985;
 //BA.debugLineNum = 4521985;BA.debugLine="Return mBase.Visible";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getVisible();
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="End Sub";
return false;
}
public String  _initialize(b4a.example.anotherprogressbar __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="anotherprogressbar";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=3997697;
 //BA.debugLineNum = 3997697;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=3997699;
 //BA.debugLineNum = 3997699;BA.debugLine="End Sub";
return "";
}
public String  _setprogresscolor(b4a.example.anotherprogressbar __ref,int _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherprogressbar";
if (Debug.shouldDelegate(ba, "setprogresscolor", true))
	 {return ((String) Debug.delegate(ba, "setprogresscolor", new Object[] {_c}));}
RDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Public Sub setProgressColor (c As Int)";
RDebugUtils.currentLine=4325377;
 //BA.debugLineNum = 4325377;BA.debugLine="BackgroundColor = c";
__ref._backgroundcolor /*int*/  = _c;
RDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="UpdateGraphics";
__ref._updategraphics /*String*/ (null);
RDebugUtils.currentLine=4325379;
 //BA.debugLineNum = 4325379;BA.debugLine="End Sub";
return "";
}
public String  _setvaluenoanimation(b4a.example.anotherprogressbar __ref,int _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherprogressbar";
if (Debug.shouldDelegate(ba, "setvaluenoanimation", true))
	 {return ((String) Debug.delegate(ba, "setvaluenoanimation", new Object[] {_v}));}
RDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Public Sub SetValueNoAnimation (v As Int)";
RDebugUtils.currentLine=4718593;
 //BA.debugLineNum = 4718593;BA.debugLine="setValue(v)";
__ref._setvalue /*String*/ (null,_v);
RDebugUtils.currentLine=4718594;
 //BA.debugLineNum = 4718594;BA.debugLine="CurrentValue = mValue";
__ref._currentvalue /*float*/  = (float) (__ref._mvalue /*int*/ );
RDebugUtils.currentLine=4718595;
 //BA.debugLineNum = 4718595;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(b4a.example.anotherprogressbar __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherprogressbar";
if (Debug.shouldDelegate(ba, "setvisible", true))
	 {return ((String) Debug.delegate(ba, "setvisible", new Object[] {_b}));}
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Public Sub setVisible(b As Boolean)";
RDebugUtils.currentLine=4456449;
 //BA.debugLineNum = 4456449;BA.debugLine="BusyIndex = BusyIndex + 1";
__ref._busyindex /*int*/  = (int) (__ref._busyindex /*int*/ +1);
RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="If b Then";
if (_b) { 
RDebugUtils.currentLine=4456451;
 //BA.debugLineNum = 4456451;BA.debugLine="BusyLoop";
__ref._busyloop /*void*/ (null);
 };
RDebugUtils.currentLine=4456453;
 //BA.debugLineNum = 4456453;BA.debugLine="mBase.Visible = b";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(_b);
RDebugUtils.currentLine=4456454;
 //BA.debugLineNum = 4456454;BA.debugLine="End Sub";
return "";
}
}