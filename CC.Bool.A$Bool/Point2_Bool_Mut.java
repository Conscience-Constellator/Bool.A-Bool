package CC.Bool;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;

public class Point2_Bool_Mut<I1,I2> implements Point2_Bool<I1,I2>
{
	public static final Clas_Rap Class=Init_StRt(Point2_Bool.class
		,Clas_Rap.class
	);/*Dep ?done*/

	public Point2_Bool_Mut(){}

	public Point2_Bool Rap;
		@Override public boolean Eql(I1 A,I2 B){return Rap.Eql(B,A);}
}