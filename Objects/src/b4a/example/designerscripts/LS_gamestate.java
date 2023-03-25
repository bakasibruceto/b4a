package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_gamestate{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll"[GameState/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
//BA.debugLineNum = 4;BA.debugLine="Panel1.SetLeftAndRight(0,100%x)"[GameState/General script]
views.get("panel1").vw.setLeft((int)(0d));
views.get("panel1").vw.setWidth((int)((100d / 100 * width) - (0d)));
//BA.debugLineNum = 5;BA.debugLine="Panel1.SetTopAndBottom(0,100%y)"[GameState/General script]
views.get("panel1").vw.setTop((int)(0d));
views.get("panel1").vw.setHeight((int)((100d / 100 * height) - (0d)));
//BA.debugLineNum = 7;BA.debugLine="ImageView1.HorizontalCenter = Panel1.Width/2"[GameState/General script]
views.get("imageview1").vw.setLeft((int)((views.get("panel1").vw.getWidth())/2d - (views.get("imageview1").vw.getWidth() / 2)));
//BA.debugLineNum = 8;BA.debugLine="ImageView1.VerticalCenter = Panel1.Height/3"[GameState/General script]
views.get("imageview1").vw.setTop((int)((views.get("panel1").vw.getHeight())/3d - (views.get("imageview1").vw.getHeight() / 2)));
//BA.debugLineNum = 10;BA.debugLine="mob.HorizontalCenter = Panel1.Width/2"[GameState/General script]
views.get("mob").vw.setLeft((int)((views.get("panel1").vw.getWidth())/2d - (views.get("mob").vw.getWidth() / 2)));
//BA.debugLineNum = 11;BA.debugLine="mob.VerticalCenter = Panel1.Height/10"[GameState/General script]
views.get("mob").vw.setTop((int)((views.get("panel1").vw.getHeight())/10d - (views.get("mob").vw.getHeight() / 2)));
//BA.debugLineNum = 12;BA.debugLine="mob2.HorizontalCenter = Panel1.Width/2"[GameState/General script]
views.get("mob2").vw.setLeft((int)((views.get("panel1").vw.getWidth())/2d - (views.get("mob2").vw.getWidth() / 2)));
//BA.debugLineNum = 13;BA.debugLine="mob2.VerticalCenter = Panel1.Height/10"[GameState/General script]
views.get("mob2").vw.setTop((int)((views.get("panel1").vw.getHeight())/10d - (views.get("mob2").vw.getHeight() / 2)));
//BA.debugLineNum = 14;BA.debugLine="mobHP.HorizontalCenter = Panel1.Width/1.85"[GameState/General script]
views.get("mobhp").vw.setLeft((int)((views.get("panel1").vw.getWidth())/1.85d - (views.get("mobhp").vw.getWidth() / 2)));
//BA.debugLineNum = 15;BA.debugLine="mobHP.VerticalCenter = Panel1.Height/10"[GameState/General script]
views.get("mobhp").vw.setTop((int)((views.get("panel1").vw.getHeight())/10d - (views.get("mobhp").vw.getHeight() / 2)));
//BA.debugLineNum = 17;BA.debugLine="ply1.HorizontalCenter = Panel1.Width/2"[GameState/General script]
views.get("ply1").vw.setLeft((int)((views.get("panel1").vw.getWidth())/2d - (views.get("ply1").vw.getWidth() / 2)));
//BA.debugLineNum = 18;BA.debugLine="ply1.VerticalCenter = Panel1.Height/1.7"[GameState/General script]
views.get("ply1").vw.setTop((int)((views.get("panel1").vw.getHeight())/1.7d - (views.get("ply1").vw.getHeight() / 2)));
//BA.debugLineNum = 19;BA.debugLine="ply2.HorizontalCenter = Panel1.Width/2"[GameState/General script]
views.get("ply2").vw.setLeft((int)((views.get("panel1").vw.getWidth())/2d - (views.get("ply2").vw.getWidth() / 2)));
//BA.debugLineNum = 20;BA.debugLine="ply2.VerticalCenter = Panel1.Height/1.7"[GameState/General script]
views.get("ply2").vw.setTop((int)((views.get("panel1").vw.getHeight())/1.7d - (views.get("ply2").vw.getHeight() / 2)));
//BA.debugLineNum = 21;BA.debugLine="HP.HorizontalCenter = Panel1.Width/1.85"[GameState/General script]
views.get("hp").vw.setLeft((int)((views.get("panel1").vw.getWidth())/1.85d - (views.get("hp").vw.getWidth() / 2)));
//BA.debugLineNum = 22;BA.debugLine="HP.VerticalCenter = Panel1.Height/1.7"[GameState/General script]
views.get("hp").vw.setTop((int)((views.get("panel1").vw.getHeight())/1.7d - (views.get("hp").vw.getHeight() / 2)));
//BA.debugLineNum = 24;BA.debugLine="Panel2.HorizontalCenter = Panel1.Width/2"[GameState/General script]
views.get("panel2").vw.setLeft((int)((views.get("panel1").vw.getWidth())/2d - (views.get("panel2").vw.getWidth() / 2)));
//BA.debugLineNum = 25;BA.debugLine="Panel2.VerticalCenter = Panel1.Height/1.25"[GameState/General script]
views.get("panel2").vw.setTop((int)((views.get("panel1").vw.getHeight())/1.25d - (views.get("panel2").vw.getHeight() / 2)));
//BA.debugLineNum = 27;BA.debugLine="Panel3.HorizontalCenter = Panel1.Width/1.89"[GameState/General script]
views.get("panel3").vw.setLeft((int)((views.get("panel1").vw.getWidth())/1.89d - (views.get("panel3").vw.getWidth() / 2)));
//BA.debugLineNum = 28;BA.debugLine="Panel3.VerticalCenter = Panel1.Height/2"[GameState/General script]
views.get("panel3").vw.setTop((int)((views.get("panel1").vw.getHeight())/2d - (views.get("panel3").vw.getHeight() / 2)));

}
}