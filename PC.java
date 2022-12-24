
public class PC extends Server {
    public String usernameU;
    public int passwordU;


    @Override
    public void username() {
        String azwar = null;
        usernameU = azwar;
    }

    @Override
    public void password() {
        int passwordU = "2100018480";

    }

    @Override
    public void billing() {
        int ja = 26, ma = 61, jb = 25, mb = 61, mh = 0;
        while (ja > 24) {
            System.out.println("jam masuk :");

        }
        while (ma >= 60) {
            System.out.println("Menit masuk :");

        }
        //Input Waktu  Keluar;
        while ((jb < ja) || (jb > 24)) {
            System.out.println("jam Keluar :");

        }
        System.out.println("Menit Keluar :");

        while (((jb == ja) && (mb <= ma)) || (mb >= 60)) {
            System.out.println("Menit Keluar :");

        }
        if ((jb == ja)) {
            mh = mb - ma;
        } else {
            mh = ((jb - ja) * 60) + (mb - ma);
        }
        System.out.println("Menit Total = " + mh);
    }
}
