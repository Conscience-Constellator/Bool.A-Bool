package CC.Bool;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import java.util.HashMap;

public class Short2_Bool implements Short_To_Bool,Short_Mach
{
	public static final Clas_Rap Class=Init_StRt(Short2_Bool.class
		,Clas_Rap.class
		,HashMap.class
	);/*Dep ?done*/

	private Short2_Bool(short Short){this.Short=Short;}
	public Short2_Bool(){}

	public short Short;
		@Override public boolean To_Bool(short Short){return Short==this.Short;}
		@Override public boolean Eql(short A,short B){return A==B;}

	public static final HashMap<Short,Short2_Bool> Registry=new HashMap<>();
		public static Short2_Bool Get(short Short)
		{
			Short Chr_=Short;
			if(Registry.containsKey(Chr_)){Registry.put(Chr_,new Short2_Bool(Short));}
			return Registry.get(Chr_);
		}

	static{Init_Nd(Short2_Bool.class);}
}