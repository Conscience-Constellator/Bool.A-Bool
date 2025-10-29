package CC.Bool;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;

import java.util.HashMap;

public class ChR2_Bool implements ChR_To_Bool,ChR_Mach
{
	public static final Clas_Rap Class=Init_StRt(ChR2_Bool.class,
		Clas_Rap.class,
		HashMap.class
	);/*Dep ?done*/

	public char ChR;
		@Override public boolean To_Bool(char ChR){return ChR==this.ChR;}
		@Override public boolean Eql(char A,char B){return A==B;}


	private ChR2_Bool(char ChR)
	{this.ChR=ChR;}
	public ChR2_Bool()
	{}

	public static final HashMap<Character,ChR2_Bool> Registry=new HashMap<>();
		public static ChR2_Bool Get(char Chr)
		{
			Character Chr_=Chr;
			if(Registry.containsKey(Chr_)){Registry.put(Chr_,new ChR2_Bool(Chr));}
			return Registry.get(Chr_);
		}

	static{Init_Nd(ChR2_Bool.class);}
}