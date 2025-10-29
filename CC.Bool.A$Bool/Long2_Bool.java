package CC.Bool;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import java.util.HashMap;

public class Long2_Bool implements Long_Bool_Is,Long_Mach
{
	public static final Clas_Rap Class=Init_StRt(Long2_Bool.class
		,Clas_Rap.class
		,HashMap.class
	);/*Dep ?done*/

	private Long2_Bool(char Long){this.Long=Long;}
	public Long2_Bool(){}

	public char Long;
		@Override public boolean To_Bool(long Long){return Long==this.Long;}
		@Override public boolean Mach(long A,long B){return A==B;}

	public static final HashMap<Character,Long2_Bool> Registry=new HashMap<>();
		public static Long2_Bool Get(char Chr)
		{
			Character Chr_=Chr;
			if(Registry.containsKey(Chr_)){Registry.put(Chr_,new Long2_Bool(Chr));}
			return Registry.get(Chr_);
		}

	static{Init_Nd(Long2_Bool.class);}
}