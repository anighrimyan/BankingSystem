import java.util.Random;

public interface IAccountNumGenerator {

    default String generator(Object supe) {
        Random random = new Random();
        StringBuilder str = new StringBuilder();
        int above;
        int below;
        if (supe instanceof CurrentNumber) {
            above = 1;
            below = 33;
            int tmp = random.nextInt(above, below);
            if (tmp < 10) {
                str.append("0");
            }
            str.append(random.nextInt(above, below));

        } else if (supe instanceof LoanContract) {
            above = 34;
            below = 66;
            str.append(random.nextInt(above, below));

        } else if (supe instanceof DepositContract) {
            above = 67;
            below = 99;
            str.append(random.nextInt(above, below));
        }


        for (int i = 0; i < 11; i++) {
            str.append(random.nextInt(9));
        }
        return str.toString();

    }

}

