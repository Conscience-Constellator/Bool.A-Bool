package CC.Bool;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;

public class Point2_Bool_No<I1,I2> implements Point2_Bool<I1,I2>
{
	public static final Clas_Rap Class=Init_StRt(Point2_Bool_No.class
		,Clas_Rap.class
	);/*Dep ?done*/

	public Point2_Bool_No(Point2_Bool<I1,I2> Eql){this.Eql=Eql;}
	public Point2_Bool_No(){}

	public Point2_Bool<I1,I2> Eql;
		@Override public boolean Eql(I1 A,I2 B){return !Eql.Eql(A,B);}

	static{Init_Nd(Point2_Bool_No.class);}
}