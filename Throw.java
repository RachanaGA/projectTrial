 public class Voter {
   	
    static void vote(int age) {
        if(age>=18) {
            System.out.println("Welcome to vote");
        }
        else
        {
            try {
                throw new VoterException("Invalid age for voting");
            }
            catch(VoterException e) {
                System.out.println(e);
            }
        }
    }
	public static void main(String[] args)
    {
        vote(18);
    }
}  



class VoterException extends Exception{
    VoterException(String message){
        super(message);
    }
}




