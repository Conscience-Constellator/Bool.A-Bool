package CC.Bool;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import java.util.HashMap;

public class Dubl2_To_Bool implements Dubl_To_Bool, Dubl_Mach
{
	public static final Clas_Rap Class=Init_StRt(Dubl2_To_Bool.class
		,Clas_Rap.class
		,HashMap.class
	);/*Dep ?done*/

	private Dubl2_To_Bool(double Dub){this.Dub=Dub;}
	public Dubl2_To_Bool(){}

	public double Dub;
		@Override public boolean To_Bool(double Dub){return Dub==this.Dub;}
		@Override public boolean Mach(double A,double B){return A==B;}

	public static final HashMap<Character,Dubl2_To_Bool> Registry=new HashMap<>();
		public static Dubl2_To_Bool Get(char Chr)
		{
			Character Chr_=Chr;
			if(Registry.containsKey(Chr_)){Registry.put(Chr_,new Dubl2_To_Bool(Chr));}
			return Registry.get(Chr_);
		}

	static{Init_Nd(Dubl2_To_Bool.class);}
}