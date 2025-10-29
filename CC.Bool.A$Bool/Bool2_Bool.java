package CC.Bool;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;

import java.util.HashMap;

public class Bool2_Bool implements Bool_To_Bool,Bool_Mach
{
//	public static final Clas_Rap Class=Init_StRt(Bool2_Bool.class,
//		Clas_Rap.class,
//		HashMap.class
//	);/*Dep ?done*/

	public boolean Bool;
		@Override public boolean To_Bool(boolean Bool){return Bool==this.Bool;}
		@Override public boolean Eql(boolean A,boolean B){return A==B;}

	public static final HashMap<Boolean,Bool2_Bool> Registry=new HashMap<>();
		public static Bool2_Bool Get(boolean Bool)
		{
			Boolean Bool_=Bool;
			if(Registry.containsKey(Bool_)){Registry.put(Bool_,new Bool2_Bool(Bool));}
			return Registry.get(Bool_);
		}


	private Bool2_Bool(boolean Bool)
	{this.Bool=Bool;}
	public Bool2_Bool()
	{}

//	static{Init_Nd(Bool2_Bool.class);}
}