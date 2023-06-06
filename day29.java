 
	public class Solution {
        public int numSquares(int n) {
            int sqrt = (int) Math.sqrt(n);
    
            if (sqrt * sqrt == n)
                return 1;
    
            while (n % 4 == 0)
                n = n / 4;
    
            if (n % 8 == 7) return 4;
    
            for (int i = 1; i * i <= n; i++) {
                int square = i * i;
                int base = (int) Math.sqrt(n - square);
    
                if (base * base == n - square) return 2;
            }
    
            return 3;
        }
    }
    
        
    
        
    
        
    
        
    


    class Solution {
        public int subtractProductAndSum(int n) {
            int s=0;
            int p=1;
            while(n>0)
            {
                int last=n%10;
                s=s+last;
                p=p*last;
                n=n/10;
            }
            return p-s;
            
        }
    }