import java.lang.Math;  //import statement included by Jeeva

class Assess{
  //insert add
  int addition(int a, int b){
    int c = a+b;
    return c;
  } 
  float addition(float a, float b){
    float c = a+b;
    return c;
  }
  //insert subraction
  public int sub(a,b){
	int subr = Math.abs(b-a); //absoulte method included by Jeeva
	return subr;
  }
  public float sub(a,b){
	float subr = Math.abs(b-a); //abs included by Jeeva
	return subr;
  }
  //insert multiply
  int multiplication(int a, int b{
	  return (a*b);
  )
  float multiplication(float a, float b){
	  return(a*b);
  }
  //insert divide
  public static float div(int a, int b){
	  final float res = a/b;
	  return res;
  }
  //return int value
  public static float div(float a, float b){
	  final float res = a/b;
	  return res;
  }

  public static void main(String[] args){
    int a = 10;
    int b = 5;
    float c = 10.0;
    float d = 5.0;
    System.out.println(multiplication(a, b));
    System.out.println(multiplication(c, d));
    System.out.println(div(a,b));
    System.out.println(div(c,d));
    System.out.println(sub(a,b));
    System.out.println(sub(c,d));
    System.out.println(additon(a, b));
    System.out.println(additon(c, d));
  }
}
