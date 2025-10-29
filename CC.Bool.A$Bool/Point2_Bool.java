package CC.Bool;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;

import CC.$.Q2$1.Point2$1;

public interface Point2_Bool<I1,I2>
	extends Point2$1<I1,I2,Boolean>
{
//	Clas_Rap Class=Init_StRt_Nd(Point2_Bool.class,
//		Clas_Rap.class,
//		Collection.class,
//		Iterable.class
//	);/*Dep ?done*/

	boolean Eql(I1 A,I2 B);
		@Override
		default Boolean Point2$1(I1 A,I2 B)
		{return Eql(A,B);}
	default void Point2$Bool(I1 A,I2 B)
	{

	}

	Point2_Bool<Object,Object>
		On=(A,B)->{return true;},
		Of=(A,B)->{return false;},
		ID=(A,B)->{return A==B;},
		Eql=(A,B)->{return A.equals(B);},
		Clas=(A,B)->{return A.getClass()==B.getClass();};
}