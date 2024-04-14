public class Main {
    public static void main(String[] args) {

        //task-1
        byte b = 100;
        short s = 10_000;
        int i = 1_000_000;
        long l = 3_000_000_000L;
        float f = 10.568f;
        double d = 10.4565874589;
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной s с типом short равно " + s);
        System.out.println("Значение переменной i с типом int равно " + i);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной d с типом double равно " + d + "\n");

        //task-2
        float f1 = 27.12f;
        long l1 = 987_678_968_549L;
        float f2 = 2.786f;
        short s1 = 569;
        short s2 = -159;
        short s3 = 27897;
        byte b1 = 67;
        System.out.format("%.2f, %d, %.3f, %d, %d, %d, %d", f1, l1, f2, s1, s2, s3, b1);
        System.out.println("\n");

        //task-3
        byte pupilsOfClass1 = 23;
        byte pupilsOfClass2 = 27;
        byte pupilsOfClass3 = 30;
        short sheetsOfpaper = 480;
        int totalPupils = pupilsOfClass1 + pupilsOfClass2 + pupilsOfClass3;
        int paperForPupil = sheetsOfpaper / totalPupils;
        System.out.println("На каждого ученика рассчитано " + paperForPupil + " листов бумаги.\n");

        //task-4
        byte bottles = 16;
        byte time = 2;
        int productForOneMinute = bottles / time;
        int productFor20Minute = productForOneMinute * 20;
        int productForDay = productForOneMinute * 60 * 24;
        int productFor3Day = productForDay * 3;
        int productForMonth = productForDay * 30;
        System.out.println("За 20 минут машина произвела " + productFor20Minute + " штук бутылок");
        System.out.println("За сутки машина произвела " + productForDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + productFor3Day + " штук бутылок");
        System.out.println("За месяц машина произвела " + productForMonth + " штук бутылок\n");

        //task-5
        byte totalCanOfPaint = 120;
        byte numberOfWhiteCanForClass = 2;
        byte numberOfBrownCanForClass = 4;
        int numberOfClasses = totalCanOfPaint / (numberOfWhiteCanForClass + numberOfBrownCanForClass);
        int totalWhiteCan = numberOfClasses * numberOfWhiteCanForClass;
        int totalBrownCan = numberOfClasses * numberOfBrownCanForClass;
        System.out.println("В школе, где  " + numberOfClasses + " классов, нужно " + totalWhiteCan +
                " банок белой краски и " + totalBrownCan + " банок коричневой краски\n");

        //task-6
        byte banan = 80;
        byte milk = 105;
        byte iceCream = 100;
        byte egg = 70;
        int weightInGram = 5 * banan + 2 * milk + 2 * iceCream + 4 * egg;
        float weightInKilogram = (float) weightInGram / 1000;
        System.out.println("Вес в граммах - " + weightInGram);
        System.out.println("Вес в килограммах - " + weightInKilogram + "\n");

        //task-7
        byte overWeight = 7;
        short loseWeight1 = 250;
        short loseWeight2 = 500;
        float daysLoseWeight1 = (float) overWeight * 1000 / loseWeight1;
        float daysLoseWeight2 = (float) overWeight * 1000 / loseWeight2;
        System.out.println("При потере 250г веса в день - потребуется " + daysLoseWeight1 + " дней");
        System.out.println("При потере 500г веса в день - потребуется " + daysLoseWeight2 + " дней\n");

        //task-8
        float increasePercent = 0.1f;

        float salaryMasha = 67760f;
        float salaryDenis = 83690f;
        float salaryKristina = 76230f;

        float salaryMashaAfterIncrease = salaryMasha * (increasePercent + 1);
        float salaryDenisAfterIncrease = salaryDenis * (increasePercent + 1);
        float salaryKristinaAfterIncrease = salaryKristina * (increasePercent + 1);

        float annualIncomeGrowthMasha = salaryMasha * increasePercent * 12;
        float annualIncomeGrowthDenis = salaryDenis * increasePercent * 12;
        float annualIncomeGrowthKristina = salaryKristina * increasePercent *12;

        System.out.println("Маша теперь получает " + salaryMashaAfterIncrease + " рублей." +
                " Годовой доход вырос на " + annualIncomeGrowthMasha + "рублей.");
        System.out.println("Денис теперь получает " + salaryDenisAfterIncrease + " рублей." +
                " Годовой доход вырос на " + annualIncomeGrowthDenis + "рублей.");
        System.out.println("Кристина теперь получает " + salaryKristinaAfterIncrease + " рублей." +
                " Годовой доход вырос на " + annualIncomeGrowthKristina + "рублей.");















    }
}