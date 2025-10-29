package CC.Bool;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import java.util.HashMap;

public class Byt2_Bool implements Byt$Bool,Byt_Mach
{
//	public static final Clas_Rap Class=Init_StRt(Byt2_Bool.class,
//		Clas_Rap.class,
//		HashMap.class
//	);/*Dep ?done*/

	public byte Byt;
		@Override public boolean To_Bool(byte Byt){return Byt==this.Byt;}
		@Override public boolean Mach(byte A,byte B){return A==B;}

	private Byt2_Bool(byte Byt)
	{
		this.Byt=Byt;
		Registry.put(Byt,this);
	}
	public Byt2_Bool()
	{}

	public static final HashMap<Byte,Byt2_Bool> Registry=new HashMap<>();
		public static Byt2_Bool Get(byte Byt)
		{
			Byte Byt_=Byt;
			if(Registry.containsKey(Byt_)){Registry.put(Byt_,new Byt2_Bool(Byt));}
			return Registry.get(Byt_);
		}

	static{Init_Nd(Byt2_Bool.class);}
}