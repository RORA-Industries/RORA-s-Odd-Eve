import java.util.*;
class RORAsOddEve
{
    public static void main()
    {  
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Choose between (o)dd and (e)ve");
        String choice = sc.nextLine();
        System.out.println("enter a no. for toss");
        int n = sc.nextInt();
        int c = r.nextInt(10);
        int sum = n+c;
        String i="f";
        int score=0;
        switch(choice)
        {
            case "o":
            if(sum % 2==1)
            {
                System.out.println("Computer:"+c+"\nPlayer:"+n+"\nPlayer Won the toss");
                System.out.println("choose (1)bat or (2)bowl");
                int R = sc.nextInt();
                if(R==1)
                {
                    i = "ba";
                }
                else
                { 
                    i = "bo";
                }
            }
            else
            {
                System.out.println("Computer:"+c+"\nPlayer:"+n+"\nComputer Won the toss");
                int in = r.nextInt(100);
                if(in%2==0)
                {
                    System.out.println("Computer choose to bat");
                    i = "bo";
                }
                else
                {
                    System.out.println("Computer choose to bowl");
                    i = "ba";
                }
            }
            break;
            
            case "e":
            if(sum % 2==0)
            {
                System.out.println("Computer:"+c+"\nPlayer:"+n+"\nPlayer Won the toss");
                System.out.println("choose (1)bat or (2)bowl");
                int R = sc.nextInt();
                if(R==1)
                {
                    i = "ba";
                }
                else
                { 
                    i = "bo";
                }
            }
            else
            {
                System.out.println("Computer:"+c+"\nPlayer:"+n+"\nComputer Won the toss");
                int in = r.nextInt(100);
                if(in%2==0)
                {
                    System.out.println("Computer choose to bat");
                    i = "bo";
                }
                else
                {
                    System.out.println("Computer choose to bowl");
                    i = "ba";
                }
            }
            break;
        }
        if(i == "ba")
        {
            for(int l=1;l>0;l++)
            {
                
               System.out.println("Give your shot");
               int run = sc.nextInt();
               int crun = r.nextInt(10);
               System.out.println("Computer:"+crun);
               if(run!=crun)
               {
                   score = score+run;
               }
               if(run==crun)
               {
                   System.out.println("Out\nPlayer scored:"+score);
                   for(int dhhd=0;dhhd<=score;)
                   {
                       int ruu = r.nextInt(10);
                       System.out.println("Bowl");
                       int rru = sc.nextInt();
                       System.out.println("Computer:"+ruu);
                       if(ruu!=rru)
                       {
                           dhhd=dhhd+ruu;
                           if(score<dhhd)
                           {
                               System.out.println("Computer Won with "+(dhhd-score)+" runs extra...");
                           }
                       }
                       else
                       {
                           System.out.println("out\nComputer scored:"+dhhd);
                           System.out.println("Player Won by "+(score-dhhd)+" runs.");
                           break;
                       }
                   }
                   break;
               }
            }
        }
        else if(i == "bo")
        {
            for(int l=1;l>0;l++)
            {
                
               System.out.println("Bowl");
               int run = sc.nextInt();
               int crun = r.nextInt(10);
               System.out.println("Computer:"+crun);
               if(run!=crun)
               {
                   score = score+run;
               }
               if(run==crun)
               {
                   System.out.println("Out\nComputer scored:"+score);
                   for(int dhhd=0;dhhd<=score;)
                   {
                       int ruu = r.nextInt(10);
                       System.out.println("Give your shot");
                       int rru = sc.nextInt();
                       System.out.println("Computer:"+ruu);
                       if(ruu!=rru)
                       {
                           dhhd=dhhd+rru;
                           if(score<dhhd)
                           {
                               System.out.println("Player Won with "+(dhhd-score)+" runs extra...");
                           }
                       }
                       else
                       {
                           System.out.println("out\nPlayer scored:"+dhhd);
                           System.out.println("Computer Won by "+(score-dhhd)+" runs.");
                           break;
                       }
                   }
                   break;
               }
            }
        }
    }
}
                
                
                
                
                