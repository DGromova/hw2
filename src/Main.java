public class Main {
    public static void main(String[] args) {
        // Задача 1
        byte glass = 3;
        short pines = 1005;
        int people = 7000;
        long bus = 655432L;
        float parts = 67.678f;
        double glassWeight = 300;
        boolean peopleNumber =  people > 10;
        System.out.println(peopleNumber);
// Задача 2
        double firstBoxer = 78.2;
        double secondBoxer = 82.7;
        double totalWeight = firstBoxer+secondBoxer;
        System.out.println("Общий вес боксеров равен "+totalWeight+ " кг.");
        double differenceBetweenWeights = secondBoxer - firstBoxer;
        System.out.println ("Разница в весе боксеров равна "+differenceBetweenWeights+" кг.");
        // Задача 3
        int bananas = 5;
        int oneBananaWeight = 80;
        int bananasWeight = bananas * oneBananaWeight;
        int milkVolume = 200;
        int milk100gWeight = 105;
        int milkWeight = milkVolume * milk100gWeight / 100;
        int iceCream = 2;
        int oneIceCreamWeighht = 100;
        int iceCreamWeight = iceCream * oneIceCreamWeighht;
        int eggs = 4;
        int oneEggWeight = 70;
        int eggsWeight = eggs * oneEggWeight;
        int totalBreakfastWeightGram = bananasWeight + milkWeight + iceCreamWeight + eggsWeight;
        int totalBreakfastWeightKg = totalBreakfastWeightGram / 1000;
        System.out.println("Вес спорт-завтрака составляет " + totalBreakfastWeightKg + " кг.");
// Задача 4
        int weightLossKg = 7;
        int weightLossGram = weightLossKg * 1000;
        int daysOfSlowWeightLoss = weightLossGram / 250;
        System.out.println("Если спортсмен в день будет терять 250 грамм, то 7 кг он сбросит через " + daysOfSlowWeightLoss + " дней.");
        int daysOfFastWeightLoss = weightLossGram / 500;
        System.out.println("Если спортсмен в день будет терять 500 грамм, то 7 кг он сбросит через " + daysOfFastWeightLoss + " дней.");
        int averageDaysLoseWeight = (daysOfSlowWeightLoss + daysOfFastWeightLoss) / 2;
        System.out.println("В среднем для похудения может потребоваться " + averageDaysLoseWeight + " день.");
        // Задача 5
        double mashaSalary = 67760;
        double mashaSalaryIncrease = mashaSalary * 1.1;
        double denisSalary = 83690;
        double denisSalaryIncrease = denisSalary * 1.1;
        double kristinaSalary = 76230;
        double kristinaSalaryIncrease = kristinaSalary * 1.1;
        double mashaRevenueBeforeIncrease = mashaSalary * 12;
        double mashaRevenueAfterIncrease = mashaSalaryIncrease * 12;
        double mashaSalaryDifferance = mashaRevenueAfterIncrease - mashaRevenueBeforeIncrease;
        double denisRevenueBeforeIncrease = denisSalary * 12;
        double denisRevenueAfterIncrease = denisSalaryIncrease * 12;
        double denisSalaryDifferance = denisRevenueAfterIncrease - denisRevenueBeforeIncrease;
        double kristinaRevenueBeforeIncrease = kristinaSalary * 12;
        double kristinaRevenueAfterIncrease = kristinaSalaryIncrease * 12;
        double kristinaSalaryDifferance = kristinaRevenueAfterIncrease - kristinaRevenueBeforeIncrease;
        System.out.println("Маша теперь получает " + mashaSalaryIncrease + " рублей. Годовой доход вырос на " + mashaSalaryDifferance + " рублей.");
        System.out.println("Денис теперь получает " + denisSalaryIncrease + " рублей. Годовой доход вырос на " + denisSalaryDifferance + " рублей.");
        System.out.println("Кристина теперь получает " + kristinaSalaryIncrease + " рублей. Годовой доход вырос на " + kristinaSalaryDifferance + " рублей.");
    }
}