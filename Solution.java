import java.util.Scanner;
class Solution {
    public List<String> fizzBuzz(int n) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int answer[i];
            if(i%3==0 && i%5==0){
                answer[i]="FizzBuzz";
            }
            else if(i%3==0){
                answer[i]="Fizz";
            }
            else if(i%5==0){
                answer[i]="Buzz";
            }
            else{
                answer[i]=i;
            }
        }
    }
}
