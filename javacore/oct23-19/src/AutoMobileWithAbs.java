
public interface AutoMobileWithAbs {
void abs();
public default void sum() {
	System.out.println("sum() AutoMobileWithAbs");
}
}
