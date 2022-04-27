public class DeskPhone implements Telephone{
    private String myNumber;
    private boolean isRinging;
    private boolean isPowerOn;

    public DeskPhone (String myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("The phone is On");
    }
    @Override
    public void dial(String phoneNumber) {
        System.out.println("Now ringing" + phoneNumber + " On Handset");
    }

    @Override
    public void answer() {
        if (isRinging && isPowerOn){
            System.out.println("Answre your call");
            isRinging = false;
        }else {
            System.out.println("Phone is not ringing");
        }
    }

    @Override
    public boolean callPhone(String phoneNumber) {
        if(phoneNumber == myNumber && isPowerOn ){
            isRinging = true;
            System.out.println(" Phone is ringing");
        } else{
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
