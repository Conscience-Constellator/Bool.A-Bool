package CC.Bool;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import java.util.HashMap;

public class Flot2_To_Bool implements Flot_To_Bool,Flot_Mach
{
	public static final Clas_Rap Class=Init_StRt(Flot2_To_Bool.class
		,Clas_Rap.class
		,HashMap.class
	);/*Dep ?done*/

	private Flot2_To_Bool(float Flot){this.Flot=Flot;}
	public Flot2_To_Bool(){}

	public float Flot;
		@Override public boolean To_Bool(float Flot){return Flot==this.Flot;}
		@Override public boolean Mach(float A,float B){return A==B;}

	static{Init_Nd(Flot2_To_Bool.class);}
}