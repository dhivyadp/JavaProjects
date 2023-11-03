class Prime
{
 public static void main(String[] args)
{
   int n=29;
  boolean isPrime =primeNum(n);
  if(isPrime==true)
   System.out.println("its a prime");
  else
    System.out.println("its not a prime");


}
 public static boolean primeNum(int n)
{
  if(n<2)
  {
   return false;

  }
  int s= (int) Math.sqrt(n);
 for(int i=2;i<=s;i++)
{
if(n%i==0)
{
  return false;
}

}
return true;
}
 
  
 
}