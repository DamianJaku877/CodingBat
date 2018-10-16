package CodingBatAp3;

public class greenTicket {
    private int a;
    private int b;
    private int c;

    public int TicketLottery(int a, int b, int c){

        if(a == b && b==c) {
            return 20;
        }
        if (a == b || a == c || b == c){
            return 10;
        }
        return 0;
    }

}
