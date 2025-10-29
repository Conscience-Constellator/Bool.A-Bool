package CC.Bool;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import java.util.HashMap;

public class Int2_Bool implements Int_To_Bool,Int_Mach
{
	public static final Clas_Rap Class=Init_StRt(Int2_Bool.class
		,Clas_Rap.class
		,HashMap.class
	);/*Dep ?done*/

	private Int2_Bool(char Chr){this.Chr=Chr;}
	public Int2_Bool(){}

	public char Chr;
		@Override public boolean To_Bool(int Int){return Int==this.Chr;}
		@Override public boolean Eql(int A,int B){return A==B;}

	public static final HashMap<Character,Int2_Bool> Registry=new HashMap<>();
		public static Int2_Bool Get(char Chr)
		{
			Character Chr_=Chr;
			if(Registry.containsKey(Chr_)){Registry.put(Chr_,new Int2_Bool(Chr));}
			return Registry.get(Chr_);
		}

	static{Init_Nd(Int2_Bool.class);}
}