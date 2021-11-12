package in.javahome.myweb.controller;
import java.util.List;
/*
 * 
 */
public class Calculator {
	/*
	 * @param i
	 * @param j
	 * @return int
	 */
	public int add(int i, int j){
		return i+j;
	}
	public int multiply(int i, int j){
		return i*j;
	}
}
/**********************************************************************/
AtomicInteger aInt1 = new AtomicInteger(0);
AtomicInteger aInt2 = new AtomicInteger(0);
if (aInt1.equals(aInt2)) { ... } 
if (aInt1.equals(aInt2)) { ... } 
if (aInt1.equals(aInt2)) { ... } 
if (aInt1.equals(aInt2)) { ... } 
if (aInt1.equals(aInt2)) { ... } 
if (aInt1.equals(aInt2)) { ... } 
if (aInt1.equals(aInt2)) { ... } 
