package crc644c4817e1bbad1d0c;


public class DemoGLSurfaceView
	extends android.opengl.GLSurfaceView
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onTouchEvent:(Landroid/view/MotionEvent;)Z:GetOnTouchEvent_Landroid_view_MotionEvent_Handler\n" +
			"";
		mono.android.Runtime.register ("SanAngles.DemoGLSurfaceView, SanAngeles", DemoGLSurfaceView.class, __md_methods);
	}


	public DemoGLSurfaceView (android.content.Context p0)
	{
		super (p0);
		if (getClass () == DemoGLSurfaceView.class)
			mono.android.TypeManager.Activate ("SanAngles.DemoGLSurfaceView, SanAngeles", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public DemoGLSurfaceView (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == DemoGLSurfaceView.class)
			mono.android.TypeManager.Activate ("SanAngles.DemoGLSurfaceView, SanAngeles", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public boolean onTouchEvent (android.view.MotionEvent p0)
	{
		return n_onTouchEvent (p0);
	}

	private native boolean n_onTouchEvent (android.view.MotionEvent p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
